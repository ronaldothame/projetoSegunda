/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronaldo Thame
 */
public class ProdutoConnection {

    private final String url = "jdbc:mysql://localhost:3306/meroy_lerlin";
    private final String usuario = "root";
    private final String password = "1234";

    public ProdutoConnection() {
    }

    public void handleSearch(JTable tabelaProdutos) {

        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "SELECT * FROM produtos";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID", "Data de Fabricação", "Nome", "Fornecedor ID"});

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                int id = rs.getInt("id");
                Date dataFabri = rs.getDate("data_fabri");
                String nome = rs.getString("nome");
                int fornecedorId = rs.getInt("fornecedor_id");

                model.addRow(new Object[]{
                    id,
                    dateFormat.format(dataFabri),
                    nome,
                    fornecedorId
                });
            }

            rs.close();
            stmt.close();
            conn.close();

            tabelaProdutos.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }
    }

    public List<Map<String, Object>> getNomesFornecedores() {
        List<Map<String, Object>> fornecedores = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);
            String sql = "SELECT id, razao_social FROM fornecedores";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int idFornecedor = rs.getInt("id");
                String nomeFornecedor = rs.getString("razao_social");

                Map<String, Object> fornecedor = new HashMap<>();
                fornecedor.put("id", idFornecedor);
                fornecedor.put("razao_social", nomeFornecedor);

                fornecedores.add(fornecedor);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }

        return fornecedores;
    }

    public void handleCadastrarProduto(String nome, String dataFabricacao, String fornecedorSelecionado) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);
            String sql = "INSERT INTO produtos (nome, data_fabri, fornecedor_id) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, dataFabricacao);

            String sqlFornecedor = "SELECT id FROM fornecedores WHERE razao_social = ?";
            PreparedStatement stmtFornecedor = conn.prepareStatement(sqlFornecedor);
            stmtFornecedor.setString(1, fornecedorSelecionado);
            ResultSet rsFornecedor = stmtFornecedor.executeQuery();

            if (rsFornecedor.next()) {
                int fornecedorId = rsFornecedor.getInt("id");
                stmt.setInt(3, fornecedorId);

                int linhasAfetadas = stmt.executeUpdate();

                if (linhasAfetadas > 0) {
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar o produto.");
                }
            }

            rsFornecedor.close();
            stmtFornecedor.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o cadastro: " + e.getMessage());
        }
    }

    public void handleAlterarProduto(int id, String nome, String dataFabricacao, String fornecedorSelecionado) {
        int fornecedorId = -1;
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);
            String sql = "SELECT id FROM fornecedores WHERE razao_social = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fornecedorSelecionado);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                fornecedorId = rs.getInt("id");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }

        if (fornecedorId == -1) {
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado.");
            return;
        }

        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "UPDATE produtos SET nome = ?, data_fabri = ?, fornecedor_id = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, dataFabricacao);
            stmt.setInt(3, fornecedorId);
            stmt.setInt(4, id);

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");

            } else {
                JOptionPane.showMessageDialog(null, "Falha ao atualizar o produto.");
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }
    }

    public void handleExcluirProduto(int id) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "DELETE FROM produtos WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com o ID informado.");
            }

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar produto: " + e.getMessage());
        }
    }
}
