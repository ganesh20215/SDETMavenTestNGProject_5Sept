package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodExample(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();  //UpCasting
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new FirefoxDriver();  //UpCasting
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("Webdriver.edge.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new EdgeDriver();  //UpCasting
        } else {
            throw new RuntimeException("Please select the correct browser");
        }
    }

    @Parameters({"username", "password"})
    @Test()
    public void verifyLoginWithValidUsernamePassword(String userName, String password) throws InterruptedException {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        WebElement loginElement = driver.findElement(By.id("login1"));
        WebElement passwordElement = driver.findElement(By.id("password"));
        loginElement.sendKeys(userName);
        passwordElement.sendKeys(password);
        Thread.sleep(4000);
        driver.close();
    }


    @Parameters({"invalidUsername", "password"})
    @Test()
    public void verifyLoginWithInValidUsernameAndValidPassword(String inValidUserName, String password) throws InterruptedException {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        WebElement loginElement = driver.findElement(By.id("login1"));
        WebElement passwordElement = driver.findElement(By.id("password"));
        loginElement.sendKeys(inValidUserName);
        passwordElement.sendKeys(password);
        Thread.sleep(4000);
        driver.close();
    }

}
