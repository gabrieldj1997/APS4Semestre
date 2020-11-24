package server;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {

    String serverName = "localhost";
    String mydatabase = "mysql";
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    String username = "root";
    String password = "";
    public Connection con = null;
    public Statement state = null;

    public void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("Conexao criada");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexao mal sucedida. erro " + e.getMessage());
        }
    }

    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
                System.out.println("conexao encerrada");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Conexao mal sucedida. erro " + e.getMessage());
            }
        }
    }

    public void getState() {
        if (con != null) {
            try {
                state = (Statement) con.createStatement();
                System.out.println("State criada");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Conexao mal sucedida. erro " + e.getMessage());
            }
        }
    }

    public void closeState() {
        if (state != null) {
            try {
                state.close();
                System.out.println("State encerrada");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Conexao mal sucedida. erro " + e.getMessage());
            }
        }
    }
}
