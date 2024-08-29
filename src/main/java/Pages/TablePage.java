package Pages;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.SQLTimeoutException;

public class TablePage extends BasePage{
    public TablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[41]/a")
    WebElement TablePage;

    @FindBy (id = "table2")
    WebElement table2;

    public String data() {
        TablePage.click();
        String text = table2.getText();
        System.out.println(text);
        return text;
    }
}
