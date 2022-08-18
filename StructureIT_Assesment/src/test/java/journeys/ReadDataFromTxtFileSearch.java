package journeys;

import BaseclassFramework.Baseclass;
import Pageobjects.TC3_ReadDataFromTxtSearch;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReadDataFromTxtFileSearch extends Baseclass {
   @Test

   public void Testscenario3() throws InterruptedException, IOException {


       TC3_ReadDataFromTxtSearch.ReadDataFromTextFile();
   }


}
