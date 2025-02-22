package com.aldrin.cafsysv2.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.aldrin.cafsysv2.dao.impl.OrderOptionDAOImpl;
import com.aldrin.cafsysv2.model.OrderOption;
import com.aldrin.cafsysv2.util.ComboBoxList;
import com.aldrin.cafsysv2.util.NumberInput;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JDialogPayment extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPayment
     */
    private DecimalFormat df = new DecimalFormat("##,##0.00");
    private Float totalAmount;
    private static String input = "";
    private Integer takingMeals;
    private JFrameCafSys jFrameCafSys = new JFrameCafSys();
    
    public JDialogPayment(JFrameCafSys parent, boolean modal, Float totaLAmount) {
        super(parent, modal);
        initComponents();
        this.jFrameCafSys = parent;
        jTextFieldAmountDue.setText(df.format(totaLAmount));
        setTotalAmount(totaLAmount);
        jTextFieldAmountDue.setEnabled(false);
        jTextFieldChange.setEnabled(false);
        comboBoxNumber();
        comboBoxOderOption();
        jButtonPayment.setEnabled(false);
        new NumberInput().doubleValidator(jTextFieldCash);
//        comboBoxTakingMeals();
        jPanelFrame.putClientProperty(FlatClientProperties.STYLE,
                "[light]border: 0,0,0,0,shade(@background,30%),,18;" + "[dark]border: 0,0,0,0,tint(@background,30%),,8");
        jButtonPayment.setEnabled(false);
        jComboBoxOrderOption.setEnabled(false);
        jComboBoxTableNo.setEnabled(false);
        
        
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
        jPanel12 = new javax.swing.JPanel();
        jButtonPayment = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanelFrame = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCash = new javax.swing.JTextField();
        jTextFieldAmountDue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldChange = new javax.swing.JTextField();
        jComboBoxTableNo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxOrderOption = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAYMENT");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(569, 60));

        jButtonPayment.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButtonPayment.setMnemonic('P');
        jButtonPayment.setText("Thanh toán");
        jButtonPayment.setFocusable(false);
        jButtonPayment.setPreferredSize(new java.awt.Dimension(400, 42));
        jButtonPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaymentActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonPayment);

        jPanel1.add(jPanel12, java.awt.BorderLayout.SOUTH);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanelFrame.setOpaque(false);
        jPanelFrame.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 244));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 403));
        jPanel2.setLayout(new java.awt.GridLayout(0, 3, 5, 5));

        jButton1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton1.setMnemonic('7');
        jButton1.setText("7");
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton2.setMnemonic('8');
        jButton2.setText("8");
        jButton2.setFocusable(false);
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton3.setMnemonic('9');
        jButton3.setText("9");
        jButton3.setFocusable(false);
        jButton3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton4.setMnemonic('4');
        jButton4.setText("4");
        jButton4.setFocusable(false);
        jButton4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton5.setMnemonic('5');
        jButton5.setText("5");
        jButton5.setFocusable(false);
        jButton5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton6.setMnemonic('6');
        jButton6.setText("6");
        jButton6.setFocusable(false);
        jButton6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton7.setMnemonic('1');
        jButton7.setText("1");
        jButton7.setFocusable(false);
        jButton7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton8.setMnemonic('2');
        jButton8.setText("2");
        jButton8.setFocusable(false);
        jButton8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton9.setMnemonic('3');
        jButton9.setText("3");
        jButton9.setFocusable(false);
        jButton9.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton10.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton10.setText("0");
        jButton10.setFocusable(false);
        jButton10.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);

        jButton11.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton11.setText(".");
        jButton11.setFocusable(false);
        jButton11.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);

        jButton12.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton12.setText(">");
        jButton12.setFocusable(false);
        jButton12.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);

        jPanel4.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 15));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(10, 224));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, java.awt.BorderLayout.EAST);

        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(250, 20));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel16, java.awt.BorderLayout.SOUTH);

        jPanelFrame.add(jPanel4, java.awt.BorderLayout.EAST);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Chọn loại");
        jLabel1.setMaximumSize(new java.awt.Dimension(55, 35));
        jLabel1.setMinimumSize(new java.awt.Dimension(55, 35));
        jLabel1.setPreferredSize(new java.awt.Dimension(55, 40));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tiền thanh toán");
        jLabel2.setMaximumSize(new java.awt.Dimension(55, 35));
        jLabel2.setMinimumSize(new java.awt.Dimension(55, 35));
        jLabel2.setPreferredSize(new java.awt.Dimension(55, 40));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 5, 140, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tiền đơn");
        jLabel3.setMaximumSize(new java.awt.Dimension(55, 35));
        jLabel3.setMinimumSize(new java.awt.Dimension(55, 35));
        jLabel3.setPreferredSize(new java.awt.Dimension(55, 40));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 45, 140, 30));

        jTextFieldCash.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jTextFieldCash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCashKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCashKeyReleased(evt);
            }
        });
        jPanel3.add(jTextFieldCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 5, 180, 30));

        jTextFieldAmountDue.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jTextFieldAmountDue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(jTextFieldAmountDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 47, 180, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dư");
        jLabel4.setMaximumSize(new java.awt.Dimension(55, 35));
        jLabel4.setMinimumSize(new java.awt.Dimension(55, 35));
        jLabel4.setPreferredSize(new java.awt.Dimension(55, 40));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 111, 30));

        jTextFieldChange.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jTextFieldChange.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(jTextFieldChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, 30));

        jComboBoxTableNo.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jComboBoxTableNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTableNoItemStateChanged(evt);
            }
        });
        jComboBoxTableNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTableNoActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxTableNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 135, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Bàn");
        jLabel5.setMaximumSize(new java.awt.Dimension(55, 35));
        jLabel5.setMinimumSize(new java.awt.Dimension(55, 35));
        jLabel5.setPreferredSize(new java.awt.Dimension(55, 40));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 130, 140, -1));

        jComboBoxOrderOption.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jComboBoxOrderOption.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOrderOptionItemStateChanged(evt);
            }
        });
        jComboBoxOrderOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrderOptionActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxOrderOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 180, 30));

        jPanel8.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(10, 224));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel11, java.awt.BorderLayout.WEST);

        jPanelFrame.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanelFrame, java.awt.BorderLayout.CENTER);

        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(10, 244));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel13, java.awt.BorderLayout.WEST);

        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(10, 244));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel14, java.awt.BorderLayout.EAST);

        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(628, 10));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(628, 10));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(646, 355));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCashKeyReleased
        Float change = 0.0F;
        Float cash = 0.0F;
        
        if (jTextFieldCash.getText().length() < 1) {
            cash = 0.0F;
            jTextFieldChange.setText("0.00");
            return;
        } else {
            cash = Float.parseFloat(jTextFieldCash.getText());
            change = cash - getTotalAmount();
            this.jFrameCafSys.setChange(change);
        }
        jTextFieldChange.setText(String.valueOf(df.format(change)));
        if ((change >= 0) && (jComboBoxTableNo.getSelectedIndex() != 0)) {
//            jButtonPayment.setEnabled(true);
            jComboBoxOrderOption.setEnabled(true);
        } else {
//            jButtonPayment.setEnabled(false);
            jComboBoxOrderOption.setEnabled(false);
        }
        this.input = jTextFieldCash.getText();
        inputNumber();
    }//GEN-LAST:event_jTextFieldCashKeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jTextFieldCash.getText().length() < 1) {
            return;
        }
        int curInputLength = getInput().length();
        
        String currentInput = getInput().substring(0, curInputLength - 1);
        this.input = "";
        setInput(currentInput);
        jTextFieldCash.setText(currentInput);
        inputNumber();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setInput("7");
        inputNumber();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setInput("8");
        inputNumber();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setInput("9");
        inputNumber();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setInput("4");
        inputNumber();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setInput("5");
        inputNumber();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setInput("6");
        inputNumber();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setInput("1");
        inputNumber();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        setInput("2");
        inputNumber();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        setInput("3");
        inputNumber();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        setInput("0");
        inputNumber();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setInput(".");
        inputNumber();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextFieldCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCashKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jFrameCafSys.setPayment(true);
            jFrameCafSys.setCash(Float.parseFloat(jTextFieldCash.getText()));
            jFrameCafSys.setChange(Float.parseFloat(jTextFieldChange.getText()));
            this.dispose();
        }
    }//GEN-LAST:event_jTextFieldCashKeyPressed

    private void jButtonPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaymentActionPerformed
        
        jFrameCafSys.setTakingMeals(jComboBoxOrderOption.getSelectedItem().toString());
        int response = JOptionPane.showConfirmDialog(null, "Bạn muốn lưu thông tin thanh toán?", "SAVE PAYMEMT INFO", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            jFrameCafSys.setPayment(true);
            jFrameCafSys.setCash(Float.parseFloat(jTextFieldCash.getText()));
            jFrameCafSys.setChange(Float.parseFloat(jTextFieldChange.getText()));
            
            ComboBoxList orderOptionId = (ComboBoxList) this.jComboBoxOrderOption.getSelectedItem();
            OrderOption oo = new OrderOption();
            oo.setId(orderOptionId.getId());
            jFrameCafSys.setOrderOption(oo);
            jFrameCafSys.setTakingMeals(jComboBoxOrderOption.getSelectedItem().toString());
            if(jComboBoxTableNo.getSelectedIndex()==0){
                jFrameCafSys.setTableNo(0);
            }else{
               jFrameCafSys.setTableNo(Integer.parseInt(jComboBoxTableNo.getSelectedItem().toString())); 
            }
            if (jComboBoxTableNo.getSelectedIndex() == 0) {
                jFrameCafSys.setTableNo(0);
            } else {
                jFrameCafSys.setTableNo(jComboBoxTableNo.getSelectedIndex() - 1);
            }
        }
        this.input = "";
        this.dispose();
    }//GEN-LAST:event_jButtonPaymentActionPerformed

    private void jComboBoxTableNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTableNoItemStateChanged
