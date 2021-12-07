import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    @Step("<loginId> bölümüne <text> değeri gönderilir")
    public void chooseAndType(String loginId, String text){
        String element = find(By.id(loginId)).getText();
        System.out.println("Login bilgisi girildi.");
        logger.info(element + " bölümüne bilgi gönderildi.");
        type(By.id(loginId),text);
    }

    @Step("Giriş yapma sayfasının açıldığı kontrol edilir")
    public void isLoginPage(){
        MobileElement element = find(By.id("com.ozdilek.ozdilekteyim:id/btnLogin"));
        String elementName = find(By.id("com.ozdilek.ozdilekteyim:id/btnLogin")).getText();
        System.out.println(elementName + " butonu görüntülendi.");
        logger.info(elementName + " butonu görüntülendi.");
        Assert.assertTrue(element.isDisplayed());
    }

    @Step("Geri gidilir")
    public void goBack(){
        click(By.id("com.ozdilek.ozdilekteyim:id/ivBack"));
        System.out.println("Geri gidildi.");
    }
}
