public class ReturnArray{
  
public int[] printarr(int[]a){
  // initialize []a here
  
  return a; 
    }
  public static void main(String[]args){
  ReturnArray r=new ReturnArray();
    // call the function and print it here
 
  int a[]={1,2,3,4,5};
  r.printarr(a);
  System.out.println("The numbers are ");
  for(int i: a){
    
    System.out.println(i);
   
  }
  }
}



