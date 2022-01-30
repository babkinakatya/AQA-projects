import base.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class YandexMarketTest extends BaseTest {

    public static final String ITEMLISTLOCATOR = ".//article[@data-autotest-id='product-snippet']";
    public static final String SEARCHLOADER = ".//div[@data-tid='67d9be0a']";
    public static final String ITEMSPRICELOCATOR = ".//div[@data-zone-name='price']//span[@data-autotest-currency='₽']/span[1]";

    @Test
    public void testSearchLaptop() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.homeURL();
        home.moveToLaptopPage();

        LaptopPage laptop = new LaptopPage(driver);
        laptop.inputSearchFilters();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SEARCHLOADER)));

        List<WebElement> itemList = driver.findElements((By.xpath(ITEMLISTLOCATOR)));

        for (int i = 0; i < itemList.size(); i++){
            Assert.assertTrue(itemList.get(i).getText().contains("Lenovo"));
        }

        List<WebElement> itemPriceList = driver.findElements(By.xpath(ITEMSPRICELOCATOR));
        for (int i = 0; i < itemPriceList.size(); i++){

            String price = itemPriceList.get(i).getText().replaceAll(" ","");
            int priceint = Integer.parseInt(price);

            Assert.assertTrue(30000 >= priceint, "Price is less than 30 000");
            Assert.assertTrue(25000 <= priceint, "Price is more than 25 000");
            }
            }
        }









