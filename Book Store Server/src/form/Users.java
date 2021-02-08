/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Users.java
 *
 * Created on 23 Jan 13, 14:48:47
 */
package form;

import db.Parameter;
import db.ResultSetTableModel;
import db.db_connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Seno4
 */
public class Users extends javax.swing.JInternalFrame {

    ResultSet rs;
    db_connection db;

    /** Creates new form Users */
    @SuppressWarnings("static-access")
    public Users() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();
    }

    public void table() {
        String namaKolom[] = {"ID", "UserID", "Username", "Password", "Type"};
        rs = db.querySelect(namaKolom, "users_data");
        tbl_users.setModel(new ResultSetTableModel(rs));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass1 = new usu.widget.glass.PanelGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        btn_add = new usu.widget.ButtonGlass();
        btn_edit = new usu.widget.ButtonGlass();
        btn_delete = new usu.widget.ButtonGlass();
        btn_refresh = new usu.widget.ButtonGlass();
        txt_search = new usu.widget.TextBox();
        btn_search = new usu.widget.ButtonGlass();
        cmb_categories = new javax.swing.JComboBox();
        label1 = new usu.widget.Label();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        user_id = new usu.widget.TextBox();
        label3 = new usu.widget.Label();
        username = new usu.widget.TextBox();
        label4 = new usu.widget.Label();
        label5 = new usu.widget.Label();
        label9 = new usu.widget.Label();
        cmb_type = new javax.swing.JComboBox();
        password = new usu.widget.TextBox();
        panelGlass3 = new usu.widget.glass.PanelGlass();
        label12 = new usu.widget.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1026, 515));

        panelGlass1.setPreferredSize(new java.awt.Dimension(1026, 515));
        panelGlass1.setRound(false);
        panelGlass1.setWarna(new java.awt.Color(255, 255, 0));

        tbl_users.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        tbl_users.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14));
        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "User ID", "Username", "Password", "Type"
            }
        ));
        tbl_users.setAlignmentX(1.0F);
        tbl_users.setAlignmentY(1.0F);
        tbl_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_users.setFocusable(false);
        tbl_users.setGridColor(new java.awt.Color(255, 153, 51));
        tbl_users.setOpaque(false);
        tbl_users.setPreferredSize(new java.awt.Dimension(600, 64));
        tbl_users.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tbl_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_usersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_users);

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_add.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_edit.png"))); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_delete.png"))); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_refresh.png"))); // NOI18N
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_search.png"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        cmb_categories.setFont(new java.awt.Font("Ubahn", 0, 18));
        cmb_categories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User ID", "Username", "Password", "Type" }));
        cmb_categories.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        cmb_categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoriesActionPerformed(evt);
            }
        });

        label1.setText("Search Categories:");
        label1.setFont(new java.awt.Font("Ubahn", 0, 18));

        panelGlass2.setBackground(new java.awt.Color(255, 153, 153));
        panelGlass2.setRound(false);
        panelGlass2.setWarna(new java.awt.Color(255, 204, 0));

        user_id.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        label3.setText("USERNAME:");
        label3.setFont(new java.awt.Font("Ubahn", 0, 14));

        username.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        label4.setText("PASSWORD:");
        label4.setFont(new java.awt.Font("Ubahn", 0, 14));

        label5.setText("TYPE:");
        label5.setFont(new java.awt.Font("Ubahn", 0, 14));

        label9.setText("USER ID:");
        label9.setFont(new java.awt.Font("Ubahn", 0, 14));

        cmb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Type", "Admin", "Cashier" }));

        password.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        password.setText("123918203");

        javax.swing.GroupLayout panelGlass2Layout = new javax.swing.GroupLayout(panelGlass2);
        panelGlass2.setLayout(panelGlass2Layout);
        panelGlass2Layout.setHorizontalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        panelGlass2Layout.setVerticalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        panelGlass3.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/table_header_big_orange.png"))); // NOI18N
        panelGlass3.setPreferredSize(new java.awt.Dimension(987, 46));
        panelGlass3.setRound(false);
        panelGlass3.setWarna(new java.awt.Color(255, 204, 0));

        label12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("Users Data");
        label12.setFont(new java.awt.Font("Tahoma", 0, 18));

        javax.swing.GroupLayout panelGlass3Layout = new javax.swing.GroupLayout(panelGlass3);
        panelGlass3.setLayout(panelGlass3Layout);
        panelGlass3Layout.setHorizontalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(444, 444, 444))
        );
        panelGlass3Layout.setVerticalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGlass3, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelGlass2, javax.swing.GroupLayout.Alignment.LEADING, 0, 535, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_categories, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_search, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addComponent(txt_search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGlass2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_categoriesActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if (user_id.getText().equals("") || username.getText().equals("") || password.getText().equals("")
                || cmb_type.getSelectedItem().equals("Type")) {
            JOptionPane.showMessageDialog(this, "Please enter the data completely");
        } else {
            String[] kolom = {"UserID", "Username", "Password", "Type"};
            String[] isi = {user_id.getText(), username.getText(), password.getText(), cmb_type.getSelectedItem().toString()};
            System.out.println(db.queryInsert("users_data", kolom, isi));
            table();
            refresh();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if (user_id.getText().equals("") || username.getText().equals("") || password.getText().equals("")
                || cmb_type.getSelectedItem().equals("Type")) {
            JOptionPane.showMessageDialog(this, "Please enter the data completely");
        } else {
            String[] kolom = {"UserID", "Username", "Password", "Type"};
            String[] isi = {user_id.getText(), username.getText(), password.getText(), cmb_type.getSelectedItem().toString()};
            String id = String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("users_data", kolom, isi, "id='" + id + "'"));
            table();
            refresh();
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_usersMouseClicked
        user_id.setText(String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 1)));
        username.setText(String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 2)));
        password.setText(String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 3)));
        cmb_type.setSelectedItem(String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 4)));
    }//GEN-LAST:event_tbl_usersMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String id = String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Are you sure want to delete this data", "Warning!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("users_data", "id=" + id);
        } else {
            return;
        }
        table();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        refresh();
        table();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        if (txt_search.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please input your keyword");
        } else {
            if (cmb_categories.getSelectedItem().equals("User ID")) {
                rs = db.querySelectAll("users_data", "UserID LIKE '%" + txt_search.getText() + "%' ");
                tbl_users.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("Username")) {
                rs = db.querySelectAll("users_data", "Username LIKE '%" + txt_search.getText() + "%' ");
                tbl_users.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("Password")) {
                rs = db.querySelectAll("users_data", "Password LIKE '%" + txt_search.getText() + "%' ");
                tbl_users.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("Type")) {
                rs = db.querySelectAll("users_data", "Type LIKE '%" + txt_search.getText() + "%' ");
                tbl_users.setModel(new ResultSetTableModel(rs));
            }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    /**
     * @param args the command line arguments
     */
    void refresh() {
        user_id.setText("");
        username.setText("");
        password.setText("");
        cmb_type.setSelectedItem("Type");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Users().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_add;
    private usu.widget.ButtonGlass btn_delete;
    private usu.widget.ButtonGlass btn_edit;
    private usu.widget.ButtonGlass btn_refresh;
    private usu.widget.ButtonGlass btn_search;
    private javax.swing.JComboBox cmb_categories;
    private javax.swing.JComboBox cmb_type;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.Label label1;
    private usu.widget.Label label12;
    private usu.widget.Label label3;
    private usu.widget.Label label4;
    private usu.widget.Label label5;
    private usu.widget.Label label9;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private usu.widget.glass.PanelGlass panelGlass3;
    private usu.widget.TextBox password;
    private javax.swing.JTable tbl_users;
    private usu.widget.TextBox txt_search;
    private usu.widget.TextBox user_id;
    private usu.widget.TextBox username;
    // End of variables declaration//GEN-END:variables
}