import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;


public class ProductsPage extends BasePage{

    @Step("Sayfanın aşağısına inilir")
    public void scrollDown(){
        int startx = 540;
        int starty = 1965;
        int endx = 540;
        int endy = 404;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(PointOption.point(startx,starty)).
                moveTo(PointOption.point(endx,endy)).
                release().perform();

        int startx_sec = 544;
        int starty_sec = 1969;
        int endx_sec = 540;
        int endy_sec =272;
        touchAction.longPress(PointOption.point(startx_sec,starty_sec)).
                moveTo(PointOption.point(endx_sec,endy_sec)).
                release().perform();
    }

    @Step("Rastgele bir ürün seçilir")
    public void select_A_randomProduct(){
        List<MobileElement> elementList = appiumDriver.findElementsById("com.ozdilek.ozdilekteyim:id/imageView");
        Random random = new Random();
        int randomValue= random.nextInt(elementList.size());
        elementList.get(randomValue).click();
        System.out.println("Rastgele bir ürüne tıklandı.");
    }

    @Step("Rastgele bir beden seçilir")
    public void select_A_randomSize(){
        List<MobileElement> sizeElements = appiumDriver.findElementsById("com.ozdilek.ozdilekteyim:id/tvInSizeItem");
        Random random = new Random();
        int randomSizeValue = random.nextInt(sizeElements.size());
        sizeElements.get(randomSizeValue).click();
        System.out.println("Rasgele bir ürün bedenine tıklandı.");
    }

    @Step("<buttonId> butonuna tıklanarak favoriye alınır")
    public void clickFavButton(String buttonId){
        click(By.id(buttonId));
    }

}
