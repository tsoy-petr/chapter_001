package ru.bildovich;

/**
 * Created by mac on 03.02.17.
 */
public class Counter {

    public int add(int start, int finish){
        int result = 0;
        for (int i=start; i < finish ; i++) {
            if((i%2)==0){
                result=result+i;
            }
        }
        return result;
    }
}
