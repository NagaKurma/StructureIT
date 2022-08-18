package journeys;

import BaseclassFramework.Baseclass;
import Pageobjects.TC2_Stringsearch;
import org.testng.annotations.Test;

public class Stringsearch extends Baseclass {


    @Test
    public void TestScenario2()throws InterruptedException{
        TC2_Stringsearch.getrandomString();
      //  TC2_Stringsearch.getrandomStringSmart();

    }
}
