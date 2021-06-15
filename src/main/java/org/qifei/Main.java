package org.qifei;

//-javaagent:/home/mi/learn/apmDemo/agent/target/java-agent-1.0-jar-with-dependencies.jar
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("22222222222");
        Demo demo = new Demo();
        demo.print("agent");
    }
}
