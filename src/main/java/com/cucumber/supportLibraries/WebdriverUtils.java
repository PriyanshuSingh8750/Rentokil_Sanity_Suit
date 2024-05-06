package com.cucumber.supportLibraries;

import java.time.Clock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;



public class WebdriverUtils {
	
	
	WebDriver driver=null;
	ExtentReport extentreport = new ExtentReport();
		    
	/**
	 * Constructor to initialize the {@link WebDriverUtil} object
	 * 
	 * @param driver
	 *            The {@link WebDriver} object
	 */
	public WebdriverUtils(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Function to pause the execution for the specified time period
	 * 
	 * @param milliSeconds
	 *            The wait time in milliseconds
	 */
	public void waitFor(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Function to wait until the specified element is located
	 * 
	 * @param by
	 *            The {@link WebDriver} locator used to identify the element
	 * @param timeOutInSeconds
	 *            The wait timeout in seconds
	 */
	public void waitUntilElementLocated(By by, long timeOutInSeconds) {
//		(new WebDriverWait(driver, 20000)).until(ExpectedConditions
//				.presenceOfElementLocated(by));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOutInSeconds));
//		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	/**
	 * Function to wait until the specified element is visible
	 * 
	 * @param by
	 *            The {@link WebDriver} locator used to identify the element
	 * @param timeOutInSeconds
	 *            The wait timeout in seconds
	 */
	public  void waitUntilElementVisible(By by, long timeOutInSeconds) {
		/*
		 * (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions
		 * .visibilityOfElementLocated(by));
		 */
	}

	/**
	 * Function to wait until the specified element is enabled
	 * 
	 * @param by
	 *            The {@link WebDriver} locator used to identify the element
	 * @param timeOutInSeconds
	 *            The wait timeout in seconds
	 */
	public void waitUntilElementEnabled(By by, long timeOutInSeconds) {
		/*
		 * (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions
		 * .elementToBeClickable(by));
		 */
	}

	/**
	 * Function to wait until the specified element is disabled
	 * 
	 * @param by
	 *            The {@link WebDriver} locator used to identify the element
	 * @param timeOutInSeconds
	 *            The wait timeout in seconds
	 */
	public void waitUntilElementDisabled(By by, long timeOutInSeconds) {
		/*
		 * (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions
		 * .not(ExpectedConditions.elementToBeClickable(by)));
		 */
	}
	
	
		public double getPageLoadTime(String element1, String element2) { 
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			
			waitUntilElementLocated(By.xpath(element1), 20);
			long start = System.currentTimeMillis(); // Launch Website
			driver.findElement(By.xpath(element1)).click();
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element2)));
			long finish = System.currentTimeMillis();
			  
			  long totalTime = finish-start;
			  double totalSeconds = totalTime*.001;
			  System.out.println("Time taken to load the site over view page :"+totalTime*.001+" secs Aprox");
			return totalSeconds;
			
			
		
		
	}
}
