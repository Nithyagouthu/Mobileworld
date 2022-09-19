package myProject.mobileWorld.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allmobile {

   
    WebDriver driver;
    


    public allmobile(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}


	public void launchBrowser() throws InterruptedException {
    	driver = new ChromeDriver();
    driver.get("https://mobileworld.banyanpro.com/");
    }
    

   public void clickonallmobiles() throws InterruptedException {
    driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
    
    }


   public void enterInSearch(String mobile) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(mobile);
    }
    
    public void clickOnOrder() throws InterruptedException {
    driver.findElement(By.linkText("Order")).click();
    }

}