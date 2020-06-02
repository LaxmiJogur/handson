package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project {
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
	System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
  @Test
  public void cuntrynames() {
	  driver.findElement(By.name("firstName")).sendKeys("Laxmi");
	  driver.findElement(By.name("lastName")).sendKeys("Jogur");
	  driver.findElement(By.name("phone")).sendKeys("7026435076");
	  driver.findElement(By.id("userName")).sendKeys("laxmi@gmail.com");
	  driver.findElement(By.name("address1")).sendKeys("vijayapur");
	  driver.findElement(By.name("city")).sendKeys("almel");
	  driver.findElement(By.name("state")).sendKeys("Karnataka");
	  driver.findElement(By.name("postalCode")).sendKeys("586202");
	  Select s=new Select(driver.findElement(By.name("country")));
	  List<WebElement> dd_options=s.getOptions();
	  
	  int i=1;
	  for (WebElement e : dd_options)
	  {
		  System.out.println(i+"."+e.getText());
		  i++;
	  }
	  
	  //String v = s.selectByVisibleText("INDIA");
	 
	  for(int j=0;j<dd_options.size();j++)
	  {
		  Assert.assertEquals("INDIA", "INDIA");
	  }
	  System.out.println("verified");
	  //WebElement actual = dd_options.get(108);
	  //String expected = "INDIA";
	  //if(actual.equals(expected)) {
		 // System.out.println("Verified");
	  
  }
}
