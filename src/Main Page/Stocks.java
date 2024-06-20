/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LogIn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import java.sql.DriverManager;
import javax.swing.table.*;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Erickson Guhilde
 */
public class Stocks extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    

    
    public Stocks() {
        setUndecorated(true);
        initComponents();
        
       // setAlwaysOnTop(true);
        setResizable(true);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        
        setSize(x,y);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment( JLabel.CENTER );
    dashboardTbl.setDefaultRenderer(Integer.class, centerRenderer);
    
        JTableHeader header = dashboardTbl.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 12));
        header.setOpaque(true);
        header.setBackground(new Color(0,74,173));
        header.setForeground(new Color(0,0,0));
        header.setPreferredSize(new Dimension(header.getWidth(), 30));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainCont = new javax.swing.JLayeredPane();
        topPanel = new javax.swing.JPanel();
        logoTxt = new javax.swing.JLabel();
        Searchbar = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        sideNav = new javax.swing.JPanel();
        dashPanel = new javax.swing.JPanel();
        dashIcon = new javax.swing.JLabel();
        dashboardTxt = new javax.swing.JLabel();
        suppPanel = new javax.swing.JPanel();
        suppIcon = new javax.swing.JLabel();
        suppTxt = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JToggleButton();
        tableCont = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashboardTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        displayBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addProdBTN = new javax.swing.JButton();
        editProdBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1550, 871));

        mainCont.setBackground(new java.awt.Color(255, 255, 255));
        mainCont.setPreferredSize(new java.awt.Dimension(1550, 871));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        topPanel.setToolTipText("");

        logoTxt.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        logoTxt.setText("HardWise Inventory Management System");

        Searchbar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbarActionPerformed(evt);
            }
        });
        Searchbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchbarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoTxt)
                            .addComponent(searchIcon))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        mainCont.add(topPanel);
        topPanel.setBounds(0, 0, 1550, 126);

        sideNav.setBackground(new java.awt.Color(244, 246, 252));

        dashPanel.setBackground(new java.awt.Color(0, 74, 173));
        dashPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashPanelMouseClicked(evt);
            }
        });

        dashIcon.setAlignmentY(1.0F);
        dashPanel.add(dashIcon);

        dashboardTxt.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        dashboardTxt.setForeground(java.awt.Color.white);
        dashboardTxt.setText("Stocks");
        dashboardTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardTxtMouseClicked(evt);
            }
        });
        dashPanel.add(dashboardTxt);

        suppPanel.setBackground(java.awt.Color.white);
        suppPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suppPanel.setOpaque(false);
        suppPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suppPanelMouseEntered(evt);
            }
        });
        suppPanel.add(suppIcon);

        suppTxt.setBackground(java.awt.Color.white);
        suppTxt.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        suppTxt.setText("Suppliers");
        suppTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppTxtMouseClicked(evt);
            }
        });
        suppPanel.add(suppTxt);

        logoutBtn.setBackground(new java.awt.Color(65, 184, 213));
        logoutBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        logoutBtn.setForeground(java.awt.Color.white);
        logoutBtn.setText("Log Out");
        logoutBtn.setBorder(null);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideNavLayout = new javax.swing.GroupLayout(sideNav);
        sideNav.setLayout(sideNavLayout);
        sideNavLayout.setHorizontalGroup(
            sideNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(sideNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(suppPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        sideNavLayout.setVerticalGroup(
            sideNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(dashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(suppPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        mainCont.add(sideNav);
        sideNav.setBounds(0, 119, 250, 640);

        tableCont.setBackground(java.awt.Color.white);
        tableCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tableCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardTbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dashboardTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Code", "Type", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dashboardTbl.setFocusable(false);
        dashboardTbl.setGridColor(java.awt.Color.black);
        dashboardTbl.setRowHeight(30);
        dashboardTbl.setSelectionBackground(new java.awt.Color(0, 74, 173));
        dashboardTbl.setSelectionForeground(java.awt.Color.white);
        dashboardTbl.setShowGrid(true);
        dashboardTbl.setShowVerticalLines(false);
        dashboardTbl.getTableHeader().setReorderingAllowed(false);
        dashboardTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dashboardTbl);
        if (dashboardTbl.getColumnModel().getColumnCount() > 0) {
            dashboardTbl.getColumnModel().getColumn(0).setResizable(false);
            dashboardTbl.getColumnModel().getColumn(1).setResizable(false);
            dashboardTbl.getColumnModel().getColumn(2).setResizable(false);
            dashboardTbl.getColumnModel().getColumn(3).setResizable(false);
            dashboardTbl.getColumnModel().getColumn(4).setResizable(false);
            dashboardTbl.getColumnModel().getColumn(5).setResizable(false);
        }

        tableCont.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 105, 934, 530));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Product Lists");
        tableCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 148, -1));

        displayBtn.setBackground(new java.awt.Color(65, 184, 213));
        displayBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        displayBtn.setText("Display Product");
        displayBtn.setAlignmentY(0.0F);
        displayBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        displayBtn.setMinimumSize(new java.awt.Dimension(126, 33));
        displayBtn.setPreferredSize(new java.awt.Dimension(126, 33));
        displayBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayBtnMouseClicked(evt);
            }
        });
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });
        tableCont.add(displayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 140, 46));

        refreshBtn.setBackground(new java.awt.Color(65, 184, 213));
        refreshBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.setMinimumSize(new java.awt.Dimension(126, 33));
        refreshBtn.setPreferredSize(new java.awt.Dimension(126, 33));
        refreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshBtnMouseClicked(evt);
            }
        });
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        tableCont.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 150, 46));

        mainCont.add(tableCont);
        tableCont.setBounds(250, 120, 980, 635);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 74, 173));

        addProdBTN.setBackground(new java.awt.Color(65, 184, 213));
        addProdBTN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addProdBTN.setText("Add Product");
        addProdBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProdBTN.setMinimumSize(new java.awt.Dimension(126, 33));
        addProdBTN.setPreferredSize(new java.awt.Dimension(126, 33));
        addProdBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProdBTNMouseClicked(evt);
            }
        });
        addProdBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdBTNActionPerformed(evt);
            }
        });

        editProdBtn.setBackground(new java.awt.Color(65, 184, 213));
        editProdBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        editProdBtn.setText("Edit Product");
        editProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProdBtn.setMinimumSize(new java.awt.Dimension(126, 33));
        editProdBtn.setPreferredSize(new java.awt.Dimension(126, 33));
        editProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProdBtnMouseClicked(evt);
            }
        });
        editProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProdBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(65, 184, 213));
        deleteBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        deleteBtn.setText("Delete Product");
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.setMinimumSize(new java.awt.Dimension(126, 33));
        deleteBtn.setPreferredSize(new java.awt.Dimension(126, 33));
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProdBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(addProdBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(244, 246, 252));

        jLabel2.setText("Master your Stocks, Maximize your  Success");

        jLabel3.setText("Empower your business with Inventory Management");

        jLabel4.setText("@20204 Group 2 Inc.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(702, 702, 702)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1229, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainCont.add(jPanel1);
        jPanel1.setBounds(0, 0, 1550, 870);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchbarActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        
        int a= JOptionPane.showConfirmDialog(null,"Do you really want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
             Login log = new Login();
            log.setVisible(true);
            
            dispose();
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        // TODO add your handling code here:
        
        Login login = new Login();
        login.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void dashPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashPanelMouseClicked

    private void suppPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppPanelMouseClicked
        // TODO add your handling code here:      
        Suppliers supp = new Suppliers();
        supp.setVisible(true);
        dispose();
    }//GEN-LAST:event_suppPanelMouseClicked

    private void suppPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_suppPanelMouseEntered

    private void dashboardTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTxtMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_dashboardTxtMouseClicked

    private void suppTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppTxtMouseClicked
        // TODO add your handling code here:
        Suppliers supp = new Suppliers();
        supp.setVisible(true);
        dispose();
    }//GEN-LAST:event_suppTxtMouseClicked

    private void addProdBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProdBTNMouseClicked
        // TODO add your handling code here:

        ProductForm prodForm = new ProductForm();
        prodForm.setVisible(true);

    }//GEN-LAST:event_addProdBTNMouseClicked

    private void addProdBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProdBTNActionPerformed

    private void displayBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_displayBtnMouseClicked

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_system", "root", "");

        Statement st = conn.createStatement();
        String query = "SELECT * FROM stock";
        ResultSet rs = st.executeQuery(query);

        DefaultTableModel model = (DefaultTableModel) dashboardTbl.getModel();

        while (rs.next()) {
            int Id = rs.getInt(1);
            String productName = rs.getString(2);
            String productCode = rs.getString(3);
            String type = rs.getString(4);
            double price = rs.getDouble(5);
            int quantity = rs.getInt(6);

            // Add a new row to the table with the retrieved data
            Object[] rowData = {Id,productName, productCode, type, price, quantity};
            model.addRow(rowData);
        }

        st.close();

        conn.close();
    } catch (ClassNotFoundException | SQLException e1) {
        e1.printStackTrace();
    }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void refreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseClicked
        // TODO add your handling code here:
        
        Stocks stock = new Stocks();
        stock.setVisible(true);
       
        dispose();
        
    }//GEN-LAST:event_refreshBtnMouseClicked

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void editProdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProdBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editProdBtnMouseClicked

    private void editProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProdBtnActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/inventory_system?rewriteBatchedStatements=true";
        String username = "root";
        String password = "";
        Connection conn;
        
        Statement st;
        DefaultTableModel model = (DefaultTableModel) dashboardTbl.getModel();
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_system", "root", "");

            st = conn.createStatement();
            for(int i = 0; i < model.getRowCount(); i++){
                
                int Id = Integer.valueOf(model.getValueAt(i, 0).toString());
                String prodName = model.getValueAt(i,1).toString();
                String prodCode = model.getValueAt(i, 2).toString();
                String prodType = model.getValueAt(i,3).toString();
                double prodPrice = Double.valueOf(model.getValueAt(i, 4).toString());
                int prodQty = Integer.valueOf(model.getValueAt(i, 5).toString());
                
                String updateQuery = "UPDATE `stock` SET `Name`='" + prodName + "', `Code`='" + prodCode + "', `Type`='" + prodType + "', `Price`='" + prodPrice + "', `Quantity`='" + prodQty + "' WHERE `id`=" + Id;
                
                st.addBatch(updateQuery);
            }
            
            JOptionPane.showMessageDialog(this, "Product edited successfully!");
            
            int[] updatedRow = st.executeBatch();
            System.out.println(updatedRow.length);
        } catch (SQLException ex) {
            Logger.getLogger(Stocks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_editProdBtnActionPerformed

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = dashboardTbl.getSelectedRow();
        
        if (selectedRowIndex == -1) {
            //pag no row selected
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) dashboardTbl.getModel();
        
        //kukunin nito yung 1st column na nasa db which is ID
        int idToDelete = (int) model.getValueAt(selectedRowIndex, 0);
        
        // delete the record from the database
        String url = "jdbc:mysql://localhost:3306/inventory_system?rewriteBatchedStatements=true";
        String username = "root";
        String password = "";
        Connection conn;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_system", "root", "");
            String deleteQuery = "DELETE FROM stock WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(deleteQuery);
            pst.setInt(1, idToDelete);
            int affectedRows = pst.executeUpdate();
            
            if (affectedRows > 0) {
                // pagkadelete ng row sa database, madidelete na rin sa table
                model.removeRow(selectedRowIndex);
                JOptionPane.showMessageDialog(this, "Product deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete record.");
            }
            
            pst.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting record: " + ex.getMessage());
        }
                                            
    
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void dashboardTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTblMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_dashboardTblMouseClicked

    private void SearchbarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchbarKeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) dashboardTbl.getModel();
        TableRowSorter<DefaultTableModel>obj=new TableRowSorter<>(model);
        dashboardTbl.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(Searchbar.getText()));
    }//GEN-LAST:event_SearchbarKeyReleased
    public static void addProductToTable(String name, String code, String type, double price, int quantity) {
    DefaultTableModel model = (DefaultTableModel) dashboardTbl.getModel();
    model.addRow(new Object[]{name, code, type, price, quantity});
}
  
  
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
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Searchbar;
    private javax.swing.JButton addProdBTN;
    private javax.swing.JLabel dashIcon;
    private javax.swing.JPanel dashPanel;
    private static javax.swing.JTable dashboardTbl;
    private javax.swing.JLabel dashboardTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton editProdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoTxt;
    private javax.swing.JToggleButton logoutBtn;
    private javax.swing.JLayeredPane mainCont;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JPanel sideNav;
    private javax.swing.JLabel suppIcon;
    private javax.swing.JPanel suppPanel;
    private javax.swing.JLabel suppTxt;
    private javax.swing.JPanel tableCont;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}