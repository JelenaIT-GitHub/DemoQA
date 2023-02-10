package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsPage extends BaseTest {
    public WidgetsPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "main-header")
    WebElement headerWidgets;

    public String textHeaderWidgets(){
        return headerWidgets.getText();
    }
}
