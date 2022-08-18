package Pageobjects;

import BaseclassFramework.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC6_Navigationmenu extends Baseclass
{

   public static void Navigationmenu_WomenTab()throws InterruptedException
   {
      Actions actions=new Actions(driver);
      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
      WebElement WomenTab=driver.findElement(By.linkText("Women"));
      actions.moveToElement(WomenTab).click().perform();

   }
   public static void Navigationmenu_DressTab()throws InterruptedException
   {
      Actions actions=new Actions(driver);
      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
      WebElement DressesTab=driver.findElement(By.linkText("Dresses"));
      actions.moveToElement(DressesTab).click().perform();

   }
   public static void Navigationmenu_TshirtsTab()throws InterruptedException
   {
      Actions actions=new Actions(driver);
      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
      WebElement TShirtsTab=driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
      actions.moveToElement(TShirtsTab).click().perform();

   }
   public static void Navigationmenu_SubCategory()throws InterruptedException
   {
      Actions actions=new Actions(driver);
      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
      WebElement WomenTab=driver.findElement(By.xpath("//a[@title='Women']"));
      actions.moveToElement(WomenTab).perform();
      WebElement subMenu = driver.findElement(By.xpath("//a[@title='Tops']"));
      actions.moveToElement(subMenu);
      WebElement SubCatSelection=driver.findElement(By.linkText("Blouses"));
      actions.moveToElement(SubCatSelection).click().perform();
   }

}
