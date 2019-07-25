package main.java.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreWithPermitZero {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(0);
    try {
      System.out.println("HEllo---23");
      semaphore.acquire();
      System.out.println("HEllo");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
