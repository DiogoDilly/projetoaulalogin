
package br.com.DAO;

import java.sql.*;
import javax.swing.JOptionPane;


public class conexaodao {
public static Connection conector(){
    
    java.sql.Connection conexao = null;
    
    String driver = "co0m.mysql.jdbc.Drive";
    String url = "jdbc:mysql://localhost:3306/bdprojetologin";
    String user = "root";
    String password = "root";
    
    try {
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, user , password);
        return conexao;
        
        
        
    }catch(Exception e){
       JOptionPane.showMessageDialog(null,"conexao" +e);
        return null;
    }
    
}

  
}
