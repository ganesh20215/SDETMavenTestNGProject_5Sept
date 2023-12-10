package basictestng.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyHomePage(){
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String webSiteTitle = driver.getTitle();
        System.out.println(10/0);
        Assert.assertTrue(driver.findElement(By.xpath("//u[text()='Forgot Password?']")).isDisplayed());
        Assert.assertEquals(webSiteTitle, "Rediffmail", "Title of the website should be Rediffmail");

        System.out.println("How Are you..");
        driver.close();
    }
}
