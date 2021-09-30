/************************************************************
 *                                                          *
 *  CSCI 470/680     In-Class Exercise 1a      Summer 2018  *                        
 *                                                          *
 *  Programmer:  Yiani Poulos                               *  
 *               Shaniel O Rivas Verdejo                    *
 *                                                          * 
 *                                                          *   
 *                                                          *
 *  Date Due:    June 26, 2018                              *                          
 *                                                          *
 ************************************************************/ 
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WorldPoulation
{
  public static void main(String[] args) throws IOException
  {
    int inputUser;
    
    double estimated = 0;
    
    final double GROWTH_RATE = 0.019;
    
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("What's the world population now? ");
    
    inputUser = keyScan.nextInt();
    
    int i;
    
    DecimalFormat aFormat = new DecimalFormat("###,###,###,###");
    
    for(i = 1; i < 6; i++)
    { 
      
      estimated += (inputUser*GROWTH_RATE)+inputUser;
    
      System.out.printf("\nPredicted population for year %d is %15s", i, aFormat.format(estimated) );
    }
    
    System.out.printf("\n\n\n\n");
  }
}