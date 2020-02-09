import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.plugin.dom.core.Element;

public class DoctorsPage {

    private static final String searchdoc_css = "input[data-qa-id='omni-searchbox-keyword']";
    private static final String docname_xpath = "//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[2]/span/div[1]\n";
    private static String validatedoc_css = "h1[data-qa-id='doctor-name']";

public void enterDoctorName(String name, WebDriver driver) {
    WebElement docname = driver.findElement(By.cssSelector(searchdoc_css));
    docname.sendKeys(name);
}

    public void selectDocName(WebDriver driver){
    WebElement selectdoc = driver.findElement(By.xpath(docname_xpath));
   //Select doctorname = new Select(selectdoc);
   // doctorname.selectByVisibleText("Rakesh Mittal");
  selectdoc.click();

}
public String getDocName(WebDriver driver){
    WebElement actualname = driver.findElement(By.cssSelector(validatedoc_css));
    return actualname.getText();

}

}




