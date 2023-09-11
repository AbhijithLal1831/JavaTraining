import java.util.*;
import java.io.*;

class LoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t >= 0 && t <= 500) {
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int sum = 0;
                if (a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <= 15) {
                    for (int j = 0; j < n; j++) {
                        int operand = 0;
                        for (int k = 0; k <= j; k++) {
                            operand += (int) Math.pow(2, k) * b;
                        }
                        sum = a + operand;
                        System.out.print(sum + " ");

                    }
                }
                System.out.println();
            }

        }
        in.close();
    }
}