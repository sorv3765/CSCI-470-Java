import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MilesRedeemer
{
  ArrayList<String> cities = new ArrayList<String>(); 
  ArrayList<Destination> destinations = new ArrayList<Destination>();
  
  public void readDestinations(Scanner fileScanner)
    {
      
      //for each line in the file
      while (fileScanner.hasNextLine())
      {       
        String line = fileScanner.nextLine();
        String[] arrOfStrgs = line.split(";");    //splitting by ";"
        String[] months = arrOfStrgs[4].split("-");
        Destination destNames = new Destination(arrOfStrgs[0], arrOfStrgs[1], arrOfStrgs[2], arrOfStrgs[3], months[0], months[1]);
        //System.out.println(arrOfStrgs[0]);        //just want the names of the city
        destinations.add(destNames);
        
      }
      
    }
  
    public ArrayList<String> getCityNames() 
    {
      ArrayList<String> cityNames = new ArrayList<String>();
        
       for (int i = 0; i < destinations.size(); i++)
       {
         //System.out.println(destinations.get(i).getCity());
         cityNames.add(destinations.get(i).getCity());             
       }
       
       Collections.sort(cityNames);
      
      return cityNames;
    }
  /*    
    public String[] redeemMiles(int miles, int month)
    {
     private destination = new destination []; 
     
     int reMiles = 0;
    }
    
    public int getRemainingMiles()
    {
      
    }
   */   
}