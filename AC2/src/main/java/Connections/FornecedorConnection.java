package Connections;

import Objects.Fornecedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FornecedorConnection {

    private final String url = "jdbc:mysql://localhost:3306/meroy_lerlin";
    private final String usuario = "root";
    private final String password = "1234";

    public FornecedorConnection() {

    }

    public void insertFornecedor(Fornecedor fornecedor) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "INSERT INTO fornecedores (cnpj, endereco, razao_social, cidade, uf, telefone, email, ramo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getEndereco());
            stmt.setString(3, fornecedor.getRazaoSocial());
            stmt.setString(4, fornecedor.getCidade());
            stmt.setString(5, fornecedor.getUf());
            stmt.setString(6, fornecedor.getTelefone());
            stmt.setString(7, fornecedor.getEmail());
            stmt.setString(8, fornecedor.getRamo());

            stmt.executeUpdate();

            stmt.close();
            conn.close();

            JOptionPane.showMessageDialog(null, "Fornecedor inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir fornecedor: " + e.getMessage());
        }
    }

    public void handleSearch(JTable tabelaFornecedores) {

        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "SELECT * FROM fornecedores";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID", "CNPJ", "Endereço", "Razão Social", "Cidade", "UF", "Telefone", "Email", "Ramo"});

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("cnpj"),
                    rs.getString("endereco"),
                    rs.getString("razao_social"),
                    rs.getString("cidade"),
                    rs.getString("uf"),
                    rs.getString("telefone"),
                    rs.getString("email"),
                    rs.getString("ramo")
                });
            }

            rs.close();
            stmt.close();
            conn.close();

            tabelaFornecedores.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }
    }

    public void handleDelete(int id) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "DELETE FROM fornecedores WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum fornecedor encontrado com o ID informado.");
            }

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar fornecedor: " + e.getMessage());
        }
    }

    public void handleUpdate(Fornecedor fornecedor) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "UPDATE fornecedores SET cnpj = ?, endereco = ?, razao_social = ?, cidade = ?, uf = ?, telefone = ?, email = ?, ramo = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getEndereco());
            stmt.setString(3, fornecedor.getRazaoSocial());
            stmt.setString(4, fornecedor.getCidade());
            stmt.setString(5, fornecedor.getUf());
            stmt.setString(6, fornecedor.getTelefone());
            stmt.setString(7, fornecedor.getEmail());
            stmt.setString(8, fornecedor.getRamo());
            stmt.setInt(9, fornecedor.getId());

            stmt.executeUpdate();

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor: " + e.getMessage());
        }
    }
}
