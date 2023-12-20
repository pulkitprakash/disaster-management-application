/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundRaisingOrganisationAdmin;

import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pulkitprakash
 */
public class FundRaisingOrganisationAdminWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    
    /**
     * Creates new form HelpSeekerAdminWorkArea
     */
    public FundRaisingOrganisationAdminWorkArea(JPanel downJPanel, Enterprise enterprise) {
        initComponents();
         this.downJPanel=downJPanel;
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageUserAccountBtn = new javax.swing.JButton();
        manageEmployeeBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        manageUserAccountBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        manageUserAccountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_useraccount.jpeg"))); // NOI18N
        manageUserAccountBtn.setText("MANAGE USER ACCOUNT");
        manageUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountBtnActionPerformed(evt);
            }
        });

        manageEmployeeBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        manageEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_emp.jpeg"))); // NOI18N
        manageEmployeeBtn.setText("MANAGE EMPLOYEE");
        manageEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                                              Fund Raising Organization Admin Work Area");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Manage User Account");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Manage Employee");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(manageEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)
                        .addComponent(manageUserAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel2)
                        .addGap(353, 353, 353)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(manageEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(manageUserAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountBtnActionPerformed
        ManageUserAccount muajp = new ManageUserAccount(downJPanel, enterprise);
        downJPanel.add("HelpProviderManageUserAccount", muajp);

        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageUserAccountBtnActionPerformed

    private void manageEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeBtnActionPerformed
        ManageEmployee manageEmployeeJPanel = new ManageEmployee(downJPanel, enterprise.getOrganizationDirectory());
        downJPanel.add("GiverManageEmployee", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageEmployeeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton manageEmployeeBtn;
    private javax.swing.JButton manageUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}
