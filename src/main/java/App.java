import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class App {

    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://lk.aqsi.ru/login");

        WebElement webElement = driver.findElement(By.name("emailOrPhone"));
        webElement.click();
        webElement.sendKeys("gea+t1@aqsi.ru");

        WebElement webElement1 = driver.findElement(By.name("password"));
        webElement1.click();
        webElement1.sendKeys("Qq123456");
        webElement1.submit();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement webElement2 = driver.findElement(By.xpath("//div[@id=\"app-root\"]/div/div/div/div/div[1]/ul[2]/div[2]/a/div[2]/p"));
        webElement2.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement webElement3 = driver.findElement(By.xpath("//div[3]/div[3]/div/div[1]/a/div/p"));
        webElement3.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement webElement4 = driver.findElement(By.xpath("//div[@id=\"app-root\"]/div/main/header/div[1]/div/div/div[1]/button/span[1]/h5"));
        webElement4.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement webElement5 = driver.findElement(By.xpath("//p[@title=\"Категория3\"]"));
        webElement5.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement webElement6 = driver.findElement(By.xpath("//div[@id=\"app-root\"]/div/main/header/div[1]/div/div/div[4]/a/span[1]/span"));
        webElement6.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement webElement7 = driver.findElement(By.name("name"));
        webElement7.click();
        webElement7.sendKeys("Латте");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement webElement8 = driver.findElement(By.name("price"));
        webElement8.click();
        webElement8.sendKeys("199");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement webElement9 = driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/main/header/div[1]/div/div/div[2]/div/div[3]/button"));
        webElement9.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    //driver.quit();

    }
}
