/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FlightSurfaceView.java
 *
 * Created on Oct 13, 2009, 11:20:36 PM
 */

package PLNF_Component;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author -B-
 */
public class FlightSurfaceView extends javax.swing.JPanel {

    String outputData;
    FlightSurfaceController controller;
    boolean isHT; 
    boolean isV;
    
    /** Creates new form FlightSurfaceView */
    public FlightSurfaceView(FlightSurfaceController.SURFACE_TYPE type, FlightSurfaceController controller)
    {

        initComponents();
        this.controller = controller;

        // Initially Type 1 is selected, so disable the unnecessary inputs
        jSSPNOP_Text.setEnabled(false);
        jCHRDBP_Text.setEnabled(false);
        jSAVSO_Text.setEnabled(false);

        controller.createLink("AIRFOIL",jAirfoil_Text,String.class);
        controller.createLink("CHRDBP", jCHRDBP_Text, Double.class);
        controller.createLink("CHRDR",  jCHRDR_Text,  Double.class);
        controller.createLink("CHRDTP", jCHRDTP_Text, Double.class);
        controller.createLink("CHSTAT", jCHSTAT_Text, Double.class);
        controller.createLink("DHDADI", jDHDADI_Text, Double.class);
        controller.createLink("DHDADO", jDHDADO_Text, Double.class);
        controller.createLink("SAVSI",  jSAVSI_Text,  Double.class);
        controller.createLink("SAVSO",  jSAVSO_Text,  Double.class);
        controller.createLink("SSPNDO", jSSPNDO,      Double.class);
        controller.createLink("SSPNE",  jSSPNE_Text,  Double.class);
        controller.createLink("SSPNOP", jSSPNOP_Text, Double.class);
        controller.createLink("SSPN",   jSSPN_Text,   Double.class);
        controller.createLink("TWISTA", jTWISTA_Text, Double.class);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel55 = new javax.swing.JPanel();
        jTitle = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel220 = new javax.swing.JLabel();
        jSSPNE_Text = new javax.swing.JTextField();
        jCHRDBP_Text = new javax.swing.JTextField();
        jLabel229 = new javax.swing.JLabel();
        jSAVSI_Text = new javax.swing.JTextField();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jCHRDR_Text = new javax.swing.JTextField();
        jLabel237 = new javax.swing.JLabel();
        jSSPN_Text = new javax.swing.JTextField();
        jType = new javax.swing.JComboBox();
        jSAVSO_Text = new javax.swing.JTextField();
        jLabel214 = new javax.swing.JLabel();
        jCHSTAT_Text = new javax.swing.JTextField();
        jLabel216 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jSSPNOP_Text = new javax.swing.JTextField();
        jLabel228 = new javax.swing.JLabel();
        jCHRDTP_Text = new javax.swing.JTextField();
        jLabel232 = new javax.swing.JLabel();
        jAirfoil_Text = new javax.swing.JTextField();
        jLabel252 = new javax.swing.JLabel();
        jCustomAirfoil = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jDHDADO_Text = new javax.swing.JTextField();
        jLabel213 = new javax.swing.JLabel();
        jDHDADI_Text = new javax.swing.JTextField();
        jTWISTA_Text = new javax.swing.JTextField();
        jSSPNDO = new javax.swing.JTextField();
        jLabel233 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel55.setName("jPanel55"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(opendatcom.OpenDatcomController.class).getContext().getResourceMap(FlightSurfaceView.class);
        jTitle.setFont(resourceMap.getFont("jTitle.font")); // NOI18N
        jTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitle.setText(resourceMap.getString("jTitle.text")); // NOI18N
        jTitle.setName("jTitle"); // NOI18N

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel8.border.border.border.title"))))); // NOI18N
        jPanel8.setName("jPanel8"); // NOI18N

        jLabel220.setText(resourceMap.getString("jLabel220.text")); // NOI18N
        jLabel220.setToolTipText(resourceMap.getString("jLabel220.toolTipText")); // NOI18N
        jLabel220.setName("jLabel220"); // NOI18N

        jSSPNE_Text.setName("jSSPNE_Text"); // NOI18N

        jCHRDBP_Text.setName("jCHRDBP_Text"); // NOI18N

        jLabel229.setText(resourceMap.getString("jLabel229.text")); // NOI18N
        jLabel229.setToolTipText(resourceMap.getString("jLabel229.toolTipText")); // NOI18N
        jLabel229.setName("jLabel229"); // NOI18N

        jSAVSI_Text.setName("jSAVSI_Text"); // NOI18N

        jLabel235.setText(resourceMap.getString("jLabel235.text")); // NOI18N
        jLabel235.setToolTipText(resourceMap.getString("jLabel235.toolTipText")); // NOI18N
        jLabel235.setName("jLabel235"); // NOI18N

        jLabel236.setText(resourceMap.getString("jLabel236.text")); // NOI18N
        jLabel236.setToolTipText(resourceMap.getString("jLabel236.toolTipText")); // NOI18N
        jLabel236.setName("jLabel236"); // NOI18N

        jCHRDR_Text.setName("jCHRDR_Text"); // NOI18N

        jLabel237.setText(resourceMap.getString("jLabel237.text")); // NOI18N
        jLabel237.setToolTipText(resourceMap.getString("jLabel237.toolTipText")); // NOI18N
        jLabel237.setName("jLabel237"); // NOI18N

        jSSPN_Text.setName("jSSPN_Text"); // NOI18N

        jType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Type 1 (Straight Tapered)", "Type 2 (Double Delta)", "Type 3 (Cranked)" }));
        jType.setName("jType"); // NOI18N
        jType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTypeActionPerformed(evt);
            }
        });

        jSAVSO_Text.setName("jSAVSO_Text"); // NOI18N

        jLabel214.setText(resourceMap.getString("jLabel214.text")); // NOI18N
        jLabel214.setToolTipText(resourceMap.getString("jLabel214.toolTipText")); // NOI18N
        jLabel214.setName("jLabel214"); // NOI18N

        jCHSTAT_Text.setName("jCHSTAT_Text"); // NOI18N

        jLabel216.setText(resourceMap.getString("jLabel216.text")); // NOI18N
        jLabel216.setToolTipText(resourceMap.getString("jLabel216.toolTipText")); // NOI18N
        jLabel216.setName("jLabel216"); // NOI18N

        jLabel253.setText(resourceMap.getString("jLabel253.text")); // NOI18N
        jLabel253.setToolTipText(resourceMap.getString("jLabel253.toolTipText")); // NOI18N
        jLabel253.setName("jLabel253"); // NOI18N

        jSSPNOP_Text.setName("jSSPNOP_Text"); // NOI18N

        jLabel228.setText(resourceMap.getString("jLabel228.text")); // NOI18N
        jLabel228.setToolTipText(resourceMap.getString("jLabel228.toolTipText")); // NOI18N
        jLabel228.setName("jLabel228"); // NOI18N

        jCHRDTP_Text.setName("jCHRDTP_Text"); // NOI18N

        jLabel232.setText(resourceMap.getString("jLabel232.text")); // NOI18N
        jLabel232.setToolTipText(resourceMap.getString("jLabel232.toolTipText")); // NOI18N
        jLabel232.setName("jLabel232"); // NOI18N

        jAirfoil_Text.setName("jAirfoil_Text"); // NOI18N

        jLabel252.setText(resourceMap.getString("jLabel252.text")); // NOI18N
        jLabel252.setToolTipText(resourceMap.getString("jLabel252.toolTipText")); // NOI18N
        jLabel252.setName("jLabel252"); // NOI18N

        jCustomAirfoil.setText(resourceMap.getString("jCustomAirfoil.text")); // NOI18N
        jCustomAirfoil.setName("jCustomAirfoil"); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel252)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCustomAirfoil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jAirfoil_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel229)
                            .addComponent(jLabel236)
                            .addComponent(jLabel220)
                            .addComponent(jLabel237)
                            .addComponent(jLabel235)
                            .addComponent(jLabel214)
                            .addComponent(jLabel216)
                            .addComponent(jLabel228)
                            .addComponent(jLabel232)
                            .addComponent(jLabel253))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jType, 0, 133, Short.MAX_VALUE)
                            .addComponent(jCHRDTP_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jSSPNOP_Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jSAVSO_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jCHRDR_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jCHRDBP_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jSSPN_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jSSPNE_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jSAVSI_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jCHSTAT_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel253)
                    .addComponent(jType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSSPNOP_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel228))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel236)
                    .addComponent(jSSPNE_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel229)
                    .addComponent(jSSPN_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel220)
                    .addComponent(jCHRDBP_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel237)
                    .addComponent(jCHRDR_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel235)
                    .addComponent(jSAVSI_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel214)
                    .addComponent(jSAVSO_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel216)
                    .addComponent(jCHSTAT_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCHRDTP_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel232))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel252)
                    .addComponent(jAirfoil_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCustomAirfoil)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel15.border.title"))); // NOI18N
        jPanel15.setName("jPanel15"); // NOI18N

        jLabel211.setText(resourceMap.getString("jLabel211.text")); // NOI18N
        jLabel211.setToolTipText(resourceMap.getString("jLabel211.toolTipText")); // NOI18N
        jLabel211.setName("jLabel211"); // NOI18N

        jLabel212.setText(resourceMap.getString("jLabel212.text")); // NOI18N
        jLabel212.setToolTipText(resourceMap.getString("jLabel212.toolTipText")); // NOI18N
        jLabel212.setName("jLabel212"); // NOI18N

        jDHDADO_Text.setName("jDHDADO_Text"); // NOI18N

        jLabel213.setText(resourceMap.getString("jLabel213.text")); // NOI18N
        jLabel213.setToolTipText(resourceMap.getString("jLabel213.toolTipText")); // NOI18N
        jLabel213.setName("jLabel213"); // NOI18N

        jDHDADI_Text.setName("jDHDADI_Text"); // NOI18N

        jTWISTA_Text.setName("jTWISTA_Text"); // NOI18N

        jSSPNDO.setName("jSSPNDO"); // NOI18N

        jLabel233.setText(resourceMap.getString("jLabel233.text")); // NOI18N
        jLabel233.setToolTipText(resourceMap.getString("jLabel233.toolTipText")); // NOI18N
        jLabel233.setName("jLabel233"); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel212)
                    .addComponent(jLabel233))
                .addGap(46, 46, 46)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSSPNDO)
                    .addComponent(jTWISTA_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel213)
                    .addComponent(jLabel211))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDHDADI_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jDHDADO_Text))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jDHDADI_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDHDADO_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel213)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel212)
                            .addComponent(jTWISTA_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel233)
                            .addComponent(jSSPNDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel211))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel16.border.title"))); // NOI18N
        jPanel16.setName("jPanel16"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel16.getAccessibleContext().setAccessibleName(resourceMap.getString("jPanel16.AccessibleContext.accessibleName")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void jTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTypeActionPerformed
        int type = jType.getSelectedIndex() + 1;
        switch(type)
        {
            case(1):    
            {  // Type 1 planforms do not take the following inputs, so disable them
                jSSPNOP_Text.setEnabled(false);
                jSSPNOP_Text.setText("");
                jCHRDBP_Text.setEnabled(false);
                jCHRDBP_Text.setText("");
                jSAVSO_Text.setEnabled(false);
                jSAVSO_Text.setText("");
                break;
            }
            default:
            { // Else enable them and continue
                jSSPNOP_Text.setEnabled(true);
                jCHRDBP_Text.setEnabled(true);
                jSAVSO_Text.setEnabled(true);
                break;
            }
        }
        controller.refresh();
    }//GEN-LAST:event_jTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAirfoil_Text;
    private javax.swing.JTextField jCHRDBP_Text;
    private javax.swing.JTextField jCHRDR_Text;
    private javax.swing.JTextField jCHRDTP_Text;
    private javax.swing.JTextField jCHSTAT_Text;
    private javax.swing.JButton jCustomAirfoil;
    private javax.swing.JTextField jDHDADI_Text;
    private javax.swing.JTextField jDHDADO_Text;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jSAVSI_Text;
    private javax.swing.JTextField jSAVSO_Text;
    private javax.swing.JTextField jSSPNDO;
    private javax.swing.JTextField jSSPNE_Text;
    private javax.swing.JTextField jSSPNOP_Text;
    private javax.swing.JTextField jSSPN_Text;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTWISTA_Text;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jTitle;
    private javax.swing.JComboBox jType;
    // End of variables declaration//GEN-END:variables

    public JTextField getjAirfoil_Text() {
        return jAirfoil_Text;
    }

    public JTextField getjCHRDBP_Text() {
        return jCHRDBP_Text;
    }

    public JTextField getjCHRDR_Text() {
        return jCHRDR_Text;
    }

    public JTextField getjCHRDTP_Text() {
        return jCHRDTP_Text;
    }

    public JTextField getjCHSTAT_Text() {
        return jCHSTAT_Text;
    }

    public JTextField getjDHDADO_Text() {
        return jDHDADO_Text;
    }

    public JTextField getjDHDADI_Text() {
        return jDHDADI_Text;
    }

    public JTextField getjSAVSI_Text() {
        return jSAVSI_Text;
    }

    public JTextField getjSAVSO_Text() {
        return jSAVSO_Text;
    }

    public JTextField getjSSPNE_Text() {
        return jSSPNE_Text;
    }

    public JTextField getjSSPNOP_Text() {
        return jSSPNOP_Text;
    }

    public JTextField getjSSPN_Text() {
        return jSSPN_Text;
    }

    public JTextField getjTWISTA_Text() {
        return jTWISTA_Text;
    }

    public int getjTYPE() {
        return jType.getSelectedIndex() + 1;
    }

    public void setjTYPE(int i) {
        jType.setSelectedIndex(i);
    }

    public void setjPanel55(JPanel jPanel55) {
        this.jPanel55 = jPanel55;
    }

    public void setjTitle(String Title) {
        this.jTitle.setText(Title);
    }

    public String getOutputData() {
        return outputData;
    }

    public void setOutputData(String outputData) {
        this.outputData = outputData;
    }

    public void setIsHT(boolean isHT) {
        this.isHT = isHT;
    }

    public void setIsV(boolean isV) {
        this.isV = isV;
    }

    public JTextField getjSSPNDO() {
        return jSSPNDO;
    }
}
