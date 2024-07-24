
import java.util.Scanner;

public class DynamicArrays{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    System.out.println("enter the length of the array");
    int length = scan.nextInt();
    int a[] = new int[length];
    for(int i = 0; i< a.length;i++)
    {
      System.out.println("enter the element at index= "+i);
      a[i] = scan.nextInt();
    }
    System.out.println("values are ");
    for(int j : a)
    {
      System.out.println(j);
    }

  }
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  
  
}
