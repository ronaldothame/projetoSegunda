/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Connections.CompraConnection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Votogames
 */
public class HomeCompra extends javax.swing.JFrame {

    public HomeCompra() {
        initComponents();
        CompraConnection compraConnection = new CompraConnection();
        compraConnection.handleSearch(tbl_tabelaCompras);

        List<String> nomesFuncionarios = compraConnection.getNomesFuncionarios();
        for (String nomeFuncionario : nomesFuncionarios) {
            cbx_Funcionario.addItem(nomeFuncionario);
        }

        List<String> nomesProdutos = compraConnection.getNomesProdutos();
        for (String nomeProduto : nomesProdutos) {
            cbx_Produto.addItem(nomeProduto);
        }

        tbl_tabelaCompras.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = tbl_tabelaCompras.getSelectedRow();
                    if (selectedRow != -1) {
                        Object quantidadeValue = tbl_tabelaCompras.getValueAt(selectedRow, 3);
                        if (quantidadeValue != null) {
                            String quantidade = quantidadeValue.toString();
                            txt_qnt.setText(quantidade);
                        }
                    }
                }
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

        lbl_sejaBemVindo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tabelaCompras = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lbl_Funcionario = new javax.swing.JLabel();
        lbl_Produto = new javax.swing.JLabel();
        lbl_qnt = new javax.swing.JLabel();
        txt_qnt = new javax.swing.JTextField();
        btm_Comprar = new javax.swing.JButton();
        btm_Excluir = new javax.swing.JButton();
        cbx_Funcionario = new javax.swing.JComboBox<>();
        cbx_Produto = new javax.swing.JComboBox<>();
        btm_Alterar1 = new javax.swing.JButton();
        btm_sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_sejaBemVindo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_sejaBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_sejaBemVindo.setText("COMPRA");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_tabelaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Funcionário", "Produto", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tbl_tabelaCompras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_Funcionario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_Funcionario.setText("FUNCIONARIO");

        lbl_Produto.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_Produto.setText("PRODUTO");

        lbl_qnt.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_qnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_qnt.setText("QUANTIDADE");
        lbl_qnt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_qnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qntActionPerformed(evt);
            }
        });

        btm_Comprar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btm_Comprar.setText("COMPRAR");
        btm_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_ComprarActionPerformed(evt);
            }
        });

        btm_Excluir.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btm_Excluir.setText("EXCLUIR");
        btm_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_ExcluirActionPerformed(evt);
            }
        });

        cbx_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_FuncionarioActionPerformed(evt);
            }
        });

        btm_Alterar1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btm_Alterar1.setText("ALTERAR");
        btm_Alterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_Alterar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Funcionario)
                    .addComponent(cbx_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbl_Produto))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cbx_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btm_Excluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btm_Alterar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btm_Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm_Alterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_Comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btm_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btm_sair.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btm_sair.setForeground(new java.awt.Color(255, 0, 0));
        btm_sair.setText("SAIR");
        btm_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_sairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("SEJA BEM VINDO À");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("MEROY LERLIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(lbl_sejaBemVindo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btm_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_sejaBemVindo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btm_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_qntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qntActionPerformed

    private void btm_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_ComprarActionPerformed
        CompraConnection compraConnection = new CompraConnection();

        String funcionarioSelecionado = cbx_Funcionario.getSelectedItem().toString();
        String produtoSelecionado = cbx_Produto.getSelectedItem().toString();
        String quantidadeTexto = txt_qnt.getText();

        if (quantidadeTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida!");
        } else {
            int quantidade = Integer.parseInt(quantidadeTexto);

            compraConnection.handleCadastrarCompra(funcionarioSelecionado, produtoSelecionado, quantidade);
            compraConnection.handleSearch(tbl_tabelaCompras);
        }
        txt_qnt.setText("");
    }//GEN-LAST:event_btm_ComprarActionPerformed

    private void btm_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_ExcluirActionPerformed
        CompraConnection compraConnection = new CompraConnection();
        if (tbl_tabelaCompras.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma compra na tabela.");
            return;
        }
        compraConnection.handleExcluirCompra(Integer.parseInt(tbl_tabelaCompras.getValueAt(tbl_tabelaCompras.getSelectedRow(), 0).toString()));
        compraConnection.handleSearch(tbl_tabelaCompras);

    }//GEN-LAST:event_btm_ExcluirActionPerformed

    private void btm_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_sairActionPerformed
        int sair = JOptionPane.showConfirmDialog(this, "Voltar ao menu anterior?", "", 2);
        if (sair == 0) {
            Menu menu = new Menu();
            menu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btm_sairActionPerformed

    private void btm_Alterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_Alterar1ActionPerformed
        CompraConnection compraConnection = new CompraConnection();
        int selectedRow = tbl_tabelaCompras.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma compra na tabela.");
            return;
        }

        int id = Integer.parseInt(tbl_tabelaCompras.getValueAt(selectedRow, 0).toString());
        String funcionarioSelecionado = cbx_Funcionario.getSelectedItem().toString();
        String produtoSelecionado = cbx_Produto.getSelectedItem().toString();
        int quantidade = Integer.parseInt(txt_qnt.getText());

        compraConnection.handleAlterarCompra(id, funcionarioSelecionado, produtoSelecionado, quantidade);
        compraConnection.handleSearch(tbl_tabelaCompras);
        txt_qnt.setText("");
    }//GEN-LAST:event_btm_Alterar1ActionPerformed

    private void cbx_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_FuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_FuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(HomeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_Alterar1;
    private javax.swing.JButton btm_Comprar;
    private javax.swing.JButton btm_Excluir;
    private javax.swing.JButton btm_sair;
    private javax.swing.JComboBox<String> cbx_Funcionario;
    private javax.swing.JComboBox<String> cbx_Produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Funcionario;
    private javax.swing.JLabel lbl_Produto;
    private javax.swing.JLabel lbl_qnt;
    private javax.swing.JLabel lbl_sejaBemVindo;
    private javax.swing.JTable tbl_tabelaCompras;
    private javax.swing.JTextField txt_qnt;
    // End of variables declaration//GEN-END:variables
}