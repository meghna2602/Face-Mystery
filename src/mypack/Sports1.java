/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author shweta
 */
public class Sports1 extends javax.swing.JFrame {
    int s=0;
    public static int score1;

    /**
     * Creates new form Sports1
     */
    public Sports1() {
        initComponents();
        jLabel5.setVisible(true);
        jLabel4.setVisible(false);
        jLabel16.setVisible(false);
        jLabel12.setVisible(false);
        jLabel21.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        jLabel15.setVisible(false);
        jLabel10.setVisible(false);
        jLabel17.setVisible(false);
        timer t= new timer();
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("AR BERKLEY", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Guess the Player");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 460, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Cristiano Ronaldo-1.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1000, 500));
        jLabel3.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 350, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Cristiano Ronaldo-2.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1000, 500));
        jLabel4.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 350, 66));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Cristiano Ronaldo-3.jpg"))); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(1000, 500));
        jLabel12.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 346, 350, 48));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Cristiano Ronaldo-4.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(1000, 500));
        jLabel5.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 394, 350, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Cristiano Ronaldo-5.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 445, 350, 105));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/11.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1000, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 350, 400));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/bck1.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.setPreferredSize(new java.awt.Dimension(390, 440));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("DeVinne Txt BT", 1, 10)); // NOI18N
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 240, 30));

        jLabel9.setFont(new java.awt.Font("DeVinne Txt BT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("Answer");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 60, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, 60));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel10.setText("lfttym");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 100, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/finalexit.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/buttons22.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Curved_Arrow.svg.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 50, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/buttons21.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("His autobiography,");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("titled Moments,");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("was published in");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("December 2007.");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/hint-1.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/bckgd.JPG"))); // NOI18N
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(750, 520));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = jTextField1.getText();
        if(a.equalsIgnoreCase("Cristiano Ronaldo"))
        {
            jLabel1.setVisible(true);
            jLabel16.setVisible(true);
            jLabel3.setVisible(true);
            jLabel12.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel8.setVisible(false);
            jLabel10.setVisible(true);
            jLabel10.setText(" "+"00:"+Integer.toString(s));
            if(s>=45)
            {
                score1=20;
            }
            else if(s<45 && s>=30)
            {
                score1=10;
            }
            else
            {
                score1=5;
            }
        }
        else{
            jLabel8.setVisible(false);
            jLabel10.setVisible(true);
            jLabel10.setText("Sorry!");
            jLabel3.setVisible(true);
            jLabel16.setVisible(true);
            jLabel4.setVisible(true);
            jLabel1.setVisible(true);
            jLabel5.setVisible(true);
            jLabel12.setVisible(true);
            jTextField1.setText("Cristiano Ronaldo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jLabel17.setVisible(true);
        jLabel15.setVisible(true);
        jLabel21.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel14.setVisible(true);
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Sports2 i = new Sports2();
        i.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        InputStream music;
    
    try{
    music =  new FileInputStream(new File("C:\\Users\\shweta\\Documents\\NetBeansProjects\\Face\\src\\music\\clock-ticking-2.wav"));
    AudioStream audios = new AudioStream(music);
    AudioPlayer.player.start(audios);
    
}
    catch(Exception e)
    {
        System.out.println(e);
    }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Sports1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sports1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sports1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sports1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sports1().setVisible(true);
            }
        });
    }
     public class timer extends Thread{
    public void run(){
        try{
            
            for (s=60;s>=0;s--){
              
                jLabel8.setText("00:"+Integer.toString(s));
                  Thread.sleep(1000);
                 if(s>48){
                     jLabel5.setVisible(true);
                 }
                 if(s>36 && s<=48){
                     jLabel4.setVisible(true);
                 }
                 if(s>24 && s<=36){
                     jLabel3.setVisible(true);
                 }
                 if(s>12 && s<=24){
                     jLabel1.setVisible(true);
                 }
                 if(s<12)
                 {
                     jLabel12.setVisible(true);
                 }
            }
        }
        catch(Exception e){
            
        }
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
