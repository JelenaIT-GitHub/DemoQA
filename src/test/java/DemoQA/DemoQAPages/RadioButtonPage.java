package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class RadioButtonPage extends BaseTest {

    public RadioButtonPage() {
        PageFactory.initElements(driver, this);
    }

  public   @FindBy(id = "item-2")
    WebElement sidebarRadioButton;

  public @FindBy(className = "custom-control-label") List<WebElement> buttons;

  public @FindBy(className = "text-success")
  WebElement buttonSuccess;

  public @FindBy (css = ".custom-control-label.disabled")
  WebElement buttonNo;

    //------------------------------------------------
    public void clickOnRadioButton() {
        sidebarRadioButton.click();
    }

    public void clickOnButton(String button)  {
        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).getText().equals(button)) {
                buttons.get(i).click();
                break;
            }
        }

    }
    public String buttonIsSelected(){
       return  buttonSuccess.getText();

    }
    public void clickOnRadioButtonNo(){
        buttonNo.click();
    }
}