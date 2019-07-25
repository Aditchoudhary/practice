package main.java.concurrent.thread;

import java.util.concurrent.Semaphore;

public class ThreadSemaPhore extends Thread {
  static Semaphore semaphore = new Semaphore(0);

  @Override
  public void run(){

    try {
      semaphore.acquire();
      this.method1();

      semaphore.release();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws InterruptedException  {
    ThreadSemaPhore threadLock1 = new ThreadSemaPhore();
    ThreadSemaPhore threadLock2 = new ThreadSemaPhore();
    ThreadSemaPhore threadLock3 = new ThreadSemaPhore();
    ThreadSemaPhore threadLock4 = new ThreadSemaPhore();

    threadLock1.setName("First");
    threadLock2.setName("Second");
    threadLock3.setName("Third");
    threadLock4.setName("Fourth");
    threadLock1.start();
    threadLock2.start();
    threadLock3.start();
    threadLock4.start();

    System.out.println("END");

  }

  private void method1(){

    while(true) {
      System.out.println(Thread.currentThread().getName() + "Method 1--"+ semaphore.availablePermits());
    }
  }

}

