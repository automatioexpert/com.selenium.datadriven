package Lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
    	
	public static String captureScreenshot(WebDriver ldriver,String screenshot_name)
	{
		
		
       TakesScreenshot screenshot=(TakesScreenshot)ldriver;
		
		// it will store screenshot in memory
	    File src=screenshot.getScreenshotAs(OutputType.FILE);
		
		String path="C:\\LatestSeleniumDrivers\\"+screenshot_name+".png";
	    
	    try 
	    {
			FileUtils.copyFile(src, new File(path));
		} 
	    catch (IOException e) 
	    {
		
	    	System.out.println("Unable to capture screeshot "+e.getMessage());
		}
	    
	    return path;
		
	}
	
	
	public void highlightElements()
	{
		
	}
	
	
}
