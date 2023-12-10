package basictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test(groups = "smoke")
    public void verifyAbhibusWebsite() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test(groups = "smoke")
    public void verifyEdsoWebsite() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://edso.in/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test(groups = "smoke")
    public void verifyRediffmailWebsite() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test(groups = "smoke")
    public void verifyFacebookWebsite() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }

}
