package myProject.mobileWorld.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
		WebDriver driver;
		
	    public SignIn(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}

		public void launchBrowser() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.get("https://mobileworld.banyanpro.com/");
		}
		
		    public void signIn() throws  InterruptedException {
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
		    }
		
		
		    public void username(String userName) throws  InterruptedException {
		        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		    }
		
		
		    public void password(String password) throws  InterruptedException {
		        driver.findElement(By.cssSelector("#password")).sendKeys(password);
		    }
		 
		
		    public void rememberme() throws  InterruptedException {
		        driver.findElement(By.xpath("//label[@for='remember-me']")).click();
		    }
		
	
		    public void login() throws  InterruptedException {
		        driver.findElement(By.cssSelector("a[type='submit']")).click();
		    }
		    
		    public void isTestPassed(String userName) {
		    	if(userName.length() < 3 || userName.length() >20) {
		    		Assert.assertEquals("https://mobileworld.banyanpro.com/sign.html", driver.getCurrentUrl());
		    	}
		    	else
		    		Assert.assertEquals("https://mobileworld.banyanpro.com/index.html", driver.getCurrentUrl());
		    }
		    
		    
		            
		   
	}




