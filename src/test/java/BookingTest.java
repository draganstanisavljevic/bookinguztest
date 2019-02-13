import io.qameta.allure.Flaky;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;


public class BookingTest extends BaseTest {

    @DataProvider
    public Object[][] testData() {
        //retrive data from
        return new Object[][] {
                //from, to
                {"Киев","Львов"},
                {"Киев","Одесса"},
                {"Киев","Харьков"},
                {"Киев","Мариуполь"}
        };
    }

    @Test
    public void testOpenSite() throws InterruptedException {
        driver.get("https://booking.uz.gov.ua/ru/?from=2200001&to=2218000&date=2019-03-21&time=00%3A00&url=train-list");
        HomePage homePage = new HomePage(driver);
//        homePage.setFrom("Киев");
//        homePage.setTo("Львов");
//        homePage.submit();
        homePage.getTrains().get(2).clickOnTitle();
        Thread.sleep(3000);
    }

    @Test
    public void testOpenSite2() throws InterruptedException {
        driver.get("https://booking.uz.gov.ua/ru/?from=2200001&to=2218000&date=2019-03-21&time=00%3A00&url=train-list");
        HomePage homePage = new HomePage(driver);
//        homePage.setFrom("Киев");
//        homePage.setTo("Львов");
//        homePage.submit();
        homePage.getTrains().get(2).clickOnTitle();
        Thread.sleep(3000);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void testOpenSite3() throws InterruptedException {
        driver.get("https://booking.uz.gov.ua/ru/?from=2200001&to=2218000&date=2019-03-21&time=00%3A00&url=train-list");
        HomePage homePage = new HomePage(driver);
//        homePage.setFrom("Киев");
//        homePage.setTo("Львов");
//        homePage.submit();
        homePage.getTrains().get(2).clickOnTitle();
        Thread.sleep(3000);
    }

    @Test
    @Flaky
    @Issue("DEV-5678")
    public void testOpenSite4() throws InterruptedException {
        driver.get("https://booking.uz.gov.ua/ru/?from=2200001&to=2218000&date=2019-03-21&time=00%3A00&url=train-list");
        HomePage homePage = new HomePage(driver);
//        homePage.setFrom("Киев");
//        homePage.setTo("Львов");
//        homePage.submit();
        homePage.getTrains().get(2).clickOnTitle();
        Thread.sleep(3000);
    }

}
