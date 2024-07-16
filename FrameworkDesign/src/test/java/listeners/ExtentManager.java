package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
public static ExtentReports extent;
	
	
	public static ExtentReports getInstance()
	{
		
		if(extent==null)
		{
			extent=createInstance();
			return extent;
		}
		else 
		{
			return extent;
		}
		
	}
	

	public static ExtentReports createInstance()
	{
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Sauce1.html");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Digvijay Patil");
		sparkReporter.config().setDocumentTitle("Automation Test Report");
		sparkReporter.config().setReportName("Sprint UG_0.1.38");
		
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		return extent;
	}


}
