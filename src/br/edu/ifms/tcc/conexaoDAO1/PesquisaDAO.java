/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.conexaoDAO1;

import br.edu.ifms.tcc.telas.Pesquisa_Questao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Noah
 */
public class PesquisaDAO {
    static Pesquisa_Questao pesques = new Pesquisa_Questao();
    public static void PQ1(Pesquisa_Questao pq1){
        String sql = "SELECT * FROM Cont1 WHERE id1_questao = ?";
        try{
        PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
        pstm.setInt(1, pesques.getRecebnum());
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            pq1.setQuestao(rs.getString("exercicio1"));
        }
        pstm.execute();
        pstm.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema no Banco de Dados !");
            System.out.println("Problemas ao inserir informações");
            System.out.println(ex.getMessage());
        }
    }
    public static void PQ2(Pesquisa_Questao pq2){
        String sql = "SELECT * FROM Cont2 WHERE id2_questao = ?";
        try{
        PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
        pstm.setInt(1, pesques.getRecebnum());
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            pq2.setQuestao(rs.getString("exercicio2"));
        }
        pstm.execute();
        pstm.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema no Banco de Dados !");
            System.out.println("Problemas ao inserir informações");
            System.out.println(ex.getMessage());
        }
    }
    public static void PQ3(Pesquisa_Questao pq3){
        String sql = "SELECT * FROM Cont3 WHERE id3_questao3 = ?";
        try{
        PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
        pstm.setInt(1, pesques.getRecebnum());
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            pq3.setQuestao(rs.getString("exercicio3"));
        }
        pstm.execute();
        pstm.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema no Banco de Dados !");
            System.out.println("Problemas ao inserir informações");
            System.out.println(ex.getMessage());
        }
    }
    public static void PQ4(Pesquisa_Questao pq4){
        String sql = "SELECT * FROM Cont4 WHERE id4_questao = ?";
        try{
        PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
        pstm.setInt(1, pesques.getRecebnum());
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            pq4.setQuestao(rs.getString("exercicio4"));
        }
        pstm.execute();
        pstm.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema no Banco de Dados !");
            System.out.println("Problemas ao inserir informações");
            System.out.println(ex.getMessage());
        }
    }
}
