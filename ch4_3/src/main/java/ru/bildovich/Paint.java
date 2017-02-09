package ru.bildovich;

/**
 * Created by mac on 03.02.17.
 */
public class Paint {

    String piramid(int h){
        int center = h/2;
        StringBuilder sb = new StringBuilder();
        h=h*2;
        if(h%2 == 0) h++;
        for(int i=0; i<h; i+=2)
        {
            for(int j=0; j<(h-1)/2-(i/2); j++) sb.append(" ");
            for(int j=0; j<i+1; j++) sb.append('*');
            sb.append("\n");
        }
        return sb.toString();
    }
}
