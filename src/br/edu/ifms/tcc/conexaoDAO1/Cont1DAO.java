/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.conexaoDAO1;

import br.edu.ifms.tcc.classes.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.edu.ifms.tcc.classes.Conteudo1;
import br.edu.ifms.tcc.classes.Usuario;
import br.edu.ifms.tcc.telas.Cont1_exercicios;
import br.edu.ifms.tcc.telas.Barra_de_Progresso;
import java.sql.ResultSet;

/**
 *
 * @author Noah
 */
public class Cont1DAO{
    private static int numquest = 1;
    private static int idquest = 0;
    private static int max = 29;
    static Usuario usuario = new Usuario();
    public static void receberquestao(Conteudo1 rq){
        idquest = idquest + 1;
        String sql = "SELECT * FROM Cont1 WHERE id1_questao =" + idquest;
        try{
        if(max >= idquest){
        PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            rq.setExercicio(rs.getString("exercicio1"));
            rq.setAlt1(rs.getString("alternativa1_1"));
            rq.setAlt2(rs.getString("alternativa1_2"));
            rq.setAlt3(rs.getString("alternativa1_3"));
            rq.setAlt4(rs.getString("alternativa1_4"));
            rq.setAlt5(rs.getString("alternativa1_5"));
            rq.setResult(rs.getString("resultado1"));
            numquest = idquest + 1;
            rq.setNumquestao(numquest);
        }
        pstm.execute();
        pstm.close();
       } 
       if(max == idquest){
           rq.setBotaoprox("Finalizar");
       } 
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema no Banco de Dados !");
            System.out.println("Problemas ao inserir informações");
            System.out.println(ex.getMessage());
        }
    }
    static int contador = 0;
    public static void Contador(Conteudo1 rq) {
        int maxace;
        String sql = "SELECT * FROM Aluno WHERE nome_aluno = ?";
        try{
        PreparedStatement pstm = new Conexao().fazerConexao().prepareStatement(sql);
        pstm.setObject(1, usuario.nome_logado);
        ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                if(rq.getPrimquest() == 1){
                    contador = contador + 1;
                    rq.setPrimquest(0);
                }
                if (rq.getResult() == "correta"){
                    contador = rs.getInt("n1_exe_aluno") + 1;
                    System.out.println("acertou!");
                }
                String sql1 = "UPDATE Aluno SET n1_exe_aluno = "+contador+" WHERE nome_aluno = ?";
                try {
                PreparedStatement pstm1 = new Conexao().fazerConexao().prepareStatement(sql1);
                pstm1.setObject(1, usuario.nome_logado);
                pstm1.execute();
            } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema no Banco de Dados!");
            System.out.println("Problemas ao inserir informações");
            System.out.println(ex.getMessage());
        }  
            } 
        pstm.execute();
        pstm.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema no Banco de Dados!");
            System.out.println("Problemas ao inserir informações");
            System.out.println(ex.getMessage());
        }
        if(max == idquest){
                    String sql3 = "SELECT * FROM Aluno WHERE nome_aluno = ?";
                    try{
                    PreparedStatement pstm3 = new Conexao().fazerConexao().prepareStatement(sql3);
                    pstm3.setObject(1, usuario.nome_logado);
                    ResultSet rs3 = pstm3.executeQuery();
                        while(rs3.next()){
                            idquest = -1;
                            rq.setProgresso(rs3.getInt("n1_exe_aluno"));
                            if(rs3.getInt("n1_exe_aluno") > rs3.getInt("max_n1")){
                            maxace = rs3.getInt("n1_exe_aluno");
                            String sql2 = "UPDATE Aluno SET max_n1 = "+maxace+" WHERE nome_aluno = ?";
                            PreparedStatement pstm2 = new Conexao().fazerConexao().prepareStatement(sql2);
                            pstm2.setObject(1, usuario.nome_logado);
                            pstm2.execute();
                            pstm2.close();
                            }
                        }
                    pstm3.execute();
                    pstm3.close();
                    }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Problema no Banco de Dados!");
                    System.out.println("Problemas ao inserir informações");
                    System.out.println(ex.getMessage());
                    }
        }
    }
     public static void Historico(Conteudo1 rq) throws SQLException{
         
        String sql2 = "INSERT INTO HistoricoPontuacao (pont1,questoes_erradas,nome_aluno) VALUES (?,?,?);";
                            PreparedStatement pstm2 = new Conexao().fazerConexao().prepareStatement(sql2);
                            pstm2.setInt(1, rq.getProgresso());
                            pstm2.setString(2, rq.getErros());
                            pstm2.setString(3, usuario.nome_logado);
                            pstm2.execute();
    }

   
}
