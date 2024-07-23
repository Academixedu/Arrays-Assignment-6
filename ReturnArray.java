import java.util.Arrays;
public class ReturnArray
{
  
public int[] printarr(int[]a)
{
  // initialize []a here
 // int [] array={11,22,33,44,55};
  return a;   
}
  public static void main(String[]args)
  {
   ReturnArray r=new ReturnArray();
    // call the function and print it here
    int[] arr={1,2,3,4,5};
    r.printarr(arr);

    for(int i=0;i<=arr.length-1;i++)
    {
      System.err.print(arr[i]+" ");

    }
    System.out.println();
    System.out.println("------------------");
    System.out.println(Arrays.toString(arr));

  }
}
