/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.telas;

import br.edu.ifms.tcc.classes.GerarPDF;
import static br.edu.ifms.tcc.telas.Pesquisa_Questao.recebnum;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.font.TextAttribute.FONT;
import javax.swing.JOptionPane;

/**
 *
 * @author Chrigor
 */
public class MenuExer extends javax.swing.JFrame {
    
    /**
     * Creates new form MenuExer
     */
    public MenuExer() {
        initComponents();
        //configurarPainel();
        //configurarBotão();
        JTFcont1.setToolTipText("Usuário");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JBPdf1 = new javax.swing.JButton();
        JBNivel1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        JBPdf2 = new javax.swing.JButton();
        JBNivel2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        JBPdf3 = new javax.swing.JButton();
        JBNivel3 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        JBPdf4 = new javax.swing.JButton();
        JBNivel4 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        JBVoltar = new javax.swing.JButton();
        JTFcont1 = new javax.swing.JTextField();
        JBir1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 250));

        JBPdf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBPdf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifms/tcc/imagens/pdf.png"))); // NOI18N
        JBPdf1.setText("PDF 1");
        JBPdf1.setPreferredSize(new java.awt.Dimension(140, 60));
        JBPdf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPdf1ActionPerformed(evt);
            }
        });

        JBNivel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBNivel1.setText("Conteúdo 1");
        JBNivel1.setMaximumSize(new java.awt.Dimension(139, 59));
        JBNivel1.setMinimumSize(new java.awt.Dimension(139, 59));
        JBNivel1.setPreferredSize(new java.awt.Dimension(140, 60));
        JBNivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNivel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JBNivel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 250));

        JBPdf2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBPdf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifms/tcc/imagens/pdf.png"))); // NOI18N
        JBPdf2.setText("PDF 2");
        JBPdf2.setPreferredSize(new java.awt.Dimension(140, 60));
        JBPdf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPdf2ActionPerformed(evt);
            }
        });

        JBNivel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBNivel2.setText("Conteúdo 2");
        JBNivel2.setMaximumSize(new java.awt.Dimension(139, 59));
        JBNivel2.setMinimumSize(new java.awt.Dimension(139, 59));
        JBNivel2.setPreferredSize(new java.awt.Dimension(133, 60));
        JBNivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNivel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JBNivel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBPdf2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JBPdf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBNivel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 250));

        JBPdf3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBPdf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifms/tcc/imagens/pdf.png"))); // NOI18N
        JBPdf3.setText("PDF 3");
        JBPdf3.setPreferredSize(new java.awt.Dimension(140, 60));
        JBPdf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPdf3ActionPerformed(evt);
            }
        });

        JBNivel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBNivel3.setText("Conteúdo 3");
        JBNivel3.setMaximumSize(new java.awt.Dimension(139, 59));
        JBNivel3.setMinimumSize(new java.awt.Dimension(139, 59));
        JBNivel3.setPreferredSize(new java.awt.Dimension(140, 60));
        JBNivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNivel3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPdf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBNivel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JBPdf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBNivel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 250));

        JBPdf4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBPdf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifms/tcc/imagens/pdf.png"))); // NOI18N
        JBPdf4.setText("PDF 4");
        JBPdf4.setPreferredSize(new java.awt.Dimension(140, 60));
        JBPdf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPdf4ActionPerformed(evt);
            }
        });

        JBNivel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JBNivel4.setText("Conteúdo 4");
        JBNivel4.setMaximumSize(new java.awt.Dimension(139, 59));
        JBNivel4.setMinimumSize(new java.awt.Dimension(139, 59));
        JBNivel4.setPreferredSize(new java.awt.Dimension(140, 60));
        JBNivel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNivel4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPdf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBNivel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JBPdf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBNivel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JBVoltar.setBackground(new java.awt.Color(51, 255, 0));
        JBVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBVoltar.setText("Tela Inicial");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JTFcont1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFcont1.setToolTipText("Nº questão");
        JTFcont1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTFcont1.setName("ahhh"); // NOI18N
        JTFcont1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFcont1ActionPerformed(evt);
            }
        });

        JBir1.setText("Ir");
        JBir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBir1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Procurar Questão Específica:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JBVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTFcont1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(JBir1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JBVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFcont1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBir1))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        JTFcont1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBPdf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPdf1ActionPerformed
       GerarPDF gpdf = new GerarPDF();
       gpdf.PDF1();
    }//GEN-LAST:event_JBPdf1ActionPerformed

    private void JBNivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNivel1ActionPerformed
        Cont1_exercicios nv1 = new Cont1_exercicios();
        nv1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBNivel1ActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        TelaInicial janela = new TelaInicial();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JTFcont1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFcont1ActionPerformed
        
    }//GEN-LAST:event_JTFcont1ActionPerformed

    Pesquisa_Questao pesques = new Pesquisa_Questao();
    int pq;
    
    private void JBir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBir1ActionPerformed
        pq = Integer.parseInt(JTFcont1.getText());
        if(pq > 0 && pq <= 120){
        pesques.setRecebnum(pq);
        Pesquisa_Questao pq = new Pesquisa_Questao();
        pq.setVisible(true);
        this.dispose();
        } else {JOptionPane.showMessageDialog(null, "Digite um número de questão válido");};
    }//GEN-LAST:event_JBir1ActionPerformed

    private void JBNivel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNivel4ActionPerformed
        Cont4_exercicios janela = new Cont4_exercicios();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBNivel4ActionPerformed

    private void JBPdf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPdf4ActionPerformed
        GerarPDF gpdf = new GerarPDF();
        gpdf.PDF4();
    }//GEN-LAST:event_JBPdf4ActionPerformed

    private void JBNivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNivel2ActionPerformed
        Cont2_exercicios janela = new Cont2_exercicios();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBNivel2ActionPerformed

    private void JBPdf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPdf2ActionPerformed
        GerarPDF gpdf = new GerarPDF();
        gpdf.PDF2();
    }//GEN-LAST:event_JBPdf2ActionPerformed

    private void JBNivel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNivel3ActionPerformed
        Cont3_exercicios janela = new Cont3_exercicios();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBNivel3ActionPerformed

    private void JBPdf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPdf3ActionPerformed
        GerarPDF gpdf = new GerarPDF();
        gpdf.PDF3();
    }//GEN-LAST:event_JBPdf3ActionPerformed

    public void configurarPainel(){
        jPanel2.setPreferredSize(new Dimension(300,HEIGHT));
        jPanel3.setPreferredSize(new Dimension(300,HEIGHT));
        jPanel4.setPreferredSize(new Dimension(300,HEIGHT));
        jPanel5.setPreferredSize(new Dimension(300,HEIGHT));
    }
    public void configurarBotão(){
        //configurando o tamanho do botão PDF
        JBPdf1.setPreferredSize(new Dimension(250, 300));
        JBPdf1.setPreferredSize(new Dimension(250, 300));
        JBPdf3.setPreferredSize(new Dimension(250, 300));
        JBPdf4.setPreferredSize(new Dimension(250, 300));
        //configurando o tamanho do botão PDF
        JBNivel1.setPreferredSize(new Dimension(250, 300));
        JBNivel1.setPreferredSize(new Dimension(250, 300));
        JBNivel3.setPreferredSize(new Dimension(250, 300));
        JBNivel4.setPreferredSize(new Dimension(250, 300));
        //configurar o tamanho da letra PDF
        JBPdf1.setFont( new Font(getName(), WIDTH, 40) );
        JBPdf1.setFont( new Font(getName(), WIDTH, 40) );
        JBPdf3.setFont( new Font(getName(), WIDTH, 40) );
        JBPdf4.setFont( new Font(getName(), WIDTH, 40) );
        //configurar o tamanho da letra Nível
        JBNivel1.setFont( new Font(getName(), WIDTH, 40) );
        JBNivel1.setFont( new Font(getName(), WIDTH, 40) );
        JBNivel3.setFont( new Font(getName(), WIDTH, 40) );
        JBNivel4.setFont( new Font(getName(), WIDTH, 40) );
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
            java.util.logging.Logger.getLogger(MenuExer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuExer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuExer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuExer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuExer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBNivel1;
    private javax.swing.JButton JBNivel2;
    private javax.swing.JButton JBNivel3;
    private javax.swing.JButton JBNivel4;
    private javax.swing.JButton JBPdf1;
    private javax.swing.JButton JBPdf2;
    private javax.swing.JButton JBPdf3;
    private javax.swing.JButton JBPdf4;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JButton JBir1;
    private javax.swing.JTextField JTFcont1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
