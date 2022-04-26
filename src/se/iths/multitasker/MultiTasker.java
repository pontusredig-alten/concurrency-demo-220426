package se.iths.multitasker;

import java.util.ArrayList;
import java.util.List;

public class MultiTasker {


    private final List<Runnable> tasks;

    public MultiTasker(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    public void runAllTasks() {
        // Skapa upp en lista av trådar, lika stor som listan av tasks vi skickat in
        List<Thread> threads = new ArrayList<>(tasks.size());

        // För varje task, skapa upp en ny tråd och lägg till på listan av trådar
        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }

        // Starta varje tråd i listan
        for (Thread thread: threads) {
            thread.start();
        }

    }

}
