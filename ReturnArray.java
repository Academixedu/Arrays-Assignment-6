public class ReturnArray{
  
public int[] printarr(int[]a){
  // initialize []a here
  return a;   
    }
  public static void main(String[]args){
  ReturnArray r=new ReturnArray();
  int[]a={1,3,5,7,9};
  r.printarr(a);
  System.out.println("Entered numbers are: ");
  for(int v:a){
    System.out.println(v);
  }
    // call the function and print it here
  }
}
