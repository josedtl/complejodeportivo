/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor holas GIGO gggg.
 */
package complejodeportivo;

import Business.T01_Usuarios;
import Entity.T01_UsuariosEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAVID
 */
public class C_UsuarioMain extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    Integer _Id = 0;
    ArrayList<T01_UsuariosEntity> Lista;

    /**
     * Creates new form C_UsuarioMain
     */
    public C_UsuarioMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        String titulos[] = getColumnas();
        dtm.setColumnIdentifiers(titulos);
        lstUsuario.setModel(dtm);
        Mostrar();
    }

    private String[] getColumnas() {

        String columna[] = new String[]{"Nombre", "Estado", "Usuario"};
        return columna;
    }

    private void Mostrar() {

        try {
            T01_Usuarios CN = new T01_Usuarios();
            DefaultTableModel modelo = (DefaultTableModel) lstUsuario.getModel();
            Lista = CN.Get_C_Usuarios();
            Object[] Fila = new Object[modelo.getColumnCount()];

            int f, e, cont = 0;
            f = dtm.getRowCount();
            if (f > 0) {
                for (e = 0; e < f; e++) {
                    modelo.removeRow(0);
                }
            }
            while (cont < Lista.size()) {

                Fila[0] = Lista.get(cont).getUsuario();
                Fila[1] = Lista.get(cont).getEstado() ? "ACTIVO" : "DESACTIVO";
                Fila[2] = Lista.get(cont).getUsuario();
                modelo.addRow(Fila);
                cont += 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstUsuario.setBackground(new java.awt.Color(34, 34, 34));
        lstUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lstUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lstUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        lstUsuario.setShowVerticalLines(false);
        lstUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstUsuarioMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lstUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void lstUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUsuarioMouseReleased

 
        if(evt.getClickCount()==2)
        try {
                int filasele = lstUsuario.getSelectedRow();

                for (T01_UsuariosEntity item : Lista) {
                    if (item.getUsuario().equals(lstUsuario.getValueAt(filasele, 0).toString())) {

                        Other.ComplejoDeportivo._Id = item.getUsuarioId();
                        C_Usuario_JFrame Persona_Formulario = new C_Usuario_JFrame();
                        Persona_Formulario.setVisible(true);
                        this.dispose();
//                    txtNombre.setText(item.getUsuario());
//                    txtFechaRegistro.setText(item.getFechaRegistro());
//                    chkEstado.setSelected(item.getEstado());
//                    txtUsuarioRefistro.setText(item.getUsuario());
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_lstUsuarioMouseReleased


    
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
            java.util.logging.Logger.getLogger(C_UsuarioMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_UsuarioMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_UsuarioMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_UsuarioMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_UsuarioMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lstUsuario;
    // End of variables declaration//GEN-END:variables
}
