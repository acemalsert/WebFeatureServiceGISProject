/*
	Author: Ahmet Cemal Sert
*/

package GUI;

import Functions.AccordingToNeighbourhood;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccordingToNeighbourhoodGUI extends javax.swing.JFrame {

    private javax.swing.JComboBox<String> SRSNAME_ComboBox;
    private javax.swing.JTextField cql_filterTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> typeNameComboBox;


    public AccordingToNeighbourhoodGUI() {
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
        SRSNAME_ComboBox = new javax.swing.JComboBox<>();
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
        typeNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPENAME=TKGM:mahalleler", "TYPENAME=TKGM:yapılar", "TYPENAME=TKGM:eklentiler", "TYPENAME=TKGM:adalar", "TYPENAME=TKGM:muhdesatlar", "TYPENAME=TKGM:irtifakhakları", "TYPENAME=TKGM:tescilharicialanlar", "TYPENAME=TKGM:yerkontrolnoktaları" }));
        typeNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeNameComboBoxActionPerformed(evt);
            }
        });

        SRSNAME_ComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SRSNAME_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SRSNAME=EPSG:4326" }));
        SRSNAME_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRSNAME_ComboBoxActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cql_filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(SRSNAME_ComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(typeNameComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(219, 219, 219)
                                                .addComponent(jButton1)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addComponent(typeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(SRSNAME_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cql_filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void typeNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        TYPENAME= String.valueOf(typeNameComboBox.getSelectedItem());
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        AccordingToNeighbourhood gui = new AccordingToNeighbourhood(serviceURL, SERVICE, VERSION, REQUEST, TYPENAME, SRSNAME, CQL_FILTER);
        finalURL = gui.toString();
        URL myURL = null;
        try {
            myURL = new URL(finalURL);
        } catch (MalformedURLException ex) {
            Logger.getLogger(AccordingToDateGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, myURL);
    }

    private void SRSNAME_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        String SRSNAME= String.valueOf(SRSNAME_ComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, SRSNAME);
    }

    private void cql_filterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        CQL_FILTER = cql_filterTextField.getSelectedText();
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccordingToNeighbourhoodGUI().setVisible(true);
            }
        });
    }
}
