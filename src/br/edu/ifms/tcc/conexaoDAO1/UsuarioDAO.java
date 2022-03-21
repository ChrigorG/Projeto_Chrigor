/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.conexaoDAO1;

import br.edu.ifms.tcc.classes.Usuario;
import br.edu.ifms.tcc.telas.Cadastrar;
import br.edu.ifms.tcc.telas.Login;
import java.awt.List;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chrigor
 */
public class UsuarioDAO {
    static Cadastrar cad = new Cadastrar();
    
    
    
    
    public static void cadastroUsu(Usuario u1){
        String sql = "INSERT INTO Aluno (Nome_aluno,Idade_aluno,max_n1,max_n2,max_n3,max_n4) VALUES (?,?,?,?,?,?)";
        try{
        PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
            
        pstm.setObject(1, u1.getNome());
        pstm.setObject(2, u1.getIdade());
        pstm.setInt(3, 0);
        pstm.setInt(4, 0);
        pstm.setInt(5, 0);
        pstm.setInt(6, 0);
        pstm.execute();
        pstm.close();
            System.out.println("Cliente Inserido com sucesso!!");
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema no Banco de Dados !");
            System.out.println("Problemas ao inserir informações");
            System.out.println(ex.getMessage());
        }
    }
    
    public static Usuario verificarUsu(String nome_aluno){
        Usuario usuario = null;
        String sql = "SELECT * FROM Aluno WHERE nome_aluno = ?";
        
        try{
            PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
            pstm.setObject(1, nome_aluno);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                nome_aluno = rs.getString("nome_aluno");
                usuario = new Usuario();
                String sql1 = "UPDATE Aluno SET n1_exe_aluno = 0 WHERE nome_aluno = ?";
                    PreparedStatement pstm1 = new Conexao().fazerConexao().prepareStatement(sql1);
                    pstm1.execute();
                    pstm1.close();
            }

            pstm.close();      
        }catch(SQLException ex){
            System.out.println("Erro");
            System.out.println(ex.getMessage());
        }
        
        return usuario;
    }
    
    
    public boolean validarCadastro (String cadastro) throws SQLException, ClassNotFoundException {
        
        String sql = ("SELECT nome_aluno FROM aluno WHERE nome_aluno = ?");
        try{
            PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
            pstm.setObject(1, cadastro);
            ResultSet rs = pstm.executeQuery();
            
            if(rs.next()){
                Usuario.valor = 1;
            } else {Usuario.valor = 0;}
            
        pstm.close();
        }catch(SQLException ex){
            System.out.println("Erro");
            System.out.println(ex.getMessage());
        }
        return true;
    }
}
