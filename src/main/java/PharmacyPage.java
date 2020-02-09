import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PharmacyPage {

    private static String searchbox_xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/input";
   private static String medname_xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div[2]/a[1]/div[2]/div[1]";
    private static String add_xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div[2]/a[1]/div[3]/div[2]/button";
    private static String viewcart_css ="span[class='heading-delta-bold']";
    private static String mednamecart_css = "span[class='heading-delta-bold']";



    public void enterMedNAme(WebDriver driver, String Medicine){
        WebElement medname = driver.findElement(By.xpath(searchbox_xpath));
        medname.click();
        medname.sendKeys(Medicine);
    }

 public void clckAddBtn(WebDriver driver){
        WebElement clckadd = driver.findElement(By.xpath(add_xpath));
        clckadd.click();
}

public void ClckViewCart(WebDriver driver){
        WebElement viewcart = driver.findElement(By.cssSelector(viewcart_css));
        viewcart.click();
}

public String getMedname(WebDriver driver){
        WebElement medname = driver.findElement(By.xpath(medname_xpath));
        return medname.getText();
}

public String getMednameFrmCart(WebDriver driver){
        WebElement mednamefromcart = driver.findElement(By.cssSelector(mednamecart_css));
        return mednamefromcart.getText();

}

}
