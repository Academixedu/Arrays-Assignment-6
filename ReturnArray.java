public class ReturnArray {

    
    public int[] printarr(int[] a) {
        
        System.out.println("Array elements inside the method:");
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        return a;
    }

    public static void main(String[] args) {
        
        ReturnArray r = new ReturnArray();


        int[] myArray = {1, 2, 3, 4, 5};

    
        int[] resultArray = r.printarr(myArray);

        
        System.out.println("Returned array elements:");
        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }
}

