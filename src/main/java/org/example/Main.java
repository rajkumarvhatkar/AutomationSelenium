package org.example;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==2){
                System.out.println("we will take a break");
                break;
            }
        }
        System.out.println("out of the loop");
        for(int j=0;j<10;j++){
            if(j==2) {
                continue;
            }
            System.out.println(j);
        }

    }
}

