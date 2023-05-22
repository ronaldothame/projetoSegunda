package Connections;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Objects.User;
import View.TelaSplash;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserConnection {

    private final String url = "jdbc:mysql://localhost:3306/meroy_lerlin";
    private final String usuario = "root";
    private final String password = "1234";

    public void insertUser(User user) {
        String sql = "INSERT INTO users (login, senha, nome, cpf, email, cidade) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, usuario, password); PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, user.getLogin());
            statement.setString(2, user.getSenha());
            statement.setString(3, user.getNome());
            statement.setString(4, user.getCpf());
            statement.setString(5, user.getEmail());
            statement.setString(6, user.getCidade());

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuário: " + e.getMessage());
        }
    }

    public int handleLogin(String login, String senha) {
        int logou = 0;
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String query = "SELECT * FROM users WHERE login = ? AND senha = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, login);
            statement.setString(2, senha);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                
                TelaSplash telaSplash = new TelaSplash();
                telaSplash.setVisible(true);
                logou = 1;
                return logou;
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos. Por favor, tente novamente.");
            }
            resultSet.close();
            statement.close();
            conn.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao logar: " + e.getMessage());
        }
        return logou;
    } 
    
    public void handleSearch(JTable tabelaUsuarios) {

        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "SELECT * FROM users";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID", "Login", "Senha", "Nome", "CPF", "Email", "Cidade"});

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("login"),
                    rs.getString("senha"),
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("cidade"),
                });
            }

            rs.close();
            stmt.close();
            conn.close();

            tabelaUsuarios.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: " + e.getMessage());
        }
    }
    public void handleDelete(int id) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum usuário encontrado com o ID informado.");
            }

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuário: " + e.getMessage());
        }
    }
    
    public void handleUpdate(User user) {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);

            String sql = "UPDATE users SET login = ?, senha = ?, nome = ?, cpf = ?, email = ?, cidade = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getSenha());
            stmt.setString(3, user.getNome());
            stmt.setString(4, user.getCpf());
            stmt.setString(5, user.getEmail());
            stmt.setString(6, user.getCidade());
            stmt.setInt(7, user.getId());

            stmt.executeUpdate();

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar usuário: " + e.getMessage());
        }
    }
}
