package basicmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleMaven {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
