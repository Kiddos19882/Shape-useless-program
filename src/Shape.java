import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int r;
        int i, j, k;
        int y = n;
        int l = 0;
        int p = n - 3;
        int o = 1;
        int t = n;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < y; j++) {
                System.out.print(" ");
            }
            y--;
            for (j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }
                if (j >= 1 && j < 3) {
                    for (k = 0; k < l; k++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            if (i > 1) {
                l++;
            }
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j < o; j++) {
                System.out.print(" ");
            }
            o++;
            for (j = 1; j <= t + 2; j++) {
                if (j == 1 || j == t + 2 && i != n) {
                    System.out.print("* ");
                }

                if (j >= 1 && j < 3) {
                    for (k = 0; k <= p; k++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            if (i >= 1) {
                p--;
            }
            t--;
        }
    }
}
