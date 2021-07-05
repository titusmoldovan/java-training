package business;

import connection.ConnectionFactory;

import javax.swing.*;
import java.io.Serial;
import java.io.Serializable;
import java.sql.*;

public class CreateAccount implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int lastId=0;
    public CreateAccount(String username, String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createInsertStatement();
        try {
             connection = ConnectionFactory.getConnection();
             statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,username);
            statement.setString(2,password);
            statement.setString(3,"Client");
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()){
                lastId = rs.getInt(1);
            }
            JOptionPane.showMessageDialog(null,"Inregistrarea a avut succes !","Succes!",3);
        } catch (SQLException throwables) {
            JOptionPane.showMessageDialog(null,"Eroare la inserarea clientului !","Eroare inserare",2);
        } finally {
            ConnectionFactory.close(connection);
            ConnectionFactory.close(statement);
        }

    }
    public String createInsertStatement(){
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ");
        sb.append("deliverymanagement.user (username,password,type) ");
        sb.append("VALUES (?,?,?);");
        return sb.toString();
    }
    public int getLastId() {
        return lastId;
    }
}
