package me.yhb.leetcode;

/**

 */
public class Solution50 {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        boolean isMin = false;
        if (n == Integer.MIN_VALUE) {
            isMin = true;
            n = n + 1;
        }
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = -n;
        }
        double temp = x;
        double pow = 1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                pow = pow * temp;
            }
            n = n >> 1;
            if (n > 0) {
                temp = temp * temp;
            }
        }

        if (isNegative) {
            if (isMin) {
                pow = pow * x;
            }
            pow = 1 / pow;
        }
        return  pow;
    }
}
