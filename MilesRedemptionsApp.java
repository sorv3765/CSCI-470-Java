import java.util.Scanner;
import java.io.*;

public class MilesRedemptionsApp
{
  public static void main(String [] args) throws IOException
  {
    String filename;
    
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("Please enter the name of the file: ");
    filename = keyScan.next();
   
    File file = new File(filename);

    Scanner fileScanner = new Scanner(file);
   
    System.out.println("----------------------------------------------------------------");
    System.out.println("WELCOME TO THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP");
    System.out.println("----------------------------------------------------------------");
    System.out.println();
    
    MilesRedeemer miles = new MilesRedeemer();
    
    System.out.println("List of destination cities your client can travel to: \n");
    
    
    miles.readDestinations(fileScanner);
    
    for (String city : miles.getCityNames())
    {
      System.out.println(city);
    }
    
    

    
    
  } 
}