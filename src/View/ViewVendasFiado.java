/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.FiadoController;
import DAO.Conexao;
import DAO.FiadoDAO;
import DAO.ProdutoDAO;
import Model.Fiado;
import Model.Produtos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author NEX
 */
public class ViewVendasFiado extends javax.swing.JFrame {
    
    private static boolean aberto = false;

    TelaPrincipal TP = new TelaPrincipal();
    VendasFiado vendasFiado = new VendasFiado();
    
    
    public ViewVendasFiado() throws SQLException {
        initComponents();

        if (TP.getTema() == true) {

            label_fundo_emprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_registro_4.png")));

        } else if (TP.getTema() == false) {

            label_fundo_emprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_registro_4.png")));
        }

        //Conexão
        //
        Connection conexao1 = new Conexao().getConnection();

        ProdutoDAO produtosDAO = new ProdutoDAO(conexao1);
        List<Produtos> listaFerramentas = produtosDAO.listarProdutos();
        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
        for (Produtos f : listaFerramentas) {
            if (f.getEstaEmprestada() == 0) {
                model1.addElement(f.getNome() + "-" + f.getId());
            }

            // comboBoxAmigos.add
        }
        comboBoxProdutos.setModel(model1);

        //Quando fechar pela aba não da erro!
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                aberto = false;
                dispose();
            }
        });

    }

    private void inicializeFormattedField() throws ParseException {

        // Define a máscara para o formato de data (dd/MM/yyyy)
        MaskFormatter maskFormatter = new MaskFormatter("##/##/####");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MaskFormatter maskFormatter = null;
        try{
            maskFormatter = new MaskFormatter("##/##/####");
        }catch(Exception e){
            e.printStackTrace();
        }
        DataVendaFiado = new javax.swing.JFormattedTextField(maskFormatter);
        comboBoxProdutos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        label_quantidadeFiado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRealizarFiado = new javax.swing.JButton();
        cancelarFiado = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_fundo_emprestimos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(235, 120, 3));
        jPanel2.setOpaque(false);

        DataVendaFiado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DataVendaFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataVendaFiadoActionPerformed(evt);
            }
        });

        comboBoxProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdutosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Nome do cliente:");

        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });
        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyReleased(evt);
            }
        });

        label_quantidadeFiado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        label_quantidadeFiado.setText("Quantidade:");

        jLabel5.setText("Item:");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Data da venda:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(label_quantidadeFiado)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeCliente)
                            .addComponent(DataVendaFiado, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtQuantidade))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(DataVendaFiado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_quantidadeFiado))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 470, -1));

        jPanel3.setBackground(new java.awt.Color(8, 119, 197));
        jPanel3.setOpaque(false);

        jRealizarFiado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jRealizarFiado.setText("Realizar Venda");
        jRealizarFiado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRealizarFiado.setFocusPainted(false);
        jRealizarFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRealizarFiadoActionPerformed(evt);
            }
        });

        cancelarFiado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cancelarFiado.setText("Cancelar");
        cancelarFiado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarFiado.setFocusPainted(false);
        cancelarFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFiadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jRealizarFiado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(cancelarFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRealizarFiado)
                    .addComponent(cancelarFiado))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 470, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 400));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 395, 910, 5));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 0, 5, 400));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fiado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 430, 60));

        label_fundo_emprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_registro_4.png"))); // NOI18N
        jPanel1.add(label_fundo_emprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 400));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private void jRealizarFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRealizarFiadoActionPerformed

        String boxProdutos = (String) comboBoxProdutos.getSelectedItem();
        if (boxProdutos == null || boxProdutos.equals("")) {
            JOptionPane.showMessageDialog(null, "Um ou mais campos não foram preenchidos!");
        } else {
            int idProduto = Util.Util.obtemNum(boxProdutos);
            String dataVenda = DataVendaFiado.getText();
            LocalDate dtVenda = Util.Util.converterData(dataVenda);
            String nomeCliente = txtNomeCliente.getText();
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            Fiado fiado = new Fiado(nomeCliente, idProduto, dtVenda, quantidade);
            Connection conexao = new Conexao().getConnection();
            FiadoDAO fiadoDAO = new FiadoDAO(conexao);
            Connection conexao2 = new Conexao().getConnection();
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao2);
            Connection conexao3 = new Conexao().getConnection();
            ProdutoDAO produtoDAO2 = new ProdutoDAO(conexao3);
            try {
                Produtos produtos = produtoDAO.buscarProdutos(idProduto);
                if (produtos.getQuantidade() >= quantidade) {
                    fiadoDAO.insertBD(fiado);
                    produtoDAO2.UpdateQuantidade(produtos.getQuantidade() - quantidade, idProduto);
                    this.fiadoAxu.getFiadoController().listarFiado();
                    JOptionPane.showMessageDialog(null, "Venda Realizada!");
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade Menor que 1, por favor adicione mais deste item");

                }
                // atualizaStatusFerramenta(idProduto);
            } catch (SQLException ex) {
                Logger.getLogger(ViewVendasFiado.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Falha em realizar venda! " + ex);
            }

        }
        aberto = false;
        dispose();
    }//GEN-LAST:event_jRealizarFiadoActionPerformed

    /*  private void atualizaStatusFerramenta(int idFerramenta) {
        Connection conexao = new Conexao().getConnection();
        FerramentaDAO ferramentaDAO = new FerramentaDAO(conexao);
        ferramentaDAO.updateStatus(1, idFerramenta);

    }*/

    private void DataVendaFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataVendaFiadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataVendaFiadoActionPerformed

    private void cancelarFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFiadoActionPerformed
        aberto = false;
        dispose();
    }//GEN-LAST:event_cancelarFiadoActionPerformed

    private void txtNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyReleased
  
    }//GEN-LAST:event_txtNomeClienteKeyReleased

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void comboBoxProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxProdutosActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVendasFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVendasFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVendasFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVendasFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewVendasFiado().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewVendasFiado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private VendasFiado fiadoAxu;

    public void setPrincipal(VendasFiado fiado) {
        this.fiadoAxu = fiado;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DataVendaFiado;
    private javax.swing.JButton cancelarFiado;
    private javax.swing.JComboBox<String> comboBoxProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jRealizarFiado;
    private javax.swing.JLabel label_fundo_emprestimos;
    private javax.swing.JLabel label_quantidadeFiado;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

}
