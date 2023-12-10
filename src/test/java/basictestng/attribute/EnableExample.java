package basictestng.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableExample {

    @Test
    public void verifyLogin() {
        System.out.println("Login Functionality");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"verifyLogin"}, alwaysRun = true)
    public void verifyHomePage() {
        System.out.println("Home Page Functionality");
    }

    @Test(description = "Verify credit card transaction")
    public void verifyCardTransactions() {
        System.out.println("Card Transactions");
    }

    @Test(groups = "smoke")
    public void verifyCashBackOffer() {
        System.out.println("CashBack Offer");
    }
}
