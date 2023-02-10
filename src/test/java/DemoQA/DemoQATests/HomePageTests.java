package DemoQA.DemoQATests;

import DemoQA.DemoQABase.BaseTest;
import DemoQA.DemoQAPages.ElementsPage;
import DemoQA.DemoQAPages.FormsPage;
import DemoQA.DemoQAPages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HomePageTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get(homeURL);
        homePage =new HomePage();
        elementsPage = new ElementsPage();
        formsPage= new FormsPage();
    }

    @Test
    public void userCanClickOnElementsCard(){
        assertHomePage();
        scrollIntoView();
        homePage.clickOnElements();
        assertElementsPage();
    }
    @Test
    public void userCanClickOnFormsCard(){
        assertHomePage();
        scrollIntoView();
        homePage.clickOnForms();
        assertFormsPage();
    }
@Test
    public void userCanClickOnAlertsCard(){
    assertHomePage();
    scrollIntoView();
    homePage.clickOnAlerts();
    assertAlertsPage();
}
@Test
    public void userCanClickOnInteractionsCard(){
        assertHomePage();
        scrollIntoView();
        homePage.clickOnInteractions();
        assertInteractionsPage();
}
@Test
public void userCanClickOnWidgetsCard(){
        assertHomePage();
        scrollIntoView();
        homePage.clickOnWidgets();
        assertWidgetsPage();
}
@Test
    public void userCanClickOnBookStoreCard(){
        assertHomePage();
        scrollIntoView();
        homePage.clickOnBookstore();
        assertBookStorePage();
}
@Test
    public void userCanClickOnHomeBanner(){
        assertHomePage();
        homePage.clickOnHomeBanner();
        assertToolsQA();
}

}
