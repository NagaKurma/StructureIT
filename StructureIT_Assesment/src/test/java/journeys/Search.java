package journeys;

import BaseclassFramework.Baseclass;
import Pageobjects.TC1_Search;
import org.testng.annotations.Test;

public class Search extends Baseclass {


    @Test
    public void TestScenario1() throws InterruptedException{
        TC1_Search.ClickSearchButton();
    }

}
