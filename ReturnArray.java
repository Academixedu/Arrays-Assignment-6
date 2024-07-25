public class ReturnArray{
  
public int[] printarr(int[]a){
  
  // initialize []a here
  return a;   
    }
  public static void main(String[]args){
  ReturnArray r=new ReturnArray();
    // call the function and print it here
    int a[]={2,4,6,8,10};
    r.printarr(a);
    for (int k : a){
     System.out.println(k);
  }
}
}
