package Shape;

import java.io.IOException;
import java.util.Scanner;

public class Shape {
    public static void main(String[] args) throws IOException {
        String new_path = "src/Shape/test.txt";

        Write line1 = new Write(new_path);
        line1.fileWrite("");

        Write line = new Write(new_path,true);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int space = n;
        int space_2 = 0;
        int i;
        for (i = -n; i <= n; i++) {
            for (int j = space; j >= 1; j--) {
                line.fileWrite(" ");
            }
            for (int j = 0; j < i; j++) {
                line.fileWrite(" ");
            }
            for (int j = -n; j <= i; j++) {
                if (j == -n || j == i && j != n) {
                    line.fileWrite("*");
                }
                if (i == -space && j == -n && i < 1) {
                    for (int k = 0; k < space_2; k++) {
                        line.fileWrite(" ");
                    }
                } else if (i > 0 && j == -n) {
                    for (int k = 0; k < space_2; k++) {
                        line.fileWrite(" ");
                    }
                }
            }
            line.fileWrite("\n");
            space--;
            if (i >= -n && space_2 <= (n * 2) - 2 && i < 0) space_2++;
            if (i > -n && space_2 <= (n * 2) - 2 && i < 0) space_2++;
            if (i >= 0) space_2 -= 2;
        }
    }
}

