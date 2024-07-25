import java.util.Scanner;

public class DynamicArrays{
  public static void main(String[] args) {
      //create an array
  int a[]={1,2,3,4,5};
   Scanner in=new Scanner(System.in);
    //System.out.println("Enter your length");
    int len=in.nextInt();
    int[]scan=new int[len];
    for(int i=0;i<scan.length;i++)
    {
        System.out.println("Enter the index"+i);
        scan[i]=in.nextInt();
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
}
  }
}
