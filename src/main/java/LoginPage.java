import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static final String username_xpath ="//input[@id='username']";
    private static final String password_xpath ="//input[@id='password']";
    private static final String login_xpath ="//button[@id='login']";

    public void enterUsername(WebDriver driver, String mobilenumber){
        WebElement mob = driver.findElement(By.xpath(username_xpath));
        mob.sendKeys(mobilenumber);

    }
     public void enterPassword(WebDriver driver,String password){
        WebElement pass = driver.findElement(By.xpath(password_xpath));
                pass.sendKeys(password);
     }

     public void clickLoginBtn(WebDriver driver){
        WebElement click = driver.findElement(By.xpath(login_xpath));
        click.click();
     }

     //method to validate the login text
 public String getLoginText(WebDriver driver){
        WebElement text = driver.findElement(By.xpath(login_xpath));
        return text.getText();
 }

}

