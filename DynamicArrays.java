import java.util.Scanner;

public class DynamicArrays
{
  public static void main(String[] args) {
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  Scanner aobj=new Scanner(System.in);
  System.out.println("Enter the number = ");
  int array=aobj.nextInt();
  int[] arr=new int[array];
  for(int i=0;i<array;i++)
  {
    System.out.println("number of Array "+i);
    arr[i]=aobj.nextInt();
  }
  for (int element : arr) 
  {
    System.out.println("Your typed NUmber = "+element);
  }

  

  }
}
