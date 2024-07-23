public class ReturnArray{
public int[] printarr(int[]a){
  return a;   
  }
  public static void main(String[]args){
  ReturnArray r=new ReturnArray();
    int a[]={1,2,3,4,5};
    r.printarr(a);
    System.out.println("Elements of the Array:");
    for (int i : a) {
      System.out.println(i);
    }
  }
}
