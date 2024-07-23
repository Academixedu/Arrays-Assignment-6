import java.util.Scanner;
public class DynamicArrays{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s[]=new int[6];
    for(int i=0;i<s.length;i++){
      System.out.println("enter index value"+i);
      s[i]=sc.nextInt();
    }
    for(int k:s){
      System.out.println(k);
    }



    }
  }
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop

