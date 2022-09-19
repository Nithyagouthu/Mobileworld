package myProject.mobileWorld.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	
	WebDriver driver;
	
	
    public SignUp(Object driver2) {
		// TODO Auto-generated constructor stub
	}

	public void Browser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
    }
    
    public void clickOnSignin() throws  InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
    }
    
    public void enterFirstName(String fname) throws InterruptedException {
        driver.findElement(By.id("myname")).sendKeys(fname);
    }
    
    public void enterLastName(String lname) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
    }
    
    public void enterEmail(String email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(email);
    }
    
    public void enterPassword(String password) throws InterruptedException {
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
    }
    
    public void enterDateOfBirth(String dob) throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys(dob);
    }
    
    public void entergender() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
    }
    
    public void enterPhoneNumber(String phonenumber) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys(phonenumber);
        }
    
   
    public void enterShortbio(String bio) throws InterruptedException {
        driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys(bio);
        
    }
    
    public void clickOnRegister() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
   
    }
    
   
}
