/*
	Author: Ahmet Cemal Sert
*/

package GUI;

import Functions.CONTAINS;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CONTAINSGUI extends javax.swing.JFrame {

    private javax.swing.JButton SORGUYU_UYGULA_jButton;
    private javax.swing.JComboBox<String> SRSNAME_jComboBox;
    private javax.swing.JComboBox<String> TYPENAME_jComboBox;
    private javax.swing.JTextField cql_filterTextField;

    public CONTAINSGUI() {
        initComponents();
    }

    //class attributes
    private static final String serviceURL = "http://cbsservis.tkgm.gov.tr/tkgm.ows/wfs?";
    private static final String SERVICE= "SERVICE=WFS";
    private static final String VERSION = "Version=1.0.0";
    private static final String REQUEST = "REQUEST=GetFeature";
    private static String TYPENAME;
    private static String SRSNAME;
    private static String CQL_FILTER;
    private String finalURL;


    private void initComponents() {

        SORGUYU_UYGULA_jButton = new javax.swing.JButton();
        TYPENAME_jComboBox = new javax.swing.JComboBox<>();
        SRSNAME_jComboBox = new javax.swing.JComboBox<>();
        cql_filterTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SORGUYU_UYGULA_jButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SORGUYU_UYGULA_jButton.setText("SORGUYU UYGULA");
        SORGUYU_UYGULA_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SORGUYU_UYGULA_jButtonActionPerformed(evt);
            }
        });

        TYPENAME_jComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TYPENAME_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPENAME=TKGM:mahalleler", "TYPENAME=TKGM:yapılar", "TYPENAME=TKGM:eklentiler", "TYPENAME=TKGM:adalar", "TYPENAME=TKGM:muhdesatlar", "TYPENAME=TKGM:irtifakhakları", "TYPENAME=TKGM:tescilharicialanlar", "TYPENAME=TKGM:yerkontrolnoktaları" }));
        TYPENAME_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TYPENAME_jComboBoxActionPerformed(evt);
            }
        });

        SRSNAME_jComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SRSNAME_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SRSNAME=EPSG:4326" }));
        SRSNAME_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRSNAME_jComboBoxActionPerformed(evt);
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SORGUYU_UYGULA_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cql_filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(SRSNAME_jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TYPENAME_jComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(TYPENAME_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SRSNAME_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cql_filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SORGUYU_UYGULA_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );

        pack();
    }

    private void TYPENAME_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        TYPENAME= String.valueOf(TYPENAME_jComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, TYPENAME);
    }

    private void SORGUYU_UYGULA_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CONTAINS contains = new CONTAINS(serviceURL, SERVICE, VERSION, REQUEST, TYPENAME, SRSNAME, CQL_FILTER);
        finalURL = contains.toString();
        URL myURL = null;
        try {
            myURL = new URL(finalURL);
        } catch (MalformedURLException ex) {
            Logger.getLogger(AccordingToDateGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, myURL);
    }

    private void SRSNAME_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        String SRSNAME= String.valueOf(SRSNAME_jComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, SRSNAME);
    }

    private void cql_filterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        CQL_FILTER = cql_filterTextField.getSelectedText();
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONTAINSGUI().setVisible(true);
            }
        });
    }
}
