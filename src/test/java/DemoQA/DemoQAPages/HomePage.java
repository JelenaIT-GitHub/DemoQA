package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseTest {
   public HomePage() {
       PageFactory.initElements(driver,this);
  }
//List<WebElement> cards;
  public @FindBy(className = "card-body")
   List<WebElement> cards;

  public @FindBy(className = "home-banner")
   WebElement homeBanner;


  /*  public List<WebElement> getCards() {
        return driver.findElements(By.className("card-body"));
    }
*/
    //----------------------------------

    public void clickOnElements() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Elements")) {
                cards.get(i).click();
                break;
            }
        }
    }


    public void clickOnForms() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Forms")) {
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickOnAlerts() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Alerts, Frame & Windows")) {
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickOnWidgets() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Widgets")) {
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickOnInteractions() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Interactions")) {
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickOnBookstore() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Book Store Application")) {
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickOnCard(String cardName) {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals(cardName)) {
                cards.get(i).click();
                break;
            }
        }
    }
public void clickOnHomeBanner(){
        homeBanner.click();
}


}