//
//        Double change = 0.0;
//        Double cash = 0.0;
//
//        if (jTextFieldCash.getText().length() < 1) {
//            cash = 0.0;
//            jTextFieldChange.setText("0.00");
//            return;
//        } else {
//            cash = Double.parseDouble(jTextFieldCash.getText());
//            change = cash - getTotalAmount();
//        }
//        if ((change >= 0) && (jComboBoxTableNo.getSelectedIndex() != 0)) {
//            jButtonPayment.setEnabled(true);
////            panelCashier.setTableNo(0);
//        } else {
//            jButtonPayment.setEnabled(false);
//        }
    }//GEN-LAST:event_jComboBoxTableNoItemStateChanged

    private void jComboBoxTableNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTableNoActionPerformed
        if (jComboBoxTableNo.getSelectedIndex() == 0) {
            jButtonPayment.setEnabled(false);
        } else {
            jButtonPayment.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxTableNoActionPerformed

    private void jComboBoxOrderOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrderOptionActionPerformed
        
        if (jComboBoxOrderOption.getSelectedIndex() == 0) {
            jComboBoxTableNo.setEnabled(false);
            jButtonPayment.setEnabled(false);
        } else if (jComboBoxOrderOption.getSelectedItem().toString().equals("DINE-IN")) {//dine-in
            jComboBoxTableNo.setEnabled(true);
            jButtonPayment.setEnabled(false);
        } else if (jComboBoxOrderOption.getSelectedItem().toString().equals("TAKE-OUT")) {//take out
            jComboBoxTableNo.setEnabled(false);
            jComboBoxTableNo.setSelectedIndex(0);
            jButtonPayment.setEnabled(true);
        }

    }//GEN-LAST:event_jComboBoxOrderOptionActionPerformed

    private void jComboBoxOrderOptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOrderOptionItemStateChanged

