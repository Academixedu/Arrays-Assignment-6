
import java.util.Scanner;

public class DynamicArrays{
  public static void main(String[] args) {
    Scanner sd = new Scanner(System.in);
    System.out.println("enter the array");
    int len=sd.nextInt();
    int []scan= new int[len];
    for(int i=0;i<scan.length;i++){
      System.out.println("enter the index: "+i);
      scan[i]=sd.nextInt();

    }
    for (int  j : scan) {
      System.out.println(j);
      
    }

  }
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  
}

