/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.tutor;

import adt.AdtInterface;
import adt.ArrayList;
import entity.Programme;
import entity.Tutor;
import javax.swing.DefaultComboBoxModel;
import utility.insertData;

/**
 *
 * @author kenne
 */
public class tutorAdd extends javax.swing.JFrame {

    public static AdtInterface<Tutor> tutorList = insertData.tutorList;
    public static AdtInterface<Programme> programmeList = insertData.programmeList;

    /**
     * Creates new form tutorAdd
     */
    public tutorAdd() {
        initComponents();
        setupProgrammeComboBox();

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
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backTextField = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        add1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        programmeComboBox = new javax.swing.JComboBox<>();
        positionComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TUTOR - ADD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        nameTextField.setBackground(new java.awt.Color(255, 255, 255));
        nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(0, 0, 0));
        nameTextField.setToolTipText("");
        nameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 340, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NAME : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ADDRESS : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        addressTextField.setBackground(new java.awt.Color(255, 255, 255));
        addressTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressTextField.setForeground(new java.awt.Color(0, 0, 0));
        addressTextField.setToolTipText("");
        addressTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 340, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("POSITION :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PROGRAMME : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, 40));

        backTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backTextField.setText("BACK");
        backTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(backTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 720, -1, -1));

        add1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add1.setText("ADD");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel1.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 670, 140, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("SALARY :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        salaryTextField.setBackground(new java.awt.Color(255, 255, 255));
        salaryTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salaryTextField.setForeground(new java.awt.Color(0, 0, 0));
        salaryTextField.setToolTipText("");
        salaryTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(salaryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 340, 40));

        programmeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        programmeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        programmeComboBox.setForeground(new java.awt.Color(0, 0, 0));
        programmeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmeComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(programmeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        positionComboBox.setBackground(new java.awt.Color(255, 255, 255));
        positionComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        positionComboBox.setForeground(new java.awt.Color(0, 0, 0));
        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LECTURER", "TUTOR" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(positionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setupProgrammeComboBox() {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        for (int i = 0; i < programmeList.getNumberOfEntries(); i++) {
            Programme programme = programmeList.getEntry(i + 1);
            comboBoxModel.addElement(programme.getProgrammeName());
        }
        programmeComboBox.setModel(comboBoxModel); // Set the model for the JComboBox

    }

    private void backTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTextFieldActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        tutorUI t = new tutorUI();
        t.setVisible(true);
    }//GEN-LAST:event_backTextFieldActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:

        String name = nameTextField.getText();
        String address = addressTextField.getText();
        double salary = Double.parseDouble(salaryTextField.getText());
        String position = positionComboBox.getItemAt(positionComboBox.getSelectedIndex());
        String programme = programmeComboBox.getItemAt(programmeComboBox.getSelectedIndex());
        int total = tutorList.getNumberOfEntries() + 1;
        String id = "T" + total;

        
        
        for (int i = 0; i < tutorList.getNumberOfEntries(); i++) {

            if (id.equals(tutorList.getEntry(i + 1).getTutorID())) {
                total += 1;
                id = "T" + total;
            }
        }

        for (int i = 0; i < programmeList.getNumberOfEntries(); i++) {
            if (programme.equals(programmeList.getEntry(i + 1).getProgrammeName())) {
                programme = programmeList.getEntry(i + 1).getProgrammeCode();

            }
        }

        tutorList.add(new Tutor("T" + total, name, salary, address, position, programme));
        jLabel1.setText("Added Successfully");
        nameTextField.setText("");
        addressTextField.setText("");
        salaryTextField.setText("");

        for (int i = 0; i < tutorList.getNumberOfEntries(); i++) {
            System.out.println("tutorID : " + tutorList.getEntry(i + 1).getTutorID());
        }
    }//GEN-LAST:event_add1ActionPerformed

    private void programmeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programmeComboBoxActionPerformed

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(tutorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tutorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tutorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tutorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tutorAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JComboBox<String> programmeComboBox;
    private javax.swing.JTextField salaryTextField;
    // End of variables declaration//GEN-END:variables
}
