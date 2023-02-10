package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        // FIXME
        if(n == 1)return 0;
        if(n == 2 || n == 3)return 1;
        int[] fib = new int[n+1];
        fib[1] = 0;
        fib[2] = 1;
        fib[3] = 1;
        for(int i = 4; i <= n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}
