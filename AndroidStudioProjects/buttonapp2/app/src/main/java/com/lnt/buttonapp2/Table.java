package com.lnt.buttonapp2;

public class Table {
    
    public static String arr[]=new String[5];

    public static synchronized void print(int x){

        for(int i=1;i<=5;i+){
            arr[i]=String.valueOf(i*x);
            for(int j=1;j<=5;)
            MainActivity.tv1.setText(arr[i]);
            try{
                Thread.sleep(100);
                MainActivity.tv1.
            }
        }
    }
}
