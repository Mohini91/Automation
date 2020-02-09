import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.sql.Driver;


public class TestDropdown {



    private static String dropdown_css = "select[id='testingDropdown']";
    private static String textbox_xpath = "//input[@id='fname']";
    private static String submit_xpath = "//button[@id='idOfButton']";
    private static String male_css = "input[id='male']";
    private static String from_css = "div[id='draggable']";
    private static String to_css = "div[id='droppable']";
    private static String doubleclick_xpath ="//button[@id='dblClkBtn']";



    public void dropDown() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver WD = new ChromeDriver();
        WD.get("https://testandquiz.com/selenium/testing.html");
        WD.manage().window().maximize();

        WebElement Ele = WD.findElement(By.cssSelector(dropdown_css));
        Select Sel = new Select(Ele);
        //Sel.selectByVisibleText("Database Testing");
        Sel.selectByValue("Manual");
        // Sel.selectByIndex(1);

        WebElement WE = WD.findElement(By.xpath(textbox_xpath));
        WE.sendKeys("Mohini");

        WD.findElement(By.xpath(submit_xpath)).click();
        WD.findElement(By.cssSelector(male_css)).click();

    }
@Test
    public void dragAndDrop() {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver WD = new ChromeDriver();
        WD.get("https://testandquiz.com/selenium/testing.html");
        WD.manage().window().maximize();


        Actions act = new Actions(WD);
        act.doubleClick(WD.findElement(By.xpath(doubleclick_xpath)));


// WebElement from = WD.findElement(By.cssSelector(from_css));
// WebElement to = WD.findElement(By.cssSelector(to_css));
//        Actions ac = new Actions(WD);
//        ac.dragAndDrop(from,to).build().perform();
    }

}