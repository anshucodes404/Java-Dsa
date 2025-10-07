public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 48;
        int precision = 5;
        System.out.println(Math.sqrt(n));
        System.out.println(sqrt(n, precision));
    }

    static double sqrt(int n, int precise) {
        // int start = 0;
        // int end = n;

        double root = 0.0;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (mid * mid == n) {
//                 return mid;
//             } else if (mid * mid > n) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }
// System.out.println(root);
        double incr = 0.1;
        for (int i = 0; i < precise; i++) {
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
