/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import Modelo.Clientes;

/**
 *
 * @author 36127512021.2
 */
public class ExibeEmp extends javax.swing.JFrame {

    /**
     * Creates new form ExibeEmp
     */
    public ExibeEmp() {
        initComponents();
    }

    public void exportarDados (Clientes model){
           lblautor.setText(model.getAutor());
            lblcodigo.setText(model.getCodigo());
            lbltitulo.setText(model.getTitulo());
            lblendereco.setText(model.getEndereço());
            lblnome.setText(model.getNome());
            lblcpf.setText(model.getCpf());
            lblinicio.setText(model.getInicio());
            lblfim.setText(model.getFim());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        lblcpf = new javax.swing.JLabel();
        lblendereco = new javax.swing.JLabel();
        lblinicio = new javax.swing.JLabel();
        lblfim = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        voltar = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblautor = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel8.setText("Nome:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("ISBN:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 130, 80, 22);

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Título do livro:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 143, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("Endereço:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 220, 100, 22);

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setText("Data de inicio:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 250, 140, 22);

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("CPF:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 190, 50, 22);

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 153));
        jLabel7.setText("Data de Entrega:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 280, 159, 22);
        getContentPane().add(lblcodigo);
        lblcodigo.setBounds(160, 130, 140, 20);
        getContentPane().add(lblnome);
        lblnome.setBounds(150, 160, 140, 20);
        getContentPane().add(lblcpf);
        lblcpf.setBounds(140, 190, 140, 20);
        getContentPane().add(lblendereco);
        lblendereco.setBounds(160, 220, 140, 20);
        getContentPane().add(lblinicio);
        lblinicio.setBounds(180, 250, 140, 20);
        getContentPane().add(lblfim);
        lblfim.setBounds(190, 280, 140, 20);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Exibição Emprestimo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 270, 40);

        voltar.setBackground(new java.awt.Color(153, 255, 153));
        voltar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(140, 320, 110, 31);

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 153));
        jLabel9.setText("Nome:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 160, 80, 22);
        getContentPane().add(lbltitulo);
        lbltitulo.setBounds(170, 90, 140, 20);

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 153));
        jLabel10.setText("Autor:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 60, 80, 22);
        getContentPane().add(lblautor);
        lblautor.setBounds(150, 60, 120, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/abc.jpg"))); // NOI18N
        jLabel11.setText("jLabel3");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 400, 400);

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
            java.util.logging.Logger.getLogger(ExibeEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibeEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibeEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibeEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibeEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel lblcpf;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblfim;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
}
