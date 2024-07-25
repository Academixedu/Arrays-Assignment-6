import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrays {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        ArrayList<Integer> numbers = new ArrayList<>();

        
        System.out.print("How many numbers would you like to input? ");
        int n = scanner.nextInt();

    
        System.out.println("Please enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);  
        }

        
        System.out.println(" entered the following numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        
        scanner.close();
    }
}


