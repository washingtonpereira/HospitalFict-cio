/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;


/**
 *
 * @author Washington
 */
public class ConnectionFactory {
    //método responsável por fazer conexão com o banco
     public static Connection conector(){
         java.sql.Connection conexao = null;
// linha abaixo chama o drive
         String driver ="com.mysql.jdbc.Driver"; 
//armazenando informações referente ao banco
         String url = "jdbc:mysql://localhost:3306/hopvida";
         String user = "root";
         String password ="";
         //estabelecendo a conexão com o banco de dados
         try {
             Class.forName(driver);
             conexao = DriverManager.getConnection(url,user,password);
             return conexao;
         } catch (Exception e) {
             System.out.println(e);
             return null;
         }
     }   
        
     
}

