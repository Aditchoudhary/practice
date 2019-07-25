package main.java.concurrent.classLevelLock;

public class ClassLevelLock {
  static int x;

  public void method1() {

    synchronized (ClassLevelLock.class) {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName() + " method 1:-" + i);
      }

    }
  }

  public void method2() {
    synchronized (ClassLevelLock.class) {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName() + " method 2:-" + i);
      }
    }
  }

  public static void main(String[] args) {
    //ClassLevelLock.method1();
    //ClassLevelLock.method2();
    Thread thread = new Thread(new MyThread1());
    Thread thread2 = new Thread(new MyThread2());
    thread.start();
    thread2.start();
  }
}

class MyThread1 implements Runnable {

  @Override
  public void run() {
    new ClassLevelLock().method1();
  }

}

class MyThread2 implements Runnable {

  @Override
  public void run() {

    new ClassLevelLock().method2();

  }

}