package basictestng.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin() {
        System.out.println("Login Functionality");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"verifyLogin"})       //Depends on Method
    public void verifyHomePage() {
        System.out.println("Home Page Functionality");
    }

    @Test
    public void verifyCardTransactions() {
        System.out.println("Card Transactions");
    }

    @Test
    public void verifyCashBackOffer() {
        System.out.println("CashBack Offer");
    }
}
