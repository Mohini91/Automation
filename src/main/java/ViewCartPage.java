import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewCartPage {

    private static String location_css = "span[class='u-text--bold']";


    public void useLocatn(WebDriver driver){
        WebElement locatn = driver.findElement(By.cssSelector(location_css));
        locatn.click();

    }
}
