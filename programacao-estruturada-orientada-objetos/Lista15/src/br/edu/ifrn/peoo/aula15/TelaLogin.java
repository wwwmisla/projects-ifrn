package br.edu.ifrn.peoo.aula15;

import br.edu.ifrn.peoo.aula15.arquivos.ManipuladorArquivoObjeto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBranco = new javax.swing.JPanel();
        jlIcon = new javax.swing.JLabel();
        jlAreaAcesso = new javax.swing.JLabel();
        jpCinza = new javax.swing.JPanel();
        jlLogin = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jbtnEntrar = new javax.swing.JButton();
        jbtnCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área de Acesso");

        jpBranco.setBackground(java.awt.Color.white);

        jlIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/peoo/icons/icons8-login-arredondado-à-direita-96.png"))); // NOI18N
        jlIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlAreaAcesso.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlAreaAcesso.setText("Área de Acesso");
        jlAreaAcesso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jpCinza.setBackground(java.awt.Color.lightGray);

        jlLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlLogin.setText("Login:");

        jtfLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jlSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlSenha.setText("Senha:");

        jpfSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jpfSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jbtnEntrar.setBackground(java.awt.Color.gray);
        jbtnEntrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnEntrar.setText("Entrar");
        jbtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEntrarActionPerformed(evt);
            }
        });

        jbtnCadastro.setBackground(java.awt.Color.gray);
        jbtnCadastro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnCadastro.setText("Cadastrar-se");
        jbtnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCinzaLayout = new javax.swing.GroupLayout(jpCinza);
        jpCinza.setLayout(jpCinzaLayout);
        jpCinzaLayout.setHorizontalGroup(
            jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCinzaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCinzaLayout.createSequentialGroup()
                        .addComponent(jlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(444, 444, 444))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCinzaLayout.createSequentialGroup()
                        .addGroup(jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCinzaLayout.createSequentialGroup()
                                .addComponent(jlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(278, 278, 278))
                            .addComponent(jtfLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCinzaLayout.createSequentialGroup()
                                .addComponent(jbtnCadastro)
                                .addGap(100, 100, 100)
                                .addComponent(jbtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(168, 168, 168))))
        );
        jpCinzaLayout.setVerticalGroup(
            jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCinzaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jlLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpBrancoLayout = new javax.swing.GroupLayout(jpBranco);
        jpBranco.setLayout(jpBrancoLayout);
        jpBrancoLayout.setHorizontalGroup(
            jpBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBrancoLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jlIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addComponent(jlAreaAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93))
            .addComponent(jpCinza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpBrancoLayout.setVerticalGroup(
            jpBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBrancoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jpBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpBrancoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlAreaAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpCinza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEntrarActionPerformed

        String campoLogin = jtfLogin.getText();
        String campoSenha = String.valueOf(jpfSenha.getPassword());

        ArrayList<Alunos> alunos = ManipuladorArquivoObjeto.ler("alunos.txt");

        boolean mensagem = false;
        
        for (Alunos aluno : alunos) {

            if (aluno.getNome().equals(campoLogin) && aluno.getSenha().equals(campoSenha)) {
                
                mensagem = true;
                
                JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
                
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                telaPrincipal.setVisible(true);
                this.setVisible(false);
                
                break;
            }
        }
        
        if(!mensagem){
            JOptionPane.showMessageDialog(null, "Verifique seu login e a senha!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnEntrarActionPerformed

    private void jbtnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastroActionPerformed

        TelaCadastroUsuario telaCadastro = new TelaCadastroUsuario();
        telaCadastro.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCadastro;
    private javax.swing.JButton jbtnEntrar;
    private javax.swing.JLabel jlAreaAcesso;
    private javax.swing.JLabel jlIcon;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPanel jpBranco;
    private javax.swing.JPanel jpCinza;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfLogin;
    // End of variables declaration//GEN-END:variables
}
