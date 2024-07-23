public class DynamicArrays{
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
}
import java.util.Scanner;

public class DynamicArrays {
public static void main(String[] args) {
    
    Scanner in=new Scanner(System.in);
    int []a={10,20,30,40,50};
    for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
}
int[]scan=new int[5];
for(int i=0;i<scan.length;i++){
scan[i]=in.nextInt();
}
for(int j : scan){
System.out.println(j);
}
}
}
