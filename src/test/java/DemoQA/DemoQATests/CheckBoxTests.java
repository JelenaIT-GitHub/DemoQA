package DemoQA.DemoQATests;

import DemoQA.DemoQABase.BaseTest;
import DemoQA.DemoQAPages.CheckBoxPage;
import DemoQA.DemoQAPages.ElementsPage;
import DemoQA.DemoQAPages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTest {
    @BeforeMethod
    public void setUpCheckBox(){
        driver.manage().window().maximize();
        driver.get(homeURL);
        homePage =new HomePage();
        elementsPage = new ElementsPage();
        checkBoxPage= new CheckBoxPage();
        assertHomePage();
        scrollIntoView();
        homePage.clickOnElements();
        assertElementsPage();

    }

    public void clickOnCheckBoxFromElements(){
        checkBoxPage.clickOnSidebarCheckBox();
        assertCheckBox();

    }
    @Test
    public void userCanCheckBoxForHomeFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnHomeCheckBox();
        assertMarkedHomeFolderCheckBox();

    }
    @Test
    public void userCanExpandHomeFolder()  {
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        assertHomePageExpanded();
    }
    @Test
    public void userCanCollapseHomeFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clilckOnCollaoseHome();
        assertCheckBox();
    }
    @Test
    public void userCanExpandMarkedHomeFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnHomeCheckBox();
        checkBoxPage.clickOnExpandHome();
    }
    @Test
    public void userCanUnheckDesktopFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Desktop");
        checkBoxPage.clickOnFolder("Desktop");
       assertUnchecked();
    }
    @Test
    public void userCanCheckFileNotesFormDesktopFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
       checkBoxPage.clickOnFolder("Notes");
        assertFolderIsMarked(0,"notes");
    }


    @Test
    public void userCanCheckFileCommandsFormDesktopFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Commands");
        assertFolderIsMarked(0,"commands");
    }
@Test
    public void userCanClickOnDocumentsFolder(){
    clickOnCheckBoxFromElements();
    checkBoxPage.clickOnExpandHome();
    checkBoxPage.clickOnFolder("Documents");
    assertFolderIsMarked(0,"documents");
}
@Test
public void userCanClickOnFileWorkSpaceFolder(){
    clickOnCheckBoxFromElements();
    checkBoxPage.clickOnExpandHome();
    checkBoxPage.clickOnFolder("WorkSpace");
    assertFolderIsMarked(0,"workspace");
}
@Test
public void userCanClickOnFileReactFromWorkSpaceFolder(){
    clickOnCheckBoxFromElements();
    checkBoxPage.clickOnExpandHome();
    checkBoxPage.clickOnFolder("React");
    assertFolderIsMarked(0,"react");

}
@Test
    public void userCanClickOnFileAngularFromWorkSpaceFolder(){
    clickOnCheckBoxFromElements();
    checkBoxPage.clickOnExpandHome();
    checkBoxPage.clickOnFolder("Angular");
    assertFolderIsMarked(0,"angular");}

@Test
public void userCanClickOnFileVeuFromWorkSpaceFolder(){
    clickOnCheckBoxFromElements();
    checkBoxPage.clickOnExpandHome();
    checkBoxPage.clickOnFolder("Veu");
    assertFolderIsMarked(0,"veu");}

    @Test
    public void userCanClickOFilesFromOfficeFrom(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        for (int i = 1; i <= excelReader.getLastRow("CheckBox"); i++) {
            String folder = excelReader.getStringData("CheckBox", i, 0);
            String assertFolder= excelReader.getStringData("CheckBox",i,1);
//            int index=excelReader.getIntegerData("CheckBox",i,2);
       checkBoxPage.clickOnFolder(folder);
       assertFolderIsMarked(0,assertFolder);
       checkBoxPage.clickOnFolder(folder); }
    }

@Test
public void userCanClickOnDownloadsFolder(){
    clickOnCheckBoxFromElements();
    checkBoxPage.clickOnExpandHome();
    checkBoxPage.clickOnFolder("Downloads");
    assertFolderIsMarked(0,"downloads");}

