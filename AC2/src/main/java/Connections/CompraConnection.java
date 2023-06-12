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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronaldo Thame
 */
public class CompraConnection {

    private final String url = "jdbc:mysql://localhost:3306/meroy_lerlin";
    private final String usuario = "root";
    private final String password = "1234";

    public CompraConnection() {
    }

    public void handleSearch(JTable tabelaCompras) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "SELECT id, funcionario, produto, quantidade FROM compras";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID", "Funcionário", "Produto", "Quantidade"});

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("funcionario"),
                    rs.getString("produto"),
                    rs.getInt("quantidade")
                });
            }

            rs.close();
            stmt.close();
            conn.close();

            tabelaCompras.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }
    }

    public List<String> getNomesFuncionarios() {
        List<String> funcionarios = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);
            String sql = "SELECT nome FROM users";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nomeFuncionario = rs.getString("nome");
                funcionarios.add(nomeFuncionario);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }

        return funcionarios;
    }

    public List<String> getNomesProdutos() {
        List<String> produtos = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);
            String sql = "SELECT nome FROM produtos";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nomeProduto = rs.getString("nome");
                produtos.add(nomeProduto);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }

        return produtos;
    }

    public void handleCadastrarCompra(String funcionario, String produto, int quantidade) {
        String funcionarioNome = null;
        String produtoNome = null;

        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sqlFuncionario = "SELECT nome FROM users WHERE nome = ?";
            PreparedStatement stmtFuncionario = conn.prepareStatement(sqlFuncionario);
            stmtFuncionario.setString(1, funcionario);
            ResultSet rsFuncionario = stmtFuncionario.executeQuery();

            if (rsFuncionario.next()) {
                funcionarioNome = rsFuncionario.getString("nome");
            }

            rsFuncionario.close();
            stmtFuncionario.close();

            String sqlProduto = "SELECT nome FROM produtos WHERE nome = ?";
            PreparedStatement stmtProduto = conn.prepareStatement(sqlProduto);
            stmtProduto.setString(1, produto);
            ResultSet rsProduto = stmtProduto.executeQuery();

            if (rsProduto.next()) {
                produtoNome = rsProduto.getString("nome");
            }

            rsProduto.close();
            stmtProduto.close();

            String sqlInsert = "INSERT INTO compras (funcionario, produto, quantidade) VALUES (?, ?, ?)";
            PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert);
            stmtInsert.setString(1, funcionarioNome);
            stmtInsert.setString(2, produtoNome);
            stmtInsert.setInt(3, quantidade);
            int rowsInserted = stmtInsert.executeUpdate();

            stmtInsert.close();
            conn.close();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar a compra.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a compra: " + e.getMessage());
        }
    }

    public void handleExcluirCompra(int id) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "DELETE FROM compras WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Compra excluída com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma compra encontrada com o ID informado.");
            }

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir compra: " + e.getMessage());
        }
    }

    public void handleAlterarCompra(int id, String funcionario, String produto, int quantidade) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "UPDATE compras SET funcionario = ?, produto = ?, quantidade = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, funcionario);
            stmt.setString(2, produto);
            stmt.setInt(3, quantidade);
            stmt.setInt(4, id);

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Compra atualizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao atualizar a compra.");
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }
    }

}
