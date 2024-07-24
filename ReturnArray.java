public class ReturnArray{
  
  public int[] printarr(int[]a){
    // initialize []a here
    
    return a;   
      }
    public static void main(String[]args){
      int[]a={3,4,5,6};
    ReturnArray r=new ReturnArray();
      // call the function and print it here
      r.printarr(a);
      for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
          
  
      }
      
    }
  }
  
  