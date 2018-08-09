package chipotlirestaurant;

import javax.swing.JOptionPane;

public class chiportli extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operation;
    double[] i = new double[10];

    public chiportli() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabCalcualtor = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        textDisplay = new javax.swing.JTextField();
        jbtn6 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn10 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn12 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn13 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn17 = new javax.swing.JButton();
        jbtn22 = new javax.swing.JButton();
        jbtn16 = new javax.swing.JButton();
        jbtn21 = new javax.swing.JButton();
        jbtn15 = new javax.swing.JButton();
        jbtn14 = new javax.swing.JButton();
        jbtn18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbtn11 = new javax.swing.JButton();
        jbtn20 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtReceipt = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtextdrinkCost = new javax.swing.JTextField();
        jtextmealCost = new javax.swing.JTextField();
        jcb4Tax = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jballTotall = new java.awt.Button();
        jbReceipt = new java.awt.Button();
        jbExit = new java.awt.Button();
        jbReset = new java.awt.Button();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtTax = new javax.swing.JTextField();
        jtxtallTotal = new javax.swing.JTextField();
        jtextsubTotal = new javax.swing.JTextField();
        jbChange = new java.awt.Button();
        jPanel12 = new javax.swing.JPanel();
        jcbDrinks = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jcb1Burrito = new javax.swing.JCheckBox();
        jtxtBurritos = new javax.swing.JTextField();
        jcb2Bowl = new javax.swing.JCheckBox();
        jtextBowl = new javax.swing.JTextField();
        jtextTacos = new javax.swing.JTextField();
        jcb3Tacos = new javax.swing.JCheckBox();
        jbStart = new java.awt.Button();
        jTxtTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chipotle");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTabCalcualtor.setBackground(new java.awt.Color(0, 102, 204));

        jPanel13.setBackground(new java.awt.Color(242, 235, 235));

        textDisplay.setBackground(new java.awt.Color(204, 204, 204));
        textDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtn6.setBackground(new java.awt.Color(204, 204, 204));
        jbtn6.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(0, 72, 0));
        jbtn6.setText("7");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn3.setBackground(new java.awt.Color(204, 204, 204));
        jbtn3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(0, 72, 0));
        jbtn3.setText("8");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn10.setBackground(new java.awt.Color(204, 204, 204));
        jbtn10.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn10.setForeground(new java.awt.Color(0, 72, 0));
        jbtn10.setText("4");
        jbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn10ActionPerformed(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(204, 204, 204));
        jbtn7.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(0, 72, 0));
        jbtn7.setText("5");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn12.setBackground(new java.awt.Color(204, 204, 204));
        jbtn12.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn12.setForeground(new java.awt.Color(0, 72, 0));
        jbtn12.setText("2");
        jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn12ActionPerformed(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(204, 204, 204));
        jbtn8.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(0, 72, 0));
        jbtn8.setText("6");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(204, 204, 204));
        jbtn4.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(0, 72, 0));
        jbtn4.setText("9");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(204, 204, 204));
        jbtn9.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(0, 72, 0));
        jbtn9.setText("-");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn13.setBackground(new java.awt.Color(204, 204, 204));
        jbtn13.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtn13.setForeground(new java.awt.Color(0, 72, 0));
        jbtn13.setText("⬅︎");
        jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn13ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(204, 204, 204));
        jbtn5.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(0, 72, 0));
        jbtn5.setText("+");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn17.setBackground(new java.awt.Color(204, 204, 204));
        jbtn17.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jbtn17.setForeground(new java.awt.Color(0, 72, 0));
        jbtn17.setText("x");
        jbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn17ActionPerformed(evt);
            }
        });

        jbtn22.setBackground(new java.awt.Color(204, 204, 204));
        jbtn22.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jbtn22.setForeground(new java.awt.Color(0, 72, 0));
        jbtn22.setText("÷");
        jbtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn22ActionPerformed(evt);
            }
        });

        jbtn16.setBackground(new java.awt.Color(204, 204, 204));
        jbtn16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jbtn16.setForeground(new java.awt.Color(0, 72, 0));
        jbtn16.setText("+/-");
        jbtn16.setToolTipText("");
        jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn16ActionPerformed(evt);
            }
        });

        jbtn21.setBackground(new java.awt.Color(204, 204, 204));
        jbtn21.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jbtn21.setForeground(new java.awt.Color(0, 72, 0));
        jbtn21.setText("=");
        jbtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn21ActionPerformed(evt);
            }
        });

        jbtn15.setBackground(new java.awt.Color(204, 204, 204));
        jbtn15.setFont(new java.awt.Font("Avenir Next Condensed", 1, 14)); // NOI18N
        jbtn15.setForeground(new java.awt.Color(0, 72, 0));
        jbtn15.setText("C");
        jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn15ActionPerformed(evt);
            }
        });

        jbtn14.setBackground(new java.awt.Color(204, 204, 204));
        jbtn14.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn14.setForeground(new java.awt.Color(0, 72, 0));
        jbtn14.setText("1");
        jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn14ActionPerformed(evt);
            }
        });

        jbtn18.setBackground(new java.awt.Color(204, 204, 204));
        jbtn18.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jbtn18.setForeground(new java.awt.Color(0, 72, 0));
        jbtn18.setText("0");
        jbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn18ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 72, 0));
        jButton1.setText("%");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbtn11.setBackground(new java.awt.Color(204, 204, 204));
        jbtn11.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jbtn11.setForeground(new java.awt.Color(0, 72, 0));
        jbtn11.setText("3");
        jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn11ActionPerformed(evt);
            }
        });

        jbtn20.setBackground(new java.awt.Color(204, 204, 204));
        jbtn20.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jbtn20.setForeground(new java.awt.Color(0, 72, 0));
        jbtn20.setText(".");
        jbtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textDisplay)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jbtn18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(jbtn11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(textDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jbtn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(4, 4, 4)))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtn14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jbtn22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jbtn21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jTabCalcualtor.addTab("Calculator", jPanel13);

        jTxtReceipt.setColumns(20);
        jTxtReceipt.setRows(5);
        jTxtReceipt.setPreferredSize(new java.awt.Dimension(180, 80));
        jScrollPane1.setViewportView(jTxtReceipt);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        jTabCalcualtor.addTab("Receipt", jPanel15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jTabCalcualtor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabCalcualtor, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 257, -1, 295));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel2.setText("Cost of Drinks");

        jLabel3.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel3.setText("Cost of Meals");

        jtextdrinkCost.setBackground(new java.awt.Color(234, 232, 232));
        jtextdrinkCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtextdrinkCost.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtextmealCost.setBackground(new java.awt.Color(234, 232, 232));
        jtextmealCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtextmealCost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtextmealCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextmealCostActionPerformed(evt);
            }
        });

        jcb4Tax.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jcb4Tax.setText("Tax");
        jcb4Tax.setToolTipText("");
        jcb4Tax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb4TaxMouseClicked(evt);
            }
        });
        jcb4Tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb4TaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jcb4Tax)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtextdrinkCost, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jtextmealCost))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jtextdrinkCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jtextmealCost, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addComponent(jcb4Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 257, 421, -1));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jballTotall.setBackground(new java.awt.Color(204, 204, 204));
        jballTotall.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jballTotall.setLabel("Total");
        jballTotall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jballTotallMouseClicked(evt);
            }
        });
        jballTotall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jballTotallActionPerformed(evt);
            }
        });

        jbReceipt.setBackground(new java.awt.Color(204, 204, 204));
        jbReceipt.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jbReceipt.setLabel("Receipt");
        jbReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReceiptActionPerformed(evt);
            }
        });

        jbExit.setBackground(new java.awt.Color(204, 204, 204));
        jbExit.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jbExit.setLabel("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        jbReset.setBackground(new java.awt.Color(204, 204, 204));
        jbReset.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jbReset.setLabel("Reset");
        jbReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbResetMouseClicked(evt);
            }
        });
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jballTotall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jballTotall, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbReset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 389, -1, -1));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel5.setText("Sub Total:");

        jLabel6.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel6.setText("Tax:");

        jLabel7.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel7.setText("Total:");

        jtxtTax.setBackground(new java.awt.Color(234, 232, 232));
        jtxtTax.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTaxActionPerformed(evt);
            }
        });

        jtxtallTotal.setBackground(new java.awt.Color(234, 232, 232));
        jtxtallTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtextsubTotal.setBackground(new java.awt.Color(234, 232, 232));
        jtextsubTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbChange.setActionCommand("JbChange");
        jbChange.setBackground(new java.awt.Color(204, 204, 204));
        jbChange.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jbChange.setLabel("Change");
        jbChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbChangeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(56, 56, 56)
                        .addComponent(jtxtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtextsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtallTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtallTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbChange, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 42, 236, 209));

        jPanel12.setBackground(new java.awt.Color(216, 211, 211));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbDrinks.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jcbDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Drink", "Apple Juice", "Tea", "Cola", "Coffee", "Ice Tea", "Ice Coffee", "Orange" }));
        jcbDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDrinksActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel1.setText("DRINKS");

        jcb1Burrito.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jcb1Burrito.setText("BURRITO");
        jcb1Burrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb1BurritoMouseClicked(evt);
            }
        });
        jcb1Burrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb1BurritoActionPerformed(evt);
            }
        });

        jtxtBurritos.setBackground(new java.awt.Color(234, 232, 232));
        jtxtBurritos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBurritos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcb2Bowl.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jcb2Bowl.setText("BOWL");
        jcb2Bowl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb2BowlChicMMouseClicked(evt);
            }
        });

        jtextBowl.setBackground(new java.awt.Color(234, 232, 232));
        jtextBowl.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtextBowl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtextTacos.setBackground(new java.awt.Color(234, 232, 232));
        jtextTacos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtextTacos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcb3Tacos.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jcb3Tacos.setText("TACOS");
        jcb3Tacos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb3TacosMouseClicked(evt);
            }
        });

        jbStart.setBackground(new java.awt.Color(204, 204, 204));
        jbStart.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jbStart.setLabel("Start");
        jbStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbStartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcb1Burrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcb3Tacos)
                        .addComponent(jcb2Bowl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtextBowl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtextTacos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbDrinks, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtBurritos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jbStart, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbStart, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb1Burrito)
                    .addComponent(jtxtBurritos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb2Bowl)
                    .addComponent(jtextBowl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb3Tacos)
                    .addComponent(jtextTacos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, -1, -1));

        jTxtTitle.setBackground(new java.awt.Color(204, 204, 204));
        jTxtTitle.setFont(new java.awt.Font("Marion", 1, 24)); // NOI18N
        jTxtTitle.setText("  Chipote Restaurant Cash Register");
        jTxtTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtTitle.setEnabled(false);
        jTxtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTitleActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 6, 400, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bfeef4e16e76af17b73c5e5645df298f.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn8.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn11ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn11.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn11ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn6.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn3.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn4.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn10ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn10.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn10ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn7.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn14ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn14.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn14ActionPerformed

    private void jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn12ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn12.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn12ActionPerformed

    private void jbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn18ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn18.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn18ActionPerformed

    private void jbtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn20ActionPerformed
        String Enternumber = textDisplay.getText() + jbtn20.getText();
        textDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn20ActionPerformed

    private void jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn15ActionPerformed
        textDisplay.setText(null);
    }//GEN-LAST:event_jbtn15ActionPerformed

    private void jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn13ActionPerformed
        String backspace = null;
        if (textDisplay.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(textDisplay.getText());
            strB.deleteCharAt(textDisplay.getText().length() - 1);
            backspace = strB.toString();
            textDisplay.setText(backspace);
        }

    }//GEN-LAST:event_jbtn13ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        firstnum = Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
        operation = "+";
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        firstnum = Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
        operation = "-";
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn17ActionPerformed
        firstnum = Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
        operation = "*";
    }//GEN-LAST:event_jbtn17ActionPerformed

    private void jbtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn22ActionPerformed
        firstnum = Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
        operation = "/";
    }//GEN-LAST:event_jbtn22ActionPerformed

    private void jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn16ActionPerformed
        double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
        ops = ops * (-1);
        textDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtn16ActionPerformed

    private void jbtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn21ActionPerformed
        String answer;
        secondnum = Double.parseDouble(textDisplay.getText());

        if (operation == "+") {
            result = firstnum + secondnum;
            answer = String.format("%.0f", result);
            textDisplay.setText(answer);
        } else if (operation == "-") {
            result = firstnum - secondnum;
            answer = String.format("%.0f", result);
            textDisplay.setText(answer);
        } else if (operation == "*") {
            result = firstnum * secondnum;
            answer = String.format("%.0f", result);
            textDisplay.setText(answer);
        } else if (operation == "/") {
            result = firstnum / secondnum;
            answer = String.format("%.0f", result);
            textDisplay.setText(answer);
        } else if (operation == "%") {
            result = firstnum % secondnum;
            answer = String.format("%.0f", result);
            textDisplay.setText(answer);
        }
    }//GEN-LAST:event_jbtn21ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        firstnum = Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
        operation = "%";
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed

    }//GEN-LAST:event_jbResetActionPerformed

    private void jTxtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTitleActionPerformed

    }//GEN-LAST:event_jTxtTitleActionPerformed

    private void jcbDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDrinksActionPerformed

        double Apple = 2.30;
        double Tea = 2.00;
        double Cola = 1.75;
        double Coffee = 2.50;
        double Ice_Tea = 1.90;
        double Ice_Coffee = 2.30;
        double Orenge = 3.00;
        double empty = 0;

        if (jcbDrinks.getSelectedItem().equals("Apple Juice")) {
            String cApple = String.format("%.2f", Apple);
            jtextdrinkCost.setText(cApple);
        }
        if (jcbDrinks.getSelectedItem().equals("Tea")) {
            String cTea = String.format("%.2f", Tea);
            jtextdrinkCost.setText(cTea);
        }
        if (jcbDrinks.getSelectedItem().equals("Cola")) {
            String cCola = String.format("%.2f", Cola);
            jtextdrinkCost.setText(cCola);
        }
        if (jcbDrinks.getSelectedItem().equals("Coffee")) {
            String cCoffee = String.format("%.2f", Coffee);
            jtextdrinkCost.setText(cCoffee);
        }
        if (jcbDrinks.getSelectedItem().equals("Ice Tea")) {
            String cIcetea = String.format("%.2f", Ice_Tea);
            jtextdrinkCost.setText(cIcetea);
        }
        if (jcbDrinks.getSelectedItem().equals("Ice Coffee")) {
            String cIcecoffee = String.format("%.2f", Ice_Coffee);
            jtextdrinkCost.setText(cIcecoffee);
        }
        if (jcbDrinks.getSelectedItem().equals("Orange")) {
            String cOrenge = String.format("%.2f", Orenge);
            jtextdrinkCost.setText(cOrenge);
        }
        if (jcbDrinks.getSelectedItem().equals("Select a Drink")) {
            String Empty = String.format("%.2f", empty);
            jtextdrinkCost.setText(Empty);
        }
    }//GEN-LAST:event_jcbDrinksActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbResetMouseClicked

        jtextdrinkCost.setText(null);
        jtextmealCost.setText(null);
        jTxtReceipt.setText(null);
        jtxtBurritos.setText(null);
        jtextBowl.setText(null);
        jtextTacos.setText(null);
        jtextsubTotal.setText(null);
        jtxtTax.setText(null);
        jtxtallTotal.setText(null);
    }//GEN-LAST:event_jbResetMouseClicked

    private void jcb1BurritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb1BurritoMouseClicked
        double cMeal = Double.parseDouble(jtextmealCost.getText());
        double iBurritos = Double.parseDouble(jtxtBurritos.getText());
        double BurritosP = 5.65;

        if (jcb1Burrito.isSelected()) {
            i[0] = (iBurritos * BurritosP);
            String pMeal = String.format("%.2f", i[0] + cMeal);
            jtextmealCost.setText(pMeal);

        }


    }//GEN-LAST:event_jcb1BurritoMouseClicked

    private void jcb2BowlChicMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb2BowlChicMMouseClicked
        double cMeal = Double.parseDouble(jtextmealCost.getText());
        double iBowl = Double.parseDouble(jtextBowl.getText());
        double BowlP = 6.99;

        if (jcb2Bowl.isSelected()) {
            i[0] = (iBowl * BowlP) + cMeal;
            String pMeal = String.format("%.2f", i[0]);
            jtextmealCost.setText(pMeal);

        }
    }//GEN-LAST:event_jcb2BowlChicMMouseClicked

    private void jcb3TacosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb3TacosMouseClicked
        double cMeal = Double.parseDouble(jtextmealCost.getText());
        double iTacos = Double.parseDouble(jtextTacos.getText());
        double TacosP = 3.99;

        if (jcb3Tacos.isSelected()) {
            i[0] = (iTacos * TacosP) + cMeal;
            String pMeal = String.format("%.2f", i[0] + cMeal);
            jtextmealCost.setText(pMeal);

        }
    }//GEN-LAST:event_jcb3TacosMouseClicked

    private void jcb4TaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb4TaxMouseClicked
        double cTotal1 = Double.parseDouble(jtextdrinkCost.getText());
        double cTotal2 = Double.parseDouble(jtextmealCost.getText());
        double allTotal = (cTotal1 + cTotal2) / 15;

        String iTotal = String.format(" %.2f", allTotal);
        jtxtTax.setText(iTotal);
    }//GEN-LAST:event_jcb4TaxMouseClicked

    private void jcb4TaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb4TaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb4TaxActionPerformed

    private void jballTotallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jballTotallMouseClicked

        double cTotal1 = Double.parseDouble(jtextdrinkCost.getText());
        double cTotal2 = Double.parseDouble(jtextmealCost.getText());
        double cTotal3 = Double.parseDouble(jtxtTax.getText());
        
        double subTotal = (cTotal1 + cTotal2 + cTotal3);
        String isubTotal = String.format("$ %.2f", subTotal);
        jtextsubTotal.setText(isubTotal);

        double allTotal = (cTotal3 + subTotal);
        String iTotal = String.format("%.2f", allTotal);
        jtxtallTotal.setText(iTotal);

        String iTaxTotal = String.format("$ %.2f", cTotal3);
        jtxtTax.setText(iTaxTotal);
    }//GEN-LAST:event_jballTotallMouseClicked

    private void jbReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReceiptActionPerformed
        int Chic1 = Integer.parseInt(jtxtBurritos.getText());
        int Chic2 = Integer.parseInt(jtextBowl.getText());
        int Chic3 = Integer.parseInt(jtextTacos.getText());
        String iTotal = String.format(jtxtallTotal.getText());
        jTxtReceipt.append("    Chipotle Restauran\n\n"
                + "\nBURRITOS:\t" + Chic1 + "\nBOWlS:   \t" + Chic2
                + "\nTACOS:\t" + Chic3 + "\n\nYour Total is:  $" + iTotal
                + "\n\n\n\n\n\nThank you for coming \n"
                + "to our restaurant.");
    }//GEN-LAST:event_jbReceiptActionPerformed

    private void jtextmealCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextmealCostActionPerformed

    }//GEN-LAST:event_jtextmealCostActionPerformed

    private void jtxtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTaxActionPerformed

    private void jbChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbChangeMouseClicked

        String input = JOptionPane.showInputDialog(null, "Enter the Amount of Cash", "Change", JOptionPane.PLAIN_MESSAGE);

        double paid = Integer.parseInt(input);
        String iTotal = String.format(jtxtallTotal.getText());
        double allTotal = Double.parseDouble(iTotal);

        double totalChange = (paid - allTotal);
        //System.out.printf("Total change: $%.2f\n", totalChange);
        totalChange = (int) (totalChange * 100);

        double dollars = totalChange / 100;
        totalChange = totalChange % 100;

        double quarters = totalChange / 25;
        totalChange = totalChange % 25;

        double dimes = totalChange / 10;
        totalChange = totalChange % 10;

        double nickels = totalChange / 5;
        totalChange = totalChange % 5;

        double pennies = totalChange;

        System.out.println();

        JOptionPane.showMessageDialog(null, "The Remaining Amount\n" + (int) dollars
                + "\t" + "dollars\n" + (int) quarters + "\t" + "quarters\n"
                + (int) dimes + "\t" + "dimes\n" + (int) nickels + "\t" + "nickels\n" + (int) pennies + "\t" + "pennies");
    }//GEN-LAST:event_jbChangeMouseClicked

    private void jbStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbStartMouseClicked
        double empty = 0;
        String Empty = String.format("%.2f", empty);
        jtextmealCost.setText(Empty);
    }//GEN-LAST:event_jbStartMouseClicked

    private void jcb1BurritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb1BurritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb1BurritoActionPerformed

    private void jballTotallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jballTotallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jballTotallActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chiportli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabCalcualtor;
    private javax.swing.JTextArea jTxtReceipt;
    private javax.swing.JTextField jTxtTitle;
    private java.awt.Button jbChange;
    private java.awt.Button jbExit;
    private java.awt.Button jbReceipt;
    private java.awt.Button jbReset;
    private java.awt.Button jbStart;
    private java.awt.Button jballTotall;
    private javax.swing.JButton jbtn10;
    private javax.swing.JButton jbtn11;
    private javax.swing.JButton jbtn12;
    private javax.swing.JButton jbtn13;
    private javax.swing.JButton jbtn14;
    private javax.swing.JButton jbtn15;
    private javax.swing.JButton jbtn16;
    private javax.swing.JButton jbtn17;
    private javax.swing.JButton jbtn18;
    private javax.swing.JButton jbtn20;
    private javax.swing.JButton jbtn21;
    private javax.swing.JButton jbtn22;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JCheckBox jcb1Burrito;
    private javax.swing.JCheckBox jcb2Bowl;
    private javax.swing.JCheckBox jcb3Tacos;
    private javax.swing.JCheckBox jcb4Tax;
    private javax.swing.JComboBox<String> jcbDrinks;
    private javax.swing.JTextField jtextBowl;
    private javax.swing.JTextField jtextTacos;
    private javax.swing.JTextField jtextdrinkCost;
    private javax.swing.JTextField jtextmealCost;
    private javax.swing.JTextField jtextsubTotal;
    private javax.swing.JTextField jtxtBurritos;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtallTotal;
    private javax.swing.JTextField textDisplay;
    // End of variables declaration//GEN-END:variables
}
