import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyAddingMedicinetoCartFunctionality {

    @Test
    public void verifyCart(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver WD = new ChromeDriver();
        WD.get("https://www.practo.com/");
        WD.manage().window().maximize();

        LandingPage lpage = new LandingPage();
        lpage.clckPharmacyTab(WD);

        PharmacyPage ppage = new PharmacyPage();
        ppage.enterMedNAme(WD,"Imol Plus");
        WD.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        String getmedname = ppage.getMedname(WD);
        ppage.clckAddBtn(WD);
        ppage.ClckViewCart(WD);

        ViewCartPage vcpage = new ViewCartPage();
        vcpage.useLocatn(WD);
        WD.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

       // System.out.println(getmedname);

       String mednamecart = ppage.getMednameFrmCart(WD);
      Assert.assertEquals(getmedname,mednamecart);

       WD.quit();
    }
}
