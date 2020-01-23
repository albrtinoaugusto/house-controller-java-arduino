
package Application;

import AppPackage.AnimationClass;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Albertino Augusto */

public class GUIMain extends javax.swing.JFrame 
{
    
    PlayerClass PC = new PlayerClass();
    
    private boolean showHide;
    public static int countLoop;
    private boolean playing = false;
    
    
    public GUIMain() 
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("")).getImage());
        
        
        next.setVisible(false);
        previous.setVisible(false);
        play_pause.setVisible(false);
        
        skype.setVisible(false);
        email.setVisible(false);
        twitter.setVisible(false);
        facebook.setVisible(false);
        instagram.setVisible(false);
        google_plus.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infos = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        notification = new javax.swing.JLabel();
        dragger = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        facebook = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        skype = new javax.swing.JLabel();
        google_plus = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        keyboard = new javax.swing.JLabel();
        music = new javax.swing.JLabel();
        wallpapers = new javax.swing.JLabel();
        appliances = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        play_pause = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        microphone = new javax.swing.JLabel();
        lateralBar = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Project");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        infos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        infos.setForeground(new java.awt.Color(255, 255, 255));
        infos.setText("Informação:");
        getContentPane().add(infos);
        infos.setBounds(140, 10, 980, 20);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        getContentPane().add(minimize);
        minimize.setBounds(1301, 14, 16, 14);

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
        getContentPane().add(close);
        close.setBounds(1338, 12, 16, 16);

        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(about);
        about.setBounds(1130, 12, 130, 17);

        notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notification.png"))); // NOI18N
        getContentPane().add(notification);
        notification.setBounds(6, 3, 34, 33);
        getContentPane().add(dragger);
        dragger.setBounds(0, 0, 1366, 40);

        searchField.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        searchField.setForeground(new java.awt.Color(255, 255, 255));
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchField.setText("Search");
        searchField.setBorder(null);
        searchField.setOpaque(false);
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(searchField);
        searchField.setBounds(1070, 79, 270, 30);

        facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebook.setEnabled(false);
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookMouseClicked(evt);
            }
        });
        getContentPane().add(facebook);
        facebook.setBounds(20, 266, 36, 40);

        twitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter.setEnabled(false);
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });
        getContentPane().add(twitter);
        twitter.setBounds(20, 328, 36, 40);

        email.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        email.setEnabled(false);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(22, 471, 36, 40);

        skype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        skype.setEnabled(false);
        skype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skypeMouseClicked(evt);
            }
        });
        getContentPane().add(skype);
        skype.setBounds(20, 520, 38, 40);

        google_plus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        google_plus.setEnabled(false);
        google_plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                google_plusMouseClicked(evt);
            }
        });
        getContentPane().add(google_plus);
        google_plus.setBounds(22, 570, 38, 40);

        instagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagram.setEnabled(false);
        instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagramMouseClicked(evt);
            }
        });
        getContentPane().add(instagram);
        instagram.setBounds(21, 622, 38, 40);

        keyboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keyboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keyboardMouseClicked(evt);
            }
        });
        getContentPane().add(keyboard);
        keyboard.setBounds(30, 740, 66, 26);

        music.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        music.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                musicMouseReleased(evt);
            }
        });
        getContentPane().add(music);
        music.setBounds(298, 236, 192, 145);

        wallpapers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wallpapers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                wallpapersMouseReleased(evt);
            }
        });
        getContentPane().add(wallpapers);
        wallpapers.setBounds(508, 236, 196, 145);

        appliances.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appliances.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                appliancesMouseReleased(evt);
            }
        });
        getContentPane().add(appliances);
        appliances.setBounds(722, 236, 192, 145);

        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                settingsMouseReleased(evt);
            }
        });
        getContentPane().add(settings);
        settings.setBounds(936, 236, 194, 145);

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous.png"))); // NOI18N
        previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous.setEnabled(false);
        getContentPane().add(previous);
        previous.setBounds(1157, 740, 37, 24);

        play_pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pause.png"))); // NOI18N
        play_pause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play_pause.setEnabled(false);
        play_pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_pauseMouseClicked(evt);
            }
        });
        getContentPane().add(play_pause);
        play_pause.setBounds(1212, 740, 24, 24);

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next.png"))); // NOI18N
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.setEnabled(false);
        getContentPane().add(next);
        next.setBounds(1254, 740, 36, 24);

        microphone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(microphone);
        microphone.setBounds(1316, 676, 29, 50);

        lateralBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lateral_bar.png"))); // NOI18N
        lateralBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lateralBarMouseEntered(evt);
            }
        });
        getContentPane().add(lateralBar);
        lateralBar.setBounds(-80, 0, 100, 770);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ground.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1366, 768);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Background1.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1366, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        
        this.setState(GUIMain.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void musicMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicMouseReleased
                
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3", "mpeg3");
        
        JFileChooser chooser = new JFileChooser("");
        chooser.addChoosableFileFilter(filter);
        
        
        int returnVal = chooser.showOpenDialog(new GUIMain());
        
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            PC.stop();
            
            next.setVisible(false);
            next.setEnabled(false);
            previous.setVisible(false);
            previous.setEnabled(false);
            play_pause.setVisible(false);
            play_pause.setEnabled(false);
        
            File myFile = chooser.getSelectedFile();
            String song = myFile + "";
            
            String name = chooser.getSelectedFile().getName();
            infos.setText("Playing: " + name);
            
            PC.play(song);
            
            next.setVisible(true);
            next.setEnabled(true);
            previous.setVisible(true);
            previous.setEnabled(true);
            play_pause.setVisible(true);
            play_pause.setEnabled(true);
            
            playing = true;
        }
    }//GEN-LAST:event_musicMouseReleased

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
        
        LaunchBrowser LB = new LaunchBrowser();
        LB.launchFacebook();
    }//GEN-LAST:event_facebookMouseClicked

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        
        LaunchBrowser LB = new LaunchBrowser();
        LB.launchTwitter();
    }//GEN-LAST:event_twitterMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        
        
    }//GEN-LAST:event_emailMouseClicked

    private void skypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skypeMouseClicked
        
        LaunchBrowser LB = new LaunchBrowser();
        LB.launchSkype();
    }//GEN-LAST:event_skypeMouseClicked

    private void google_plusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_google_plusMouseClicked
        
        LaunchBrowser LB = new LaunchBrowser();
        LB.launchGoogle_plus();
    }//GEN-LAST:event_google_plusMouseClicked

    private void instagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseClicked
        
        LaunchBrowser LB = new LaunchBrowser();
        LB.launchInstagram();
    }//GEN-LAST:event_instagramMouseClicked

    private void keyboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyboardMouseClicked
        
        try 
        {
            Process p;
            String sysroot = System.getenv("SystemRoot");
            p = Runtime.getRuntime().exec("cmd /c " + sysroot + "/system32/osk.exe");
        }
        catch(IOException ex) 
        {
            
        }
    }//GEN-LAST:event_keyboardMouseClicked

    private void lateralBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lateralBarMouseEntered
        
        AnimationClass AC = new AnimationClass();
        
        if(showHide == false)
        {
            AC.jLabelXRight(-80, 0, 2, 2, lateralBar);
            
            skype.setVisible(true);
            skype.setEnabled(true);
            email.setVisible(true);
            email.setEnabled(true);
            twitter.setVisible(true);
            twitter.setEnabled(true);
            facebook.setVisible(true);
            facebook.setEnabled(true);
            instagram.setVisible(true);
            instagram.setEnabled(true);
            google_plus.setVisible(true);
            google_plus.setEnabled(true);
            
            showHide = true;
            
            new Thread()
            {
                int timeWait = 0;
                
                public void run()
                {
                    try
                    {
                        while(timeWait == 0)
                        {                            
                            Thread.sleep(10000);
                            
                            AC.jLabelXLeft(0, -80, 2, 2, lateralBar);
                            
                            skype.setVisible(false);
                            skype.setEnabled(false);
                            email.setVisible(false);
                            email.setEnabled(false);
                            twitter.setVisible(false);
                            twitter.setEnabled(false);
                            facebook.setVisible(false);
                            facebook.setEnabled(false);
                            instagram.setVisible(false);
                            instagram.setEnabled(false);
                            google_plus.setVisible(false);
                            google_plus.setEnabled(false);
                            
                            timeWait = 1;
                            showHide = false;
                        }
                    }
                    catch(Exception e)
                    {
                        
                    }
                }
            }.start();
        } 
    }//GEN-LAST:event_lateralBarMouseEntered

    private void play_pauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_pauseMouseClicked
        
        if(playing == true)
        {
            PC.pause();
                
            ImageIcon II = new ImageIcon(getClass().getResource("/Images/play.png"));
            play_pause.setIcon(II);
            
            playing = false;
        }
        else
        {
            PC.resume();
                
            ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/pause.png"));
            play_pause.setIcon(II2);
            
            playing = true;
        }
    }//GEN-LAST:event_play_pauseMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/close_blue.png"));
        close.setIcon(II);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/close.png"));
        close.setIcon(II);
    }//GEN-LAST:event_closeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/minimize_blue.png"));
        minimize.setIcon(II);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/minimize.png"));
        minimize.setIcon(II);
    }//GEN-LAST:event_minimizeMouseExited

    private void appliancesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appliancesMouseReleased
        
        AppliancesGUI AG = new AppliancesGUI();
        AG.setVisible(true);
    }//GEN-LAST:event_appliancesMouseReleased

    private void settingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseReleased
        
        SettingsGUI SG = new SettingsGUI();
        SG.setVisible(true);
    }//GEN-LAST:event_settingsMouseReleased

    private void wallpapersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wallpapersMouseReleased
       
        WallpaperGUI WG = new WallpaperGUI();
        WG.setVisible(true);
    }//GEN-LAST:event_wallpapersMouseReleased

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            
        }
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        
        String text = searchField.getText();
        
        if(text.equals(""))
        {
            searchField.setText("Search");
        }    
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        
        searchField.setText("");
    }//GEN-LAST:event_searchFieldMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel BG;
    private javax.swing.JLabel about;
    private javax.swing.JLabel appliances;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dragger;
    private javax.swing.JLabel email;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel google_plus;
    public static javax.swing.JLabel infos;
    private javax.swing.JLabel instagram;
    private javax.swing.JLabel keyboard;
    private javax.swing.JLabel lateralBar;
    private javax.swing.JLabel microphone;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel music;
    private javax.swing.JLabel next;
    private javax.swing.JLabel notification;
    private javax.swing.JLabel play_pause;
    private javax.swing.JLabel previous;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel skype;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel wallpapers;
    // End of variables declaration//GEN-END:variables
}
