//In this case, we are given the row number r and the column number c, and we need to find out the element at position (r,c). 

import java.util.*;
public class Main {
    public static int nCr(int a, int b) {
        int res = 1;
        int n=a-1;
        int r=b-1;
        
        for(int i=0;i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
        public static void main(String[] args) {
        int a = 5; // row number
        int b = 3; // col number
        int element = nCr(a, b);
        System.out.println("The element at position (r,c) is: " + element);
    }
} 