@Test
public void userCanClickOnFileWordFromDownloads(){
    clickOnCheckBoxFromElements();
    checkBoxPage.clickOnExpandHome();
    scrollIntoView();
    checkBoxPage.clickOnFolder("Word File.doc");
    assertFolderIsMarked(0,"wordFile");}

    @Test
    public void userCanClickOnFileExcelFromDownloads(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        scrollIntoView();
        checkBoxPage.clickOnFolder("Excel File.doc");
        assertFolderIsMarked(0,"excelFile");}

    @Test
    public void userCanUnceckDesktopFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Desktop");
        checkBoxPage.clickOnFolder("Desktop");
        assertUnchecked();
    }
    @Test
    public void userCanUncheckFileNotesFormDesktopFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Notes");
        checkBoxPage.clickOnFolder("Notes");
        assertUnchecked();
    }


    @Test
    public void userCanUncheckFileCommandsFormDesktopFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Commands");
        checkBoxPage.clickOnFolder("Commands");
        assertUnchecked();
    }
    @Test
    public void userCanUncheckDocumentsFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Documents");
        checkBoxPage.clickOnFolder("Documents");
        assertUnchecked();
    }
    @Test
    public void userCanUncheckFileWorkSpaceFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("WorkSpace");
        checkBoxPage.clickOnFolder("WorkSpace");
        assertUnchecked();
    }
    @Test
    public void userCanUncheckFileReactFromWorkSpaceFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("React");
        checkBoxPage.clickOnFolder("React");
        assertUnchecked();

    }
    @Test
    public void userCanUncheckFileAngularFromWorkSpaceFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Angular");
        checkBoxPage.clickOnFolder("Angular");
        assertUnchecked();}
    @Test
    public void userCanUncheckFileVeuFromWorkSpaceFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Veu");
        checkBoxPage.clickOnFolder("Veu");
        assertUnchecked();
    }

    @Test
    public void userCanUncheckFilesFromOfficeFrom(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        for (int i = 1; i <= excelReader.getLastRow("CheckBox"); i++) {
            String folder = excelReader.getStringData("CheckBox", i, 0);
            String assertFolder= excelReader.getStringData("CheckBox",i,1);
//            int index=excelReader.getIntegerData("CheckBox",i,2);
            checkBoxPage.clickOnFolder(folder);
            assertFolderIsMarked(0,assertFolder);
            checkBoxPage.clickOnFolder(folder);
            assertUnchecked();
        }
    }

    @Test
    public void userCanUncheckDownloadsFolder(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnFolder("Downloads");
        checkBoxPage.clickOnFolder("Downloads");
        assertUnchecked();
    }

    @Test
    public void userCanUncheckFileWordFromDownloads(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        scrollIntoView();
        checkBoxPage.clickOnFolder("Word File.doc");
        checkBoxPage.clickOnFolder("Word File.doc");
        assertUnchecked();
    }

    @Test
    public void userCanUncheckFileExcelFromDownloads(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        scrollIntoView();
        checkBoxPage.clickOnFolder("Excel File.doc");
        checkBoxPage.clickOnFolder("Excel File.doc");
        assertUnchecked();
    }

    @Test
    public void allFoldersAndFilesAreChecked(){
        clickOnCheckBoxFromElements();
        checkBoxPage.clickOnExpandHome();
        checkBoxPage.clickOnHomeCheckBox();
        checkBoxPage.clickOnExpandHome();
        for (int i = 0; i < checkBoxPage.success.size(); i++) {
            checkBoxPage.success.get(i).getText();
            String folderAndFiles= excelReader.getStringData("CheckBoxAll", i, 0);
            Assert.assertEquals(checkBoxPage.success.get(i).getText(),folderAndFiles);
            break;
        }
    }
  /*  @AfterMethod
    public void tearDown() {
       driver.quit();}
*/
}
