package main.java.concurrent.thread;

import java.util.concurrent.CountDownLatch;

public class ThreadLockCountDownLatch extends Thread {
  static CountDownLatch countDownLatch = new CountDownLatch(3);

  @Override
  public void run() {
    this.method1();
  }

  public static void main(String[] args) throws InterruptedException  {
    ThreadLock threadLock1 = new ThreadLock();
    ThreadLock threadLock2 = new ThreadLock();
    ThreadLock threadLock3 = new ThreadLock();

    threadLock1.setName("First");
    threadLock2.setName("Second");
    threadLock3.setName("Third");
    threadLock1.start();
    threadLock2.start();
    threadLock3.start();

    countDownLatch.await();
    System.out.println("END");

  }

  private void method1() {
    System.out.println(Thread.currentThread().getName() + "Method 1");
    countDownLatch.countDown();
  }

}
