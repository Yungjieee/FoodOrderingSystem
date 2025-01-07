
package myhellokittyfoodorderingsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class RegisterClient extends javax.swing.JFrame {

    private ClientOperation clientOp;
    private HomePage homePage;
    
    public RegisterClient(HomePage homePage) {
        setTitle("MyHelloKitty");
        clientOp = new ClientOperation();
        this.homePage = homePage;
        initComponents();
        initializeForm();
        panelRegister.setPreferredSize(new Dimension(1104, 950)); // Set fixed size to avoid layout shift
        
        Timer timer = new Timer(100, (ActionEvent e) -> {
            String checkId = txtId.getText();
            if (checkId.length()!=6 || !checkId.matches("\\d+")) {
                txtId.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                txtId.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }
            String checkName = txtName.getText();            
            if (checkName.equals("")) {
                txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                txtName.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }
            String checkEmail = txtEmail.getText();
            if (!checkEmail.contains("@gmail.com")) {
                txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                txtEmail.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }
            String checkAddress = txtAddress.getText();
            if (checkAddress.equals("")) {
                txtAddress.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                txtAddress.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }
        });
        timer.start();
    
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelRegister = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdBtnCust = new javax.swing.JRadioButton();
        rdBtnRest = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblDisplayClient = new javax.swing.JTable();
        panelFood1 = new javax.swing.JPanel();
        panelFood = new javax.swing.JPanel();
        lblFoodMenu = new javax.swing.JLabel();
        lblFood1 = new javax.swing.JLabel();
        txtFood1 = new javax.swing.JTextField();
        lblPrice1 = new javax.swing.JLabel();
        txtPrice1 = new javax.swing.JTextField();
        lblFood2 = new javax.swing.JLabel();
        txtFood2 = new javax.swing.JTextField();
        lblPrice2 = new javax.swing.JLabel();
        txtPrice2 = new javax.swing.JTextField();
        lblFood3 = new javax.swing.JLabel();
        txtFood3 = new javax.swing.JTextField();
        lblPrice3 = new javax.swing.JLabel();
        txtPrice3 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        TblDisplayFood = new javax.swing.JTable();
        btnSubmitClient = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        btnDisplayClient = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegister.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REGISTER CLIENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(300, 300, 300))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Registering for : ");

        rdBtnCust.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(rdBtnCust);
        rdBtnCust.setText("Customer");
        rdBtnCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnCustActionPerformed(evt);
            }
        });

        rdBtnRest.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(rdBtnRest);
        rdBtnRest.setText("Restaurant");
        rdBtnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnRestActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Client ID        : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Client Name    :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Address          :");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email              :");

        TblDisplayClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client ID", "Client Name", "Address", "Email"
            }
        ));
        jScrollPane3.setViewportView(TblDisplayClient);

        panelFood1.setBackground(new java.awt.Color(255, 204, 204));

        panelFood.setBackground(new java.awt.Color(255, 204, 204));

        lblFoodMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFoodMenu.setText("Food Menu Item List:");

        lblFood1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFood1.setText("Food 1 :");

        lblPrice1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice1.setText("Price (RM) :");

        lblFood2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFood2.setText("Food 2 :");

        lblPrice2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice2.setText("Price (RM) :");

        lblFood3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFood3.setText("Food 3 :");

        lblPrice3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice3.setText("Price (RM) :");

        TblDisplayFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant ID", "Food", "Price"
            }
        ));
        jScrollPane8.setViewportView(TblDisplayFood);

        javax.swing.GroupLayout panelFoodLayout = new javax.swing.GroupLayout(panelFood);
        panelFood.setLayout(panelFoodLayout);
        panelFoodLayout.setHorizontalGroup(
            panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFoodLayout.createSequentialGroup()
                        .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFoodMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFoodLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFoodLayout.createSequentialGroup()
                                        .addComponent(lblFood3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFood3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFoodLayout.createSequentialGroup()
                                        .addComponent(lblFood2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFood2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFoodLayout.createSequentialGroup()
                                        .addComponent(lblFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFoodLayout.createSequentialGroup()
                                        .addComponent(lblPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFoodLayout.createSequentialGroup()
                                        .addComponent(lblPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFoodLayout.createSequentialGroup()
                                        .addComponent(lblPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );
        panelFoodLayout.setVerticalGroup(
            panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoodMenu)
                .addGap(18, 18, 18)
                .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFood1))
                    .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrice1)
                        .addComponent(txtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFood2)
                    .addComponent(lblPrice2)
                    .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFood3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFood3)
                    .addComponent(lblPrice3)
                    .addComponent(txtPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        btnSubmitClient.setText("Submit");
        btnSubmitClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitClientActionPerformed(evt);
            }
        });

        btnClearAll.setText("Clear");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        btnDisplayClient.setText("Display All Client");
        btnDisplayClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayClientActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFood1Layout = new javax.swing.GroupLayout(panelFood1);
        panelFood1.setLayout(panelFood1Layout);
        panelFood1Layout.setHorizontalGroup(
            panelFood1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFood1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSubmitClient, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnDisplayClient, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFood1Layout.setVerticalGroup(
            panelFood1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFood1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFood1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitClient, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplayClient, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFood1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail))
                            .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelRegisterLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(31, 31, 31)
                                    .addComponent(rdBtnCust)
                                    .addGap(63, 63, 63)
                                    .addComponent(rdBtnRest))
                                .addGroup(panelRegisterLayout.createSequentialGroup()
                                    .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(28, 28, 28)
                                    .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                                        .addComponent(txtName)))
                                .addGroup(panelRegisterLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(30, 30, 30)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdBtnCust)
                        .addComponent(rdBtnRest))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelFood1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdBtnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnRestActionPerformed
        panelFood.setVisible(true);
    }//GEN-LAST:event_rdBtnRestActionPerformed

    private void btnSubmitClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitClientActionPerformed
        if (rdBtnCust.isSelected()) {

            String enteredId = txtId.getText();
            String nameCust = txtName.getText();
            String addressCust = txtAddress.getText();
            String emailCust = txtEmail.getText();
            
            if (enteredId.isEmpty() || nameCust.isEmpty() || addressCust.isEmpty() || emailCust.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (clientOp.isValidId(enteredId)) {
                try {

                    int custID = Integer.parseInt(txtId.getText());
                    
                    Customer cust = new Customer(custID, nameCust, addressCust, emailCust);

                    if (!clientOp.isUniqueCustId(custID)) {
                        JOptionPane.showMessageDialog(this, "Customer ID must be unique!", "Error", JOptionPane.ERROR_MESSAGE);
                        txtId.setText("");
                    } else {
                        clientOp.registerCustomer(cust);
                        JOptionPane.showMessageDialog(this, "  Customer registered Succesfully! ", "Success", JOptionPane.INFORMATION_MESSAGE);

                        DefaultTableModel model = (DefaultTableModel) TblDisplayClient.getModel();
                        model.setRowCount(0); // Clear existing data
                        model.addRow(new Object[]{cust.getId(), cust.getName(), cust.getAddress(), cust.getEmail()});

                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Customer ID cannot be null!", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                // Show error message if validation fails
                JOptionPane.showMessageDialog(this, "ID must be a 6-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (rdBtnRest.isSelected()) {
            String enteredId = txtId.getText();
            String nameRest = txtName.getText();
            String addressRest = txtAddress.getText();
            String emailRest = txtEmail.getText();
            String food1 = txtFood1.getText();
            String food2 = txtFood2.getText();
            String food3 = txtFood3.getText();
            String price1 = txtPrice1.getText();
            String price2 = txtPrice2.getText();
            String price3 = txtPrice3.getText();
            
            if (enteredId.isEmpty() || nameRest.isEmpty() || addressRest.isEmpty() || emailRest.isEmpty() || 
                food1.isEmpty() || food2.isEmpty() || food3.isEmpty() || price1.isEmpty() || price2.isEmpty() || price3.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (clientOp.isValidId(enteredId)) {
                try {
                    int restID = Integer.parseInt(txtId.getText());    
                    double p1 = Double.parseDouble(price1);
                    double p2 = Double.parseDouble(price2);
                    double p3 = Double.parseDouble(price3);
                    List<Food> menu = new ArrayList<>();
                    menu.add(new Food(food1, p1));
                    menu.add(new Food(food2, p2));
                    menu.add(new Food(food3, p3));

                    Restaurant rest = new Restaurant(restID, nameRest, addressRest, emailRest, menu);

                    if (!clientOp.isUniqueRestId(restID)) {
                        JOptionPane.showMessageDialog(this, "Restaurant ID must be unique!", "Error", JOptionPane.ERROR_MESSAGE);
                        txtId.setText("");
                    } else if (food1.equals(food2) || food1.equals(food3) || food3.equals(food2)) {
                        JOptionPane.showMessageDialog(this, "Food name cannot be same!", "Error", JOptionPane.ERROR_MESSAGE);
                        txtFood1.setText("");
                        txtFood2.setText("");
                        txtFood3.setText("");
                        txtPrice1.setText("");
                        txtPrice2.setText("");
                        txtPrice3.setText("");
                    } else if (!clientOp.isRestaurantNameUnique(nameRest)) {
                        JOptionPane.showMessageDialog(this, "Restaurant name must be unique!", "Error", JOptionPane.ERROR_MESSAGE);
                        txtName.setText("");
                    } else {
                        clientOp.registerRestaurant(rest);
                        DefaultTableModel model = (DefaultTableModel) TblDisplayClient.getModel();
                        model.setRowCount(0); // Clear existing data
                        model.addRow(new Object[]{rest.getId(), rest.getName(), rest.getAddress(), rest.getEmail()});
                        DefaultTableModel model2 = (DefaultTableModel) TblDisplayFood.getModel();
                        model2.setRowCount(0); // Clear existing data
                        for (Food f : rest.getFoods()) {
                            model2.addRow(new Object[]{rest.getId(), f.getFood(), f.getPrice()});
                        }
                        JOptionPane.showMessageDialog(this, "Restaurant registered Succesfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Restaurant ID cannot be null!", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                // Show error message if validation fails
                JOptionPane.showMessageDialog(this, "ID must be a 6-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
                JOptionPane.showMessageDialog(this, "Please Select A Client Type!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitClientActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        if (rdBtnCust.isSelected()) {
            txtId.setText("");
            txtName.setText("");
            txtAddress.setText("");
            txtEmail.setText("");
            DefaultTableModel model = (DefaultTableModel) TblDisplayClient.getModel();
            model.setRowCount(0);
        } else if (rdBtnRest.isSelected()) {
            txtId.setText("");
            txtName.setText("");
            txtAddress.setText("");
            txtEmail.setText("");
            txtFood1.setText("");
            txtPrice1.setText("");
            txtFood2.setText("");
            txtPrice2.setText("");
            txtFood3.setText("");
            txtPrice3.setText("");
            DefaultTableModel model = (DefaultTableModel) TblDisplayClient.getModel();
            model.setRowCount(0);
            DefaultTableModel model2 = (DefaultTableModel) TblDisplayFood.getModel();
            model2.setRowCount(0);
        }
        buttonGroup1.clearSelection();

    }//GEN-LAST:event_btnClearAllActionPerformed

    private void btnDisplayClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayClientActionPerformed

        DefaultTableModel model = (DefaultTableModel) TblDisplayClient.getModel();
        model.setRowCount(0); // Clear existing data
        
        if (rdBtnCust.isSelected()) {
            for (Client c : clientOp.getCustList()) {
                model.addRow(new Object[]{c.getId(), c.getName(), c.getAddress(), c.getEmail()});
            }
        } else if (rdBtnRest.isSelected()) {
            DefaultTableModel model2 = (DefaultTableModel) TblDisplayFood.getModel();
            model2.setRowCount(0); // Clear existing data

            for (Restaurant r : clientOp.getRestList()) {
                model.addRow(new Object[]{r.getId(), r.getName(), r.getAddress(), r.getEmail()});
                for (Food f : r.getFoods()) {
                    model2.addRow(new Object[]{r.getId(), f.getFood(), f.getPrice()});
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select A Client Type!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDisplayClientActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        homePage.setLocationRelativeTo(null);
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void rdBtnCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnCustActionPerformed
        panelFood.setVisible(false);
    }//GEN-LAST:event_rdBtnCustActionPerformed
    private void initializeForm() {

        panelFood.setVisible(false);
    }

    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterClient registerClient = new RegisterClient(new HomePage());
                registerClient.setLocationRelativeTo(null);
                registerClient.setVisible(true);

            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblDisplayClient;
    private javax.swing.JTable TblDisplayFood;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnDisplayClient;
    private javax.swing.JButton btnSubmitClient;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblFood1;
    private javax.swing.JLabel lblFood2;
    private javax.swing.JLabel lblFood3;
    private javax.swing.JLabel lblFoodMenu;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblPrice3;
    private javax.swing.JPanel panelFood;
    private javax.swing.JPanel panelFood1;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JRadioButton rdBtnCust;
    private javax.swing.JRadioButton rdBtnRest;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFood1;
    private javax.swing.JTextField txtFood2;
    private javax.swing.JTextField txtFood3;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice1;
    private javax.swing.JTextField txtPrice2;
    private javax.swing.JTextField txtPrice3;
    // End of variables declaration//GEN-END:variables
}
