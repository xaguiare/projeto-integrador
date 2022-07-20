/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import Modelo.Livros;

/*
 *
 * @author 36127512021.2
 */
public class TelaExibeLivroCadastrado extends javax.swing.JFrame {

    /**
     * Creates new form TelaExibeLivroCadastrado
     */
    public TelaExibeLivroCadastrado() {
        initComponents();
    }

    public void exportarDados (Livros model){
            lblautor.setText(model.getAutor());
            lbltitulo.setText(model.getTítulo());
            lblcodigo.setText(model.getCódigo());
            lblvolume.setText(model.getVolume());
            lbleditora.setText (model.getEditora());
            lblquantidade.setText(model.getQuantidade());
            
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblautor = new javax.swing.JLabel();
        lblvolume = new javax.swing.JLabel();
        lbleditora = new javax.swing.JLabel();
        lblquantidade = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setText("ISBN:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Detalhes do livro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 240, 30);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Autor:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 80, 70, 21);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Título:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 110, 70, 21);

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 153));
        jLabel7.setText("Editora:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 200, 90, 21);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("Volume:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 170, 79, 21);

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("Quantidade:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 230, 120, 21);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(284, 69, 0, 0);
        getContentPane().add(lbltitulo);
        lbltitulo.setBounds(160, 110, 140, 20);
        getContentPane().add(lblautor);
        lblautor.setBounds(160, 80, 140, 20);
        getContentPane().add(lblvolume);
        lblvolume.setBounds(160, 170, 140, 20);
        getContentPane().add(lbleditora);
        lbleditora.setBounds(200, 200, 100, 20);
        getContentPane().add(lblquantidade);
        lblquantidade.setBounds(170, 230, 140, 20);

        voltar.setBackground(new java.awt.Color(153, 255, 153));
        voltar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(150, 270, 110, 31);

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 153));
        jLabel8.setText("ISBN:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 140, 60, 21);
        getContentPane().add(lblcodigo);
        lblcodigo.setBounds(160, 140, 140, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/abc.jpg"))); // NOI18N
        jLabel10.setText("jLabel3");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 400, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExibeLivroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExibeLivroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExibeLivroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExibeLivroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExibeLivroCadastrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblautor;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lbleditora;
    private javax.swing.JLabel lblquantidade;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblvolume;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
