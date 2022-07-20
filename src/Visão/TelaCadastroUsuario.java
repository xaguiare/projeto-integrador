/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import Modelo.Livros;
import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaCadastroUsuario() {
        initComponents();
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
        deletar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        senha = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 50, 130, 30);

        deletar.setBackground(new java.awt.Color(153, 255, 153));
        deletar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        getContentPane().add(deletar);
        deletar.setBounds(140, 260, 120, 31);

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 170, 40, 22);

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Login:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 90, 80, 22);
        getContentPane().add(senha);
        senha.setBounds(160, 130, 120, 30);
        getContentPane().add(login);
        login.setBounds(160, 90, 120, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 130, 80, 22);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id);
        id.setBounds(160, 170, 70, 30);

        cadastrar.setBackground(new java.awt.Color(153, 255, 153));
        cadastrar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(140, 210, 130, 31);

        listar.setBackground(new java.awt.Color(153, 255, 153));
        listar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        getContentPane().add(listar);
        listar.setBounds(0, 260, 120, 31);

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setText("Cadastro Biblioteca");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 10, 260, 30);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 260, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/abc.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Usuarios model = new Usuarios();
       
        if ((login.getText().equals("")) && (senha.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "NÃO PODE HAVER CAMPOS EM BRANCO!!!!\n"
                    + "PREENCHA TODOS ELES !!!!");
            login.setText("");
            senha.setText("");

            setVisible(true);
        } else {

            //fazendo referencia aos metodos set do empregr
            model.setLogin(login.getText());
            model.setSenha(senha.getText());
          
        }

        try //tratamento de exceção
        {

            String L = login.getText();
            String S = senha.getText();

            String url = "jdbc:mysql://localhost/integradorlivro";
            String sql = "INSERT INTO usuarios values (null,'" + L + "',md5('" + S + "'))";

            Connection conexao = DriverManager.getConnection(url, "root", ""); //comando de conexão com banco

            PreparedStatement atualizar = conexao.prepareStatement(sql);

            atualizar.executeUpdate();//método

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro na Conexão com Banco de Dados : " + erro);

        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
         try { //tratamento de exceção
            String I = id.getText();
            String url = "jdbc:mysql://localhost/integradorlivro";
            String sql = "DELETE FROM usuarios WHERE id_usuario='" + I + "'";
            Connection conexao = DriverManager.getConnection(url, "root", ""); //comando de conexão com banco
            PreparedStatement atualizar = conexao.prepareStatement(sql);
            atualizar.executeUpdate();//método

            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro na Conexão com Banco de Dados : " + erro);
    }                                       
    }//GEN-LAST:event_deletarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        String I = null;
        String L = null;

        try
        {

            String url = "jdbc:mysql://localhost/integradorlivro";

            Connection conexao = DriverManager.getConnection(url, "root","");

            String sql = "SELECT * FROM usuarios ";

            PreparedStatement pesquisa = conexao.prepareStatement(sql);

            ResultSet resultado = pesquisa.executeQuery();

            while (resultado.next()) {

                I = resultado.getString("id_usuario");
                L  = resultado.getString("login");
                
                

                JOptionPane.showMessageDialog(null,"Dados encontrados com sucesso!\n"+
                    "------------------------------\n"+
                        "ID  : "+I+"\n"+
                        "Login  : "+L+"\n"+
                    "------------------------------");

            }

        }

        catch(Exception erro) {

            JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_listarActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        
          
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton deletar;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton listar;
    private javax.swing.JTextField login;
    private javax.swing.JTextField senha;
    // End of variables declaration//GEN-END:variables
}
