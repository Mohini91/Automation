import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;


public class DummyTest {

    private static String username_css = "input[id='usernameId']";
    private static String password_css = "input[id='passwordId']";
    private static String login_css = "span[class='ui-button-text ui-clickable']";
    private static String submittext_css = "input[name='cusid']";
    private static String clcksubmit_css = "input[name='submit']";
    private static String iframe_xpath = "/html/body/a/img";

    @Test
    public void testGoogle() {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver WD = new ChromeDriver();
        WD.get("http://demo.guru99.com/test/guru99home/");
        WD.manage().window().maximize();
        WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
/*
      WD.findElement(By.cssSelector(username_css)).click();
    WD.findElement(By.cssSelector(username_css)).sendKeys("Sanjay");

    WD.findElement(By.cssSelector(password_css)).click();
    WD.findElement(By.cssSelector(password_css)).sendKeys("Password1");

    WD.findElement(By.cssSelector(login_css)).click();
    WD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    WD.findElement(By.cssSelector(submittext_css)).sendKeys("20");
    WD.findElement(By.cssSelector(clcksubmit_css)).click();


// Switch to Alert
        Alert alrt = WD.switchTo().alert();

        // get text
       String alrttext = alrt.getText();
        Assert.assertEquals(alrttext,"Do you really want to delete this Customer?");
        alrt.dismiss();
      //  alrt.accept();
       // alrt.accept();
*/
        //swtich to iframe
        WD.switchTo().frame("a077aa5e");
        WD.findElement(By.xpath(iframe_xpath)).click();
WD.quit();
    }

}
