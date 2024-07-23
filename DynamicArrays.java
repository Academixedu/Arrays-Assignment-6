import java.util.Scanner;

public class DynamicArrays{
  public static void main(String args[]){
  //create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop

  System.out.println("Enter the size");
  Scanner sc = new Scanner(System.in);
  int len = sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<=arr.length-1;i++){
    System.out.println("Enter the index value at:" +i);
    arr[i]=sc.nextInt();
  }
  for(int j : arr){
    System.out.println(j);
  }
}
}
