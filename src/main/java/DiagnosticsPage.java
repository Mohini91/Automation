import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiagnosticsPage {

    //locators for Add patient details
    private static String booknow_xpath = ".//div/div/div[2]/div[2]/div[4]/div/div[2]/div//div[2]/div/div[2]/div/div/div/footer/div/a/span";
    private static String patientname_css = "input[class='c-opd-inputable-box error']";
    private static String age_css = "input[class='c-opd-inputable-box u-marginr--std age__input']";
    private static String mobile_xpath = ".//div/div/div[2]/div/div/div/div[1]/div[2]/div/div/form/div[2]/div[1]/div/div[2]/input";
    private static String email_xpath = ".//div/div/div[2]/div/div/div/div[1]/div[2]/div/div/form/div[2]/div[2]/input";
    private static String continue_xpath = "input[class='u-width--full u-margint--full c-button c-button--order ']";

    //locators for Select patient address
    /*
     private static String
    private static String
    private static String
    private static String
    private static String
    private static String
*/

        public void clickBooknowBtn(WebDriver driver){
            WebElement booknow = driver.findElement(By.xpath(booknow_xpath));
            booknow.click();
        }

        public void enterPatientName(WebDriver driver, String name){
            WebElement patientname = driver.findElement(By.cssSelector(patientname_css));
            patientname.sendKeys(name);
        }

    public void enterAge(WebDriver driver, String patientage){
        WebElement age = driver.findElement(By.cssSelector(age_css));
        age.sendKeys(patientage);
    }

    public void enterMobileNumber(WebDriver driver, String mobile){
        WebElement phone = driver.findElement(By.xpath(mobile_xpath));
        phone.sendKeys(mobile);
    }

    public void enterEmail(WebDriver driver, String email){
        WebElement emailid = driver.findElement(By.xpath(email_xpath));
        emailid.sendKeys(email);
    }

    public void clickContinueBtn(WebDriver driver){
        WebElement cont = driver.findElement(By.xpath(continue_xpath));
        cont.click();
    }
}
