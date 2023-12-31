/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.FiadoController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author GUI
 */
public class VendasFiado extends javax.swing.JFrame {

    /**
     * Creates new form VendasFiado
     */
     private static boolean aberto = false;
    private final FiadoController controller;

    public VendasFiado() {
        initComponents();
        controller = new FiadoController(this);
        controller.listarFiado();

        
          addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                aberto = false;
                dispose();
            }
        });

        
        
    }
 


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Home = new javax.swing.JPanel();
        b_refreshFiado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_titulo_home = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonVendasFiado = new javax.swing.JButton();
        buttonDeleteVendaFiado = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableFiado = new javax.swing.JTable();
        label_fundo_home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JP_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_refreshFiado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/refresh_icon.png"))); // NOI18N
        b_refreshFiado.setBorderPainted(false);
        b_refreshFiado.setContentAreaFilled(false);
        b_refreshFiado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refreshFiado.setFocusPainted(false);
        b_refreshFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refreshFiadoActionPerformed(evt);
            }
        });
        JP_Home.add(b_refreshFiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 40, 40));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo_home.setFont(new java.awt.Font("Segoe UI Black", 1, 94)); // NOI18N
        label_titulo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Quiosque_M.B_preto.png"))); // NOI18N
        jPanel1.add(label_titulo_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 670, 130));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/quiosque_Icon-removebg-preview.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 160, 190));

        JP_Home.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        buttonVendasFiado.setText("Vender");
        buttonVendasFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVendasFiadoActionPerformed(evt);
            }
        });
        JP_Home.add(buttonVendasFiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 240, 50));

        buttonDeleteVendaFiado.setText("Deletar Venda");
        buttonDeleteVendaFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteVendaFiadoActionPerformed(evt);
            }
        });
        JP_Home.add(buttonDeleteVendaFiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 240, 50));

        tableFiado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome do Cliente", "Nome do produto", "Data da \"Venda\"", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableFiado);

        JP_Home.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 510, -1));

        label_fundo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_Home.add(label_fundo_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JP_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JP_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_refreshFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refreshFiadoActionPerformed
        controller.listarFiado();
    }//GEN-LAST:event_b_refreshFiadoActionPerformed

    private void buttonVendasFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVendasFiadoActionPerformed
        ViewVendasFiado viewVendasFiado;
        try {
            viewVendasFiado = new ViewVendasFiado();
            viewVendasFiado.setVisible(true);
            viewVendasFiado.setPrincipal(this);

        } catch (SQLException ex) {
            Logger.getLogger(VendasFiado.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_buttonVendasFiadoActionPerformed

    private void buttonDeleteVendaFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteVendaFiadoActionPerformed

    }//GEN-LAST:event_buttonDeleteVendaFiadoActionPerformed

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
            java.util.logging.Logger.getLogger(VendasFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasFiado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_Home;
    private javax.swing.JButton b_refreshFiado;
    private javax.swing.JButton buttonDeleteVendaFiado;
    private javax.swing.JButton buttonVendasFiado;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label_fundo_home;
    private javax.swing.JLabel label_titulo_home;
    private javax.swing.JTable tableFiado;
    // End of variables declaration//GEN-END:variables

    public JTable getTableFiado() {
        return tableFiado;
    }

    public void setTableFiado(JTable tableFiado) {
        this.tableFiado = tableFiado;
    }

    public static boolean isAberto() {
        return aberto;
    }

    public static void setAberto(boolean aberto) {
        VendasFiado.aberto = aberto;
    }
   public FiadoController getFiadoController(){
        return this.controller;
    
    }
    
    
}
