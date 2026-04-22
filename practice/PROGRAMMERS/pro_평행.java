import java.io.*;
import java.util.*;

public class pro_평행 {
    public static void main(String[] args) {
        int[][] dots = { { 1, 4 }, { 9, 2 }, { 3, 8 }, { 11, 6 } };

        // (0,1) - (2,3)
        boolean one = vali(dots[0], dots[1], dots[2], dots[3]);
        // (0,2) - (1,3)
        boolean two = vali(dots[0], dots[1], dots[2], dots[3]);
        // (0,3) - (1,2)
        boolean three = vali(dots[0], dots[1], dots[2], dots[3]);

        if (one || two || three) {
            answer = 1;
        } else {
            answer = 0;
        }
    }

    public static boolean vali(int[] a, int[] b, int[] c, int[] d) {
        int ax = b[0] - a[0];
        int ay = b[1] - a[1];

        int bx = d[0] - c[0];
        int by = d[1] - c[1];

        if (ax == 0 || bx == 0) {
            return false;
        } else {
            if (ay / ax == by / bx) {
                return true;
            } else {
                return false;
            }
        }
    }
}
