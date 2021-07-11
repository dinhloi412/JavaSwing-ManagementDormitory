/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.StudentDao;
import Model.StudentModel;
import helper.DataValidator;
import helper.ImgaeHelper;
import helper.MessageDialogHelper;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LoiDinh
 */
public class Student extends javax.swing.JPanel {
    private Page parentFrom;
    private DefaultTableModel tblModel;
    private byte[] personalImage;
    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
        initTable();
        LoadDatatoTable();
    }
    private  void initTable()
    {
        tblModel= new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"ID Student","FullName","Email","Phone Number","Sex","Adress","Birthday"});
        tblStudent.setModel(tblModel);
        tblStudent.getTableHeader().setOpaque(false);
        tblStudent.getTableHeader().setBackground(new Color(32,136,203));
        tblStudent.getTableHeader().setForeground(new Color(225,255,255));
        tblStudent.setRowHeight(25);
    }
    private void LoadDatatoTable()
    {
        try {
            StudentDao dao= new StudentDao();
            List<StudentModel> list=dao.findall();
            tblModel.setRowCount(0);
            for(StudentModel it:list)
            {
                tblModel.addRow(new Object[]{
                it.getIDStdudent(),it.getFullName(),it.getEmail(),it.getPhoneNumber(),it.getSex()==1?"Male":"Famle",it.getAddress(),it.getBirthday()
                
            });
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentFrom, e.getMessage(), "Lỗi");
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDStudent = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBrowser = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaAddress = new javax.swing.JTextArea();
        rdmale = new javax.swing.JRadioButton();
        rdFamale = new javax.swing.JRadioButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        txtBirthday = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(830, 582));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID Student");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Full Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        txtIDStudent.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtIDStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(71, 120, 197)));
        txtIDStudent.setCaretColor(new java.awt.Color(255, 0, 255));
        txtIDStudent.setOpaque(false);

        txtFullName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtFullName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(71, 120, 197)));
        txtFullName.setOpaque(false);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(71, 120, 197)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Sex: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Address");

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(71, 120, 197)));

        tblStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStudent.setFocusable(false);
        tblStudent.setGridColor(new java.awt.Color(255, 255, 255));
        tblStudent.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblStudent.setRowHeight(25);
        tblStudent.setShowHorizontalLines(false);
        tblStudent.getTableHeader().setReorderingAllowed(false);
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudent);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBrowser.setBackground(new java.awt.Color(153, 194, 255));
        btnBrowser.setText("Open Picture");
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });

        lblImage.setBackground(new java.awt.Color(153, 194, 255));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagev2/icons8_save_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(btnBrowser)
                .addGap(58, 58, 58))
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrowser)
                .addContainerGap())
        );

        txaAddress.setColumns(20);
        txaAddress.setRows(5);
        jScrollPane2.setViewportView(txaAddress);

        rdmale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdmale);
        rdmale.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdmale.setText("Male");

        rdFamale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdFamale);
        rdFamale.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdFamale.setText("Female");

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtBirthday.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtBirthday.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(71, 120, 197)));

        jPanel3.setBackground(new java.awt.Color(71, 120, 197));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Management Rooms");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtIDStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(17, 17, 17)
                                .addComponent(rdmale)
                                .addGap(24, 24, 24)
                                .addComponent(rdFamale))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtBirthday))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnNew)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(txtIDStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5))
                            .addComponent(rdmale)
                            .addComponent(rdFamale))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtIDStudent.setText("");
        txtFullName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        personalImage=null;
        
        
        
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb= new StringBuilder();
        DataValidator.ValidationEmpty(txtIDStudent, sb, "Ma sinh vien khong duoc de trong");
        if(sb.length()>0)
        {
            MessageDialogHelper.showErrorDialog(parentFrom, sb.toString(), "Lỗi");
        }
        try {
            StudentModel sv= new StudentModel();
            sv.setIDStdudent(Integer.parseInt(txtIDStudent.getText()));
            sv.setFullName(txtFullName.getText());
            sv.setAddress(txaAddress.getText());
            sv.setEmail(txtEmail.getText());
            sv.setPhoneNumber(txtPhone.getText());
            sv.setSex(rdmale.isSelected()?1:0);
            sv.setBirthday(txtBirthday.getText());
            sv.setPicture(personalImage);
//            sv.setBirthday(new SimpleDateFormat("dd/MM/yyyy").parse(txtBirthday.getText()));
            StudentDao dao= new StudentDao();
            if(dao.insert(sv))
            {
                MessageDialogHelper.showMessageDialog(parentFrom, "Sinh viên đã được lưu", "Thông báo");
                LoadDatatoTable();
            }
            else
            {
                MessageDialogHelper.showConfirmDialog(parentFrom, "Sinh viên chưa được lưu", TOOL_TIP_TEXT_KEY);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentFrom, e.getMessage(), " Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb= new StringBuilder();
        DataValidator.ValidationEmpty(txtIDStudent, sb, "Ma sinh vien khong duoc de trong");
        if(sb.length()>0)
        {
            MessageDialogHelper.showErrorDialog(parentFrom, sb.toString(), "Lỗi");
        }
        if(MessageDialogHelper.showConfirmDialog(parentFrom, "Bạn có muốn cập nhật không", "Thông báo quan trọng")==JOptionPane.NO_OPTION){ 
            return;
            
        }
        try {
            StudentModel sv= new StudentModel();
            sv.setIDStdudent(Integer.parseInt(txtIDStudent.getText()));
            sv.setFullName(txtFullName.getText());
            sv.setAddress(txaAddress.getText());
            sv.setEmail(txtEmail.getText());
            sv.setPhoneNumber(txtPhone.getText());
            sv.setSex(rdmale.isSelected()?1:0);
            sv.setBirthday(txtBirthday.getText());
            sv.setPicture(personalImage);
//            sv.setBirthday(new SimpleDateFormat("dd/MM/yyyy").parse(txtBirthday.getText()));
            StudentDao dao= new StudentDao();
            if(dao.update(sv))
            {
                MessageDialogHelper.showMessageDialog(parentFrom, "Sinh viên đã được cập nhật", "Thông báo");
                LoadDatatoTable();
            }
            else
            {
                MessageDialogHelper.showConfirmDialog(parentFrom, "Sinh viên chưa được cập nhật", "Cảnh báo");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentFrom, e.getMessage(), " Lỗi");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb= new StringBuilder();
        DataValidator.ValidationEmpty(txtIDStudent, sb, "Ma sinh vien khong duoc de trong");
        if(sb.length()>0)
        {
            MessageDialogHelper.showErrorDialog(parentFrom, sb.toString(), "Lỗi");
        }
        if(MessageDialogHelper.showConfirmDialog(parentFrom, "Bạn có muốn xoá sinh viên không", "Thông báo quan trọng")==JOptionPane.NO_OPTION){
             
            return;
            
        }
        try {
           
            StudentDao dao= new StudentDao();
            if(dao.delete(txtIDStudent.getText()))
            {
                MessageDialogHelper.showMessageDialog(parentFrom, "Sinh viên đã được xoá", "Thông báo");
                LoadDatatoTable();
            }
            else
            {
                MessageDialogHelper.showConfirmDialog(parentFrom, "Sinh viên chưa được xoá", TOOL_TIP_TEXT_KEY);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentFrom, e.getMessage(), " Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
//    private ArrayList<StudentModel> list;
    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked
        try {
            int row= tblStudent.getSelectedRow();
             if(row>=0)
             {
                 int id= (int) tblStudent.getValueAt(row, 0);
                 StudentDao dao= new StudentDao();
                 StudentModel sv= dao.FindByID(id);
                 
                 if(sv != null)
                 {
                     txtIDStudent.setText(String.valueOf(sv.getIDStdudent()));
                     txtFullName.setText(sv.getFullName());
                     txtEmail.setText(sv.getEmail());
                     txtPhone.setText(sv.getPhoneNumber());
                     rdmale.setSelected(sv.getSex()==1?true:false);
                     txaAddress.setText(sv.getAddress());
                     txtBirthday.setText(sv.getBirthday());
                     if(sv.getPicture()!=null)
                     {
                         Image img=ImgaeHelper.createImageFromByteArray(sv.getPicture(), "jpg");
                         lblImage.setIcon(new ImageIcon(img));
                         personalImage= sv.getPicture();
                     }
                     else
                     {
                         personalImage=null; 
                     }
                     
                 }
             }
//                int row= tblStudent.getSelectedRow();
//                StudentModel sv=list.get(row);
//                     txtIDStudent.setText(String.valueOf(sv.getIDStdudent()));
//                     txtFullName.setText(sv.getFullName());
//                     txtEmail.setText(sv.getEmail());
//                     txtPhone.setText(sv.getPhoneNumber());
//                     rdmale.setSelected(sv.getSex()==1?true:false);
//                     txaAddress.setText(sv.getAddress());
//                     txtBirthday.setText(sv.getBirthday());
                
        } catch (Exception e) {
             e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentFrom, e.getMessage(), " Lỗi");
        }
    }//GEN-LAST:event_tblStudentMouseClicked

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        JFileChooser chooser= new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.isDirectory())
                {
                    return true;
                }
                else
                {
                    return f.getName().toLowerCase().endsWith("jpg");
                }
            }

            @Override
            public String getDescription() {
                return "Image File(*.jpg)";
            }
        });
        if(chooser.showOpenDialog(parentFrom)==JFileChooser.CANCEL_OPTION)
        {
            return;
        }
        File file= chooser.getSelectedFile();
        try {
                ImageIcon icon= new ImageIcon(file.getPath());
                Image img=ImgaeHelper.resize(icon.getImage(), 140, 160);
                ImageIcon resizedIcon=new ImageIcon(img);
                lblImage.setIcon(resizedIcon);
                personalImage= ImgaeHelper.toByteArray(img, "jpg");
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showMessageDialog(parentFrom, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnBrowserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton rdFamale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextArea txaAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtIDStudent;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
