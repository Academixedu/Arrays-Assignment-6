import java.util.Scanner;

public class DynamicArrays{
  public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sca.nextInt();
        String[]ar=new String[len];
        for(int i=0;i<ar.length;i++){
            System.out.println("Enter the value of index: "+i);
            ar[i]=sca.next();
        }
        for(String j:ar){
            System.out.println(j);
        }
    
  
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
}
}

