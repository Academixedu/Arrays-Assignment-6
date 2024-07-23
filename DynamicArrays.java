import java.util.Scanner;
public class DynamicArrays{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("enter array lenght");
    int b = s.nextInt();
    int arr[] = new int [b];
    for(int i=0;i<arr.length;i++){
      System.out.println("enter index value:");
      arr[i]= s.nextInt();
    }
   for ( int j : arr){
     System.out.println(j);
    }
  }
}
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
