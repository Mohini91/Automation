import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FindADoctor {

    @Test
    public void findDoctor(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver WD = new ChromeDriver();
        WD.get("https://www.practo.com/");
        WD.manage().window().maximize();

        LandingPage lp = new LandingPage();
        lp.clickDoctorsLink(WD);


        DoctorsPage dp = new DoctorsPage();
        dp.enterDoctorName("Rakesh Mittal",WD);
        WD.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
dp.selectDocName(WD);



String act = dp.getDocName(WD);
        //System.out.println(act);
        Assert.assertEquals(act,"Dr. Rakesh Mittal");
        WD.quit();
    }
}
