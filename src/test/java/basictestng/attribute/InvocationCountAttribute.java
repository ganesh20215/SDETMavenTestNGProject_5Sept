package basictestng.attribute;

import org.testng.annotations.Test;

public class InvocationCountAttribute {


    @Test(invocationCount = 500, invocationTimeOut = 1)
    public void amazonTest(){
        System.out.println("Amazon Test");
    }
}
