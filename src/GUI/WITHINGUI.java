/*
	Author: Ahmet Cemal Sert
*/

package GUI;

import Functions.WITHIN;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WITHINGUI extends javax.swing.JFrame {

    private javax.swing.JComboBox<String> SRSNAMEComboBox;
    private javax.swing.JTextField cql_filterTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> typeNameComboBox;


    public WITHINGUI() {
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



    private void initComponents() {

        typeNameComboBox = new javax.swing.JComboBox<>();
        SRSNAMEComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cql_filterTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        typeNameComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        typeNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPENAME=TKGM:mahalleler", "TYPENAME=TKGM:yapılar", "TYPENAME=TKGM:eklentiler", "TYPENAME=TKGM:adalar", "TYPENAME=TKGM:muhdesatlar", "TYPENAME=TKGM:irtifakhakları", "TYPENAME=TKGM:tescilharicialanlar", "TYPENAME=TKGM:yerkontrolnoktaları", " " }));
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

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("SORGUYU UYGULA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cql_filterTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(25, 25, 25))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(SRSNAMEComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(134, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(typeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(134, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(93, Short.MAX_VALUE)
                                .addComponent(SRSNAMEComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cql_filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(typeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(227, Short.MAX_VALUE)))
        );

        pack();
    }

    private void typeNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        TYPENAME= String.valueOf(typeNameComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, TYPENAME);
    }

    private void SRSNAMEComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        SRSNAME= String.valueOf(SRSNAMEComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, SRSNAME);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        WITHIN within = new WITHIN(serviceURL, SERVICE, VERSION, REQUEST, TYPENAME, SRSNAME, CQL_FILTER);
        finalURL = within.toString();
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
                new WITHINGUI().setVisible(true);
            }
        });
    }
}
