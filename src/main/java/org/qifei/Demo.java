package org.qifei;

public class Demo {
    public void print(String string) throws InterruptedException {
        Thread.sleep(100L);
        System.out.println("hello " + string);
    }
}
