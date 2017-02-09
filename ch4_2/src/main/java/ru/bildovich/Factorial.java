package ru.bildovich;

/**
 * Created by mac on 03.02.17.
 */
public class Factorial {
    
    public int factorial(int n)
    {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }
}
