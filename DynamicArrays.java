import java.util.Scanner;

public class DynamicArrays{
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int size= scan.nextInt();
   int[] array = new int[size];
   for(int i=0; i<size; i++){
    System.out.print("Element " + i + ": ");
    array[i] = scan.nextInt();
   }
   System.out.println("enterd values are: ");
   for(int element : array){
    System.out.println(element);
   }

 
  }
}
