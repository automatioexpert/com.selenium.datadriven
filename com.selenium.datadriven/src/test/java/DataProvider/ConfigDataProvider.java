package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{

	Properties pro;
	
	public ConfigDataProvider(String path)
	{
		
		try
		{
		FileInputStream fis=new FileInputStream(new File(path));
		pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Unable to load file "+e.getMessage());
		}
	}
	
	
	public String getIEDriverPath()
	{
		
		return pro.getProperty("IEDriverPath");
	}
	
	
	public String getChromeDriverPath()
	{
	
		return pro.getProperty("ChromeDriverPath");
	}
	
}
