import java.util.Arrays;

public class ReturnArray{
  
public int[] printarr(int[]a){
  // initialize []a here
  return a;   
    }
  public static void main(String[]args){
  ReturnArray r=new ReturnArray();
    // call the function and print it here
    int[] arr={1,2,3,4,5};
    r.printarr(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("----------------------------------------------------");
  System.out.println("");
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]);
  }
  }
}
