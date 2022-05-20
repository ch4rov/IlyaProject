package ru.arhiser.stack;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueSample {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);


        Thread producer = new Thread(() ->{
            String[] words = new String[] {"OneEl", "TwoEl", "ThreeEl", "FourEl", "FiveEl", "SixEl", "SevenEl", "8El", "9El", "TenEl"};

            for (int i = 0; i < words.length && !Thread.interrupted();) {
                try {
                    Thread.sleep(1000);
                    queue.put(words[i]);
                    System.out.println("producer: add in queue " + words[i] + ", counts of elements in queue: " + queue.size());
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(2500);
                    sb.append(queue.take());
                    System.out.println("consumer: Processed from queue " + ", count of elements in queue: " + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}







