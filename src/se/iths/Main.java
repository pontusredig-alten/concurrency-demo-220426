package se.iths;

public class Main {

    public static void main(String[] args) {

        MultiThreadClass thread1 = new MultiThreadClass();
        MultiThreadClass thread2 = new MultiThreadClass();
        MultiThreadClass thread3 = new MultiThreadClass();

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(thread1.getName());
        System.out.println(thread3.getName());


    }

}
