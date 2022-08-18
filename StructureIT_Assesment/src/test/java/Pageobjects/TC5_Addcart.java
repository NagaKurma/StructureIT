package Pageobjects;

import BaseclassFramework.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class TC5_Addcart extends Baseclass
{
    public static By FadedShortSleeveTshirts=By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]");
    
    public static void AddProductToCart()throws InterruptedException
    {
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        Thread.sleep(2000);
        WebElement popularTab=driver.findElement(By.linkText("POPULAR"));
        actions.moveToElement(popularTab).click().perform();
        //Add product to Cart

        driver.findElement(FadedShortSleeveTshirts).click();
        driver.findElement(By.xpath("//button[@name='Submit']//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Add']//i[1]")).click();
        String UnitPrice = driver.findElement(By.xpath("//td[@data-title='Unit price']")).getText();
        String UnitPriceFinal = UnitPrice.replace("$","");// replaceAll("\\D+", "");
        System.out.println("Product prize:"+UnitPriceFinal);
        Thread.sleep(2000);
        String QuantitySize=driver.findElement(By.xpath("//span[@id='summary_products_quantity'][text()='2 Products']")).getText();
        System.out.println("Quntity :"+QuantitySize);

//      extract digits only from strings
        String QuantitySizeFinal = QuantitySize.replaceAll("\\D+", "");
        System.out.println(QuantitySizeFinal);
        Double NewUnitPriceFinal= Double.valueOf(UnitPriceFinal);
        System.out.println(NewUnitPriceFinal);
        Double TotalAmount = NewUnitPriceFinal * Integer.parseInt(QuantitySizeFinal);

        System.out.println("Total prize:"+"$"+TotalAmount);
        String exptsumvalue = "$"+TotalAmount.toString();
        String Totalprize= driver.findElement(By.id("total_product_price_1_1_0")).getText();
        System.out.println("Total prize on product :"+Totalprize);

        Assert.assertEquals(Totalprize,exptsumvalue);


    }


}


