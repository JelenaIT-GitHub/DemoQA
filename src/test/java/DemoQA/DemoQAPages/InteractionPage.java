package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionPage extends BaseTest {
    public InteractionPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "main-header")
    WebElement headerInteraction;


    public String headerInteraction(){
        return headerInteraction.getText();
    }
}
