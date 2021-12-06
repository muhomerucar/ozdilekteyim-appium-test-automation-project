import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ShoppingPage extends BasePage{

    @Step("<buttonId> butonuna tıklanır")
    public void clickButton(String buttonId){
        String buttonName = find(By.id(buttonId)).getText();
        find(By.id(buttonId)).click();
        System.out.println(buttonName + " butonuna basıldı.");
    }

    @Step("<pageId> açıldığı doğrulanır")
    public void hasPageOpened(String pageId){
        String element = find(By.id(pageId)).getAttribute("content-desc");
        System.out.println(element + " görüntülendi.");
        Assert.assertTrue(isDisplayed(By.id(pageId)));
    }

    @Step("<x_path> elementi seçilir")
    public void selectElement(String xpath){
        click(By.xpath(xpath));
    }


}
