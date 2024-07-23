import java.util.Scanner;

public class DynamicArrays{
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter your length");
    int []in=new int[5];
    for(int i=0;i<in.length-1;i++){
      System.out.println("enter the value for index"+i);
      in[i]=scan.nextInt();
    }
    for (int j : in){
      System.out.println(j);
    }
  }
}
