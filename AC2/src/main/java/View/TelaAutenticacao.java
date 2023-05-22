package View;
import Connections.UserConnection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author caue
 */
public class TelaAutenticacao extends javax.swing.JFrame {

    public TelaAutenticacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel_meroy = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_semCadastro = new javax.swing.JLabel();
        btm_cadastro = new javax.swing.JButton();
        lbl_acesso = new javax.swing.JLabel();
        jPanel_login = new javax.swing.JPanel();
        lbl_login = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_user = new javax.swing.JTextPane();
        btm_acesso = new javax.swing.JButton();
        lbl_senha = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();

        jTextPane2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextPane2.setText("Usuário");
        jTextPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextPane2);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Usuário:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_meroy.setBackground(new java.awt.Color(255, 246, 246));

        lbl_semCadastro.setBackground(new java.awt.Color(0, 0, 0));
        lbl_semCadastro.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lbl_semCadastro.setText("Nao tem cadastro? Cadastre aqui:");

        btm_cadastro.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btm_cadastro.setText("CADASTRO");
        btm_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_cadastroActionPerformed(evt);
            }
        });

        lbl_acesso.setBackground(new java.awt.Color(0, 0, 0));
        lbl_acesso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbl_acesso.setText("ACESSO RESTRITO A FUNCIONÁRIOS");

        javax.swing.GroupLayout jPanel_meroyLayout = new javax.swing.GroupLayout(jPanel_meroy);
        jPanel_meroy.setLayout(jPanel_meroyLayout);
        jPanel_meroyLayout.setHorizontalGroup(
            jPanel_meroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_meroyLayout.createSequentialGroup()
                .addGroup(jPanel_meroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_meroyLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lbl_semCadastro))
                    .addGroup(jPanel_meroyLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel1))
                    .addGroup(jPanel_meroyLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbl_acesso))
                    .addGroup(jPanel_meroyLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btm_cadastro)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel_meroyLayout.setVerticalGroup(
            jPanel_meroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_meroyLayout.createSequentialGroup()
                .addGroup(jPanel_meroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_meroyLayout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1))
                    .addGroup(jPanel_meroyLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lbl_acesso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(lbl_semCadastro)
                .addGap(7, 7, 7)
                .addComponent(btm_cadastro)
                .addContainerGap())
        );

        jPanel_login.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_login.setBackground(new java.awt.Color(0, 0, 0));
        lbl_login.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbl_login.setText("LOGIN");

        txt_user.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txt_user);

        btm_acesso.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btm_acesso.setText("ACESSAR");
        btm_acesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_acessoActionPerformed(evt);
            }
        });

        lbl_senha.setBackground(new java.awt.Color(0, 0, 0));
        lbl_senha.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_senha.setText("Senha:");

        lbl_user.setBackground(new java.awt.Color(0, 0, 0));
        lbl_user.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_user.setText("Usuário:");

        txt_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_loginLayout = new javax.swing.GroupLayout(jPanel_login);
        jPanel_login.setLayout(jPanel_loginLayout);
        jPanel_loginLayout.setHorizontalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_loginLayout.createSequentialGroup()
                        .addComponent(lbl_senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                        .addComponent(btm_acesso)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                        .addComponent(lbl_login)
                        .addGap(150, 150, 150))))
            .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_loginLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(lbl_user)
                    .addContainerGap(320, Short.MAX_VALUE)))
        );
        jPanel_loginLayout.setVerticalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_login)
                .addGap(104, 104, 104)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_senha)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(btm_acesso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_loginLayout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(lbl_user)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_meroy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_meroy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btm_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_cadastroActionPerformed
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
                cadastroUsuario.setVisible(true);

    }//GEN-LAST:event_btm_cadastroActionPerformed

    private void btm_acessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_acessoActionPerformed
        String login = txt_user.getText();
        String senha = new String(txt_senha.getPassword());
        
        UserConnection userConnection = new UserConnection();
        int logou = userConnection.handleLogin(login, senha);
        if (logou == 1)
            dispose();
        
    }//GEN-LAST:event_btm_acessoActionPerformed

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaActionPerformed

    }//GEN-LAST:event_txt_senhaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAutenticacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_acesso;
    private javax.swing.JButton btm_cadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JPanel jPanel_meroy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lbl_acesso;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_semCadastro;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextPane txt_user;
    // End of variables declaration//GEN-END:variables

}
