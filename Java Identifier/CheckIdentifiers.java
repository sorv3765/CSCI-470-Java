/***********************************************************
*                                                          *
*  CSCI 470/680     In-Class Exercise 2      Summer 2018   *
*                                                          *
*  Programmer: Yianni Poulos                               *
*              Shaniel Omar Rivas Verdejo                  *
*                                                          *
*                                                          *
*                                                          *
*  Date Due:   06/28/2018                                  *
*                                                          *
*  Purpose:    Checking for valid characters               *
*                                                          *
*                                                          *
***********************************************************/
import java.io.*;
  
public class CheckIdentifiers
{
  public static void main(String[] args) throws IOException
  {
    char character;
    //prompt
    System.out.println("Please enter a valid Java identifier: ");
    
    //the user put its input form keyboard
    character = (char)System.in.read();
    
    //checking to see if it starts with a whitespace
    if(Character.isWhitespace(character))
    {
      System.out.println("At least one character is needed!");
    }  
    
    //check if it's a digit
    else if(Character.isDigit(character))
      {
        System.out.printf("Illegal first character: ", character);     
      }
    
    //check if its a valid letter
    else if(Character.isLetter(character) || character == '_' || character == '$')
    {
       System.out.println("Legal identifier");
       
      //After the first character is valid then check if has a digit, symbol after
      do
      {
        character =(char)System.in.read();
        
        System.out.println("Legal identifier");
        
      }
      while(Character.isLetter(character) || character == '_' || character == '$' || Character.isDigit(character));
    }
    
  }
}