import java.util.Scanner;

public class DynamicArrays{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    int arr[]= new int[size];
    for (int i=0;i<arr.length;i++){
      System.out.println("Enter the index value of "+i);
      arr[i]=sc.nextInt();
    }
    System.out.println("Array Values:");
    for (int j : arr) {
      System.out.println(j);
      
    }
    }
  }

