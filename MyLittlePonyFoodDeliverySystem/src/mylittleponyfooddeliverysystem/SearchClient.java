package mylittleponyfooddeliverysystem;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class SearchClient extends javax.swing.JFrame {

    private ClientOperation clientOp;
    private HomePage homePage;

    public SearchClient(HomePage homePage) {
        setTitle("My Little Pony");
        clientOp = new ClientOperation();
        this.homePage = homePage;
        initComponents();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                homePage.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpClient = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSearchResult = new javax.swing.JTextArea();
        lblChooseClient = new javax.swing.JLabel();
        btnCust = new javax.swing.JRadioButton();
        btnRest = new javax.swing.JRadioButton();
        lblId = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("SEARCH CLIENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearchResult.setColumns(20);
        txtSearchResult.setRows(5);
        jScrollPane1.setViewportView(txtSearchResult);

        lblChooseClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblChooseClient.setText("Choose Client :");

        btnCust.setBackground(new java.awt.Color(204, 204, 255));
        btnGrpClient.add(btnCust);
        btnCust.setText("Customer");

        btnRest.setBackground(new java.awt.Color(204, 204, 255));
        btnGrpClient.add(btnRest);
        btnRest.setText("Restaurant");

        lblId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblId.setText("Enter ID        :");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblChooseClient)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnSearch))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCust)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRest))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnBack)
                        .addGap(70, 70, 70)
                        .addComponent(btnClear))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseClient)
                    .addComponent(btnCust)
                    .addComponent(btnRest))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        homePage.setLocationRelativeTo(null);
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        btnGrpClient.clearSelection();
        txtId.setText("");
        txtSearchResult.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        txtSearchResult.setText("");
        txtSearchResult.setEditable(false);
        try {
            int clientId = Integer.parseInt(txtId.getText());

            if (btnCust.isSelected()) {
                if (clientOp.isCustomerRegistered(clientId)) {
                    Client customer = clientOp.getCustomerById(clientId);
                    StringBuilder result = new StringBuilder();
                    result.append("Name: ").append(customer.getName()).append("\n");
                    result.append("Home Address: ").append(customer.getAddress()).append("\n");
                    result.append("Email Address: ").append(customer.getEmail()).append("\n");
                    result.append("Past Orders: \n");

                    double totalAmount = 0.0;
                    List<Order> customerOrders = clientOp.getOrdersByCustomerId(clientId);
                    
                    int i = 1;
                    
                    for (Order order : customerOrders) {
                        result.append("---------------------------------").append("\n");
                        result.append("Order ").append(i).append("\n");
                        result.append("Restaurant Name: ").append(order.getRestaurantName()).append("\n");
                        result.append("Date Ordered: ").append(order.getDateOrdered()).append("\n");
                        result.append("Foods Ordered: \n");
                        
                        for (OrderItem item : order.getOrderItems()) {
                            result.append(" - ").append(item.getFoodName()).append(" x").append(item.getQuantity()).append("\n");
                            
                        }
                        
                        result.append("Order Amount: RM").append(String.format("%.2f", order.getTotalAmount())).append("\n");
                        totalAmount += order.getTotalAmount();
                        result.append("\n");
                        i++;
                    }
                    result.append("Total Amount Paid: RM").append(String.format("%.2f", totalAmount)).append("\n");
                    txtSearchResult.setText(result.toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Customer with ID " + clientId + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (btnRest.isSelected()) {
                if (clientOp.isRestaurantRegistered(clientId)) {
                    Restaurant restaurant = clientOp.getRestaurantById(clientId);
                    StringBuilder result = new StringBuilder();
                    result.append("Name: ").append(restaurant.getName()).append("\n");
                    result.append("Email Address: ").append(restaurant.getEmail()).append("\n");
                    result.append("Foods Sold: \n");

                    for (Food food : clientOp.getFoodsByRestaurantID(clientId)) {
                        result.append(" - ").append(food.getFood()).append(": RM ").append(String.format("%.2f", food.getPrice())).append("\n");
                    }

                    txtSearchResult.setText(result.toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Restaurant with ID " + clientId + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select either Customer or Restaurant.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchClient searchClient = new SearchClient(new HomePage());
                searchClient.setLocationRelativeTo(null);
                searchClient.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JRadioButton btnCust;
    private javax.swing.ButtonGroup btnGrpClient;
    private javax.swing.JRadioButton btnRest;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChooseClient;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtSearchResult;
    // End of variables declaration//GEN-END:variables
}
