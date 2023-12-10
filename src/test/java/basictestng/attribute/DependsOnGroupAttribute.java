package basictestng.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupAttribute {

    @Test(groups = {"smoke"})
    public void verifyLogin() {
        System.out.println("Login Functionality");
        Assert.assertTrue(false);
    }

    @Test(dependsOnGroups = {"smoke"})       //Depends on smoke
    public void verifyHomePage() {
        System.out.println("Home Page Functionality");
    }

    @Test(groups = {"sanity"})
    public void verifyCardTransactions() {
        System.out.println("Card Transactions");
    }

    @Test
    public void verifyCashBackOffer() {
        System.out.println("CashBack Offer");
    }
}
