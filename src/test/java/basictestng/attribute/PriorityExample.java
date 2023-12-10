package basictestng.attribute;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(groups = "smoke")
    public void testCaseZ(){
        System.out.println("Test Case Z");
    }

    @Test(priority = -1)
    public void testCaseB(){
        System.out.println("Test Case B");
    }

    @Test(priority = 1)
    public void testCaseX(){
        System.out.println("Test Case X");
    }

    @Test(priority = 'A')
    public void testCaseF(){
        System.out.println("Test Case F");
    }

    @Test(priority = 5)
    public void testCaseD(){
        System.out.println("Test Case D");
    }

    @Test(priority = -6)
    public void testCaseA(){
        System.out.println("Test Case A");
    }
}