//        TakingMeals d = new TakingMeals();
//        d.setId(Integer.parseInt(takingMealsId.getId()));
//        d.setTakingMeals(String.valueOf(takingMealsId.getName()));
//
//        panelCashier.setTakingMeals(d);
//        Double change = 0.0;
//        Double cash = 0.0;
//
//        panelCashier.setTakingMeals(d);
////        jTextFieldChange.setText(String.valueOf(df.format(change)));
//
//        if (change >= 0) {
//            jButtonPayment.setEnabled(true);
//        } else {
//            jButtonPayment.setEnabled(false);
//        }
//        if (jComboBoxTakingMeals.getSelectedItem().equals("Dine-in")) {
//            jButtonPayment.setEnabled(true);
////            panelCashier.setChange(Double.parseDouble(jTextFieldChange.getText()));
//            panelCashier.setTableNo(0);
//        } else {
//            jButtonPayment.setEnabled(true);
//        }

    }//GEN-LAST:event_jComboBoxOrderOptionItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.input = "";
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonPayment;
    private javax.swing.JComboBox<Object> jComboBoxOrderOption;
    private javax.swing.JComboBox<String> jComboBoxTableNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JTextField jTextFieldAmountDue;
    private javax.swing.JTextField jTextFieldCash;
    private javax.swing.JTextField jTextFieldChange;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the totalAmount
     */
    public Float getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return the input
     */
    public static String getInput() {
        return input;
    }

    /**
     * @param aInput the input to set
     */
    public static void setInput(String aInput) {
        input = input + aInput;
    }
    
    private void inputNumber() {
        Double change = 0.0;
        Double cash = 0.0;
        
        if (getInput().isEmpty()) {
            cash = 0.0;
            jTextFieldChange.setText("0.00");
            return;
        } else {
            jTextFieldCash.setText(getInput());
            cash = Double.parseDouble(jTextFieldCash.getText());
            change = cash - getTotalAmount();
//            panelCashier.setChange(change);
        }
        
        jTextFieldChange.setText(String.valueOf(df.format(change)));
        if (change >= 0) {
//            jButtonPayment.setEnabled(true);
            jComboBoxOrderOption.setEnabled(true);
        } else {
//            jButtonPayment.setEnabled(false);
            jComboBoxOrderOption.setEnabled(false);
        }
    }
    
    private void calculate() {
        Double change = 0.0;
        Double cash = 0.0;
        
        if (jTextFieldCash.getText().length() < 1) {
            cash = 0.0;
            jTextFieldChange.setText("0.00");
            return;
        } else {
            cash = Double.parseDouble(jTextFieldCash.getText());
            change = cash - getTotalAmount();
        }
        jTextFieldChange.setText(String.valueOf(df.format(change)));
        if (change > 0) {
            jButtonPayment.setEnabled(true);
        } else {
            jButtonPayment.setEnabled(false);
        }
    }
    
    private void comboBoxNumber() {
        jComboBoxTableNo.addItem("SELECT TABLE");
        for (int i = 1; i < 101; i++) {
            jComboBoxTableNo.addItem(String.valueOf(i));
        }
    }
    


    /**
     * @return the takingMeals
     */
    public Integer getTakingMeals() {
        return takingMeals;
    }

    /**
     * @param takingMeals the takingMeals to set
     */
    public void setTakingMeals(Integer takingMeals) {
        this.takingMeals = takingMeals;
    }
    private OrderOptionDAOImpl orderOptionDAOImpl= new OrderOptionDAOImpl();
    private void comboBoxOderOption() {
        orderOptionDAOImpl.comboBoxOrderOption();
        jComboBoxOrderOption.removeAllItems();
        jComboBoxOrderOption.addItem("SELECT");
        for (ComboBoxList a : orderOptionDAOImpl.getList()) {
            this.jComboBoxOrderOption.addItem(a);
        }
    }
    
}
