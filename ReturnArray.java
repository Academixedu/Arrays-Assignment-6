public class ReturnArray{
  
public int[] printarr(int[]a){
  System.out.print("Array elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
  return a;   
    }
  public static void main(String[]args){
  ReturnArray r=new ReturnArray();
  int[] arr={1,2,3,4,5};
  int[] returnArray = r.printarr(arr);
  System.out.println("Returned array :");
   }
  }
