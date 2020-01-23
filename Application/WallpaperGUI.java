
package Application;

import javax.swing.ImageIcon;

/**
 *
 * @author Albertino Augusto */

public class WallpaperGUI extends javax.swing.JFrame 
{

    public WallpaperGUI() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        walpaper1 = new javax.swing.JLabel();
        walpaper2 = new javax.swing.JLabel();
        walpaper3 = new javax.swing.JLabel();
        walpaper4 = new javax.swing.JLabel();
        walpaper5 = new javax.swing.JLabel();
        walpaper6 = new javax.swing.JLabel();
        walpaper7 = new javax.swing.JLabel();
        walpaper8 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wallpapers Page");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1338, 12, 16, 16));

        walpaper1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walpaper1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walpaper1MouseReleased(evt);
            }
        });
        getContentPane().add(walpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 236, 192, 145));

        walpaper2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walpaper2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walpaper2MouseReleased(evt);
            }
        });
        getContentPane().add(walpaper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 236, 196, 145));

        walpaper3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walpaper3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walpaper3MouseReleased(evt);
            }
        });
        getContentPane().add(walpaper3, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 236, 192, 145));

        walpaper4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walpaper4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walpaper4MouseReleased(evt);
            }
        });
        getContentPane().add(walpaper4, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 236, 194, 145));

        walpaper5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walpaper5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walpaper5MouseReleased(evt);
            }
        });
        getContentPane().add(walpaper5, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 400, 192, 145));

        walpaper6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walpaper6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walpaper6MouseReleased(evt);
            }
        });
        getContentPane().add(walpaper6, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 400, 196, 145));

        walpaper7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walpaper7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walpaper7MouseReleased(evt);
            }
        });
        getContentPane().add(walpaper7, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 400, 192, 145));

        walpaper8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walpaper8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walpaper8MouseReleased(evt);
            }
        });
        getContentPane().add(walpaper8, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 400, 194, 145));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wall_ground.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Background1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered

        ImageIcon II = new ImageIcon(getClass().getResource("/Images/close_blue.png"));
        close.setIcon(II);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited

        ImageIcon II = new ImageIcon(getClass().getResource("/Images/close.png"));
        close.setIcon(II);
    }//GEN-LAST:event_closeMouseExited

    private void walpaper1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walpaper1MouseReleased

    }//GEN-LAST:event_walpaper1MouseReleased

    private void walpaper2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walpaper2MouseReleased


    }//GEN-LAST:event_walpaper2MouseReleased

    private void walpaper3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walpaper3MouseReleased

    }//GEN-LAST:event_walpaper3MouseReleased

    private void walpaper4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walpaper4MouseReleased

    }//GEN-LAST:event_walpaper4MouseReleased

    private void walpaper5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walpaper5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_walpaper5MouseReleased

    private void walpaper6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walpaper6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_walpaper6MouseReleased

    private void walpaper7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walpaper7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_walpaper7MouseReleased

    private void walpaper8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walpaper8MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_walpaper8MouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel walpaper1;
    private javax.swing.JLabel walpaper2;
    private javax.swing.JLabel walpaper3;
    private javax.swing.JLabel walpaper4;
    private javax.swing.JLabel walpaper5;
    private javax.swing.JLabel walpaper6;
    private javax.swing.JLabel walpaper7;
    private javax.swing.JLabel walpaper8;
    // End of variables declaration//GEN-END:variables
}
