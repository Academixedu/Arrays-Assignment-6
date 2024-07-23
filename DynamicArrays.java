import java.util.Scanner;

public class DynamicArrays
{
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop

  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length of an array");
    int arr[]=new int[sc.nextInt()];

    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.println("Enter the value for index: "+i);
      arr[i]=sc.nextInt();
    }
     for (int i : arr)
      {
          System.out.println(i);
     }
     sc.close();
  }
}
