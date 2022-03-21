/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.conexaoDAO1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Chrigor
 */
public class Conexao {

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static PreparedStatement createStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public Statement stm;
        public ResultSet rs; 
        private String driver = "org.postgresql.Driver";
        private String url  = "jdbc:postgresql://localhost:5432/BancoDadosTcc";
        private String user = "postgres";
        private String senha = "postgres";
        public Connection con;
    
    public Connection fazerConexao(){
        Connection con = null;
        try{
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(url,user,senha);
            System.out.println("Conectado na base de dados");
        }catch(SQLException ex){
            System.out.println("Problemas ao se conectar");
        }
        return con;
    }
    
    public void desconecta(){
        try{
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possivel desconectar do Banco");
        }
    }
}
