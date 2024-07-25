import java.util.Scanner;

public class DynamicArrays{
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
  System.out.println("enter length of array");
  int len=in.nextInt();
  int scan[]=new int[len];
  for(int i=0;i<scan.length;i++)
  {
    System.out.println("enter the index value "+i);
    scan[i]=in.nextInt();
  }
  for (int j:scan) 
  {
    System.out.println(j);
  }

}
}

