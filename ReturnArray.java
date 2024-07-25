public class ReturnArray{
  
public int[] printarr(int[]a){
  // initialize []a here
  return a;   
    }
  public static void main(String[] args) {
    ReturnArray r = new ReturnArray();
    
    // Initialize an array to test the method
    int[] testArray = {1, 2, 3, 4, 5};
    
    // Call the function and store the returned array
    int[] resultArray = r.printarr(testArray);
    
    // Print the returned array
    System.out.println("The elements of the returned array are:");
    for (int element : resultArray) {
        System.out.println(element);
    }
}
}// call the function and print it here
  
