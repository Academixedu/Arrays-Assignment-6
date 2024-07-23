public class ReturnArray{

    public static int[] printarr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("values: "+a[i]);
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        printarr(arr);
    }
}
