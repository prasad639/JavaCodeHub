public class kaddens_subarray {
    
    public static int[] repeatedNumber(final int[] A) {
        int n = A.length;
        int sn = n * (n + 1);
        int sn2 = (n * (n + 1) * (2 * n + 1)) / 6;
        int s = 0;
        int s2 = 0;
        
        for (int i = 0; i < n; i++) {
            s = s + A[i];
            s2 = s2 + A[i] * A[i];
        }
        
        int e1 = s - s2; // x - y
        int e2 = (s2 - sn2) / e1; // x2 - y2
        
        int x = (e1 + e2) / 2;
        int y = x - e1;
        
        return new int[]{x, y};
    }
    
    public static void main(String args[]){
        
        final int[] A = {5,6};
        int arr[] =  repeatedNumber(A);
    }
}
