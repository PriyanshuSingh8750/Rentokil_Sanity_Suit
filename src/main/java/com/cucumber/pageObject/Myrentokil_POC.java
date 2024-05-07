package com.cucumber.pageObject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.supportLibraries.ExtentReport;
import com.cucumber.supportLibraries.WebdriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.CucumberCraft.supportLibraries.ObjectRepository;

public class Myrentokil_POC {
	WebdriverUtils webdriverutils = new WebdriverUtils(null);
	WebDriver driver = null;
	ExtentReport extentreport = new ExtentReport();

	public void lauchTheBrowser() {
		try {
			
			 WebDriverManager.chromedriver().setup(); 
			  driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.manage().window().maximize();
			  
			  
			 // System.setProperty("webdriver.chrome.driver","C:\\Users\\2183095\\OneDrive - Cognizant\\Rentokil\\chromedriver\\chromedriver.exe");
			  // Instantiate a ChromeDriver 
			  //driver = new ChromeDriver();
			  
			 //  Maximize the browser 
			  //driver.manage().window().maximize();
			 

			//webdriverutils.waitFor(5000);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			// Launch Website

			long start = System.currentTimeMillis();
			driver.get("https://myrentokil.com/");

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Login to your account')]")));
			long finish = System.currentTimeMillis();
			extentreport.testSuiteStart();
			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			if (totalSeconds <= 5) {

				System.out.println(totalTime);
				System.out.println("Time taken to load the login page : " + totalTime * .001 + " seconds approx");
				Thread.sleep(5000);

				String description = "Launch the React myRentokil application";
				String info = "Verify that the React myRentokil application is launched";
				String pass = "React myRentokil application is launched succesfully";
				String pageLoadTime = "Time taken to load login page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Launch the React myRentokil application";
				String info = "Verify that the React myRentokil application is launched";
				String fail = "React myRentokil application is launched succesfully";
				String pageLoadTime = "Time taken to load login page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		}

		catch (Exception e) {
			e.printStackTrace();

			String description = "Launch the React myRentokil application";
			String info = "Verify that the React myRentokil application is launched";
			String fail = "React myRentokil application is not launched succesfully";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void enterLoginDetails() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(By.xpath("//input[@id='txtUserName']"), 10);

			driver.findElement(By.xpath("//input[@id='txtUserName']"))
					.sendKeys("myAdm1n.Demo01@gmail.com");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Rentokil1234!");

			long start = System.currentTimeMillis(); // Launch Website
			//
			driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'United Kingdom')]")));

			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			if (totalSeconds <= 5) {
				System.out.println("milli secs : " + totalTime);
				System.out
						.println("Time taken to load the Country selection page : " + totalTime * .001 + " secs Aprox");

				Thread.sleep(5000);
				String description = "Login into React myRentokil";
				String info = "Verify that the user is able to login with valid credentials and navigate to country selection page";
				String pass = "User logged in successfully and navigated to country selection page";
				String pageLoadTime = "Time taken to load Country selection page : " + totalTime * .001
						+ " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Login into React myRentokil";
				String info = "Verify that the user is able to login with valid credentials and navigate to country selection page";
				String fail = "User logged in successfully and navigated to country selection page";
				String pageLoadTime = "Time taken to load login page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);

			}
		} catch (Exception e) {
			e.printStackTrace();
			String description = "Login into React myRentokil";
			String info = "Verify that the user is able to login with valid credentials and navigate to country selection page";
			String fail = "User is unable to login with valid credentials";

			extentreport.testCaseFail(description, info, fail);

		}

	}

