/************************************************************
 *                                                          *
 *  CSCI 470/680    In-Class Exercise 3    Summer 2018      *                        
 *                                                          *
 *  Programmer:     Yianni Poulos                           *  
 *                  Shaniel O Rivas Verdejo                 *
 *                                                          * 
 *                                                          *   
 *                                                          *
 *  Date Due:    July 5, 2018                               *                          
 *                                                          *
 ************************************************************/ 
import java.io.*;
import java.util.Scanner;

public class ParkCharges
{
  public static void main(String [] args) throws IOException
  {
    double parkInput;
    String askInput;
    double sum;
    double hourly = 0;
    double hour = 0;
    
    do
    {  
      Scanner keyScan = new Scanner(System.in);
    
      System.out.println("How many hours did you park yesterday? ");
      parkInput = keyScan.nextDouble();
    
      System.out.printf("\n");
    
      if(parkInput <= 3)
      {
        System.out.printf(" You only paid $2.00 for those %.0f hours of parking yesterday \n\n", parkInput);
      }
      else if (parkInput > 3)
      {
      
        hourly = parkInput - 3;
        int i;
      
        for (i = 1; i <= hourly; i++)
        {
          hour = i * 0.50;
        }
      
        sum = 2 + hour;
      
        if(sum >= 10)
        {
          sum = 10;
        }
      
        System.out.printf(" You only paid $%.2f for those %.0f hours of parking yesterday \n\n", sum, parkInput);
      
      }
      else if (parkInput == 24)
      {
        System.out.printf("\n\n\nYou only paid $10.00 for those %.0f hours of parking yesterday \n\n", parkInput);
      }
      
      System.out.printf("Would you like to do another input? ");
      askInput = keyScan.next();
      
    }while( askInput == "yes" || askInput == "Yes");
    
    System.out.printf("\n\n\n");

  }
}