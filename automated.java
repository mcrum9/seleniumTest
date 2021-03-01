package lbrands.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automated {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome,driver", "C:\\Users\\mason\\OneDrive\\Desktop\\lbrands\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.victoriassecret.com/us/");
		driver.manage().window().maximize();
		driver.findElement(By.id("BRAS")).click();
		driver.findElement(By.id("/us/vs/bras/body-by-victoria-collection#perfect")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Lightly Lined Full-Coverage Lace Racerback Bra")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("11178733")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("34")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("34")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("C")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("e7665891-9b0e-477f5-a0b2a6762d92")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("fabric-primary-button-element fabric-add-to-bag-overlay-checkout-button")).click();

		driver.findElement(By.id("fabric-primary-grey-button-element checkoutAsGuestButton")).click();
		Thread.sleep(2000);

		String at = driver.getTitle();
		String et = "victoriassecret";
				driver.close();
				
				{
					System.out.println("Successful");
				}
				
				else
					
				{
					System.out.println("unsuccessful");
						
				}
	}

		
		
		
		
	}


