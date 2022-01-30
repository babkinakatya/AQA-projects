import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class LaptopPage extends BaseTest {

    public static final String MANUFACTURERBLOCATOR = ".//span[text()='%s']/parent::div";
    public static final String PRICEFROMLOCATOR = ".//input[@id='glpricefrom']";
    public static final String PRICETOLOCATOR = ".//input[@id='glpriceto']";

    public LaptopPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getManufacturer(String name){
        return driver.findElement(By.xpath(String.format(MANUFACTURERBLOCATOR, name)));
    }

    public WebElement getPriceFrom(){
        return driver.findElement(By.xpath(PRICEFROMLOCATOR));
    }

    public WebElement getPriceTo(){
        return driver.findElement(By.xpath(PRICETOLOCATOR));
    }

    public void inputSearchFilters(){
        TestUtils.scrollClick(driver, getManufacturer("Lenovo"));
        getPriceFrom().click();
        getPriceFrom().sendKeys("25000");
        getPriceTo().sendKeys("30000");
    }
}

