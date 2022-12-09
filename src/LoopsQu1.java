import java.util.Scanner;

public class LoopsQu1 {


    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            for (int i = 0; i < t; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int n = scan.nextInt();
                fac(a, b, n);
            }
        }

        public static void fac(int a, int b, int n) {
            int x = 1;
            int[] arr = new int[n];
            int s = a + (x * b);
            arr[0] = s;
            int sum = s;
            for (int i = 1; i < n; i++) {
                x *= 2;
                sum += (x * b);
                arr[i] = sum;
            }
            for (int w : arr) {
                System.out.print(w + " ");
            }
            System.out.println();
        }

    }

}
