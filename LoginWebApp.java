package browserdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginWebApp {

	public static void main(String[] args) {
		

       ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		//enter the uname
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//driver.findElement(By.partialLinkText("CRM")).click();
	}

}
