package mylittleponyfooddeliverysystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ModifyClient extends javax.swing.JFrame {

    private ClientOperation clientOp;
    private HomePage homePage;

    public ModifyClient(HomePage homePage) {
        setTitle("My Little Pony");
        initComponents();
        btnDelete.setEnabled(false);
        txtName.setEnabled(false);
        txtAddress.setEnabled(false);
        txtEmail.setEnabled(false);
        txtFood1.setEnabled(false);
        txtFood2.setEnabled(false);
        txtFood3.setEnabled(false);
        txtPrice1.setEnabled(false);
        txtPrice2.setEnabled(false);
        txtPrice3.setEnabled(false);
        txtFood1.setVisible(false);
        txtFood2.setVisible(false);
        txtFood3.setVisible(false);
        txtPrice1.setVisible(false);
        txtPrice2.setVisible(false);
        txtPrice3.setVisible(false);
        lblFood1.setVisible(false);
        lblFood2.setVisible(false);
        lblFood3.setVisible(false);
        lblPrice1.setVisible(false);
        lblPrice2.setVisible(false);
        lblPrice3.setVisible(false);
        lblCategory1.setVisible(false);
        lblCategory2.setVisible(false);
        lblCategory3.setVisible(false);
        cbxCategory1.setVisible(false);
        cbxCategory2.setVisible(false);
        cbxCategory3.setVisible(false);

        panelModify.setPreferredSize(new Dimension(635, 610)); // Set fixed size to avoid layout shift

        btnSaveChanges.setEnabled(false);

        clientOp = new ClientOperation();
        this.homePage = homePage;

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
        panelModify = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblChooseClient = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnCust = new javax.swing.JRadioButton();
        btnRest = new javax.swing.JRadioButton();
        txtId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblFood1 = new javax.swing.JLabel();
        lblFood2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtFood1 = new javax.swing.JTextField();
        txtFood2 = new javax.swing.JTextField();
        btnSaveChanges = new javax.swing.JButton();
        lblFood3 = new javax.swing.JLabel();
        lblPrice2 = new javax.swing.JLabel();
        lblPrice1 = new javax.swing.JLabel();
        lblPrice3 = new javax.swing.JLabel();
        txtPrice2 = new javax.swing.JTextField();
        txtFood3 = new javax.swing.JTextField();
        txtPrice1 = new javax.swing.JTextField();
        txtPrice3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblCategory1 = new javax.swing.JLabel();
        cbxCategory1 = new javax.swing.JComboBox<>();
        lblCategory2 = new javax.swing.JLabel();
        cbxCategory2 = new javax.swing.JComboBox<>();
        lblCategory3 = new javax.swing.JLabel();
        cbxCategory3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelModify.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("MODIFY CLIENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(lblTitle)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

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

        lblChooseClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblChooseClient.setText("Choose Client :");

        lblId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblId.setText("Enter ID :");

        btnCust.setBackground(new java.awt.Color(204, 255, 204));
        btnGrpClient.add(btnCust);
        btnCust.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCust.setText("Customer");
        btnCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustActionPerformed(evt);
            }
        });

        btnRest.setBackground(new java.awt.Color(204, 255, 204));
        btnGrpClient.add(btnRest);
        btnRest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRest.setText("Restaurant");
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("Name   :");

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAddress.setText("Address :");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Email    :");

        lblFood1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFood1.setText("Food 1 :");

        lblFood2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFood2.setText("Food 2 :");

        txtFood2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFood2ActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        lblFood3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFood3.setText("Food 3 :");

        lblPrice2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice2.setText("Price 2 : RM");

        lblPrice1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice1.setText("Price 1 : RM");

        lblPrice3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice3.setText("Price 3 : RM");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Only Restaurant Able to Modify Their Menu:");

        lblCategory1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCategory1.setText("Category :");

        cbxCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Course", "Beverage", "Dessert" }));

        lblCategory2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCategory2.setText("Category :");

        cbxCategory2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Course", "Beverage", "Dessert" }));

        lblCategory3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCategory3.setText("Category :");

        cbxCategory3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Course", "Beverage", "Dessert" }));

        javax.swing.GroupLayout panelModifyLayout = new javax.swing.GroupLayout(panelModify);
        panelModify.setLayout(panelModifyLayout);
        panelModifyLayout.setHorizontalGroup(
            panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelModifyLayout.createSequentialGroup()
                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModifyLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnCust)
                        .addGap(37, 37, 37)
                        .addComponent(btnRest))
                    .addGroup(panelModifyLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(panelModifyLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblChooseClient))
                    .addGroup(panelModifyLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelModifyLayout.createSequentialGroup()
                                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelModifyLayout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch))
                                    .addComponent(txtName)
                                    .addComponent(txtAddress)
                                    .addComponent(txtEmail)))
                            .addGroup(panelModifyLayout.createSequentialGroup()
                                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFood1)
                                    .addComponent(lblFood2)
                                    .addComponent(lblFood3))
                                .addGap(18, 18, 18)
                                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFood3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(txtFood1)
                                    .addComponent(txtFood2))
                                .addGap(21, 21, 21)
                                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelModifyLayout.createSequentialGroup()
                                        .addComponent(lblCategory3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPrice3))
                                    .addGroup(panelModifyLayout.createSequentialGroup()
                                        .addComponent(lblCategory1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(lblPrice1))
                                    .addGroup(panelModifyLayout.createSequentialGroup()
                                        .addComponent(lblCategory2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPrice2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelModifyLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnSaveChanges)
                        .addGap(39, 39, 39)
                        .addComponent(btnDelete)
                        .addGap(36, 36, 36)
                        .addComponent(btnBack)
                        .addGap(36, 36, 36)
                        .addComponent(btnClear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelModifyLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPrice1, txtPrice2, txtPrice3});

        panelModifyLayout.setVerticalGroup(
            panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModifyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseClient)
                    .addComponent(btnCust)
                    .addComponent(btnRest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModifyLayout.createSequentialGroup()
                        .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFood1)
                            .addComponent(txtFood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory1)
                            .addComponent(cbxCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFood2)
                            .addComponent(txtFood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory2)
                            .addComponent(cbxCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFood3)
                                .addComponent(txtFood3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrice3)
                                .addComponent(lblCategory3))
                            .addComponent(cbxCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModifyLayout.createSequentialGroup()
                        .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice1))
                        .addGap(18, 18, 18)
                        .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice2))
                        .addGap(18, 18, 18)
                        .addComponent(txtPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(33, 33, 33)
                .addGroup(panelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModify, javax.swing.GroupLayout.PREFERRED_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        int clientId = Integer.parseInt(txtId.getText());
        Restaurant rest = clientOp.getRestaurantById(clientId);

        String name = txtName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        int response = JOptionPane.showConfirmDialog(this, "Do you want to save the changes?", "Confirm save changes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {

            if (btnCust.isSelected()) {
                clientOp.updateCustomer(clientId, name, address, email);
                JOptionPane.showMessageDialog(this, "Customer details updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            } else if (btnRest.isSelected()) {
                if (rest.getName().equals(name) || clientOp.isRestaurantNameUnique(name)) {
                    String food1 = txtFood1.getText();
                    String food2 = txtFood2.getText();
                    String food3 = txtFood3.getText();
                    String[] foods = {food1, food2, food3};

                    double price1 = Double.parseDouble(txtPrice1.getText());
                    double price2 = Double.parseDouble(txtPrice2.getText());
                    double price3 = Double.parseDouble(txtPrice3.getText());
                    double[] prices = {price1, price2, price3};
                    String category1 = cbxCategory1.getSelectedItem().toString();
                    String category2 = cbxCategory2.getSelectedItem().toString();
                    String category3 = cbxCategory3.getSelectedItem().toString();
                    String[] categories = {category1, category2, category3};

                    clientOp.updateRestaurant(clientId, name, address, email, foods, prices, categories);
                    JOptionPane.showMessageDialog(this, "Restaurant details updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Restaurant name must be unique!", "Error", JOptionPane.ERROR_MESSAGE);
                    txtName.setText("");

                }

            }
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            int clientId = Integer.parseInt(txtId.getText());
            if (btnCust.isSelected()) {
                if (clientOp.isCustomerRegistered(clientId)) {
                    JOptionPane.showMessageDialog(null, "Customer with ID " + clientId + " found !", "Success", JOptionPane.INFORMATION_MESSAGE);
                    txtId.setEnabled(false);
                    btnDelete.setEnabled(true);
                    btnSaveChanges.setEnabled(true);
                    txtName.setEnabled(true);
                    txtAddress.setEnabled(true);
                    txtEmail.setEnabled(true);
                    txtFood1.setVisible(false);
                    txtFood2.setVisible(false);
                    txtFood3.setVisible(false);
                    txtPrice1.setVisible(false);
                    txtPrice2.setVisible(false);
                    txtPrice3.setVisible(false);
                    lblFood1.setVisible(false);
                    lblFood2.setVisible(false);
                    lblFood3.setVisible(false);
                    lblPrice1.setVisible(false);
                    lblPrice2.setVisible(false);
                    lblPrice3.setVisible(false);
                    lblCategory1.setVisible(false);
                    lblCategory2.setVisible(false);
                    lblCategory3.setVisible(false);
                    cbxCategory1.setVisible(false);
                    cbxCategory2.setVisible(false);
                    cbxCategory3.setVisible(false);
                    btnSaveChanges.setEnabled(true);
                    Timer timer = new Timer(100, (ActionEvent e) -> {

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

                    Client customer = clientOp.getCustomerById(clientId);
                    if (customer != null) {
                        txtName.setText(customer.getName());
                        txtAddress.setText(customer.getAddress());
                        txtEmail.setText(customer.getEmail());
                    } else {
                        JOptionPane.showMessageDialog(this, "Error retrieving customer details.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Customer with ID " + clientId + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    txtId.setText("");
                }
            } else if (btnRest.isSelected()) {
                if (clientOp.isRestaurantRegistered(clientId)) {
                    JOptionPane.showMessageDialog(null, "Restaurant with ID " + clientId + " found !", "Success", JOptionPane.INFORMATION_MESSAGE);
                    txtId.setEnabled(false);
                    btnDelete.setEnabled(true);
                    txtName.setEnabled(true);
                    txtAddress.setEnabled(true);
                    txtEmail.setEnabled(true);
                    txtFood1.setEnabled(true);
                    txtFood2.setEnabled(true);
                    txtFood3.setEnabled(true);
                    txtPrice1.setEnabled(true);
                    txtPrice2.setEnabled(true);
                    txtPrice3.setEnabled(true);
                    txtFood1.setVisible(true);
                    txtFood2.setVisible(true);
                    txtFood3.setVisible(true);
                    txtPrice1.setVisible(true);
                    txtPrice2.setVisible(true);
                    txtPrice3.setVisible(true);
                    lblFood1.setVisible(true);
                    lblFood2.setVisible(true);
                    lblFood3.setVisible(true);
                    lblPrice1.setVisible(true);
                    lblPrice2.setVisible(true);
                    lblPrice3.setVisible(true);
                    lblCategory1.setVisible(true);
                    lblCategory2.setVisible(true);
                    lblCategory3.setVisible(true);
                    cbxCategory1.setVisible(true);
                    cbxCategory2.setVisible(true);
                    cbxCategory3.setVisible(true);

                    btnSaveChanges.setEnabled(true);
                    Timer timer = new Timer(100, (ActionEvent e) -> {

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
                    Restaurant restaurant = clientOp.getRestaurantById(clientId);
                    if (restaurant != null) {
                        txtName.setText(restaurant.getName());
                        txtAddress.setText(restaurant.getAddress());
                        txtEmail.setText(restaurant.getEmail());

                        //CHANGED
                        List<Food> food = clientOp.getFoodsByRestaurantID(clientId);
                        restaurant.setFoods(food);

                        if (food != null) {
                            if (food.size() > 0) {
                                txtFood1.setText(food.get(0).getName());
                                txtPrice1.setText(String.format("%.2f", food.get(0).getPrice()));
                                cbxCategory1.setSelectedItem(food.get(0).getCategory());
                            }
                            if (food.size() > 1) {
                                txtFood2.setText(food.get(1).getName());
                                txtPrice2.setText(String.format("%.2f", food.get(1).getPrice()));
                                cbxCategory2.setSelectedItem(food.get(1).getCategory());
                            }
                            if (food.size() > 2) {
                                txtFood3.setText(food.get(2).getName());
                                txtPrice3.setText(String.format("%.2f", food.get(2).getPrice()));
                                cbxCategory3.setSelectedItem(food.get(2).getCategory());
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Error retrieving restaurant details.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Restaurant with ID " + clientId + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    txtId.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select either Customer or Restaurant.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
            txtId.setText("");
        } catch (NullPointerException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        btnGrpClient.clearSelection();
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtFood1.setText("");
        txtFood2.setText("");
        txtFood3.setText("");
        txtPrice1.setText("");
        txtPrice2.setText("");
        txtPrice3.setText("");
        btnDelete.setEnabled(false);
        btnSaveChanges.setEnabled(false);
        txtId.setEnabled(true);
        txtName.setEnabled(false);
        txtAddress.setEnabled(false);
        txtEmail.setEnabled(false);
        txtFood1.setEnabled(false);
        txtFood2.setEnabled(false);
        txtFood3.setEnabled(false);
        txtPrice1.setEnabled(false);
        txtPrice2.setEnabled(false);
        txtPrice3.setEnabled(false);
        txtFood1.setVisible(false);
        txtFood2.setVisible(false);
        txtFood3.setVisible(false);
        txtPrice1.setVisible(false);
        txtPrice2.setVisible(false);
        txtPrice3.setVisible(false);
        lblFood1.setVisible(false);
        lblFood2.setVisible(false);
        lblFood3.setVisible(false);
        lblPrice1.setVisible(false);
        lblPrice2.setVisible(false);
        lblPrice3.setVisible(false);
        lblCategory1.setVisible(false);
        lblCategory2.setVisible(false);
        lblCategory3.setVisible(false);
        cbxCategory1.setVisible(false);
        cbxCategory2.setVisible(false);
        cbxCategory3.setVisible(false);
        btnSaveChanges.setEnabled(true);
        // Reset combo boxes to their default value
        cbxCategory1.setSelectedIndex(0);
        cbxCategory2.setSelectedIndex(0);
        cbxCategory3.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        homePage.setLocationRelativeTo(null);
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            if (txtId == null || txtId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid client ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int clientId = Integer.parseInt(txtId.getText());
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the client with ID " + clientId + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                if (btnCust.isSelected()) {
                    clientOp.deleteCustomer(clientId);
                } else if (btnRest.isSelected()) {
                    clientOp.deleteRestaurant(clientId);
                }
                btnGrpClient.clearSelection();
                txtId.setText("");
                txtName.setText("");
                txtAddress.setText("");
                txtEmail.setText("");
                txtFood1.setText("");
                txtFood2.setText("");
                txtFood3.setText("");
                txtPrice1.setText("");
                txtPrice2.setText("");
                txtPrice3.setText("");

                // Reset combo boxes to their default value
                cbxCategory1.setSelectedIndex(0);
                cbxCategory2.setSelectedIndex(0);
                cbxCategory3.setSelectedIndex(0);

                JOptionPane.showMessageDialog(this, "Client with ID " + clientId + " has been successfully deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnSaveChanges.setEnabled(false);
                btnDelete.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Deletion canceled.", "Canceled", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numerical client ID.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustActionPerformed

    }//GEN-LAST:event_btnCustActionPerformed

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestActionPerformed

    private void txtFood2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFood2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFood2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifyClient modifyClient = new ModifyClient(new HomePage());
                modifyClient.setLocationRelativeTo(null);
                modifyClient.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JRadioButton btnCust;
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGrpClient;
    private javax.swing.JRadioButton btnRest;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxCategory1;
    private javax.swing.JComboBox<String> cbxCategory2;
    private javax.swing.JComboBox<String> cbxCategory3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCategory1;
    private javax.swing.JLabel lblCategory2;
    private javax.swing.JLabel lblCategory3;
    private javax.swing.JLabel lblChooseClient;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFood1;
    private javax.swing.JLabel lblFood2;
    private javax.swing.JLabel lblFood3;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblPrice3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelModify;
    private javax.swing.JTextField txtAddress;
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
