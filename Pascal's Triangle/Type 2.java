//Given the row number n. Print the nth row of Pascal’s triangle.

import java.util.*;
public class Main {

    static void pascalTriangle(int n) {
        long ans=1;
        System.out.print(ans + " "); //printing 1st element

        for (int i=1;i<n;i++) {
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}
