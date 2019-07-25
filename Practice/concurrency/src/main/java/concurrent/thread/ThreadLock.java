package main.java.concurrent.thread;

public class ThreadLock extends Thread {
  String name = new String("Adesh");

  @Override
  public void run(){
    this.method1();
  }

  public static void main(String[] args) {
    ThreadLock threadLock1 = new ThreadLock();
    ThreadLock threadLock2 = new ThreadLock();
    threadLock1.setName("First");
    threadLock2.setName("Second");
    threadLock1.start();
    threadLock2.start();

  }

  private void method1() {
    synchronized (name) {
      int i = 0;
      while (i < 10) {
        i++;
        System.out.println(Thread.currentThread().getName() + "Method 1- " + i);
      }
    }
  }

}
