package DemoQA.DemoQATests;

import DemoQA.DemoQABase.BaseTest;
import DemoQA.DemoQAPages.ElementsPage;
import DemoQA.DemoQAPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsPageTextBoxTests extends BaseTest {
@BeforeMethod
    public void setUpElements(){
    driver.manage().window().maximize();
    driver.get(homeURL);
    homePage =new HomePage();
    elementsPage = new ElementsPage();
}
    public void verifyTextBox(){
    assertHomePage();
    scrollIntoView();
    homePage.clickOnElements();
    assertElementsPage();
    elementsPage.clickOnTextBox();
    assertTextBox();
}
@Test (priority = 10)
    public void userCanClickOnTextBox(){
    verifyTextBox();
}
@Test(priority = 20)
    public void userCanNotSubmitWithBlankFields(){
    verifyTextBox();
    elementsPage.clickOnSubmit();
}
@Test(priority = 30)
    public void userCanSubmitWithValidUsername(){
    verifyTextBox();
    for (int i = 1; i < excelReader.getLastRow("TextBox"); i++) {
        String validUsername = excelReader.getStringData("TextBox", i, 0);
        elementsPage.insertUsername(validUsername);
        elementsPage.clickOnSubmit();
        String assertVN= "Name:"+ validUsername;
        Assert.assertEquals(assertVN,elementsPage.resultNameSubmit());
}}
    @Test(priority = 40)
    public void userCanSubmitWithValidEmail(){
    verifyTextBox();
    String validEmail= excelReader.getStringData("TextBox",1,1);
    elementsPage.insertEmail(validEmail);
    elementsPage.clickOnSubmit();
    String assertE= "Email:"+ validEmail;
    Assert.assertEquals(assertE,elementsPage.resultEmailSubmit());
    }
    @Test(priority = 50)
    public void userCanNotSubmitWithInvalidEmail(){
        verifyTextBox();
        for (int i = 1; i < excelReader.getLastRow("TextBox"); i++) {
            String validUsername = excelReader.getStringData("TextBox", 1, 0);
            String invalidEmail= excelReader.getStringData("TextBox",i,2);
            elementsPage.insertUsername(validUsername);
            elementsPage.insertEmail(invalidEmail);
            elementsPage.clickOnSubmit();
            Assert.assertFalse(isDisplayed(elementsPage.emailSubmit));
    }}
    @Test(priority = 60)
    public void userCanSubmitWithValidCurrentAddress(){
    verifyTextBox();
        for (int i = 1; i < excelReader.getLastRow("TextBox"); i++) {
            String validCurrentAddress = excelReader.getStringData("TextBox", i, 3);
            elementsPage.insertCurrentAddress(validCurrentAddress);
            elementsPage.clickOnSubmit();
            String assertCA= "Current Address :"+validCurrentAddress;
            Assert.assertEquals(assertCA,elementsPage.resultCurrentAddress());

    }}
@Test(priority = 70)
    public void userCanSubmitWithValidPermanentAddress(){
    verifyTextBox();
    for (int i = 1; i < excelReader.getLastRow("TextBox"); i++) {
        String validPermanentAddress = excelReader.getStringData("TextBox", i, 4);
        elementsPage.insertPermanentAddress(validPermanentAddress);
        elementsPage.clickOnSubmit();
        String assertPA= "Permananet Address :"+validPermanentAddress;
        Assert.assertEquals(assertPA,elementsPage.resultPermanentAddress());
}}
    @Test(priority = 80)
    public void userCanSubmitWithAllValidData(){
    verifyTextBox();
        String validUsername = excelReader.getStringData("TextBox", 1, 0);
        String validEmail= excelReader.getStringData("TextBox",1,1);
        String validCurrentAddress = excelReader.getStringData("TextBox", 1, 3);
        String validPermanentAddress = excelReader.getStringData("TextBox", 1, 4);
        elementsPage.insertPermanentAddress(validPermanentAddress);
        elementsPage.insertCurrentAddress(validCurrentAddress);
        elementsPage.insertEmail(validEmail);
        elementsPage.insertUsername(validUsername);
        elementsPage.clickOnSubmit();
        Assert.assertTrue(isDisplayed(elementsPage.outputCurrentAddressSubmit));
    }
//   @AfterMethod
//    public void tearDown() {
//
//        driver.;
//    }
}
