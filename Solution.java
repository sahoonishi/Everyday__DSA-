// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

class Solution {
    public static int Fibonaci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int val = Fibonaci(n-1) + Fibonaci(n-2);
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = Fibonaci(n);
        System.out.println(result);
    }

    
}