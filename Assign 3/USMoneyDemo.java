import java.util.Scanner;

public class USMoneyDemo
{
  public static void main(String [] args)
  {
    int inputDollars;
    int inputCents;
    
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("Enter the amount of dollars: ");
    inputDollars = keyScan.nextInt();
    
    System.out.print("Enter the amount of cents: ");
    inputCents = keyScan.nextInt();
    
    USMoney x = new USMoney(inputDollars, inputCents);
    
    System.out.print("Enter another amount of dollars: ");
    inputDollars = keyScan.nextInt();
    
    System.out.print("Enter another amount of cents: ");
    inputCents = keyScan.nextInt();
   
    USMoney y = new USMoney(inputDollars, inputCents);
    
    keyScan.close();
    
    USMoney total = x.plus(y);
    
    System.out.println("You have: " + total.getDollars() + " dollars and " + total.getCents() + " cents");   
    
  }
}