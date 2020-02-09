import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    private static final String signup_css = "a[name='Practo login']";
    private static final String name_css = "div.nav-items.u-d-trigger.dropdown-toggle.push-droparrow > span > span.user_info_top";
    private static String doctor_css = "#root > div > div > div.global-nav-bar > div.practo_GlobalNavigation > div.navbar.desktop.en > div > div.nav-mid > div:nth-child(1) > a > div.product-tab__title";
    private static String pharmacy_css = "#root > div > div > div.global-nav-bar > div.practo_GlobalNavigation > div.navbar.desktop.en > div > div.nav-mid > div:nth-child(3) > a > div.product-tab__title";
    private static String diagnostic_xpath = "/html/body/div[1]/div[3]/div/div[2]/div[1]/a/div[2]";
    private static String delhi_xpath ="/html/body/div[3]/div/div/div/div/div/div/div/div[4]/div[2]";


    public void clickSignupBtn(WebDriver driver){
        WebElement sign = driver.findElement(By.cssSelector(signup_css));
        sign.click();
    }

    public String verifyName(WebDriver driver){
        WebElement name = driver.findElement(By.cssSelector(name_css));
        return name.getText();
    }

    public void clickDoctorsLink(WebDriver driver){
        WebElement doctor = driver.findElement(By.cssSelector(doctor_css));
        doctor.click();
    }

    public void clckPharmacyTab(WebDriver driver){
        WebElement pharmacy = driver.findElement(By.cssSelector(pharmacy_css));
        pharmacy.click();
    }

    public void clickDiagnosticsTab(WebDriver driver){
        WebElement diagnostic = driver.findElement(By.xpath(diagnostic_xpath));
        diagnostic.click();
    }

    public void clickDelhiLocation(WebDriver driver){
        WebElement delhi = driver.findElement(By.xpath(delhi_xpath));
        delhi.click();
    }

}
