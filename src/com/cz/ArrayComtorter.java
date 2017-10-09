package com.cz;

import java.util.ArrayList;
import java.util.List;

public class ArrayComtorter {


    //数组
    public static void main(String... ager){
        //创建一维数组
        ArrayList ady = new ArrayList();

        for(int i=0;i<20;i++){
            for(int j=i;j<10;j++) {
                ady.add(i * j);
            }
        }
        for(int f=0;f<ady.size();f++){
            for(int d=0;d<5;d++) {
                System.out.print(ady.get(f));
            }
                System.out.println();
        }

    }
}