	public void countrySelection() {
		try {

			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			String countryvalue = "United Kingdom";
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("//p[contains(text(),'" + countryvalue + "')]")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Login as me')]")));

			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			System.out.println(totalTime);
			double totalSeconds = totalTime * .001;

			/*
			 * String countryvalue = "United Kingdom";
			 * 
			 * webdriverutils.getPageLoadTime("//p[contains(text(),'"+countryvalue+"')]",
			 * "//p[contains(text(),'Employee zone')]");
			 */

			if (totalSeconds <= 5) {
				// System.out.println("Time taken to load the Employee page : "+totalTime*.001+"
				// Secs Aprox");
				Thread.sleep(5000);
				String description = "Select a country : " + countryvalue + "";
				String info = "Verify that the user is able to select the Country and navigate to employee zone page";
				String pass = "User selected the country successfully and navigated to employee zone page";
				String pageLoadTime = "Time taken to load Employee zone pages : " + totalTime * .001
						+ "  seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Select a country : " + countryvalue + "";
				String info = "Verify that the user is able to select the Country and navigate to employee zone page";
				String fail = "User selected the country successfully and navigated to employee zone page";
				String pageLoadTime = "Time taken to load Employee zone pages : " + totalTime * .001
						+ "  seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);

			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Select a country";
			String info = "Verify that the user is able to select the Country and navigate to employee zone page";
			String fail = "User is unable to select the Country and navigate to employee zone page";

			extentreport.testCaseFail(description, info, fail);
		}

	}

	public void loginAsMe() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitFor(3000);

			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//p[contains(text(),'Login as me')]")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[@class='sign-post_content sign-post_content--centre']")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			System.out.println(totalTime);
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Welcome page :" + totalTime * .001 + " secs Aprox");
			Thread.sleep(2000);
			if (totalSeconds <= 5) {
				String description = "Click on the login as me";
				String info = "Verify that the user is able to select login as me button and navigate to welcome page";
				String pass = "User succesfully navigated to welcome page";
				String pageLoadTime = "Time taken to load welcome page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Click on the login as me";
				String info = "Verify that the user is able to select login as me button and navigate to welcome page";
				String fail = "User succesfully navigated to welcome page";
				String pageLoadTime = "Time taken to load welcome page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Click on the login as me";
			String info = "Verify that the user is able to select login as me button and navigate to welcome page";
			String fail = "User is unable to select login as me button and navigate to welcome page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void servicePage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//span[contains(text(),'Service')]")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4'])[2]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the site over view page :" + totalTime * .001 + " secs Aprox");
			if (totalSeconds <= 5) {
				String description = "Click on Service button and verify Dashboard screen is displayed";
				String info = "Verify that the user is able to navigate site overview page and dashboard screen is displayed";
				String pass = "User successfully navigated to site overview page";
				String pageLoadTime = "Time taken to load Site overview page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
				Thread.sleep(5000);
			} else {
				String description = "Click on Service button and verify Dashboard screen is displayed";
				String info = "Verify that the user is able to navigate site overview page and dashboard screen is displayed";
				String fail = "User successfully navigated to site overview page";
				String pageLoadTime = "Time taken to load Site overview page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Click on Service button and verify Dashboard screen is displayed";
			String info = "Verify that the user is able to navigate site overview page and dashboard screen is displayed";
			String fail = "The user is unable to navigate site overview page and dashboard screen is displayed";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void siteName(String site_name) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// Find element by link text and store in variable "Element"
			String xpath = "//span[contains(text(),'" + site_name + "')]";
			// String xpath = "//span[@title='" + site_name + "']"; // "//input[@value='" +
			// site_name + "']";
			WebElement site_element = driver.findElement(By.xpath(xpath));

			// This will scroll the page till the element is found
			js.executeScript("arguments[0].scrollIntoView();", site_element);
			if (site_element.isDisplayed()) {

				long start = System.currentTimeMillis(); // Launch Website
				site_element.click();
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//p[starts-with(@class,'jss')])[22]")));
				long finish = System.currentTimeMillis();

				long totalTime = finish - start;
				double totalSeconds = totalTime * .001;
				System.out.println("Time taken to load the Site Summary  page :" + totalTime * .001 + " secs Aprox");
				if (totalSeconds <= 5) {
					String description = "User select the site : " + site_name + "";
					String info = "Verify that the user select the site and navigate to site summary page";
					String pass = "User successfully selected the site and navigated to site summary page";
					String pageLoadTime = "Time taken to load Site summary page : " + totalTime * .001
							+ " seconds approx";
					extentreport.testCasePass(description, info, pass, pageLoadTime);
				}

				else {
					String description = "User select the site : " + site_name + "";
					String info = "Verify that the user select the site and navigate to site summary page";
					String fail = "User successfully selected the site and navigated to site summary page";
					String pageLoadTime = "Time taken to load Site summary page : " + totalTime * .001
							+ " seconds approx";
					extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "User select the site";
			String info = "Verify that the user select the site and navigate to site summary page";
			String fail = "The user is unable to select the site and navigate to site summary page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void visitpage() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//button[@aria-label='visits tab']")).click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//a[@class='grid-component__ref-hyperlink'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;

			System.out.println("Time taken to load the Visit page " + totalTime + "");
			Thread.sleep(5000);

			System.out.println("Time taken to load the Visit page :" + totalTime * .001 + " secs");
			Thread.sleep(10000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Visit page";
				String info = "Verify that the user navigate to visit page";
				String pass = "User successfully navigated to visit page";
				String pageLoadTime = "Time taken to load visit page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Visit page";
				String info = "Verify that the user navigate to visit page";
				String fail = "User successfully navigated to visit page";
				String pageLoadTime = "Time taken to load visit page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Visit page";
			String info = "Verify that the user navigate to visit page";
			String fail = "The user is unable to navigate visit page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void visitDetailsPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(By.xpath("//a[@class='grid-component__ref-hyperlink']"), 30);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//a[@class='grid-component__ref-hyperlink']")).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Recommendations')])[3]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the visit details page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Visit details page";
				String info = "Verify that the user navigate to visit details page when selected the date in visit table";
				String pass = "User successfully navigated to visit details page";
				String pageLoadTime = "Time taken to load visit details page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Visit details page";
				String info = "Verify that the user navigate to visit details page when selected the date in visit table";
				String fail = "User successfully navigated to visit details page";
				String pageLoadTime = "Time taken to load visit details page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Visit details page";
			String info = "Verify that the user navigate to visit details page when selected the date in visit table";
			String fail = "The user is unable to navigate visit details page when selected the date in visit table";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void jobsPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//a[@id='performance Jobs']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Date')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the jobs page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Jobs page";
				String info = "Verify that the user navigate to jobs page";
				String pass = "User successfully navigated to jobs page";
				String pageLoadTime = "Time taken to load jobs page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Jobs page";
				String info = "Verify that the user navigate to jobs page";
				String fail = "User successfully navigated to jobs page";
				String pageLoadTime = "Time taken to load jobs page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Jobs page";
			String info = "Verify that the user navigate to jobs page";
			String fail = "The user is unable to navigate jobs page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void pestactivityPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			Thread.sleep(3000);
			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//a[@id='performance Pest activity']")).click();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Visit date')]")));

			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the pest activity page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Pest activity page";
				String info = "Verify that the user navigate to pest activity page";
				String pass = "User successfully navigated to pest activity page";
				String pageLoadTime = "Time taken to load pest activity page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Pest activity page";
				String info = "Verify that the user navigate to pest activity page";
				String fail = "User successfully navigated to pest activity page";
				String pageLoadTime = "Time taken to load pest activity page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Pest activity page";
			String info = "Verify that the user navigate to pest activity page";
			String fail = "The user is unable to navigate pest activity page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void recommendationPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//a[@id='performance Recommendations']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Date')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Recommendation page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Recommedation page";
				String info = "Verify that the user navigate to recommedation page";
				String pass = "User successfully navigated to recommedation page";
				String pageLoadTime = "Time taken to load recommedation page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Recommedation page";
				String info = "Verify that the user navigate to recommedation page";
				String fail = "User successfully navigated to recommedation page";
				String pageLoadTime = "Time taken to load recommedation page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Recommedation page";
			String info = "Verify that the user navigate to recommedation page";
			String fail = "The user is unable to navigate recommedation page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void recommendationdetailsPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//a[@class='grid-component__ref-hyperlink']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'PDF')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Recommendation page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Recommedation details  page";
				String info = "Verify that the user navigate to recommedation details page when selected the reference number in the recommendation table";
				String pass = "User successfully navigated to recommedation details page";
				String pageLoadTime = "Time taken to load recommedation details page : " + totalTime * .001
						+ " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Recommedation details  page";
				String info = "Verify that the user navigate to recommedation details page when selected the reference number in the recommendation table";
				String fail = "User successfully navigated to recommedation details page";
				String pageLoadTime = "Time taken to load recommedation details page : " + totalTime * .001
						+ " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);

			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Recommedation details  page";
			String info = "Verify that the user navigate to recommedation details page when selected the reference number in the recommendation table";
			String fail = "The user is unable to navigate recommedation details page when selected the reference number in the recommendation table";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void tasksPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//a[@id='performance Tasks']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Date')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Tasks page :" + totalTime * .001 + " secs ");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Tasks page";
				String info = "Verify that the user navigate to Tasks page";
				String pass = "User successfully navigated to Tasks page";
				String pageLoadTime = "Time taken to load Tasks page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Tasks page";
				String info = "Verify that the user navigate to Tasks page";
				String fail = "User successfully navigated to Tasks page";
				String pageLoadTime = "Time taken to load Tasks page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Tasks page";
			String info = "Verify that the user navigate to Tasks page";
			String fail = "The user is unable to navigate Tasks page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void taskdetailsPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			long start = System.currentTimeMillis(); // Launch Website
			webdriverutils.waitUntilElementVisible(By.xpath("(//div[@class='ag-react-container'])[1]"), 50);
			driver.findElement(By.xpath("(//div[@class='ag-react-container'])[1]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-dUbtfd hUvtZZ']")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Task details page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Tasks details page";
				String info = "Verify that the user navigate to tasks details page when selected the reference number";
				String pass = "User successfully navigated to tasks details page";
				String pageLoadTime = "Time taken to load tasks details page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Tasks details page";
				String info = "Verify that the user navigate to tasks details page when selected the reference number";
				String fail = "User successfully navigated to tasks details page";
				String pageLoadTime = "Time taken to load tasks details page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Tasks details page";
			String info = "Verify that the user navigate to tasks details page when selected the reference number";
			String fail = "The user is unable to navigate tasks details page when selected the reference number";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void preparationPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//a[@id='performance Preparations']")).click();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Visit date')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Preparation page :" + totalTime * .001 + " secs");
			if (totalSeconds <= 5) {
				Thread.sleep(5000);
				String description = "Navigate to preparation page";
				String info = "Verify that the user navigates to preparation page";
				String pass = "User successfully navigated to preparation page";
				String pageLoadTime = "Time taken to load preparation page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to preparation page";
				String info = "Verify that the user navigates to preparation page";
				String fail = "User successfully navigated to preparation page";
				String pageLoadTime = "Time taken to load preparation page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to preparation page";
			String info = "Verify that the user navigates to preparation page";
			String fail = "The user is unable tonavigate preparation page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void sitePlansPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath("//a[@id='performance Site plans']")).click();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1']")));
		

			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			double timeINSEC = totalTime * .001;

			System.out.println(totalTime);

			System.out.println("Time taken to load the Site plan page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);

			if (timeINSEC < 10) {
				String description = "Navigate to Site plan page";
				String info = "Verify that the user navigate to site plan page";
				String pass = "User successfully navigated to site plan page";
				String pageLoadTime = "Time taken to load site Plan page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Site plan page";
				String info = "Verify that the user navigate to site plan page";
				String fail = "User successfully navigated to site plan page";
				String pageLoadTime = "Time taken to load site Plan page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Site plan page";
			String info = "Verify that the user navigate to site plan page";
			String fail = "The user is unable to navigate site plan page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void documentsPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(By.xpath("//button[@aria-label='documents tab']"), 20);
			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//button[@aria-label='documents tab']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"(//div[@class='sc-fGoOlv dkJOSK MuiAccordionSummary-content MuiAccordionSummary-contentGutters'])")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Documents page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Documents page";
				String info = "Verify that the user navigate to documents page";
				String pass = "User successfully navigated to documents page";
				String pageLoadTime = "Time taken to load documents page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Documents page";
				String info = "Verify that the user navigate to documents page";
				String fail = "User successfully navigated to documents page";
				String pageLoadTime = "Time taken to load documents page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Documents page";
			String info = "Verify that the user navigate to documents page";
			String fail = "The user is unable to navigate documents page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void supportPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(
					By.xpath("//a[contains(text(),'Support') and @class='sc-eBhrFy gCsDxK']"), 20);
			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//a[contains(text(),'Support') and @class='sc-eBhrFy gCsDxK']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sign-post_content ']")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			System.out.println("Time taken to load the site over view page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalTime <= 5) {
				String description = "Navigate to Support page";
				String info = "Verify that the user navigate to Support page";
				String pass = "User successfully navigated to Support page";
				String pageLoadTime = "Time taken to load Support page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Support page";
				String info = "Verify that the user navigate to Support page";
				String fail = "User successfully navigated to Support page";
				String pageLoadTime = "Time taken to load Support page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Support page";
			String info = "Verify that the user navigate to Support page";
			String fail = "The user is unable to navigate Support page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void accountsPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(By.xpath("(//a[contains(text(),'Account')])[1]"), 20);
			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("(//a[contains(text(),'Account')])[1]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Accounts page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {
				String description = "Navigate to Accounts page";
				String info = "Verify that the user navigate to accounts page";
				String pass = "User successfully navigated to accounts page";
				String pageLoadTime = "Time taken to load accounts page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Accounts page";
				String info = "Verify that the user navigate to accounts page";
				String fail = "User successfully navigated to accounts page";
				String pageLoadTime = "Time taken to load accounts page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Accounts page";
			String info = "Verify that the user navigate to accounts page";
			String fail = "The user is unable to navigate accounts page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void reportsPage_pestAnalysis() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			webdriverutils.waitUntilElementVisible(By.xpath("//a[contains(text(),'Reporting')]"), 40);

			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//a[contains(text(),'Reporting')]")).click();

			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'The
			// selections generated no data for this chart')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the Pest analysis page : " + totalTime * .001 + " secs Aprox");
			Thread.sleep(5000);

			String description = "Navigate to Pest analysis page";
			String info = "Verify that the user navigate to pest analysis page";
			String pass = "User successfully navigated to pest analysis page";
			String pageLoadTime = "Time taken to load pest analysis page : " + totalTime * .001 + " seconds approx";
			// extentreport.testCasePass(description,info,pass,pageLoadTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void recommendationAnalysisPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			webdriverutils.waitUntilElementVisible(By.xpath("//span[contains(text(),'Recommendation analysis')]"), 60);
			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//span[contains(text(),'Recommendation analysis')]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='date'])[1]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			System.out.println("Time taken to load the recommendation over view page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);

			String description = "Navigate to Recommendation analysis page";
			String info = "Verify that the user navigate to recommendation analysis page";
			String pass = "User successfully navigated to recommendation analysis page";
			String pageLoadTime = "Time taken to load recommendation analysis page : " + totalTime * .001
					+ " Secs Aprox";
			extentreport.testCasePass(description, info, pass, pageLoadTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void report_reportPage() {
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(By.xpath("//button[@aria-label='Reports tab']"), 40);
			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//button[@aria-label='Reports tab']")).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//*[starts-with(@class,'MuiSvgIcon')])[13]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the site over view page :" + totalTime * .001 + " seconds approx");
			Thread.sleep(5000);

			if (totalSeconds <= 5) {
				String description = "Navigate to Report page";
				String info = "Verify that the user navigate to report page";
				String pass = "User successfully navigated to report page";
				String pageLoadTime = "Time taken to load report page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Report page";
				String info = "Verify that the user navigate to report page";
				String fail = "User successfully navigated to report page";
				String pageLoadTime = "Time taken to load report page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Report page";
			String info = "Verify that the user navigate to report page";
			String fail = "The user is unable to navigate report page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void createReport_reportPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(By.xpath("//button[@aria-label='create report page']"), 20);
			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//button[@aria-label='create report page']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='MuiButton-label']")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the site over view page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);

			if (totalSeconds <= 5) {
				String description = "Navigate to Create report page";
				String info = "Verify that the user navigate to create report page";
				String pass = "User successfully navigated to create report page";
				String pageLoadTime = "Time taken to load create report page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Create report page";
				String info = "Verify that the user navigate to create report page";
				String fail = "User successfully navigated to create report page";
				String pageLoadTime = "Time taken to load create report page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Create report page";
			String info = "Verify that the user navigate to create report page";
			String fail = "The user is unable to navigate create report page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void sitecollectionPage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(By.xpath("//button[@aria-label='Site collections tab']"), 20);
			long start = System.currentTimeMillis(); // Launch Website

			driver.findElement(By.xpath("//button[@aria-label='Site collections tab']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//span[contains(text(),'(L3) Quickbake Bakery Ltd, First Avenue')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the site over view page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);

			if (totalSeconds <= 5) {
				String description = "Navigate to Site collection page";
				String info = "Verify that the user navigate to site collection page";
				String pass = "User successfully navigated to site collection page";
				String pageLoadTime = "Time taken to load site collection page : " + totalTime * .001
						+ " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Navigate to Site collection page";
				String info = "Verify that the user navigate to site collection page";
				String fail = "User successfully navigated to site collection page";
				String pageLoadTime = "Time taken to load site collection page : " + totalTime * .001
						+ " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Navigate to Site collection page";
			String info = "Verify that the user navigate to site collection page";
			String fail = "The user is unable to navigate site collection page";

			extentreport.testCaseFail(description, info, fail);
		}
	}

	public void logout() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			webdriverutils.waitUntilElementVisible(By.xpath("(//span[contains(text(),'Logout')])[2]"), 20);
			long start = System.currentTimeMillis();

			driver.findElement(By.xpath("(//span[contains(text(),'Logout')])[2]")).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Login to your account')]")));
			long finish = System.currentTimeMillis();

			long totalTime = finish - start;
			double totalSeconds = totalTime * .001;
			System.out.println("Time taken to load the site over view page :" + totalTime * .001 + " secs");
			Thread.sleep(5000);
			if (totalSeconds <= 5) {

				String description = "Logout";
				String info = "Verify that the user is able to logout the applicaton";
				String pass = "User successfully logged out";
				String pageLoadTime = "Time taken to load login page : " + totalTime * .001 + " seconds approx";
				extentreport.testCasePass(description, info, pass, pageLoadTime);
			} else {
				String description = "Logout";
				String info = "Verify that the user is able to logout the applicaton";
				String fail = "User successfully logged out";
				String pageLoadTime = "Time taken to load login page : " + totalTime * .001 + " seconds approx";
				extentreport.testCaseFailTime(description, info, fail, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();

			String description = "Logout";
			String info = "Verify that the user is able to logout the applicaton";
			String fail = "The user is unable to logout the applicaton";

			extentreport.testCaseFail(description, info, fail);
		}
	}
}
