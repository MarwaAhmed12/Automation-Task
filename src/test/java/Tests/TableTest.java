package Tests;

import Pages.TablePage;
import org.testng.annotations.Test;


public class TableTest extends BaseTest {
    TablePage tablePage;



    @Test()
    public void TableTest() {
        tablePage = new TablePage(driver);
        tablePage.data();


    }
}
