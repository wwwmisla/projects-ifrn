package br.edu.ifrn.peoo.aula15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    public TelaCadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBranco = new javax.swing.JPanel();
        jpCinza = new javax.swing.JPanel();
        jlMatricula = new javax.swing.JLabel();
        jtfMatricula = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlDataNascimento = new javax.swing.JLabel();
        jtfDataNascimento = new javax.swing.JTextField();
        jlMedia = new javax.swing.JLabel();
        jtfMedia = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jbtnCadastrarse = new javax.swing.JButton();
        jlCadastroUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro do Usuário");

        jpBranco.setBackground(new java.awt.Color(255, 255, 255));

        jpCinza.setBackground(java.awt.Color.lightGray);

        jlMatricula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlMatricula.setText("Matrícula:");

        jtfMatricula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jlNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlNome.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jlDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlDataNascimento.setText("Data de nascimento:");

        jtfDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jlMedia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlMedia.setText("Média:");

        jtfMedia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jlSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlSenha.setText("Senha:");

        jpfSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jbtnCadastrarse.setBackground(java.awt.Color.gray);
        jbtnCadastrarse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnCadastrarse.setText("Cadastrar-se");
        jbtnCadastrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCinzaLayout = new javax.swing.GroupLayout(jpCinza);
        jpCinza.setLayout(jpCinzaLayout);
        jpCinzaLayout.setHorizontalGroup(
            jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCinzaLayout.createSequentialGroup()
                .addGroup(jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCinzaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnCadastrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCinzaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCinzaLayout.createSequentialGroup()
                                .addComponent(jlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(231, 231, 231))
                            .addComponent(jtfMedia)
                            .addGroup(jpCinzaLayout.createSequentialGroup()
                                .addComponent(jlMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(231, 231, 231))
                            .addComponent(jtfDataNascimento)
                            .addComponent(jtfNome)
                            .addComponent(jtfMatricula)
                            .addGroup(jpCinzaLayout.createSequentialGroup()
                                .addComponent(jlDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(231, 231, 231))
                            .addComponent(jpfSenha)
                            .addGroup(jpCinzaLayout.createSequentialGroup()
                                .addGroup(jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(303, 303, 303)))))
                .addGap(298, 298, 298))
        );
        jpCinzaLayout.setVerticalGroup(
            jpCinzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCinzaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jbtnCadastrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        jlCadastroUsuario.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlCadastroUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/peoo/icons/icons8-novo-contato-100.png"))); // NOI18N
        jlCadastroUsuario.setText("Cadastro do Usuário");

        javax.swing.GroupLayout jpBrancoLayout = new javax.swing.GroupLayout(jpBranco);
        jpBranco.setLayout(jpBrancoLayout);
        jpBrancoLayout.setHorizontalGroup(
            jpBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCinza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBrancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
        );
        jpBrancoLayout.setVerticalGroup(
            jpBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBrancoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jlCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpCinza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCadastrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarseActionPerformed

        String campoMatricula = jtfMatricula.getText();
        String campoNome = jtfNome.getText();
        String campoData = jtfDataNascimento.getText();
        String campoMedia = jtfMedia.getText();
        String campoSenha = String.valueOf(jpfSenha.getPassword());

        double media = Double.parseDouble(campoMedia);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date dataNascimento = sdf.parse(campoData);

            Alunos a = new Alunos(campoMatricula, campoNome, campoSenha, dataNascimento, media);

            RepositorioAlunos rep = new RepositorioAlunos();
            rep.adicionar(a);

            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");

            TelaPrincipal telaPrincipal = new TelaPrincipal(a);
            telaPrincipal.setVisible(true);
            this.setVisible(false);
                    
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Data no formato incorreto!");
        }
    }//GEN-LAST:event_jbtnCadastrarseActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCadastrarse;
    private javax.swing.JLabel jlCadastroUsuario;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlMatricula;
    private javax.swing.JLabel jlMedia;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPanel jpBranco;
    private javax.swing.JPanel jpCinza;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfDataNascimento;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfMedia;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
