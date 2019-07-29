package main.java.concurrent.thread;

import java.util.ArrayList;
import java.util.Queue;

public class ProducerConsumerThread {

  static ArrayList<Integer> integers = new ArrayList<>();

  public static void main(String[] args) {
    Producer producer = new Producer();
    producer.start();

    Consumer consumer = new Consumer();
    consumer.start();
  }


  public void method4Producer() throws InterruptedException {
    synchronized (integers) {

      while (true) {
        if (integers.size() == 2) {
          integers.wait();
        } else if (integers.size() == 0) {
          System.out.println("Producer is Producing");
          integers.add(1);
          integers.add(2);
          integers.notify();
        }
      }
    }
  }

  public void method4Consumer() throws InterruptedException {
    synchronized (integers) {
      while (true) {
        if (integers.size() == 2) {
          integers.remove(1);
          integers.remove(0);
          System.out.println("Consumer is Consuming");
          integers.notify();
        } else {
          integers.wait();
        }
      }
    }
  }
}

class Producer extends Thread {

  ProducerConsumerThread producerConsumerThread = new ProducerConsumerThread();

  @Override
  public void run() {
    try {
      producerConsumerThread.method4Producer();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class Consumer extends Thread {
  ProducerConsumerThread producerConsumerThread = new ProducerConsumerThread();

  @Override
  public void run() {
    try {
      producerConsumerThread.method4Consumer();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}