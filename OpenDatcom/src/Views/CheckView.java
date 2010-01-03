/*
 * CheckView.java
 *
 * Created on Oct 14, 2009, 2:09:07 AM
 */

package Views;

import Core.OAE_ViewComponent;
import Services.DatcomThread;
import Services.FortranFormat;
import Services.ImportExportService;
import Services.ProjectService;
import java.io.File;

/**
 * 
 * @author -B-
 */
public class CheckView extends OAE_ViewComponent
{
    ProjectService ps;
    ImportExportService ies;
    FortranFormat fformat;


    /** Creates new form CheckView */
    public CheckView() {
        initComponents();
        ps = ProjectService.getInstance();
        ies = ImportExportService.getInstance();
        fformat = new FortranFormat();
        name = "Review";
        initView(name);
    }

    public void registerLinks(){}
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUnits = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jOutputText = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jDrawPane = new javax.swing.JPanel();
        jBuild = new javax.swing.JCheckBox();
        jPlot = new javax.swing.JCheckBox();
        jDumpAll = new javax.swing.JCheckBox();
        jDerivDeg = new javax.swing.JCheckBox();
        jDerivRad = new javax.swing.JCheckBox();
        jDrawPane1 = new javax.swing.JPanel();
        jFeet = new javax.swing.JRadioButton();
        jInches = new javax.swing.JRadioButton();
        jMeters = new javax.swing.JRadioButton();
        jCentimeters = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCustomControls = new javax.swing.JTable();

        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jOutputText.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Output", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION)));
        jOutputText.setEditable(false);
        jOutputText.setFocusable(false);
        jOutputText.setName("jOutputText"); // NOI18N
        jScrollPane1.setViewportView(jOutputText);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Controls"));
        jPanel1.setName("jPanel1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(opendatcom.OpenDatcomController.class).getContext().getResourceMap(CheckView.class);
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel3.setName("jPanel3"); // NOI18N

        jDrawPane.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jDrawPane.border.title"))); // NOI18N
        jDrawPane.setName("jDrawPane"); // NOI18N

        jBuild.setText(resourceMap.getString("jBuild.text")); // NOI18N
        jBuild.setName("jBuild"); // NOI18N

        jPlot.setText(resourceMap.getString("jPlot.text")); // NOI18N
        jPlot.setName("jPlot"); // NOI18N

        jDumpAll.setText(resourceMap.getString("jDumpAll.text")); // NOI18N
        jDumpAll.setName("jDumpAll"); // NOI18N

        jDerivDeg.setText(resourceMap.getString("jDerivDeg.text")); // NOI18N
        jDerivDeg.setName("jDerivDeg"); // NOI18N
        jDerivDeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDerivDegActionPerformed(evt);
            }
        });

        jDerivRad.setText(resourceMap.getString("jDerivRad.text")); // NOI18N
        jDerivRad.setName("jDerivRad"); // NOI18N
        jDerivRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDerivRadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDrawPaneLayout = new javax.swing.GroupLayout(jDrawPane);
        jDrawPane.setLayout(jDrawPaneLayout);
        jDrawPaneLayout.setHorizontalGroup(
            jDrawPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDrawPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDrawPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBuild)
                    .addComponent(jPlot)
                    .addComponent(jDumpAll)
                    .addComponent(jDerivDeg)
                    .addComponent(jDerivRad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDrawPaneLayout.setVerticalGroup(
            jDrawPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDrawPaneLayout.createSequentialGroup()
                .addComponent(jBuild)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPlot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDumpAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDerivDeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDerivRad))
        );

        jDrawPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jDrawPane1.border.title"))); // NOI18N
        jDrawPane1.setName("jDrawPane1"); // NOI18N

        jUnits.add(jFeet);
        jFeet.setSelected(true);
        jFeet.setText(resourceMap.getString("jFeet.text")); // NOI18N
        jFeet.setName("jFeet"); // NOI18N

        jUnits.add(jInches);
        jInches.setText(resourceMap.getString("jInches.text")); // NOI18N
        jInches.setName("jInches"); // NOI18N

        jUnits.add(jMeters);
        jMeters.setText(resourceMap.getString("jMeters.text")); // NOI18N
        jMeters.setName("jMeters"); // NOI18N

        jUnits.add(jCentimeters);
        jCentimeters.setText(resourceMap.getString("jCentimeters.text")); // NOI18N
        jCentimeters.setName("jCentimeters"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        javax.swing.GroupLayout jDrawPane1Layout = new javax.swing.GroupLayout(jDrawPane1);
        jDrawPane1.setLayout(jDrawPane1Layout);
        jDrawPane1Layout.setHorizontalGroup(
            jDrawPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDrawPane1Layout.createSequentialGroup()
                .addGroup(jDrawPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDrawPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFeet)
                        .addComponent(jInches)
                        .addGroup(jDrawPane1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                    .addComponent(jMeters)
                    .addComponent(jCentimeters))
                .addContainerGap())
        );
        jDrawPane1Layout.setVerticalGroup(
            jDrawPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDrawPane1Layout.createSequentialGroup()
                .addComponent(jFeet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInches)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMeters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCentimeters)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel2.border.title"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jCustomControls.setModel(new javax.swing.table.DefaultTableModel(
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
                {null}
            },
            new String [] {
                "Text"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jCustomControls.setToolTipText(resourceMap.getString("jCustomControls.toolTipText")); // NOI18N
        jCustomControls.setName("jCustomControls"); // NOI18N
        jScrollPane2.setViewportView(jCustomControls);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jDrawPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDrawPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDrawPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDrawPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        generateDat();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        runDatcom();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDerivDegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDerivDegActionPerformed
        jDerivRad.setSelected(false);
    }//GEN-LAST:event_jDerivDegActionPerformed

    private void jDerivRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDerivRadActionPerformed
        jDerivDeg.setSelected(false);
    }//GEN-LAST:event_jDerivRadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jBuild;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton jCentimeters;
    private javax.swing.JTable jCustomControls;
    private javax.swing.JCheckBox jDerivDeg;
    private javax.swing.JCheckBox jDerivRad;
    private javax.swing.JPanel jDrawPane;
    private javax.swing.JPanel jDrawPane1;
    private javax.swing.JCheckBox jDumpAll;
    private javax.swing.JRadioButton jFeet;
    private javax.swing.JRadioButton jInches;
    private javax.swing.JRadioButton jMeters;
    private javax.swing.JTextPane jOutputText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox jPlot;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.ButtonGroup jUnits;
    // End of variables declaration//GEN-END:variables

    public void generateDat()
    {
        File datFile = new File(parent.getWorkingDirectory().getAbsolutePath() +"\\for005.dat");
        String temp = fformat.generateForFile();

        // Set the units
        if(jFeet.isSelected()){
            temp += "DIM FT\n";
        }else if(jMeters.isSelected()){
            temp += "DIM M\n";
        }else if(jInches.isSelected()){
            temp += "DIM IN\n";
        }else if(jCentimeters.isSelected()){
            temp += "DIM CM\n";
        }
        // Set the other controls
        if(jBuild.isSelected()){
            temp += "BUILD \n";
        }
        if(jPlot.isSelected()){
            temp += "PLOT\n";
        }
        if(jDumpAll.isSelected()){
            temp += "DUMP CASE\n";
        }
        if(jDerivRad.isSelected()){
            //temp += "DAMP\n";
            temp += "DERIV RAD\n";
        }
        else if(jDerivDeg.isSelected()){
            //temp += "DAMP\n";
            temp += "DERIV DEG\n";
        }

        for(int i = 0; i  < 10; i++)
        {
            Object o = jCustomControls.getValueAt(i, 0);
            if((o != null) && !(o.toString().isEmpty()))
            {
                temp += String.valueOf(o).toUpperCase() + "\n";
            }
        }

        temp += "NEXT CASE";
        this.jOutputText.setText(temp);
        temp.replaceAll("\t", " ");
        ies.writeFile(datFile, temp);
    }
    
    private void runDatcom()
    {
        generateDat();
        DatcomThread t = new DatcomThread();
        t.start();
    }
}
