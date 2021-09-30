import java.util.Arrays;

public class Example_07_09
{
  public static void main(String[] args)
  {
    int [] ages1 = {6, 3, 1, 8, 99, 43, 25, 45, 21, 101},
    ages2;
    
 //   System.out.println(ages.length);  // print how many ages are in it
    
 //   for(int age: ages)
 //     System.out.println(age);
    
 //   Arrays.fill(ages, 0 );
    
 //   Arrays.fill(ages, 2, 5,  -1);  //between 2 and 5 put "-1"
   
 //   Arrays.equals(ages1, ages2);
    
//*************************************************************    
   ages2 = Arrays.copyOf(ages1, ages1.length);
    
   Arrays.sort(ages2);
   
    for(int age:ages1)
      System.out.println(age);
   
    System.out.println("\nSorted");
    
    for(int age : ages2)
      System.out.println(age);
    
//**************************************************************    
    
    System.out.println(Arrays.binarySearch(ages1, 5));   //to look for 5 in the array
    
  }
}