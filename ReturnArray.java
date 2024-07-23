public class ReturnArray{
  
public int[] printarr(int a[]){
  // initialize []a here
  // int a[]={1,2,3,4};
  
  return a;   
    }
  public static void main(String[]args){
  ReturnArray r=new ReturnArray();
    int a[]={1,2,3,4};
    // call the function and print it here
    int result[]=r.printarr(a);
    
      for(int j : result){
      System.out.println(j);
    }
  
  }
}
