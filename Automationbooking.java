package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationbooking {
		
   public static void main(String[] args) {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lap-319\\eclipse-workspace\\selenium\\driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
driver.findElement(By.className("sf-with-ul")).click();   //women class name
driver.findElement(By.linkText("Printed Dress")).click();   
//driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=9&controller=category'])[3]")).click();
//driver.findElement(By.id("category")).click();
driver.findElement(By.name("qty")).sendKeys("5");
	   driver.findElement(By.name("Submit")).click();
	   driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
	   
	   
	   
	
}
		
		
		
	
	
	
	
	
	
	
	
}
