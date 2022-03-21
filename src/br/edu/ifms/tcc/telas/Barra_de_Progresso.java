/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.telas;

import br.edu.ifms.tcc.classes.Conteudo1;
import br.edu.ifms.tcc.classes.Conteudo2;
import br.edu.ifms.tcc.classes.Conteudo3;
import br.edu.ifms.tcc.classes.Conteudo4;
import br.edu.ifms.tcc.conexaoDAO1.Cont1DAO;
import br.edu.ifms.tcc.conexaoDAO1.Cont2DAO;
import br.edu.ifms.tcc.conexaoDAO1.Cont3DAO;
import br.edu.ifms.tcc.conexaoDAO1.Cont4DAO;
import java.awt.Dimension;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.SQLException;
//import br.edu.ifms.tcc.classes.Conteudo3;
//import br.edu.ifms.tcc.classes.Conteudo4;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.value;
import javax.swing.JProgressBar;

/**
 *
 * @author Chrigor
 */
public class Barra_de_Progresso extends javax.swing.JFrame {
   private static Conteudo1 cont1 = new Conteudo1();
   private static Conteudo2 cont2 = new Conteudo2();
   private static Conteudo3 cont3 = new Conteudo3();
   private static Conteudo4 cont4 = new Conteudo4();
    
    public Barra_de_Progresso() {
        initComponents();
        Progresso();
        configurar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JProgresso = new javax.swing.JProgressBar();
        JBVoltar = new javax.swing.JButton();
        JBVer_Tabela = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JProgresso.setBackground(new java.awt.Color(255, 255, 255));
        JProgresso.setForeground(new java.awt.Color(51, 204, 0));
        JProgresso.setPreferredSize(new java.awt.Dimension(146, 50));
        JProgresso.setStringPainted(true);

        JBVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBVoltar.setText("Voltar Menu");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JBVer_Tabela.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBVer_Tabela.setText("Ver Tabela");
        JBVer_Tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVer_TabelaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 0, 80)); // NOI18N
        jLabel1.setText("Resultado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aproveitamento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("As questões que você errou:");

        jTextArea1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBVer_Tabela)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(JProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(211, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3))
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVer_Tabela)
                    .addComponent(JBVoltar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBVer_TabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVer_TabelaActionPerformed
       Listagem_Ponto janela = new Listagem_Ponto();
       janela.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_JBVer_TabelaActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
       MenuExer janela = new MenuExer();
       janela.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    public void Progresso(){
        JProgresso.setMaximum(100);
        new Temporizador().start();
    }
    int totquest = 30;
    int res = 0;

    public class Temporizador extends Thread{
        public void run(){
            if(cont1.getNumquestao() == 30){
                try {
                    Cont1DAO.Historico(cont1);
                } catch (SQLException ex) {
                    Logger.getLogger(Barra_de_Progresso.class.getName()).log(Level.SEVERE, null, ex);
                }
            jTextArea1.setText(cont1.getErros());
            int totacert = cont1.getProgresso();
            res = (totacert*100)/totquest; 
            while(JProgresso.getValue()<=res){
                try{
                    sleep(1);
                    JProgresso.setValue(JProgresso.getValue() + 1);
                    cont1.setNumquestao(0);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
          } else if(cont2.getNumquestao() == 60){
                try {
                    Cont2DAO.Historico(cont2);
                } catch (SQLException ex) {
                    Logger.getLogger(Barra_de_Progresso.class.getName()).log(Level.SEVERE, null, ex);
                }
            jTextArea1.setText(cont2.getErros());
            int totacert = cont2.getProgresso();
            res = (totacert*100)/totquest; 
            while(JProgresso.getValue()<res){
                try{
                    sleep(1);
                    //Aqui, colocar uma variavel que possa funcionar de acordo com os exercícios
                    //Essa linha de baixo é só um teste
                    JProgresso.setValue(JProgresso.getValue() + 1);
                    cont2.setNumquestao(30);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
          } else if(cont3.getNumquestao() == 90){
                try {
                    Cont3DAO.Historico(cont3);
                } catch (SQLException ex) {
                    Logger.getLogger(Barra_de_Progresso.class.getName()).log(Level.SEVERE, null, ex);
                }
            jTextArea1.setText(cont3.getErros());
            int totacert = cont3.getProgresso();
            res = (totacert*100)/totquest; 
            while(JProgresso.getValue()<res){
                try{
                    sleep(1);
                    //Aqui, colocar uma variavel que possa funcionar de acordo com os exercícios
                    //Essa linha de baixo é só um teste
                    JProgresso.setValue(JProgresso.getValue() + 1);
                    cont3.setNumquestao(60);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
          } else if(cont4.getNumquestao() == 120){
                try {
                    Cont4DAO.Historico(cont4);
                } catch (SQLException ex) {
                    Logger.getLogger(Barra_de_Progresso.class.getName()).log(Level.SEVERE, null, ex);
                }
            jTextArea1.setText(cont4.getErros());
            int totacert = cont4.getProgresso();
            res = (totacert*100)/totquest; 
            while(JProgresso.getValue()<res){
                try{
                    sleep(1);
                    //Aqui, colocar uma variavel que possa funcionar de acordo com os exercícios
                    //Essa linha de baixo é só um teste
                    JProgresso.setValue(JProgresso.getValue() + 1);
                    cont4.setNumquestao(90);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
          }
        }
    }
    
    public void configurar(){
        jPanel2.setPreferredSize(new Dimension(800,200));
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Barra_de_Progresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barra_de_Progresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barra_de_Progresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barra_de_Progresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barra_de_Progresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBVer_Tabela;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JProgressBar JProgresso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextArea1;
    // End of variables declaration//GEN-END:variables
}
