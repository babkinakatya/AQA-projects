import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HomePage(WebDriver driver) {;
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void homeURL(){
        driver.get("https://market.yandex.ru/");
    }

    public static final String CATALOGBUTTONLOCATOR = ".//button[@id = 'catalogPopupButton']";
    public static final String CHAPTERBLOCKLOCATOR = ".//span[text()='%s']/parent::a";
    public static final String PRODUCTPAGELOCATOR = ".//a[text()='%s']";

    public WebElement getCatalogButton(){
        return driver.findElement(By.xpath(CATALOGBUTTONLOCATOR));
    }

    public WebElement getChapter(String name){
        return driver.findElement(By.xpath(String.format(CHAPTERBLOCKLOCATOR, name)));
    }

    public WebElement getProductPage(String name){
        return driver.findElement(By.xpath(String.format(PRODUCTPAGELOCATOR,name)));
    }

    public void moveToLaptopPage(){
        getCatalogButton().click();
        Actions moveMouse = new Actions(getDriver());
        moveMouse.moveToElement((WebElement) getChapter("Компьютеры")).perform();
        getProductPage("Ноутбуки").click();

    }
}
