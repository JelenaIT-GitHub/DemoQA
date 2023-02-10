package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CheckBoxPage extends BaseTest {

    public CheckBoxPage() {
        PageFactory.initElements(driver,this);
    }
public @FindBy(className = "rct-checkbox")
    WebElement homeCheckBox;
    public @FindBy(className = "rct-title")
    List<WebElement> checkBoxList;

    public @FindBy(className = "text-success")
    List<WebElement> success;

    public @FindBy(id = "item-1")
    WebElement sidebarCheckBox;
    public @FindBy(id = "tree-node")
    WebElement result;
   public @FindBy(css = ".rct-option.rct-option-expand-all")
   WebElement expandHome;

   public @FindBy(css = ".rct-option.rct-option-collapse-all")
   WebElement collapseHome;

   public @FindBy(css = ".rct-icon.rct-icon-check")
   WebElement markedCheckBox;


   public @FindBy(id = "result")
   WebElement unchecked;

//--------------------------------------

    public void clickOnHomeCheckBox(){
        homeCheckBox.click();
    }

    public void clickOnSidebarCheckBox(){
        sidebarCheckBox.click();
    }

    public String resultText(){
        return result.getText();
    }

    public void clickOnExpandHome(){
        expandHome.click();
    }

    public void clilckOnCollaoseHome(){
        collapseHome.click();
    }
  public void clickOnFolder(String folder){
      for (int i = 0; i < checkBoxList.size(); i++) {
          if (checkBoxList.get(i).getText().equals(folder)) {
              checkBoxList.get(i).click();
              break;
          }
      }
  }

}
