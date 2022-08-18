package Pageobjects;

import java.util.Date;
import java.util.Properties;
import BaseclassFramework.Baseclass;
import org.openqa.selenium.By;
import Utility.Constant;
import Utility.Globals;

public class TC4_LoginPage  extends Baseclass
{

    static By SignInButton=By.xpath("//a[@title='Log in to your customer account']");
    static By Username=By.xpath("(//label[text()='Email address'])[2]/following::input");
    static By Password=By.xpath("//label[text()='Password']/following::input");
    static By UserSigninButton= ( By.xpath("//button[@id='SubmitLogin']//span[1]"));



    public static void ClickSignButton()throws InterruptedException
    {
        driver.findElement(SignInButton).click();

    }

    public static void ClickUserSigninButton() throws Exception
    {
        //Global Variables
        driver.findElement(Username).sendKeys(Globals.GL_UsernameNew);
        driver.findElement(Password).sendKeys(Globals.GL_PasswordNew);


        driver.findElement(UserSigninButton) .click();

    }

}





