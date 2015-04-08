package TestTryLogin;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG 
{
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();


	  
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
		    System.setProperty("webdriver.chrome.driver", "E:/Srijan/Resources/chromedriver_win32/chromedriver.exe");
		    driver = new ChromeDriver();
		    //driver.get("http://oncorpsdev.devcloud.acquia-sites.com/");
		    //driver = new FirefoxDriver();
		   baseUrl = "https://oncorpsdev.devcloud.acquia-sites.com/";
		   Thread.sleep(2000);
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
	@Test
	 public void main() throws InterruptedException {
		  
	    driver.get(baseUrl + "/user/login");
	    driver.findElement(By.id("edit-name")).clear();
	    driver.findElement(By.id("edit-name")).sendKeys("stecorgadm");
	    driver.findElement(By.id("edit-pass")).clear();
	    driver.findElement(By.id("edit-pass")).sendKeys("srijanqa123");
	    driver.findElement(By.id("edit-submit")).click();
	    
	   
	    driver.findElement(By.id("menu-1")).click();
	    
	    //wait
	    Thread.sleep(1000);
	    //driver.findElement(By.xpath("html/body/header/div/div[1]/a")).click();
	    //driver.findElement(By.xpath("html/body/header/div/div[1]/ul/li[1]/a")).click();
	    //driver.findElement(By.xpath("//*[@class='dropdown']//li[1]")).click(); // My Dashboard
	    //driver.findElement(By.xpath("id('menu-1')")).click(); //Srijan
	    //xpath which identifies Srijan but does not click.
	    //driver.findElement(By.xpath("//body//section//div[@class='dropdown']//ul[contains(@class,'dropdown-menu menu')]//a")).click();
	    //Assert.assertTrue(true,"Dashboard");
	    // To click on Srijan from My Dashboard.
	    driver.navigate().to(baseUrl + "/dashboard?org_id=28322&gids_group%5B%5D=112");
	    
	   
	    //driver.findElement(By.xpath("id('content')/x:div[1]/x:h2)")); 
	    //Assert.assertTrue(true,"Dashboard");
	    //wait
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='menu']//li[1]")).click(); //Messages ////*[@class='navigation-sidebar']//li[1]
	    
	    //driver.navigate().to(baseUrl +"/messages?org_id=28322&gids_group%5B0%5D=112");
	    //assertTrue("Messages");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@class='block']//a[1]")).click(); //
	    //driver.navigate().to(baseUrl + "/node/add/messages/28322?org_id=28322&gids_group%5B%5D=112&destination=messages%3Forg_id%3D28322%26gids_group%5B0%5D%3D112");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='menu']//li[1]")).click();
	    //driver.navigate().to(baseUrl + "Dashboard/messages?org_id=28322&gids_group%5B0%5D=112");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='block']//a[2]")).click();
	    //driver.navigate().to(baseUrl + "/mycontacts?org_id=28322&gids_group%5B%5D=112");

	    Thread.sleep(1000);
	    // Click on Libraries from left menu
	    driver.findElement(By.xpath("//*[@class='menu']/li[2]")).click();
	    //driver.navigate().to(baseUrl + "/libraries-list?org_id=28322&gids_group%5B0%5D=112");
	    
	    driver.findElement(By.xpath("//*[@class='view-content']//div[7]")).click();
	    
	    //driver.navigate().to(baseUrl + "/share-and-compare/494?org_id=28322&gids_group%5B%5D=112&lib_id=494");
	   /* driver.findElement(By.linkText("Browse by Topic")).click();
	    driver.findElement(By.cssSelector("i.icon-check")).click();
	    driver.findElement(By.cssSelector("div.inner > span")).click();
	    driver.findElement(By.cssSelector("h4.node-title")).click();
	    driver.findElement(By.linkText("Compares to other opensource CMS")).click();
	    */
	    
	    
	    driver.findElement(By.xpath("//*[@class='row-fluid']//a[1]")).click(); //Browse By Topic
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='FocusMe']//a[1]")).click();
	    //driver.navigate().to(baseUrl + "/node/54382?org_id=28322&gids_group[]=112&lib_id=494");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='row-fluid']//a[2]")).click(); //Private UC
	    driver.navigate().to(baseUrl + "/node/54382?org_id=28322&gids_group[]=112&lib_id=494");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='row-fluid']//a[3]")).click(); //Browse By Company
	    driver.navigate().to(baseUrl + "/node/54382?org_id=28322&gids_group[]=112&lib_id=494");
	    
	    
	  //Private Use cases
	    //driver.navigate().to(baseUrl + "/dashboard/srijan/usecase-list?org_id=28322&gids_group%5B%5D=112&lib_id=494");
	    //Browse by company
	   // driver.navigate().to(baseUrl + "/organisation/vendors/all?org_id=28322&gids_group%5B%5D=112&lib_id=494");
	    Thread.sleep(1000);
	    
	    /*
	    driver.findElement(By.linkText("Request a new use case")).click();
	    driver.findElement(By.linkText("D8 Library")).click();
	    driver.findElement(By.linkText("Browse by Company")).click();
	   */
	    
	    //Library
	    driver.findElement(By.xpath("//*[@class='menu']/li[2]")); //.click() is removed fro here.
	    Thread.sleep(1000);
	    
	  //Groups
	   driver.findElement(By.xpath("//*[@class='menu']/li[3] ")).click(); 
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@class='view-content']//div[3]")).click();
	   Assert.assertTrue(true,"Drupalers, Welcome to Expert Review group created to get your feedback on Drupal 8.");
	   Thread.sleep(2500);
	   driver.findElement(By.xpath("//*[@class='row-fluid block']//a[2]")).click();
	   Thread.sleep(8000);
	   driver.findElement(By.xpath("//*[@class='row-fluid block']//a[3]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@class='row-fluid block']//a[4]")).click();
	   Thread.sleep(2000);	   
	   driver.findElement(By.xpath("//*[@class='row-fluid block']//a[5]")).click();
	   Thread.sleep(2000);
	   
	   
	    
	    //Inside Groups
	    /* 
	     driver.navigate().to(baseUrl + "/node/54390/expert-review-drupal-8?org_id=28322&gids_group%5B%5D=112");
	    Thread.sleep(1000);
	    driver.navigate().to(baseUrl + "/node/54390/expert-review-drupal-8?org_id=28322&gids_group[0]=112&tab=current");
	    Thread.sleep(1000);
	    driver.navigate().to(baseUrl + "/node/54390/expert-review-drupal-8?org_id=28322&gids_group[0]=112&tab=grids");
	    Thread.sleep(1000);
	    driver.navigate().to(baseUrl + "/node/54390/expert-review-drupal-8?org_id=28322&gids_group[0]=112&tab=archive");
	    Thread.sleep(1000);
	    driver.navigate().to(baseUrl + "/node/54390/expert-review-drupal-8?org_id=28322&gids_group[0]=112&tab=addUC");
	    */
	   
	    /*
	    driver.findElement(By.linkText("Benchmarks")).click();
	    driver.findElement(By.linkText("Compare and Match")).click();
	    driver.findElement(By.linkText("Previous Benchmarks")).click();
	    driver.findElement(By.linkText("Add Use Cases")).click();
	    driver.findElement(By.linkText("Progress")).click();
	    driver.findElement(By.linkText("Users")).click();
	    driver.findElement(By.linkText("Invite User")).click(); 
	    driver.findElement(By.linkText("Messaging")).click();
	    driver.findElement(By.linkText("Comments")).click();
	    driver.findElement(By.linkText("Configuration")).click();
	    driver.findElement(By.linkText("Events")).click();
	    */
	    
	    //Matches
	    driver.findElement(By.xpath("//*[@class='menu']/li[4]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='unstyled filter-list']//li[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='unstyled filter-list']//li[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='unstyled filter-list']//li[4]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='span2 custom-tabs-left-buttons']")).click();
	    Thread.sleep(1000);
	    
	    
	    
	    /*
	    driver.navigate().to(baseUrl + "/matching/they-are-still-waiting?org_id=28322&gids_group%5B%5D=112");
	    driver.navigate().to(baseUrl + "/matching/you-are-still-waiting?org_id=28322&gids_group%5B%5D=112");
	    driver.navigate().to(baseUrl + "/matching/matches?org_id=28322&gids_group%5B%5D=112");
	    driver.navigate().to(baseUrl + "/matching/blocked?org_id=28322&gids_group%5B%5D=112");
	    driver.navigate().to(baseUrl + "/matching/preference?org_id=28322&gids_group%5B%5D=112");
	    */
	    
	    
	    /*
	    driver.findElement(By.linkText("You're still waiting")).click();
	    driver.findElement(By.linkText("Matches (0)")).click();
	    driver.findElement(By.linkText("Blocked")).click();
	    driver.findElement(By.linkText("Matching settings")).click();
	    */
	    
	    //Favorites
	    driver.findElement(By.xpath("//*[@class='menu']/li[5]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='unstyled filter-list']//li[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='unstyled filter-list']//li[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='unstyled filter-list']//li[4]")).click();
	    Thread.sleep(1000);
	    
	   // driver.findElement(By.xpath("//*[@class='menu']/li[5]")).click();
	    
	    /*
	    driver.findElement(By.cssSelector("i.icon-pencil2")).click();
	    driver.findElement(By.cssSelector("h2.h2.app-color-8")).click();
	    driver.findElement(By.cssSelector("h2.h2.app-color-2")).click();
	    driver.findElement(By.cssSelector("h2.h2.app-color-12")).click();
	    */
	    
	    //Apps
	    driver.findElement(By.xpath("//*[@class='menu']/li[6]")).click();
	    Thread.sleep(1000);
	    
	    //driver.findElement(By.linkText("Click here to invite users to a group using an app")).click();
	   
	    //driver.findElement(By.linkText("Dashboard")).click();
	    //driver.findElement(By.cssSelector("i.icon-sign-out")).click();
	    driver.findElement(By.xpath("//*[@class='logout']")).click();
	    Thread.sleep(1000);
	    
	    
  }
	
	

	  @AfterMethod
	  public void afterMethod() {
		  
		  driver.close();
	  }

}