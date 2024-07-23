import java.util.Scanner;

public class SampleArrays{
// Declare and Initialize an Array
  // print an array using for loop
  public static void main(String args[]){
  Scanner in=new Scanner(System.in);
  System.out.println("enter your length");
  int[]scan=new int[6];
  for(int i=0;i<=scan.length-1;i++){
  System.out.println("enter the value for index"+i);
  scan[i]=in.nextInt();
}
  for (int j : scan){
  System.out.println(j);
 }
      
      }
}
