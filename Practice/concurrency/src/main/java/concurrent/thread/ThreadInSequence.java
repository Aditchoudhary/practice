package main.java.concurrent.thread;

public class ThreadInSequence implements Runnable {

  @Override
  public void run() {
    foo();
  }

  public static void main(String[] args) throws  InterruptedException{
    Thread thread1 = new Thread(new ThreadInSequence());
    Thread thread2 = new Thread(new ThreadInSequence());
    Thread thread3 = new Thread(new ThreadInSequence());

    thread1.setName("First");
    thread1.start();
    thread1.join();
    thread2.setName("Second");
    thread2.start();
    thread2.join();
    thread3.setName("Third");
    thread3.start();

  }

  private void foo() {
    System.out.println(Thread.currentThread());
  }
}
