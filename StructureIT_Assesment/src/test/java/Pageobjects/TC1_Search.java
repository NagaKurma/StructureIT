package Pageobjects;

import BaseclassFramework.Baseclass;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC1_Search extends Baseclass {


    static By SearchBox=By.xpath("//input[contains(@class,'search_query form-control')]");
    public static void ClickSearchButton() throws InterruptedException {

        driver.findElement(SearchBox).sendKeys("T-SHIRTS");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		String date1 = driver.findElement(By.xpath("//h1[contains(@class,'page-heading ')]//span[1]")).getText();
		System.out.println("expected text "+date1);
		String actual = "T-SHIRTS";
		Asserts.check(true, date1);




    }

}
