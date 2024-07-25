import java.util.Scanner;

public class DynamicArrays{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the size of the array: ");
        int size =sc.nextInt();

        // Create an array
        int[] arr = new int[size];

        // Initialize the array using a for loop
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Iterate the values using a for-each loop
        System.out.println("The elements of the array are:");
        for (int element : arr) {
            System.out.println(element);
        }

        sc.close();
    }
  }
