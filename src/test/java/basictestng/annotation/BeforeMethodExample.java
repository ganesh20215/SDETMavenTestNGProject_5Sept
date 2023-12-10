package basictestng.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeMethodExample{

    @BeforeSuite
    public void beforeSuiteExample(){
        System.out.println("Before Suite Example 2");
    }

    @BeforeTest
    public void beforeTestExample(){
        System.out.println("This is a before Test method of BeforeMethodExample");
    }

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class method of BeforeMethodExample");
    }

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("Before Method");
    }

    @Test(groups = "smoke")
    public void verifyAbhibusWebsite() {
        System.out.println("Test case 1");
    }

    @Test
    public void verifyEdsoWebsite() {
        System.out.println("Test case 2");
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class method of BeforeMethodExample");
    }

    @AfterTest
    public void afterTestExample(){
        System.out.println("This is an After Test method of BeforeMethodExample");
    }

    @AfterSuite
    public void AfterSuiteExample(){
        System.out.println("After Suite Example 2");
    }
}
