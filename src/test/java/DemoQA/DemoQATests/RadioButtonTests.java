package DemoQA.DemoQATests;

import DemoQA.DemoQABase.BaseTest;
import DemoQA.DemoQAPages.CheckBoxPage;
import DemoQA.DemoQAPages.ElementsPage;
import DemoQA.DemoQAPages.HomePage;
import DemoQA.DemoQAPages.RadioButtonPage;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTest {
    @BeforeMethod
    public void setUpRadioButton(){
        driver.manage().window().maximize();
        driver.get(homeURL);
        homePage =new HomePage();
        elementsPage = new ElementsPage();
        checkBoxPage= new CheckBoxPage();
        radioButtonPage= new RadioButtonPage();
        assertHomePage();
        scrollIntoView();
        homePage.clickOnElements();}
    public void clickOnRadioButtonFromElements(){
       radioButtonPage.clickOnRadioButton();
        assertRadioButton();
}
@Test
    public void userCanSelectRadioButtonYes()  {
        clickOnRadioButtonFromElements();
        radioButtonPage.clickOnButton("Yes");
        assertRadioButtonYes();
}
@Test
    public void userCanSelectRadioButtonImpressive()  {
        clickOnRadioButtonFromElements();
        radioButtonPage.clickOnButton("Impressive");
        assertRadioButtonImpressive();
    }

    @Test
    public void verifyRadioButtonNoIsDisabled(){
        clickOnRadioButtonFromElements();
        radioButtonPage.clickOnRadioButtonNo();
        assertRadioButtonNo();
    }

    @Test
    public void userCanNotUnselectYesButton(){
        clickOnRadioButtonFromElements();
        radioButtonPage.clickOnButton("Yes");
        radioButtonPage.clickOnButton("Yes");
        assertRadioButtonYes();
    }
    @Test
    public void userCanNotUnselectRadioButtonImpressive()  {
        clickOnRadioButtonFromElements();
        radioButtonPage.clickOnButton("Impressive");
        radioButtonPage.clickOnButton("Impressive");
        assertRadioButtonImpressive();
    }

    @Test
    public void userCanNotSelectMultipleRadioButtons(){
        clickOnRadioButtonFromElements();
        radioButtonPage.clickOnButton("Impressive");
        radioButtonPage.clickOnButton("Yes");
        assertRadioButtonYes();
        Assert.assertNotEquals(radioButtonPage.buttonIsSelected(),"Impressive");
    }

 /*   @AfterMethod
    public void tearDown() {

       driver.close();
   }*/
}
