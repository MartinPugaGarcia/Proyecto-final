/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package árboles;
import arbol.Árboles;
/**
 *
 * @author marti
 */

public class Principal extends javax.swing.JFrame {

    Árboles arbolito;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PreOrden = new javax.swing.JButton();
        InOrden = new javax.swing.JButton();
        PosOrden = new javax.swing.JButton();
        construir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 50, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 50, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 30, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 30, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 20, 30));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 30, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 30, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 50, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 60, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Árboles Binarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel4.setText("Expresión");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        PreOrden.setText("PreOrden");
        PreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(PreOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 110, 40));

        InOrden.setText("InOrden");
        InOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(InOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 110, 40));

        PosOrden.setText("PosOrden");
        PosOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(PosOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 110, 30));

        construir.setText("Construir Árbol");
        construir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                construirActionPerformed(evt);
            }
        });
        getContentPane().add(construir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 550, -1));

        jLabel2.setText("3*3/4-2*5");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 70, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/árboles/automata.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreOrdenActionPerformed
        cargarArbol();
        jTextArea1.setText(arbolito.preOrden(arbolito.getRaiz()));
    }//GEN-LAST:event_PreOrdenActionPerformed

    private void construirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_construirActionPerformed
        jTextField1.setText("-");
        jTextField2.setText("/");
        jTextField3.setText("*");
        jTextField4.setText("*");
        jTextField5.setText("4");
        jTextField6.setText("2");
        jTextField7.setText("5");
        jTextField8.setText("3");
        jTextField9.setText("3");    
    }//GEN-LAST:event_construirActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void InOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InOrdenActionPerformed
        cargarArbol();
        jTextArea1.setText(arbolito.inOrden(arbolito.getRaiz()));
    }//GEN-LAST:event_InOrdenActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void PosOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosOrdenActionPerformed
        cargarArbol();
        jTextArea1.setText(arbolito.posOrden(arbolito.getRaiz()));
    }//GEN-LAST:event_PosOrdenActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    public void cargarArbol(){
        arbolito = new Árboles(jTextField1.getText());
        //Nivel 1
        arbolito.insertarIzquierda(jTextField2.getText(), arbolito.getRaiz());
        arbolito.insertarDerecha(jTextField3.getText(), arbolito.getRaiz());
        //Nivel 2
        arbolito.insertarIzquierda(jTextField4.getText(), arbolito.getRaiz().getIzquierda());
        arbolito.insertarDerecha(jTextField5.getText(), arbolito.getRaiz().getIzquierda());
        arbolito.insertarIzquierda(jTextField6.getText(), arbolito.getRaiz().getDerecha());
        arbolito.insertarDerecha(jTextField7.getText(), arbolito.getRaiz().getDerecha());
        //Nivel 3
        arbolito.insertarIzquierda(jTextField8.getText(), arbolito.getRaiz().getIzquierda().getIzquierda());
        arbolito.insertarDerecha(jTextField9.getText(), arbolito.getRaiz().getIzquierda().getIzquierda());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InOrden;
    private javax.swing.JButton PosOrden;
    private javax.swing.JButton PreOrden;
    private javax.swing.JButton construir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
