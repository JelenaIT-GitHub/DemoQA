package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends BaseTest {

    public FormsPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "main-header")
    WebElement headerForms;

    public String textHeaderForms(){
       return headerForms.getText();
    }
}
