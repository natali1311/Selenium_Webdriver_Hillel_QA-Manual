
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleFirstTest {

  @Test
    public void isCurrentPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/1chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//      String url = "https://www.google.com.ua/";

       driver.getCurrentUrl();

//      driver.manage().window().maximize();
//      driver.navigate().to("https://www.selenium.dev/documentation/en/");

    driver.navigate().to("https://next.privat24.ua/mobile");
//    Thread.sleep(3000);
//    driver.wait(3000);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.findElement(By.xpath("//input[@data-qa-node='phone-number']")).sendKeys("686979712");
      driver.findElement(By.xpath(".//input[@data-qa-node='amount']")).sendKeys("clear");
      driver.findElement(By.xpath(".//input[@data-qa-node='amount']")).sendKeys("55");
      driver.findElement(By.xpath(".//input[@data-qa-node='numberdebitSource']")).sendKeys("4506909324274797");
      driver.findElement(By.xpath(".//input[@data-qa-node='expiredebitSource']")).sendKeys("06/22");
      driver.findElement(By.xpath(".//input[@data-qa-node='cvvdebitSource']")).sendKeys("327");
      driver.findElement(By.xpath(".//button[@data-qa-node='submit']")).click();


  }
}












