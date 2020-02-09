import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver WD = new ChromeDriver();
        WD.get("https://www.practo.com/");
        WD.manage().window().maximize();
    }

    public void closeBrowser(){
        WebDriver WD = new ChromeDriver();
        WD.quit();
    }

}
