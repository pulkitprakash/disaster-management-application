/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Volunteer;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.Organization.VolunteerOrganization;
import BusinessModel.UserAccount.UserAccount;
import BusinessModel.Volunteer.Volunteer;
import BusinessModel.Volunteer.VolunteerDirectory;
import BusinessModel.WorkQueue.EmergencyAssistanceWorkReq;
import BusinessModel.WorkQueue.WorkQueue;
import BusinessModel.WorkQueue.WorkReq;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pulkitprakash
 */
public class VolunteerDashboard extends javax.swing.JPanel {

    /** Creates new form VolunteerDashboard */
    
    private JPanel downJPanel;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise enterprise;
    private EcoSystem ESystem;
    private Volunteer v;
    public VolunteerDashboard(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel=downJPanel;
        this.UserAccount=UserAccount;
        this.org=org;
        this.enterprise=enterprise;
        this.ESystem=ESystem;
        
        for (Volunteer volunteer:((VolunteerOrganization)org).getVolunteerList().getVolunteerList())
        {
            if (UserAccount.getEmployee().getEmpname().equals(volunteer.getVolunteerName())) {
                 v=volunteer;
                 
            }
            
        }
    
    
        if(v.getWorkqueue()== null){
            WorkQueue w = new WorkQueue();
            v.setWorkqueue(w);
            
        }
        
        
        populateEventTable();
    }
    
    public void populateEventTable()
    {
        DefaultTableModel model = (DefaultTableModel) ngoeventTbl.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : ESystem.getWorkQueue().getWorkRequestList()){
            Boolean isFound = false;
            if(work instanceof EmergencyAssistanceWorkReq && ((EmergencyAssistanceWorkReq) work).getVolunteerRequired()>0  &&  work.getVolunteerList() != null){
               for(Volunteer v: work.getVolunteerList()){
                    if(v == this.v){
                        isFound = true;
                        break;
                    }
               }
            if(!isFound){
            // if((work.getStatus().equals("Not Joined"))){
              Object[] row = new Object[10];
              row[0] = ((EmergencyAssistanceWorkReq) work).getTitle();
              row[1] = ((EmergencyAssistanceWorkReq) work).getDescription();
              row[2] =  work.getDateOfRequest();
              row[3] = ((EmergencyAssistanceWorkReq) work).getLocation();
              row[4] = ((EmergencyAssistanceWorkReq) work).getVolunteerRequired();
              row[5] =  ((EmergencyAssistanceWorkReq) work).getVolunteerAcquired();
              row[6] = work;
            //  row[7] = work.getStatus();

              model.addRow(row);
            }
           }
           
        
    }}
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngoeventTbl = new javax.swing.JTable();
        vRequiredTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        titleTxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        descTxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        joinBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("Volunteer Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 42, -1, -1));

        ngoeventTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Title", "Description", "Date", "Location", "Volunteers Required", "Volunteers acquired", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ngoeventTbl);
        if (ngoeventTbl.getColumnModel().getColumnCount() > 0) {
            ngoeventTbl.getColumnModel().getColumn(6).setMinWidth(0);
            ngoeventTbl.getColumnModel().getColumn(6).setPreferredWidth(0);
            ngoeventTbl.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Event Title                : ");

        viewBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        descTxt.setColumns(20);
        descTxt.setRows(5);
        jScrollPane3.setViewportView(descTxt);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Description              : ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Location                  : ");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Date                        :     ");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel7.setText("Volunteers Required: ");

        joinBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        joinBtn.setText("Join this event");
        joinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volunteer-log.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)
                                .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(vRequiredTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(joinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 16, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(viewBtn)
                            .addComponent(joinBtn))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4))
                            .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6))
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7))
                            .addComponent(vRequiredTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void joinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBtnActionPerformed
        int selectedRow = ngoeventTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            EmergencyAssistanceWorkReq p = (EmergencyAssistanceWorkReq) ngoeventTbl.getValueAt(selectedRow, 6);
            //  if(p.getVolunteer().getVolunteerName()==null){
                // p.setStatus("Joined");
                p.setVolunteerRequired(p.getVolunteerRequired()-1);
                p.setVolunteerAcquired(p.getVolunteerAcquired()+1);
                p.getVolunteerList().add(v);
                //ngoeventTbl.setEditingRow(false);

                // }
            // else{
                JOptionPane.showMessageDialog(null, "You Successfully registered for an Event! \n The number of volunteers acquired so far for this event are "+p.getVolunteerAcquired()+"\n The number of volunteers now required for this event are"+p.getVolunteerRequired());
                DefaultTableModel model = (DefaultTableModel) ngoeventTbl.getModel();
                model.removeRow(ngoeventTbl.getSelectedRow());
                // }

            // populateEventTable();

            //joinBtn.setEnabled(false);
        }
    }//GEN-LAST:event_joinBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = ngoeventTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            EmergencyAssistanceWorkReq p = (EmergencyAssistanceWorkReq) ngoeventTbl.getValueAt(selectedRow, 6);
            titleTxt.setText(p.getTitle());
            descTxt.setText(p.getDescription());
            locationTxt.setText(p.getLocation());
            dateTxt.setText(p.getDateOfRequest().toString());
            vRequiredTxt.setText(String.valueOf(p.getVolunteerRequired()));
        }
    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextArea descTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton joinBtn;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTable ngoeventTbl;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JTextField vRequiredTxt;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

}
