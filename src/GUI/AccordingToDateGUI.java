/*
	Author: Ahmet Cemal Sert
*/

package GUI;

import Functions.AccordingToDate;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccordingToDateGUI extends javax.swing.JFrame {

    private javax.swing.JComboBox<String> SRSNAMEjComboBox;
    private javax.swing.JTextField cql_filterTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> typeNameComboBox;


    public AccordingToDateGUI() {
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

        jButton1 = new javax.swing.JButton();
        typeNameComboBox = new javax.swing.JComboBox<>();
        SRSNAMEjComboBox = new javax.swing.JComboBox<>();
        cql_filterTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("SORGUYU UYGULA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        typeNameComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        typeNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPENAME=TKGM:mahalleler", "TYPENAME=TKGM:yapılar", "TYPENAME=TKGM:eklentiler", "TYPENAME=TKGM:adalar", "TYPENAME=TKGM:muhdesatlar", "TYPENAME=TKGM:irtifakhakları", "TYPENAME=TKGM:tescilharicialanlar", "TYPENAME=TKGM:yerkontrolnoktaları", " ", " " }));
        typeNameComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeNameComboBoxMouseClicked(evt);
            }
        });
        typeNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeNameComboBoxActionPerformed(evt);
            }
        });

        SRSNAMEjComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SRSNAMEjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SRSNAME=EPSG:4326" }));
        SRSNAMEjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRSNAMEjComboBoxActionPerformed(evt);
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
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cql_filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(SRSNAMEjComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(typeNameComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(39, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(typeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SRSNAMEjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cql_filterTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );

        pack();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        // AccordingToDate atd = new AccordingToDate(webFeatureServiceURL, SERVICE, VERSION, REQUEST, TYPENAME, SRSNAME, CQL_FILTER);
    }

    private void typeNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        TYPENAME= String.valueOf(typeNameComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, TYPENAME);

    }

    private void typeNameComboBoxMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void SRSNAMEjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        String SRSNAME= String.valueOf(SRSNAMEjComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, SRSNAME);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        AccordingToDate atd = new AccordingToDate(serviceURL, SERVICE, VERSION, REQUEST, TYPENAME, SRSNAME, CQL_FILTER);
        finalURL = atd.toString();
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
                new AccordingToDateGUI().setVisible(true);
            }
        });
    }
}
