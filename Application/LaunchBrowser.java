
package Application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

/**
 *
 * @author Albertino Augusto */

public class LaunchBrowser 
{
    public void launchFacebook()
    {
        try
        {
            Desktop.getDesktop().browse(URI.create("www.facebook.com"));
        }
        catch(IOException e)
        {
            
        }         
    }
    
    public void launchTwitter()
    {
        try
        {
            Desktop.getDesktop().browse(URI.create("www.twitter.com"));
        }
        catch(IOException e)
        {
            
        }         
    }
    
    public void launchSkype()
    {
        try
        {
            Desktop.getDesktop().browse(URI.create("www.skype.com"));
        }
        catch(IOException e)
        {
            
        }         
    }
    
    public void launchGoogle_plus()
    {
        try
        {
            Desktop.getDesktop().browse(URI.create("www.googleplus.com"));
        }
        catch(IOException e)
        {
            
        }         
    }
    
    public void launchInstagram()
    {
        try
        {
            Desktop.getDesktop().browse(URI.create("www.instagram.com"));
        }
        catch(IOException e)
        {
            
        }         
    }
}
