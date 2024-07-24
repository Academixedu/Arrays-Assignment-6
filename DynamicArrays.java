import java.util.Scanner;
public class DynamicArrays{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int []a=new int[4];
    for(int i=0;i<a.length;i++){
      System.out.println("enter values"+i);
      a[i]=s.nextInt();
    }
    for(int j :a){
      System.out.println(j);
    }
  }
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
}
