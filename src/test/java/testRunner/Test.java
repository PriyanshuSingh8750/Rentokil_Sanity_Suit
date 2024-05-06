package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	//static WebDriver driver;
	//
    // Instantiate a ChromeDriver class.
    WebDriver driver = null;
	public  void lauchTheBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Driver\\chromedriver (2).exe");
  driver=new ChromeDriver();
        // Maximize the browser
        driver.manage().window().maximize();
  
        // Launch Website
        driver.get("https://myrentokil.com/");
        Thread.sleep(5000);
      //  webdriverutils.getPageLoadTime("checking page load time for My Rentokil", By.xpath("https://myrentokil.com/"), By.xpath("//span[contains(text(),'Login')]"));
        
		}
		
        catch(Exception e) {
        	e.printStackTrace();
        }
	}
		public  void enterLoginDetails() {
			try {

				
				//webdriverutils.waitUntilElementVisible(By.xpath("//input[@id='txtUserName']"), 10);
				
				driver.findElement(By.xpath("//div[contains(@class,'MuiInputBase-formControl')]//input[@id='txtUserName']")).sendKeys("myRentokil.adm1n@gmail.com");
				driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Rentokil123!");
				driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
				//webdriverutils.getPageLoadTime("page load", By.xpath("//span[contains(text(),'Login')]"), By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-align-items-xs-center'])"));
			} catch (Exception e) {
				e.printStackTrace();
				

				

				
			
		}
		
	}

	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		t.lauchTheBrowser();
		t.enterLoginDetails();
	}

}
