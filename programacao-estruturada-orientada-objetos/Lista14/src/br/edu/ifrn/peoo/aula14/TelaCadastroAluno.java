package br.edu.ifrn.peoo.aula14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaCadastroAluno extends javax.swing.JFrame {

    public TelaCadastroAluno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlCadastroDoAluno = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jbtnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.lightGray);

        jlCadastroDoAluno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlCadastroDoAluno.setText("Cadastro do Aluno");

        jPanel2.setBackground(java.awt.Color.gray);

        jlMatricula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlMatricula.setText("Matrícula:");

        jtfMatricula.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatriculaActionPerformed(evt);
            }
        });

        jlNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlNome.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jlDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlDataNascimento.setText("Data de nascimento:");

        jtfDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDataNascimentoActionPerformed(evt);
            }
        });

        jlMedia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlMedia.setText("Média:");

        jtfMedia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMediaActionPerformed(evt);
            }
        });

        jlSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlSenha.setText("Senha:");

        jpfSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });

        jbtnCadastrar.setBackground(java.awt.Color.lightGray);
        jbtnCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnCadastrar.setText("Cadastrar-se");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlSenha)
                    .addComponent(jtfMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jlMedia)
                    .addComponent(jtfDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jlDataNascimento)
                    .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jlNome)
                    .addComponent(jtfMatricula)
                    .addComponent(jlMatricula)
                    .addComponent(jpfSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCadastrar)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDataNascimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jlCadastroDoAluno)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jlCadastroDoAluno)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatriculaActionPerformed
        
    }//GEN-LAST:event_jtfMatriculaActionPerformed

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jtfDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDataNascimentoActionPerformed
        
    }//GEN-LAST:event_jtfDataNascimentoActionPerformed

    private void jtfMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMediaActionPerformed
        
    }//GEN-LAST:event_jtfMediaActionPerformed

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
        
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed

        String campoMatricula = jtfMatricula.getText();
        String campoNome = jtfNome.getText();
        String campoData = jtfDataNascimento.getText();
        String campoMedia = jtfMedia.getText();
        String campoSenha = String.valueOf(jpfSenha.getPassword());

        double media = Double.parseDouble(campoMedia);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date dataNascimento = sdf.parse(campoData);

            Aluno a = new Aluno(campoMatricula, campoNome, dataNascimento, media, campoSenha);

            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
            
            TelaPrincipal telaPrincipal = new TelaPrincipal(a);
            telaPrincipal.setVisible(true);
            this.setVisible(false);

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Data no formato incorreto!");
        }
        
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

/**
 * @param args the command line arguments
 */
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
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JLabel jlCadastroDoAluno;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlMatricula;
    private javax.swing.JLabel jlMedia;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfDataNascimento;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfMedia;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
