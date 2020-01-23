
package Application;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author Albertino Augusto */

public class Settings
{
    public static Properties prop;
    
    public void setProperties(String title, String value)
    {
        try
        {
            prop.setProperty(title, value);
            prop.store(new FileOutputStream("Configs.log"), null);
        }
        catch(Exception e)
        {
            
        }     
    }
    
    
    public String loadProperties(String title)
    {
        String line = null;
        
        try
        {
            prop.load(new FileInputStream("Configs.log"));
            line = prop.getProperty(title);
        }
        catch(Exception e)
        {
            
        }
        
        return line;
    }
}
