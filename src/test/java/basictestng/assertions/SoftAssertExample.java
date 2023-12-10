package basictestng.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifyHomePage(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String webSiteTitle = driver.getTitle();
        softAssert.assertFalse(driver.findElement(By.xpath("//u[text()='Forgot Password?']")).isDisplayed());
        softAssert.assertEquals(webSiteTitle, "rediffmail", "Title of the website should be Rediffmail");
        System.out.println("How Are you..");
        softAssert.assertAll();
        driver.close();
    }
}
