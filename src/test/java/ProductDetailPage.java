import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductDetailPage extends BasePage{

    @Step("Ürün detay sayfasında olduğu incelenir")
    public void isProductDetailPage(){
        String elementName = find(By.id("com.ozdilek.ozdilekteyim:id/tvItemDescription")).getText();
        System.out.println(elementName + " ürününün detayları görüntülenmekte...");
        logger.info(elementName + " ürününün detayları görüntülendi.");
        Assert.assertTrue(isDisplayed(By.id("com.ozdilek.ozdilekteyim:id/tvItemDescription")));
    }

    @Step("Görüntülenen ürün sepete eklenir")
    public void addToCart(){
        String productInfo = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tvItemDescription")).getText();
        appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/relLayAddCartBtn")).click();
        logger.info(productInfo + " ürünü sepete eklendi.");
        System.out.println(productInfo + " ürünü sepete eklendi.");
    }
}
