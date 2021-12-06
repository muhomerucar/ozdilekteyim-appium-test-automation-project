import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class BasePage extends BaseTest{

    final static Logger logger = Logger.getLogger(BasePage.class.getName());

    public MobileElement find(By locator){
        return appiumDriver.findElement(locator);
    }

    public List<MobileElement> findAll(By locator){
        return appiumDriver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator, String text){
        find(locator).sendKeys(text);
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    @Step("<sec> saniye boyunca bekle")
    public void waitForSecond(int sec) throws InterruptedException {
        Thread.sleep(1000*sec);
        System.out.println(sec + " boyunca bekletildi.");
    }

    @Step("Uygulamanın açıldığı kontrol edilir")
    public void isAppOpen(){
        boolean statu = isDisplayed(By.id("com.ozdilek.ozdilekteyim:id/iv_storeTopLogo"));
        if(statu){
            logger.info("Uygulama başarıyla başlatıldı.");
        }
        Assert.assertTrue("Ozdilekteyim Uygulaması açıldı.",statu);
    }
}
