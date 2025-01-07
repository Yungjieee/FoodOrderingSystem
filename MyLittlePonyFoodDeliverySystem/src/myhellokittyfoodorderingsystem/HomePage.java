package myhellokittyfoodorderingsystem;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        setTitle("MyHelloKitty");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btnRegisterClient = new javax.swing.JButton();
        btnAddOrder = new javax.swing.JButton();
        btnSearchClient = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnModifyClient = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegisterClient.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnRegisterClient.setText("Register Client");
        btnRegisterClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterClientActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, -1));

        btnAddOrder.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddOrder.setText("Add Order");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 140, -1));

        btnSearchClient.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSearchClient.setText("Search Client");
        btnSearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 140, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.setText("Display Clients");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 140, -1));

        btnModifyClient.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnModifyClient.setText("Modify Client");
        btnModifyClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyClientActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifyClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 140, -1));

        jPanel1.setBackground(new java.awt.Color(243, 229, 191));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("MY HELLO KITTY FOOD ORDERING SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 441, 90));

        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 140, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myhellokittyfoodorderingsystem/hkb.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterClientActionPerformed
        RegisterClient registerClient = new RegisterClient(this);
        registerClient.setVisible(true);
        registerClient.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegisterClientActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        AddOrder addOrder = new AddOrder(this);
        addOrder.setVisible(true);
        addOrder.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DisplayClients displayClients = new DisplayClients(this);
        displayClients.setVisible(true);
        displayClients.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientActionPerformed
        SearchClient searchClient = new SearchClient(this);
        searchClient.setVisible(true);
        searchClient.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSearchClientActionPerformed

    private void btnModifyClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyClientActionPerformed
        ModifyClient modifyClient = new ModifyClient(this);
        modifyClient.setVisible(true);
        modifyClient.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModifyClientActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePage homePage = new HomePage();
                homePage.setLocationRelativeTo(null);
                homePage.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModifyClient;
    private javax.swing.JButton btnRegisterClient;
    private javax.swing.JButton btnSearchClient;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
