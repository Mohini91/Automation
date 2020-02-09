import com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyLoginFunctionality {

    @Test
    public void testLogin()

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver WD = new ChromeDriver();
        WD.get("https://www.practo.com/");
        WD.manage().window().maximize();


        LandingPage home = new LandingPage();
        home.clickSignupBtn(WD);
        WD.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Thread.sleep(3000);

        LoginPage login = new LoginPage();
        login.enterUsername(WD,"9599960664");
        login.enterPassword(WD,"Believe@500");


        String logintext = login.getLoginText(WD);
        Assert.assertEquals(logintext,"Login");
        login.clickLoginBtn(WD);

        String actualname = home.verifyName(WD);
        Assert.assertEquals(actualname,"Mohini");

        WD.quit();
    }

}
