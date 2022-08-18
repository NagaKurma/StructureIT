package journeys;

import BaseclassFramework.Baseclass;
import Pageobjects.TC4_LoginPage;
import org.testng.annotations.Test;

public class Loginpage extends Baseclass {



    @Test
    public void Testscenario_4() throws Exception {

        TC4_LoginPage.ClickSignButton();
        Thread.sleep(5000);
        TC4_LoginPage.ClickUserSigninButton();

    }

}
