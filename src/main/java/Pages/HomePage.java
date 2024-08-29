package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id="flash")
    WebElement SecureArea;

    @FindBy (xpath = "//*[@id=\"content\"]/div/a/i")
    WebElement LogoutButton;

    public void logout() {

        String actual= SecureArea.getText();
        System.out.println(actual);
        String expect = "You logged into a secure area!"  ;
        System.out.println(expect);
        assertTrue(actual.contains(expect));

        LogoutButton.click();

    }

}