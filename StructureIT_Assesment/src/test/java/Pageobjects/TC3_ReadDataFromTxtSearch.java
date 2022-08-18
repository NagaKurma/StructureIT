package Pageobjects;

import BaseclassFramework.Baseclass;
import org.openqa.selenium.By;

import java.io.*;

public class TC3_ReadDataFromTxtSearch extends Baseclass
{
    public static void ReadDataFromTextFile() throws  IOException
    {
        String TestFile = "D://Testing//temp.txt";
        //Reading from file.
        //Create Object of java FileReader and BufferedReader class.
        FileReader FR = new FileReader(TestFile);
        BufferedReader BR = new BufferedReader(FR);
        String Content = "";

        //Loop to read all lines one by one from file and print It.
        while((Content = BR.readLine())!= null)
        {
            System.out.println(Content);
            driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Content);
            driver.findElement(By.xpath("//button[@type='submit']")).click();


        }
    }
}
  //  }
  //  public static void ReadDataFromExcel() throws IOException
   // {
        //Path of the excel file
      //  FileInputStream fs = new FileInputStream("D://Testing//DemoFile.xlsx");
        //FileInputStream fs=new FileInputStream("D://Projects_IntelliJ//StructureIT//StructureIT_Assesment//src//test//java//Datadriventest//DemoFile.xlsx");
     //   //Creating a workbook
     //   System.out.println("hello 1");
     //   XSSFWorkbook workbook = new XSSFWorkbook(fs);
     //   System.out.println("hello 2");
     //   XSSFSheet sheet = workbook.getSheetAt(0);
     //   Row row = sheet.getRow(0);
      //  Cell cell = row.getCell(0);
      //  System.out.println(sheet.getRow(0).getCell(0));
     //   Row row1 = sheet.getRow(1);
     //   Cell cell1 = row1.getCell(1);
    //    System.out.println(sheet.getRow(0).getCell(1));
    //    Row row2 = sheet.getRow(1);
    //    Cell cell2 = row2.getCell(1);
    //    System.out.println(sheet.getRow(1).getCell(0));
        /*
      //  Row row3 = sheet.getRow(1);
     //   Cell cell3 = row3.getCell(1);
       // System.out.println(sheet.getRow(1).getCell(1));*/
    


