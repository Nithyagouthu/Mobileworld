package myProject.mobileWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import myProject.mobileWorld.Pages.SignIn;
import myProject.mobileWorld.Pages.SignUp;
import myProject.mobileWorld.Pages.allmobile;


public class AppTest 
{
  
	
	
	@DataProvider
	public Object[][] dataProvider1(){
		return new Object[][] {
			{"Samsung"},
			{"Apple"},
		};
		
	}
	
	
	
	@DataProvider
	public Object[][] dataProvider2(){
		return new Object[][] {
			new Object[]{
					"ga", "kj"
			},
			new Object[]{
					"nithyashettyyy", "jgywsuhquywquhiswijqihwwshu"
			},
		};
		
	}
	
	@DataProvider
	public Object[][] dataProvider3(){
		return new Object[][] {
			new Object[]{
					"nithya", "tj","nitha@gmail","nithya#14","14/10/1999","2768182722","hi team"
			},
			new Object[]{
					"ni", "jgywsuhquywquhiswijqihwwshu","hhqygguysuihah","uquh97298891989280918","21/12/5577","68178","shygygshuh828812352@"
			},
		};
		
	}
	
	@Test(dataProvider="dataProvider2", priority=1)
    public void signInPage(String userName, String userPassword) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:/Users/nithya.t/Downloads/chromedriver_win32/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	SignIn signIn = new SignIn(driver);
    	signIn.launchBrowser();
    	signIn.signIn();
    	signIn.username(userName);
    	Thread.sleep(1000);
    	signIn.password(userPassword);
    	Thread.sleep(1000);
    	signIn.rememberme();
    	signIn.login();	
    	signIn.isTestPassed(userName);
    	signIn.isTestPassed(userPassword);
        
    }
	

	 @Test(dataProvider="dataProvider3",priority=2)
	    public void signupPage(String fname,String lname,String email,String password,String dob,String phonenumber,String bio) throws InterruptedException
	    {
	    	System.setProperty("webdriver.chrome.driver","C:/Users/nithya.t/Downloads/chromedriver_win32/chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	
	    SignUp SignUp1 = new SignUp(driver);
	    SignUp1.Browser();
	    SignUp1.clickOnSignin();
	    SignUp1.enterFirstName(fname);
	    Thread.sleep(1000);
	    SignUp1.enterLastName(lname);
	    Thread.sleep(1000);
	    SignUp1.enterEmail(email);
	    Thread.sleep(1000);
	    SignUp1.enterPassword(password);
	    Thread.sleep(1000);
	    SignUp1.enterDateOfBirth(dob);
	    SignUp1.entergender();
	    SignUp1.enterPhoneNumber(phonenumber);
	    Thread.sleep(1000);
	    SignUp1.enterShortbio(bio);
	    Thread.sleep(1000);
	    SignUp1.clickOnRegister();
	    
	    }  
	 
	 @Test(dataProvider="dataProvider1" ,priority=3)
	    public void All_mobilepage(String enterMobile) throws InterruptedException
	    {
	    	System.setProperty("webdriver.chrome.driver","C:/Users/nithya.t/Downloads/chromedriver_win32/chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	
	    	allmobile allmobile1 = new allmobile(driver);
	    	allmobile1.launchBrowser();
	    	allmobile1.clickonallmobiles();
	    	Thread.sleep(1000);
	    	allmobile1.enterInSearch(enterMobile);
	    	Thread.sleep(2000);
	    	allmobile1.clickOnOrder();
	    	
	    	
	    }	 
    
}
