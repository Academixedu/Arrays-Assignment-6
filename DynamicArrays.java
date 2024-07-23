import java.util.Scanner;

public class DynamicArrays{
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lenght: ");
    int len = sc.nextInt();
    int []a = new int[len];
    for (int i=0; i<a.length; i++){
      System.out.println("Enter the value : " + i); 
      a[i] = sc.nextInt();
  }
    for (int j : a){
      System.out.println(j);
}
}
}
