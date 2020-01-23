
package Application;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Albertino Augusto */

public class PlayerClass 
{
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public long pauseLocation;
    public long songTotalLengh;
    
    public Player player;
    public String fileLocation;
    
    public void play(String path)
    {
        try
        {
            
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            
            songTotalLengh = FIS.available();
            
            fileLocation = path + "";
            
            new Thread()
            {
                @Override
                public void run()
                {
                    try 
                    {
                        player.play();
                        
                        if(player.isComplete() && GUIMain.countLoop == 1)
                        {
                            play(fileLocation);
                        }
                        
                        if(player.isComplete())
                        {
                            GUIMain.infos.setText("");
                        }
                    }
                    catch (JavaLayerException ex) 
                    {
                       
                    }
                }
            }.start();      
        } 
        catch (FileNotFoundException | JavaLayerException ex) 
        {
            
        } 
        catch (IOException ex) 
        {
            
        }
        
    }
    
    public void pause()
    {
        try
        {
            pauseLocation = FIS.available();
            player.close();
        }
        catch(Exception e)
        {
            
        }
    }
    
    public void resume()
    {
        try
        {
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            
            FIS.skip(songTotalLengh - pauseLocation);
            
            new Thread()
            {
                @Override
                public void run()
                {
                    try 
                    {
                        player.play();
                    }
                    catch (JavaLayerException ex) 
                    {
                       
                    }
                }
            }.start();    
        } 
        catch (FileNotFoundException | JavaLayerException ex) 
        {
            
        }
        catch (IOException ex)
        {
            
        }
        
    }
    
    public void stop()
    {
        try
        {
            if(player != null)
            {
                player.close();
                pauseLocation = 0;
                songTotalLengh = 0;
                
                GUIMain.infos.setText("");
                
            }
        }
        catch(Exception e)
        {
            
        }
    }
    
    
}
