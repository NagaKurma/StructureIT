package journeys;

import BaseclassFramework.Baseclass;
import Pageobjects.TC4_LoginPage;
import Pageobjects.TC5_Addcart;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class Addcart extends Baseclass
{
    @Test
    public void Testscenario_5() throws Exception {
        TC5_Addcart.AddProductToCart();



    }
}
