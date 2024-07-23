import java.util.Scanner;

public class DynamicArrays{
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter length");
    int len=sc.nextInt();
    int a[]=new int[len];
    for(int i=0;i<len;i++){
      System.out.println("enter value of index" +i);
      a[i]=sc.nextInt();
      // System.out.println(a[i]);
    }
    for(int j : a){
      System.out.println(j);
    }
  }
}
