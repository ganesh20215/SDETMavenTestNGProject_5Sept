package failtestscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailScriptsExecution {

   @Test
    public void verifyTestCase_1(){
        System.out.println("Verify Test Case 1");
    }

   @Test
    public void verifyTestCase_2(){
        Assert.assertTrue(true);
        System.out.println("Verify Test Case 2");
    }

   @Test
    public void verifyTestCase_3(){
        Assert.assertTrue(false);
        System.out.println("Verify Test Case 3");
    }

   @Test
    public void verifyTestCase_4(){
        System.out.println("Verify Test Case 4");
    }

   @Test
    public void verifyTestCase_5(){
        System.out.println("Verify Test Case 5");
    }
}
