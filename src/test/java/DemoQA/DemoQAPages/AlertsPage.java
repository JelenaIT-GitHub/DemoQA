package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BaseTest {
    public AlertsPage() { PageFactory.initElements(driver,this);
    }

    public @FindBy(className = "main-header")
    WebElement headerAlerts;

    public String headerTextElements(){
        return headerAlerts.getText();
    }
}
