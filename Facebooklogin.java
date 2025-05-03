package browserdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		//To open url in browser
		driver.get("https://www.facebook.com/");
		
		//To maximize browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Tuna@321");
        driver.findElement(By.name("login")).click();
        String fbtext=driver.findElement(By.partialLinkText("account")).getText();
        System.out.println(fbtext);
        String title=driver.getTitle();
        System.out.println(title);
	}

}
