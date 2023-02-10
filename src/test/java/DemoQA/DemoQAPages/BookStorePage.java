package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage extends BaseTest {
    public BookStorePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "main-header")
    WebElement headerBookStore;
    public String headerBookStore(){
        return headerBookStore.getText();
    }
}
