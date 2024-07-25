import java.util.Scanner;

public class DynamicArrays{
  public static void main(String[] args) {
 //create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  
   Scanner s= new Scanner(System.in);
   System.out.println("enter length:");
   int len=s.nextInt();
   int[] a= new int[len];
   for(int i=0;i<a.length;i++)
   {
    System.out.println("enter value for index:"+i);
    a[i]=s.nextInt();
  }
  
  
  for(int k:a)
  {
    System.out.println(+k);
  }
}
}

