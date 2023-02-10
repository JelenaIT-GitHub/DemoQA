package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ElementsPage extends BaseTest {
    public ElementsPage() {
        initElements(driver, this);
    }

    public @FindBy(className = "main-header")
    WebElement headerElements;
    public @FindBy(id = "item-0")
    WebElement textBox;
    public @FindBy(id = "userName-label")
    WebElement username;
    public @FindBy(id = "userName")
    WebElement userNamePlacehold;
    public @FindBy(id = "submit")
    WebElement submitButton;

    public @FindBy(id = "name")
    WebElement nameSubmit;

    public @FindBy(id = "userEmail")
    WebElement emailPlaceholder;

    public @FindBy(id = "email")
    WebElement emailSubmit;

    public @FindBy(id = "currentAddress")
    WebElement currentAddressPlaceholder;

    public @FindBy(id = "output")
    WebElement outputCurrentAddressSubmit;

    public @FindBy(id = "permanentAddress")
    WebElement permanentAddressPlaceholder;
//------------------------------------------------------------
    public String headerText() {
        return headerElements.getText();
    }

    public void clickOnTextBox() {
        textBox.click();
    }

    public String usernameText() {
        return username.getText();
    }

    public void clickOnSubmit() {
        scrollIntoView();
        submitButton.click();
    }

    public void insertUsername(String username) {
        userNamePlacehold.clear();
        userNamePlacehold.sendKeys(username);
    }

    public String resultNameSubmit(){
        return nameSubmit.getText();
    }
    public void insertEmail(String email) {
        emailPlaceholder.clear();
        emailPlaceholder.sendKeys(email);
    }

    public String resultEmailSubmit(){
        return emailSubmit.getText();
    }
    public void insertCurrentAddress(String currentAddress) {
        currentAddressPlaceholder.clear();
       currentAddressPlaceholder.sendKeys(currentAddress);
    }

    public String resultCurrentAddress(){
        return outputCurrentAddressSubmit.getText();
    }
    public void insertPermanentAddress(String permanentAddress){
        permanentAddressPlaceholder.clear();
        permanentAddressPlaceholder.sendKeys(permanentAddress);
    }
public String resultPermanentAddress(){
        return outputCurrentAddressSubmit.getText();
}
}
