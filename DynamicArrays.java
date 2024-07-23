import java.util.Scanner;

public class DynamicArrays{
public static void main(String args[]){
 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter length of the array");
  int length=sc.nextInt();
  int a[]=new int[length];
  for(int i=0;i<length;i++){
    
    System.out.println("enter value of index :"+i);
    a[i]=sc.nextInt();
  }
  for (int j:a) {
    System.out.println(j);
    
  }
}
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
}
