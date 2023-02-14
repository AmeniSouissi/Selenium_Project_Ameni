import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Gestion_Iframe {
    public static void main(String[] args) throws InterruptedException {

                 WebDriverManager.chromedriver().setup();
                 WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
                WebElement myframe = driver.findElement(By.name("packageListFrame"));
                driver.switchTo().frame(myframe);
                Thread.sleep(400);
                driver.findElement(By.linkText("org.openqa.selenium")).click();
                Thread.sleep(400);

                WebElement myframe2 = driver.findElement(By.name("packageFrame"));
                driver.switchTo().frame(myframe2);
                Thread.sleep(400);
                driver.findElement(By.linkText("WebDriver")).click();


                driver.close();

            }
        }
