/*
	Author: Ahmet Cemal Sert
*/

package GUI;

import Functions.Authenticator;
import Functions.GetFeature;
import Functions.IGetFeatureXmlConverter;

public class GetFeatureGUI extends javax.swing.JFrame {

    private javax.swing.JButton SORGUYU_UYGULA_jButton;
    private javax.swing.JComboBox<String> SRSNAMEjComboBox;
    private javax.swing.JComboBox<String> typeNameComboBox;

    public GetFeatureGUI() {
        initComponents();
    }

    // class attributes
    private static final String serviceURL = "http://cbsservis.tkgm.gov.tr/tkgm.ows/wfs?";
    private static final String SERVICE= "SERVICE=WFS";
    private static final String VERSION = "Version=1.0.0";
    private static final String REQUEST = "REQUEST=GetFeature";
    private static String TYPENAME;
    private static String SRSNAME;

    private String finalURL;



    private void initComponents() {

        SORGUYU_UYGULA_jButton = new javax.swing.JButton();
        typeNameComboBox = new javax.swing.JComboBox<>();
        SRSNAMEjComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SORGUYU_UYGULA_jButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SORGUYU_UYGULA_jButton.setText("SORGUYU UYGULA");
        SORGUYU_UYGULA_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SORGUYU_UYGULA_jButtonActionPerformed(evt);
            }
        });

        typeNameComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        typeNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPENAME=TKGM:parseller", "TYPENAME=TKGM:yapılar", "TYPENAME=TKGM:eklentiler", "TYPENAME=TKGM:adalar", "TYPENAME=TKGM:muhdesatlar", "TYPENAME=TKGM:irtifakhakları", "TYPENAME=TKGM:tescilharicialanlar", "TYPENAME=TKGM:yerkontrolnoktaları" }));
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



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(230, Short.MAX_VALUE)
                                .addComponent(SORGUYU_UYGULA_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(SRSNAMEjComboBox, 0, 197, Short.MAX_VALUE)
                                                .addComponent(typeNameComboBox, 0, 197, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(typeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(SRSNAMEjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SORGUYU_UYGULA_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
        );

        pack();
    }

    private void typeNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        TYPENAME= String.valueOf(typeNameComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, TYPENAME);
    }

    private void SRSNAMEjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        SRSNAME= String.valueOf(SRSNAMEjComboBox.getSelectedItem());
        //JOptionPane.showMessageDialog(null, SRSNAME);
    }

    private void SORGUYU_UYGULA_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        GetFeature getFeature = new GetFeature(serviceURL, SERVICE, VERSION, REQUEST, TYPENAME, SRSNAME);
        finalURL = getFeature.toString();
        Authenticator.authenticateAndDownload(finalURL
                ,"cbsdemouser","q3b8f+r*", "C:\\Users\\ACS\\Desktop\\GetFeature.txt");
        IGetFeatureXmlConverter.getFeatureConverter("C:\\Users\\ACS\\Desktop\\GetFeature.txt");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetFeatureGUI().setVisible(true);
            }
        });
    }
}
