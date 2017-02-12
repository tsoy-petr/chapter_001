package ru.bildovich;

/**
 * Created by mac on 03.02.17.
 */
public class Max {
    public int max(int first, int second){
        if (first>second){
            return first;
        }else return second;
    }
    public int max(int first, int second, int three){
       return max(max(first, second), three);
    }

}
