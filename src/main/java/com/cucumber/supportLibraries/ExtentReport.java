package com.cucumber.supportLibraries;




import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.Colors;


import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

public class ExtentReport {

	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./target/Extentreport/myRentokil_AutomationReport.html");
	 com.aventstack.extentreports.ExtentReports extent=new com.aventstack.extentreports.ExtentReports();
	 	 private WebDriver driver=null;
	 public  void testSuiteStart() throws Exception { 
			try {
				String username = "Automation Tester";
				 String environment = "myrentokil.com";
				 String loginID="likhith.kumar.mallam.1@rentokil-initial.com";
				String data ="This test suite is run locally and hence page load time may vary based on location, network etc.";
				
				String Application="myRentokil";
				extent.attachReporter(reporter);
				
				String Scenario="Validate the page load time for React myRentokil pages ";
				
				extent.createTest(Scenario);
			extent.setSystemInfo("Host Name :",InetAddress.getLocalHost().getHostName());
		
			extent.setSystemInfo("Application:", Application);
			
			extent.setSystemInfo("Environment:", environment);
			
			extent.setSystemInfo("UserID:", loginID); 
			
			extent.setSystemInfo("User role:", "Admin"); 
			extent.setSystemInfo("Note:",data );
			
		
			
			
			extent.flush();
			}
			catch(Exception e) {
			e.printStackTrace();
	}
	}
			
			
		
		  public void testCasePass(String testdescription,String info,String pass, String pageLoadTime) {
		  try {
			
		  extent.attachReporter(reporter); 
		  com.aventstack.extentreports.ExtentTest logger = extent.createTest(testdescription); 
		  logger.log(Status.INFO,info);
		  logger.log(Status.PASS,pass);
		  logger.log(Status.INFO,MarkupHelper.createLabel(pageLoadTime, ExtentColor.GREEN));
		  
		  extent.flush();
		  
		  }catch(Exception e) { 
			  e.printStackTrace(); 
			  }
		  
		  
		  }
		
		public void testCaseFailTime(String testdescription,String info,String pass, String pageLoadTime) {
			  try {
				 
		  
		  com.aventstack.extentreports.ExtentTest logger = extent.createTest(testdescription); 
		  logger.log(Status.INFO,info);
		  logger.log(Status.FAIL,pass);
		  logger.log(Status.INFO,MarkupHelper.createLabel(pageLoadTime, ExtentColor.YELLOW));
		  
		  
		  extent.flush(); 
		  }
			  catch(Exception e) {
				  e.printStackTrace(); 
				  } 
		}
				public void testCaseFail(String testdescription,String info,String fail) {
					  try {
						 
				  
				  com.aventstack.extentreports.ExtentTest logger = extent.createTest(testdescription); 
				  logger.log(Status.INFO,info);
			//	  logger.log(Status.Fail,MarkupHelper.createLabel(fail, ExtentColor.RED));
				logger.log(Status.FAIL, MarkupHelper.createLabel(fail, ExtentColor.RED)) ;
				  
				  extent.flush(); 
					  }
					  
					  catch(Exception e) {
						  e.printStackTrace(); 
						  } 
}
				
	
				public String takeScreenShot(String status, String testName)throws Exception{ String
					  path="./Reports/Screeshots";
					  
					  DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy"); LocalDate
					  sysDate=LocalDate.now(); String
					  formateddDate=dtf.format(sysDate).replace("/", "_");
					  
					  TakesScreenshot srcShot=(TakesScreenshot)driver; File
					  src=srcShot.getScreenshotAs(OutputType.FILE); String
					  screenShotdest=(path)+"-"+status+".png"; File
					  dest=new
					  File(System.getProperty("User.dir")+"/Screenshot/"+System.currentTimeMillis()
					  +".png"); 
					  String absolutePathLocation=dest.getAbsolutePath();
					 // FileUtils.copyFile(src, dest);
					  path=("./Reports")+"_"+".png";
					  
					  return absolutePathLocation; }
					 
					
					
					 
							  
						public static String getScreenShot(WebDriver driver) {
							
							
							
							TakesScreenshot ts = (TakesScreenshot) driver;
							ts.getScreenshotAs(OutputType.FILE);
							String path = System.getProperty("User.dir")+"/Screenshot/"+System.currentTimeMillis()+".png ";
						File destination = new File(path);
						return path;
							
						}
}
/*
 * public String takeScreenShot(String status, String testName)throws Exception{
 * String path="./Reports/Screeshots";
 * 
 * DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy"); LocalDate
 * sysDate=LocalDate.now(); String
 * formateddDate=dtf.format(sysDate).replace("/", "_");
 * 
 * TakesScreenshot srcShot=(TakesScreenshot)driver; File
 * src=srcShot.getScreenshotAs(OutputType.FILE); String
 * screenShotdest=WebDriverUtil.getProperty(path)+"-"+status+".png"; File
 * dest=new
 * File(System.getProperty("User.dir")+"/Screenshot/"+System.currentTimeMillis()
 * +".png"); String absolutePathLocation=dest.getAbsolutePath();
 * FileUtils.copyFile(src, dest);
 * path=WebDriverUtil.getProperty("./Reports")+"_"+".png";
 * 
 * return absolutePathLocation; } }
 * 
 * 
 * 
 */
/*
 * public static String getScreenShot(WebDriver driver) {
 * 
 * 
 * 
 * TakesScreenshot ts = (TakesScreenshot) driver;
 * ts.getScreenshotAs(OutputType.FILE); String path =
 * System.getProperty("User.dir")+"/Screenshot/"+System.currentTimeMillis()
 * +".png "; File destination = new File(path); try {
 * FileUtils.copyDirectory(Src, destination); }catch(IOException e) {
 * System.out.println("capture failed"+e.getMessage()); } return path;
 * 
 * } }
 * 
 * }
 */
 


 