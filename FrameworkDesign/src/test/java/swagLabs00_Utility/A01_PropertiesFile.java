package swagLabs00_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A01_PropertiesFile 
{
	
	public Properties p1;
	
	public A01_PropertiesFile(String filename)
	{
		File f1 = new File(System.getProperty("user.dir")+"//"+filename+".properties");
		
		p1 = new Properties();
		
		FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	
	public String getData(String key)
	{
		return p1.getProperty(key);
	}
}
