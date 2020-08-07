/*
	Author: Ahmet Cemal Sert
*/

package GUI;

import javax.swing.*;


public class MainMenuGUI extends javax.swing.JFrame {

    private javax.swing.JButton AccordingToDate_jButton;
    private javax.swing.JButton AccordingToNeighbourhood_jButton;
    private javax.swing.JMenuItem Bilgilendirme_jMenuItem;
    private javax.swing.JButton DesribeFeatureType_jButton;
    private javax.swing.JButton GetCapabilities_JButton;
    private javax.swing.JButton GetFeature_Contains_jButton;
    private javax.swing.JButton GetFeature_Within_jButton1;
    private javax.swing.JButton GetFeature_jButton;
    private javax.swing.JLabel TKGM_label_png;
    private javax.swing.JTextField header_jTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem yardım_jMenuItem;
    private javax.swing.JMenuItem çıkış_jMenuItem;


    public MainMenuGUI() {
        initComponents();
    }



    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        GetFeature_jButton = new javax.swing.JButton();
        AccordingToNeighbourhood_jButton = new javax.swing.JButton();
        DesribeFeatureType_jButton = new javax.swing.JButton();
        GetCapabilities_JButton = new javax.swing.JButton();
        GetFeature_Contains_jButton = new javax.swing.JButton();
        AccordingToDate_jButton = new javax.swing.JButton();
        header_jTextField = new javax.swing.JTextField();
        GetFeature_Within_jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TKGM_label_png = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        Bilgilendirme_jMenuItem = new javax.swing.JMenuItem();
        yardım_jMenuItem = new javax.swing.JMenuItem();
        çıkış_jMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        GetFeature_jButton.setBackground(new java.awt.Color(255, 145, 0));
        GetFeature_jButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        GetFeature_jButton.setForeground(new java.awt.Color(51, 51, 255));
        GetFeature_jButton.setText("GetFeature");

        GetFeature_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetFeature_jButtonActionPerformed(evt);
            }
        });

        AccordingToNeighbourhood_jButton.setBackground(new java.awt.Color(255, 145, 0));
        AccordingToNeighbourhood_jButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AccordingToNeighbourhood_jButton.setForeground(new java.awt.Color(51, 51, 255));
        AccordingToNeighbourhood_jButton.setText("AccordingToNeighbourhood");

        AccordingToNeighbourhood_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccordingToNeighbourhood_jButtonActionPerformed(evt);
            }
        });

        DesribeFeatureType_jButton.setBackground(new java.awt.Color(255, 145, 0));
        DesribeFeatureType_jButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DesribeFeatureType_jButton.setForeground(new java.awt.Color(51, 51, 255));
        DesribeFeatureType_jButton.setText("DescribeFeatureType");

        DesribeFeatureType_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesribeFeatureType_jButtonActionPerformed(evt);
            }
        });

        GetCapabilities_JButton.setBackground(new java.awt.Color(255, 145, 0));
        GetCapabilities_JButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        GetCapabilities_JButton.setForeground(new java.awt.Color(51, 51, 255));
        GetCapabilities_JButton.setText("GetCapabilities");

        GetCapabilities_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetCapabilities_JButtonActionPerformed(evt);
            }
        });

        GetFeature_Contains_jButton.setBackground(new java.awt.Color(255, 145, 0));
        GetFeature_Contains_jButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        GetFeature_Contains_jButton.setForeground(new java.awt.Color(51, 51, 255));
        GetFeature_Contains_jButton.setText("GetFeature-Contains");

        GetFeature_Contains_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetFeature_Contains_jButtonActionPerformed(evt);
            }
        });

        AccordingToDate_jButton.setBackground(new java.awt.Color(255, 145, 0));
        AccordingToDate_jButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AccordingToDate_jButton.setForeground(new java.awt.Color(51, 51, 255));
        AccordingToDate_jButton.setText("AccordingToDate");

        AccordingToDate_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccordingToDate_jButtonActionPerformed(evt);
            }
        });

        header_jTextField.setEditable(false);
        header_jTextField.setBackground(new java.awt.Color(255, 145, 0));
        header_jTextField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        header_jTextField.setForeground(new java.awt.Color(51, 51, 255));
        header_jTextField.setText("TKGM Web Feature Servis Sorgu Aracına Hoşgeldiniz");


        GetFeature_Within_jButton1.setBackground(new java.awt.Color(255, 145, 0));
        GetFeature_Within_jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        GetFeature_Within_jButton1.setForeground(new java.awt.Color(51, 51, 255));
        GetFeature_Within_jButton1.setText("GetFeature-Within");

        GetFeature_Within_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetFeature_Within_jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(GetFeature_jButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(AccordingToNeighbourhood_jButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DesribeFeatureType_jButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(GetCapabilities_JButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(GetFeature_Contains_jButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(AccordingToDate_jButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(header_jTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(GetFeature_Within_jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(DesribeFeatureType_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GetFeature_Within_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AccordingToNeighbourhood_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GetFeature_Contains_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AccordingToDate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(header_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GetFeature_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(GetCapabilities_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(213, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(header_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(GetFeature_Contains_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(DesribeFeatureType_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AccordingToDate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AccordingToNeighbourhood_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GetFeature_Within_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(GetFeature_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(GetCapabilities_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(175, Short.MAX_VALUE)))
        );

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));


        TKGM_label_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/indir.png"))); // NOI18N

        jMenu.setText("Ayarlar");


        Bilgilendirme_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Bilgilendirme_jMenuItem.setText("Bilgilendirme");
        Bilgilendirme_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilgilendirme_jMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(Bilgilendirme_jMenuItem);

        yardım_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        yardım_jMenuItem.setText("Yardım");
        yardım_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yardım_jMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(yardım_jMenuItem);

        çıkış_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        çıkış_jMenuItem.setText("Çıkış");
        çıkış_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çıkış_jMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(çıkış_jMenuItem);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(TKGM_label_png, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLayeredPane1))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(407, 407, 407)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TKGM_label_png, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }


    //Button actions
    private void AccordingToNeighbourhood_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AccordingToNeighbourhoodGUI gui =  new AccordingToNeighbourhoodGUI();
        gui.setVisible(true);
    }

    private void AccordingToDate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AccordingToDateGUI atg = new AccordingToDateGUI();
        atg.setVisible(true);
    }

    private void GetCapabilities_JButtonActionPerformed(java.awt.event.ActionEvent evt) {
        GetCapabilitiesGUI gui =  new GetCapabilitiesGUI();
        gui.setVisible(true);
    }

    private void GetFeature_Within_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        WITHINGUI gui = new WITHINGUI();
        gui.setVisible(true);
    }

    private void GetFeature_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        GetFeatureGUI gui = new GetFeatureGUI();
        gui.setVisible(true);
    }

    private void GetFeature_Contains_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CONTAINSGUI gui = new CONTAINSGUI();
        gui.setVisible(true);
    }

    private void DesribeFeatureType_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DescribeFeatureTypeGUI gui = new DescribeFeatureTypeGUI();
        gui.setVisible(true);
    }



    private void Bilgilendirme_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Uygulamamızda Web Feature Service 1.0.0 versiyonu ve Tapu ve Kadastro Genel Müdürlüğünün demo servisi kullanılmaktadır.");
    }

    private void yardım_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // JOptionPane.showMessageDialog(null, ); GEOSERVER WEB SİTESİNE YONLENDIR
    }

    private void çıkış_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        int yesorno = JOptionPane.showConfirmDialog(null, "Do you really want to quit?");
        if(yesorno==0) System.exit(0);
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuGUI().setVisible(true);
            }
        });
    }
}

