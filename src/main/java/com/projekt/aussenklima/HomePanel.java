/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.projekt.aussenklima;

/**
 *
 * @author michal
 */
public class HomePanel extends javax.swing.JFrame {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstCityButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        secondCityButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        thirdCityButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fourthCityButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        navigationPane = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        firstCityPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        secondCityPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        thirdCityPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        fourthCityPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Standorte");

        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home");

        javax.swing.GroupLayout homeButtonLayout = new javax.swing.GroupLayout(homeButton);
        homeButton.setLayout(homeButtonLayout);
        homeButtonLayout.setHorizontalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeButtonLayout.setVerticalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        firstCityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstCityButtonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Frankfurt");

        javax.swing.GroupLayout firstCityButtonLayout = new javax.swing.GroupLayout(firstCityButton);
        firstCityButton.setLayout(firstCityButtonLayout);
        firstCityButtonLayout.setHorizontalGroup(
            firstCityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstCityButtonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstCityButtonLayout.setVerticalGroup(
            firstCityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstCityButtonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        secondCityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondCityButtonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kelsterbach");

        javax.swing.GroupLayout secondCityButtonLayout = new javax.swing.GroupLayout(secondCityButton);
        secondCityButton.setLayout(secondCityButtonLayout);
        secondCityButtonLayout.setHorizontalGroup(
            secondCityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondCityButtonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        secondCityButtonLayout.setVerticalGroup(
            secondCityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondCityButtonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        thirdCityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirdCityButtonMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rodgau");

        javax.swing.GroupLayout thirdCityButtonLayout = new javax.swing.GroupLayout(thirdCityButton);
        thirdCityButton.setLayout(thirdCityButtonLayout);
        thirdCityButtonLayout.setHorizontalGroup(
            thirdCityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdCityButtonLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thirdCityButtonLayout.setVerticalGroup(
            thirdCityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdCityButtonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        fourthCityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourthCityButtonMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Wiesbaden");

        javax.swing.GroupLayout fourthCityButtonLayout = new javax.swing.GroupLayout(fourthCityButton);
        fourthCityButton.setLayout(fourthCityButtonLayout);
        fourthCityButtonLayout.setHorizontalGroup(
            fourthCityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fourthCityButtonLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fourthCityButtonLayout.setVerticalGroup(
            fourthCityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fourthCityButtonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstCityButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondCityButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(thirdCityButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fourthCityButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(firstCityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(secondCityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(thirdCityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fourthCityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        navigationPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        navigationPane.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N

        jLabel11.setText("Home");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel11)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel11)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        navigationPane.addTab("Home", homePanel);

        jLabel10.setText("Frankfurt");

        javax.swing.GroupLayout firstCityPanelLayout = new javax.swing.GroupLayout(firstCityPanel);
        firstCityPanel.setLayout(firstCityPanelLayout);
        firstCityPanelLayout.setHorizontalGroup(
            firstCityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstCityPanelLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel10)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        firstCityPanelLayout.setVerticalGroup(
            firstCityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstCityPanelLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel10)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        navigationPane.addTab("Frankfurt", firstCityPanel);

        jLabel9.setText("Kelsterbach");

        javax.swing.GroupLayout secondCityPanelLayout = new javax.swing.GroupLayout(secondCityPanel);
        secondCityPanel.setLayout(secondCityPanelLayout);
        secondCityPanelLayout.setHorizontalGroup(
            secondCityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondCityPanelLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel9)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        secondCityPanelLayout.setVerticalGroup(
            secondCityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondCityPanelLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel9)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        navigationPane.addTab("Kelsterbach", secondCityPanel);

        jLabel8.setText("Rodgau");

        javax.swing.GroupLayout thirdCityPanelLayout = new javax.swing.GroupLayout(thirdCityPanel);
        thirdCityPanel.setLayout(thirdCityPanelLayout);
        thirdCityPanelLayout.setHorizontalGroup(
            thirdCityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdCityPanelLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel8)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        thirdCityPanelLayout.setVerticalGroup(
            thirdCityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdCityPanelLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel8)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        navigationPane.addTab("Rodgau", thirdCityPanel);

        jLabel7.setText("Wiesbaden");

        javax.swing.GroupLayout fourthCityPanelLayout = new javax.swing.GroupLayout(fourthCityPanel);
        fourthCityPanel.setLayout(fourthCityPanelLayout);
        fourthCityPanelLayout.setHorizontalGroup(
            fourthCityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fourthCityPanelLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel7)
                .addContainerGap(412, Short.MAX_VALUE))
        );
        fourthCityPanelLayout.setVerticalGroup(
            fourthCityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fourthCityPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel7)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        navigationPane.addTab("Wiesbaden", fourthCityPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(navigationPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(navigationPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        navigationPane.setSelectedIndex(0);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void firstCityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstCityButtonMouseClicked
        navigationPane.setSelectedIndex(1);
    }//GEN-LAST:event_firstCityButtonMouseClicked

    private void secondCityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondCityButtonMouseClicked
        navigationPane.setSelectedIndex(2);
    }//GEN-LAST:event_secondCityButtonMouseClicked

    private void thirdCityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirdCityButtonMouseClicked
        navigationPane.setSelectedIndex(3);
    }//GEN-LAST:event_thirdCityButtonMouseClicked

    private void fourthCityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourthCityButtonMouseClicked
        navigationPane.setSelectedIndex(4);
    }//GEN-LAST:event_fourthCityButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel firstCityButton;
    private javax.swing.JPanel firstCityPanel;
    private javax.swing.JPanel fourthCityButton;
    private javax.swing.JPanel fourthCityPanel;
    private javax.swing.JPanel homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane navigationPane;
    private javax.swing.JPanel secondCityButton;
    private javax.swing.JPanel secondCityPanel;
    private javax.swing.JPanel thirdCityButton;
    private javax.swing.JPanel thirdCityPanel;
    // End of variables declaration//GEN-END:variables
}
