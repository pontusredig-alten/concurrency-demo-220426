package se.iths.multitasker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        while (true) {

            // Skiljelinje
            System.out.println("--------------------");

            List<Runnable> taskList = new ArrayList<>();

            taskList.add(new Task1());
            taskList.add(new Task2());
            taskList.add(new Task3());
            taskList.add(new Task4());
            taskList.add(new Task5());
            taskList.add(new Task6());

            // Skapa upp ett Multitasker-objekt och skicka in listan med tasks
            MultiTasker multiTasker = new MultiTasker(taskList);

            multiTasker.runAllTasks();

//            Thread.sleep(10);
        }
    }


    public static class Task1 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hej från Task 1, räknaren står på: " + count);
            count++;
        }
    }

    public static class Task2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hej från Task 2, räknaren står på: " + count);
            count++;
        }
    }

    public static class Task3 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hej från Task 3, räknaren står på: " + count);
            count++;
        }
    }

    public static class Task4 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hej från Task 4, räknaren står på: " + count);
            count++;
        }
    }

    public static class Task5 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hej från Task 5, räknaren står på: " + count);
            count++;
        }
    }

    public static class Task6 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hej från Task 6, räknaren står på: " + count);
            count++;
        }
    }


}
