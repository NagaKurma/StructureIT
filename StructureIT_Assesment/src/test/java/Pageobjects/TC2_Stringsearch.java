package Pageobjects;

import BaseclassFramework.Baseclass;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC2_Stringsearch extends Baseclass {



    static String[] array = {"T-shirts","Dresses","CASUAL"};


    public static void getrandomString()
    {
        for(int i=0;i<=array.length;i++);
        {
            WebElement Search = driver.findElement(By.xpath("//input[@id='search_query_top']"));
            Search.sendKeys(array[0]);
            driver.findElement(By.xpath("//button[@name='submit_search']")).click();
            String data1 = driver.findElement(By.xpath("//span[@class='lighter']")).getText();
            System.out.println("expected text "+data1);
            String actual2 = "T-SHIRTS";
            Asserts.check(true, data1);
//		Thread.sleep(20000);
            driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
            driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(array[1]);
            driver.findElement(By.xpath("//button[@name='submit_search']")).click();
            String data2 = driver.findElement(By.xpath("//span[@class='lighter']")).getText();
            System.out.println("expected text "+data2);
//			Thread.sleep(20000);
            driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
            driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(array[2]);
            driver.findElement(By.xpath("//button[@name='submit_search']")).click();
            String data3 = driver.findElement(By.xpath("//span[@class='lighter']")).getText();
            System.out.println("expected text "+data3);
        }
    }
    public static void getrandomStringSmart()
    {
        for(int i=0;i<array.length;i++)
        {
            //System.out.println(array[i]);

            driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(array[i]);
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            String data1 = driver.findElement(By.xpath("//h1[contains(@class,'page-heading ')]//span[1]")).getText();
            System.out.println("expected text "+data1);
            String actual2 = array[i];
            Asserts.check(true, data1);
        }
    }
}
