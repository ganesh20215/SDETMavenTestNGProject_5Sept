package basictestng.annotation;

import org.testng.annotations.*;

public class BeforeClassAfterClassExample {

    @BeforeSuite
    public void beforeSuiteExample(){
        System.out.println("Before Suite Example 1");
    }

    @BeforeTest
    public void beforeTestExample(){
        System.out.println("This is a before Test method of BeforeClassAfterClassExample");
    }

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class of BeforeClassAfterClassExample");
    }

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("Before Method");
    }

    @Test
    public void verifyTestCase1() {
        System.out.println("verify  case 1");
    }

/*    @Test(groups = "smoke")
    public void verifyTestCase2() {
        System.out.println("Test case 2");
    }*/

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class method of BeforeClassAfterClassExample");
    }
    @AfterTest
    public void afterTestExample(){
        System.out.println("This is an After Test method of BeforeClassAfterClassExample");
    }

    @AfterSuite
    public void AfterSuiteExample(){
        System.out.println("After Suite Example 1");
    }
}
