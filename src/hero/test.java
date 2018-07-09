package hero;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test
{

WebDriver driver;


@Test(invocationCount=5,invocationTimeOut=50000)

public void mian()
{
	System.setProperty("webdriver.chrome.driver", "E:\\Pattern\\selenium\\driver\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://jqueryui.com/droppable/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
 
	WebElement source = driver.findElement(By.xpath("//*[@id='draggable'][@class='ui-widget-content ui-draggable ui-draggable-handle']"));
   
   WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));


Actions a=new Actions(driver);
a.dragAndDrop(source,target).build().perform();




}

}
