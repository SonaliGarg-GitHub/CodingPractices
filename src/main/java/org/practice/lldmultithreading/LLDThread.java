package org.practice.lldmultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class LLDThread {

    private static final Logger LOGGER = Logger.getLogger(LLDThread.class.getName());

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Create a thread pool with 5 threads

        for (int i = 1; i <= 100; i++) {
            final int number = i;
            if(i==80)
                LOGGER.info("Stop");
             executor.submit(() -> {
                Thread.currentThread().setName("SONALI_"+number);
                LOGGER.info(""+number);
            });
        }

        executor.shutdown();
    }

}
