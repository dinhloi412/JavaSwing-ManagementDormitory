/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.RoomsDao;
import Model.RoomModel;
import helper.DataValidator;
import helper.MessageDialogHelper;
import java.awt.Cursor;
import javax.swing.table.DefaultTableModel;
import java.util.List;
/**
 *
 * @author LoiDinh
 */
public class RoomsView extends javax.swing.JPanel {
private Page parentFrom;
private DefaultTableModel tblModel;
    /**
     * Creates new form RoomsView
     */
    public RoomsView() {
        initComponents();
        InitTable();
        LoaddatatoTable();
        MouseHand();
        
        
    }
    private void MouseHand()
    {
        btnCreateRoom.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    private void InitTable()
    {
        tblModel= new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Room ID","Room Name","Bed","Limited Bed"});
        tblRoom.setModel(tblModel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void LoaddatatoTable()
    {
        try {
            RoomsDao dao= new RoomsDao();
            List<RoomModel> list=dao.FindAll();
            tblModel.setRowCount(0);
            for(RoomModel it:list)
            {
                tblModel.addRow(new Object[]
                {
                    it.getIDRooms(),it.getRoomName(),it.getBed(),it.getLimitedBed()
                            
                });
            }
        tblModel.fireTableDataChanged();
        } catch (Exception e) {
        e.printStackTrace();
        MessageDialogHelper.showErrorDialog(parentFrom, e.getMessage(), "Lỗi");

        }
    }
    private void RemoveTextFiled()
    {
        txtRoomName.setText("");
        txtBed.setText(String.valueOf(""));
        txtBedLimited.setText(String.valueOf(""));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtBedLimited = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRoomName = new javax.swing.JTextField();
        btnCreateRoom = new com.k33ptoo.components.KButton();
        txtBed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIDroom = new javax.swing.JTextField();
        btnCreateRoom1 = new com.k33ptoo.components.KButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(830, 582));

        jPanel1.setPreferredSize(new java.awt.Dimension(830, 582));

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Management Rooms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblRoom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRoom.setGridColor(new java.awt.Color(255, 255, 255));
        tblRoom.setRowHeight(25);
        tblRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRoom);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBedLimited.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBedLimited.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(71, 120, 197)));
        txtBedLimited.setOpaque(false);
        jPanel4.add(txtBedLimited, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 115, 125, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Room Name: ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 59, -1, 14));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Bed: ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 89, -1, -1));

        txtRoomName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRoomName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(71, 120, 197)));
        txtRoomName.setOpaque(false);
        jPanel4.add(txtRoomName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 45, 125, 28));

        btnCreateRoom.setText("Create Room");
        btnCreateRoom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCreateRoom.setkAllowGradient(false);
        btnCreateRoom.setkBackGroundColor(new java.awt.Color(71, 120, 197));
        btnCreateRoom.setkHoverColor(new java.awt.Color(62, 107, 178));
        btnCreateRoom.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnCreateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRoomActionPerformed(evt);
            }
        });
        jPanel4.add(btnCreateRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 161, 107, -1));

        txtBed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBed.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(71, 120, 197)));
        txtBed.setOpaque(false);
        jPanel4.add(txtBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 81, 125, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Bed Limited: ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 123, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID Room: ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 25, -1, 14));

        txtIDroom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDroom.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(71, 120, 197)));
        txtIDroom.setOpaque(false);
        jPanel4.add(txtIDroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 11, 125, 28));

        btnCreateRoom1.setText("Delete Room");
        btnCreateRoom1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCreateRoom1.setkAllowGradient(false);
        btnCreateRoom1.setkBackGroundColor(new java.awt.Color(71, 120, 197));
        btnCreateRoom1.setkHoverColor(new java.awt.Color(62, 107, 178));
        btnCreateRoom1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnCreateRoom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRoom1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnCreateRoom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 161, 107, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRoomActionPerformed
        
        StringBuilder sb= new StringBuilder();
        DataValidator.ValidationEmpty(txtIDroom, sb, "Enter your Room ID");
        DataValidator.ValidationEmpty(txtRoomName, sb, "Enter your Room Name");
        DataValidator.ValidationEmpty(txtBed, sb, "Enter your Bed");
        DataValidator.ValidationEmpty(txtBedLimited, sb, "Enter your RoomLimited");
        if(sb.length()>0)
        {
            MessageDialogHelper.showErrorDialog(parentFrom, sb.toString(), "Error");
            return;
        }
        try {
            RoomModel rm= new RoomModel();
            rm.setIDRooms(Integer.parseInt(txtIDroom.getText()));
            rm.setRoomName(txtRoomName.getText());
            rm.setBed(Integer.parseInt(txtBed.getText()));
            rm.setLimitedBed(Integer.parseInt(txtBedLimited.getText()));
            
            RoomsDao dao= new RoomsDao();
            if(dao.insert(rm))
            {
                LoaddatatoTable();
                MessageDialogHelper.showMessageDialog(parentFrom, "Save Succesfully", "Thông báo");
                RemoveTextFiled();
            }
            else
            {
                 MessageDialogHelper.showMessageDialog(parentFrom, "Failed ", "Thông báo");
            }
            
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(parentFrom, e.getMessage(), "Error");
        }
    }//GEN-LAST:event_btnCreateRoomActionPerformed

    private void tblRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomMouseClicked
        try {
            int row=tblRoom.getSelectedRow();
            if(row>=0)
            {
                int id= (int) tblRoom.getValueAt(row, 0);
                RoomsDao dao= new RoomsDao();
                RoomModel rm=dao.FindByIDRooms(id);
                if(rm!=null)
                {
                    txtIDroom.setText(String.valueOf(rm.getIDRooms()));
                    txtRoomName.setText(rm.getRoomName());
                    txtBed.setText(String.valueOf(rm.getBed()));
                    txtBedLimited.setText(String.valueOf(rm.getLimitedBed()));
                    
                }   
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentFrom, e.getMessage(), " Lỗi");

        }
    }//GEN-LAST:event_tblRoomMouseClicked

    private void btnCreateRoom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRoom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateRoom1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCreateRoom;
    private com.k33ptoo.components.KButton btnCreateRoom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoom;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtBedLimited;
    private javax.swing.JTextField txtIDroom;
    private javax.swing.JTextField txtRoomName;
    // End of variables declaration//GEN-END:variables
}
