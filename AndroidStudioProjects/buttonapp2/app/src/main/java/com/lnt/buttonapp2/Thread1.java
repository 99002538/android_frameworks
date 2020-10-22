package com.lnt.buttonapp2;

public class Thread1 extends Thread {
    @Override
     public void run(){
        Table.print(100);
     }

}
