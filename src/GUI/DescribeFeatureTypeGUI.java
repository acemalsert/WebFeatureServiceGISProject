/*
	Author: Ahmet Cemal Sert
*/

package GUI;

import Functions.DescribeFeatureType;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DescribeFeatureTypeGUI extends javax.swing.JFrame {

    private javax.swing.JComboBox<String> SRSNAMEComboBox;
    private javax.swing.JTextField cql_filterTextField;
    private javax.swing.JButton sorguyuUygula_jButton;
    private javax.swing.JComboBox<String> typeNameComboBox;

    public DescribeFeatureTypeGUI() {
        initComponents();
    }

    // class attributes
    private static final String serviceURL = "http://cbsservis.tkgm.gov.tr/tkgm.ows/wfs?";
    private static final String SERVICE= "SERVICE=WFS";
    private static final String VERSION = "Version=1.0.0";
    private static final String REQUEST = "REQUEST=GetFeature";
    private static String TYPENAME;
    private static String SRSNAME;
    private static String CQL_FILTER;
    private String finalURL;


    @SuppressWarnings("unchecked")
    private void initComponents() {

        typeNameComboBox = new javax.swing.JComboBox<>();
        SRSNAMEComboBox = new javax.swing.JComboBox<>();
        sorguyuUygula_jButton = new javax.swing.JButton();
        cql_filterTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        typeNameComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        typeNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPENAME=TKGM:mahalleler", "TYPENAME=TKGM:yapılar", "TYPENAME=TKGM:eklentiler", "TYPENAME=TKGM:adalar", "TYPENAME=TKGM:muhdesatlar", "TYPENAME=TKGM:irtifakhakları", "TYPENAME=TKGM:tescilharicialanlar", "TYPENAME=TKGM:yerkontrolnoktaları" }));
        typeNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeNameComboBoxActionPerformed(evt);
            }
        });

        SRSNAMEComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SRSNAMEComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SRSNAME=EPSG:4326" }));
        SRSNAMEComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRSNAMEComboBoxActionPerformed(evt);
            }
        });

        sorguyuUygula_jButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sorguyuUygula_jButton.setText("SORGUYU UYGULA");
        sorguyuUygula_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorguyuUygula_jButtonActionPerformed(evt);
            }
        });

        cql_filterTextField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cql_filterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cql_filterTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sorguyuUygula_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cql_filterTextField)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(SRSNAMEComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(typeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 146, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(typeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SRSNAMEComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cql_filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sorguyuUygula_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );

        pack();
    }

    private void typeNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        TYPENAME= String.valueOf(typeNameComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, TYPENAME);
    }

    private void SRSNAMEComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        String SRSNAME= String.valueOf(SRSNAMEComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, SRSNAME);
    }

    private void sorguyuUygula_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DescribeFeatureType describeFeatureType = new DescribeFeatureType(serviceURL, SERVICE, VERSION, REQUEST, TYPENAME);
        finalURL = describeFeatureType.toString();
        URL myURL = null;
        try {
            myURL = new URL(finalURL);
        } catch (MalformedURLException ex) {
            Logger.getLogger(AccordingToDateGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, myURL);
    }

    private void cql_filterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        CQL_FILTER = cql_filterTextField.getSelectedText();
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescribeFeatureTypeGUI().setVisible(true);
            }
        });
    }
}
