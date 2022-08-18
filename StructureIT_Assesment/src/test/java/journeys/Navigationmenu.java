package journeys;

import BaseclassFramework.Baseclass;
import Pageobjects.TC6_Navigationmenu;
import org.testng.annotations.Test;

public class Navigationmenu extends Baseclass
{

@Test

    public void TestScenario_6()throws Exception
    {
        TC6_Navigationmenu.Navigationmenu_WomenTab();
        TC6_Navigationmenu.Navigationmenu_DressTab();
        TC6_Navigationmenu.Navigationmenu_TshirtsTab();
        TC6_Navigationmenu.Navigationmenu_SubCategory();
    }
}
