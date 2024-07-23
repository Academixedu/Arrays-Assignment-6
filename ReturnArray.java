public class ReturnArray {
        public int[] printarr(int[] a) {
            a = new int[] {1, 2, 3, 4, 5};
            return a;
        }
    
        public static void main(String[] args) {
            ReturnArray r = new ReturnArray();
            int[] result = r.printarr(null);
            for (int i : result) {
                System.out.println(i);
            }
        }
    }
    
