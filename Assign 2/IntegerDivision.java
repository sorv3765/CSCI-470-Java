/************************************************************
 *                                                          *
 *  CSCI 470/680     Assignment 2      Summer 2018          *                        
 *                                                          *
 *  Programmer:  Shaniel O Rivas Verdejo                    *  
 *                                                          *
 *                                                          * 
 *                                                          *   
 *                                                          *
 *  Date Due:    June 28, 2018                              *                          
 *                                                          *
 ************************************************************/ 
public class IntegerDivision
{
  public static void main(String[] args)
  {
    
    int numA = 93;
    int numB = 38;
    int numC;
      
    double numD;
    
    numC = numA/numB;
      
    System.out.printf("\n\nThe result of integer %d divdied by integer %d and stored in a integer is %d", numA, numB, numC);
    
    numD = numA/numB;
    
    System.out.printf("\n\nThe result of integer %d divided by integer %d and stored in a double is %f", numA, numB, numD);
    
    numD = (double)numA/numB;
    
    System.out.printf("\n\nThe result of integer %f (cast as a double) divided by integer %d and stored in a double is %f", (double)numA, numB, numD);
    
  }
}