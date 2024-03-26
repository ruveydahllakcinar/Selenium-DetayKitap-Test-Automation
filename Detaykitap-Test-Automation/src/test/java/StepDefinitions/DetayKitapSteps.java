package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DetayKitapSteps {
    WebDriver driver;

    @Given("open in detaykitap pages")
    public void openInDetaykitapPages() {
        WebDriverManager.firefoxdriver().setup(); // Firefox WebDriver'ını yapılandırın
        driver = new FirefoxDriver(); // Firefox WebDriver'ı başlatın
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("https://detaykitap.com.tr/");
    }
    @When("click search box")
    public void clickSearchBox() {
        driver.findElement(By.cssSelector(".header-extras [name='s']")).click();

    }

    @When("Write the name of the book")
    public void writeTheNameOfTheBook() {
        driver.findElement(By.className("search-field")).sendKeys("VATANDAŞLIK 25X15 DENEME SINAVI- SAİT ZAMAN");

    }

    @When("click search button")
    public void clickSearchButton() {
        driver.findElement(By.cssSelector(".header-extras [name='s']")).sendKeys(Keys.ENTER);
    }

    @Then("add product to cart")
    public void addProductToCart() {
        driver.findElement(By.cssSelector("[name='add-to-cart']")).click();

        goToPaymentPages();
    }

    @Given("go to payment pages")
    public void goToPaymentPages() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.className("checkout-button")).click();
        enterNameInput();
    }

    @When("enter name input")
    public void enterNameInput() {
        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("Ruveyda Hilal");
        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys(Keys.ENTER);
        enterSurnameInput();
    }

    @When("enter surname input")
    public void enterSurnameInput() {
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("Akçınar");
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys(Keys.ENTER);
        enterAddressInput();
    }

    @When("enter address input")
    public void enterAddressInput() {
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("Deneme deneme");
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys(Keys.ENTER);
        enterZipcode();
    }

    @When("enter zipcode")
    public void enterZipcode() {
        driver.findElement(By.cssSelector("#billing_postcode")).sendKeys("81000");
        driver.findElement(By.cssSelector("#billing_postcode")).sendKeys(Keys.ENTER);
        enterDistrict();
    }

    @When("enter district")
    public void enterDistrict() {

        driver.findElement(By.cssSelector("#billing_city")).sendKeys("Orhangazi");
        driver.findElement(By.cssSelector("#billing_city")).sendKeys(Keys.ENTER);
        enterPhoneNumber();

    }

    @When("enter city")
    public void enterCity() {

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(".select2-selection__rendered")));
//        element.sendKeys("Denizli");
//        element.click();
//        enterPhoneNumber();

    }

    @When("enter phone number")
    public void enterPhoneNumber() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        driver.findElement(By.cssSelector("#billing_phone")).sendKeys("5351122121");
        driver.findElement(By.cssSelector("#billing_phone")).sendKeys(Keys.ENTER);
        enterEmailaddress();
    }

    @When("enter emailaddress")
    public void enterEmailaddress() {
        driver.findElement(By.cssSelector("#billing_email")).sendKeys("deneme@gmail.com");
        driver.findElement(By.cssSelector("#billing_email")).sendKeys(Keys.ENTER);
        agreeTermsAndConditions();
    }

    @When("agree terms and conditions")
    public void agreeTermsAndConditions() {
        driver.findElement(By.cssSelector("#woocommerce-terms-and-conditions-checkbox-text")).click();
        enterEmailaddress();
    }

    @Then("click accept order")
    public void clickAcceptOrder() {
        driver.findElement(By.xpath("//button[@id='place_order']")).click();

    }

//    @After
//    public  void quitPage(){
//        driver.quit();
//    }


}
