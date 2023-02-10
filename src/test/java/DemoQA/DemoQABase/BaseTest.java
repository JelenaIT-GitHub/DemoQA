package DemoQA.DemoQABase;

import DemoQA.DemoQAPages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homeURL;
    public HomePage homePage;
    public ElementsPage elementsPage;
    public FormsPage formsPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    JavascriptExecutor js;
@BeforeClass
    public void setUp() throws IOException {

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    excelReader=new ExcelReader("src/test/java/DemoQA/TestData.xlsx");
    homeURL = excelReader.getStringData("URL", 1, 0);
}
    public void waitForVisibility(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickability(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public boolean isDisplayed(WebElement element) {
        boolean webelement = false;
        try {
            webelement = element.isDisplayed();
        } catch (Exception e) {

        }
        return webelement;
    }

    public void scrollIntoView() {
        JavascriptExecutor js  = (JavascriptExecutor) driver;
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public void assertHomePage(){
        String expectedURL = excelReader.getStringData("URL", 1,0);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(isDisplayed(homePage.homeBanner));
    }

    public void assertElementsPage(){
        String expectedURL = excelReader.getStringData("URL", 1,1);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertFalse(isDisplayed(homePage.homeBanner));
        Assert.assertEquals(elementsPage.headerText(),"Elements");

    }
    public void assertFormsPage(){
        String expectedURL = excelReader.getStringData("URL", 2,1);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertFalse(isDisplayed(homePage.homeBanner));
       Assert.assertEquals(formsPage.textHeaderForms(),"Forms");
    }
public void assertAlertsPage(){
    String expectedURL = excelReader.getStringData("URL", 3,1);
    Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    Assert.assertFalse(isDisplayed(homePage.homeBanner));
    Assert.assertEquals(elementsPage.headerText(),"Alerts, Frame & Windows");

}
public void assertWidgetsPage(){
    String expectedURL = excelReader.getStringData("URL", 4,1);
    Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    Assert.assertFalse(isDisplayed(homePage.homeBanner));
    Assert.assertEquals(formsPage.textHeaderForms(),"Widgets");
}
public void assertInteractionsPage(){
    String expectedURL = excelReader.getStringData("URL", 5,1);
    Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    Assert.assertFalse(isDisplayed(homePage.homeBanner));
    Assert.assertEquals(formsPage.textHeaderForms(),"Interactions");
}
public void assertBookStorePage(){
    String expectedURL = excelReader.getStringData("URL", 6,1);
    Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    Assert.assertFalse(isDisplayed(homePage.homeBanner));
    Assert.assertEquals(formsPage.textHeaderForms(),"Book Store");
}
public void assertToolsQA(){
    ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(listaTabova.get(1));
    Assert.assertNotEquals(driver.getCurrentUrl(),homeURL);
    System.out.println(driver.getCurrentUrl());
    System.out.println(homeURL);
}

public void assertTextBox(){
    Assert.assertEquals(elementsPage.usernameText(),"Full Name");
    String expectedURL = excelReader.getStringData("URL", 7,1);
    Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
}
public void assertCheckBox(){
    Assert.assertTrue(isDisplayed(checkBoxPage.homeCheckBox));
    String expectedURL= excelReader.getStringData("URL",8,1);
    Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
}
public void assertMarkedHomeFolderCheckBox(){
  //  Assert.assertTrue(isDisplayed(checkBoxPage.result));
    Assert.assertTrue(isDisplayed(checkBoxPage.markedCheckBox));
}
public void assertHomePageExpanded() {
    Assert.assertTrue(isDisplayed(checkBoxPage.result));
}
public void assertHomePageCollapsed(){
    Assert.assertFalse(isDisplayed(checkBoxPage.result));
}
public void assertFolderIsMarked(Integer x,String folder){
    for (int i = 0; i < checkBoxPage.success.size(); i++) {
        checkBoxPage.success.get(i).getText();
        Assert.assertEquals(checkBoxPage.success.get(x).getText(),folder);
        break;
    }
    String expectedURL= excelReader.getStringData("URL",8,1);
    Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
}
//public void assertFolder(){
//    Assert.assertTrue(isDisplayed(checkBoxPage.successfullyMarked("documents")));
//    String []arr= new String [2];
//    arr[0]=actual;
//    arr[1]=expected;
  //  return new String[]{actual,expected};
//    for (int i = 0; i < checkBoxPage.success.size(); i++) {
//        if (checkBoxPage.success.get(i).getText().equals("Desktop")) {
//            checkBoxList.get(i).click();
//            break;
//        }
//        Assert.assertTru;
//    }
public void assertFolderIsUnmarked(String folder){
    for (int i = 0; i < checkBoxPage.success.size(); i++) {
        checkBoxPage.success.get(i).getText();
        Assert.assertNotEquals(checkBoxPage.success.get(i).getText(),folder);
        break;
    }
}
public void assertUnchecked(){
    Assert.assertFalse(isDisplayed(checkBoxPage.unchecked));
}
    public void assertRadioButton(){
       Assert.assertEquals(elementsPage.headerText(),"Radio Button");
        String expectedURL= excelReader.getStringData("URL",9,1);
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
    }

    public void assertRadioButtonYes(){
     Assert.assertTrue(isDisplayed(radioButtonPage.buttonSuccess));
     Assert.assertEquals(radioButtonPage.buttonIsSelected(),"Yes");

    }

    public void assertRadioButtonImpressive(){
        Assert.assertTrue(isDisplayed(radioButtonPage.buttonSuccess));
        Assert.assertEquals(radioButtonPage.buttonIsSelected(),"Impressive");

    }

    public void assertRadioButtonNo(){
        Assert.assertFalse(isDisplayed(radioButtonPage.buttonSuccess));
        Assert.assertTrue(isDisplayed(radioButtonPage.buttonNo));
    }

}



