package concurrent.thread;

public class OddEvenUsingTwoThread {
  static final Object lock = new Object();
  static Integer value = 0;
  static boolean isEven = true;

  public static void main(String[] args) {
    Even even = new Even();
    even.setName("I'm Even");
    even.start();

    Odd odd = new Odd();
    odd.setName("I'm Odd");
    odd.start();
    try {
      odd.join();
      even.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

  public void printEven() {

    synchronized (lock) {
      while (value <= 10) {
        if (isEven) {
          System.out.println(value+ "-"+ Thread.currentThread().getName());
          value++;
          isEven = false;
          notify();
        } else {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }

  }

  public void printOdd() {
    synchronized (lock) {
      while (value <= 9) {
        if (!isEven) {
          System.out.println(value+ "-"+ Thread.currentThread().getName());
          value++;
          isEven = true;
          lock.notify();
        } else {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }


}

class Even extends Thread {
  OddEvenUsingTwoThread oddEvenUsingTwoThread = new OddEvenUsingTwoThread();

  @Override
  public void run() {
    oddEvenUsingTwoThread.printEven();
  }

}

class Odd extends Thread {
  OddEvenUsingTwoThread oddEvenUsingTwoThread = new OddEvenUsingTwoThread();

  @Override
  public void run() {
    oddEvenUsingTwoThread.printOdd();
  }

}