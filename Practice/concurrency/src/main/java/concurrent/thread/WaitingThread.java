package main.java.concurrent.thread;

public class WaitingThread extends  Thread{
  String s="adesh";

  @Override
  public void run(){
    try{
      this.method();
    }catch (Exception e){

    }
  }
  void method() throws InterruptedException{
    System.out.println(Thread.currentThread().getName()+"  inside method");
    synchronized (s){
      System.out.println(Thread.currentThread().getName());
      s.wait(1);
      System.out.println(Thread.currentThread().getName()+"  notify calling");
      s.notify();
      System.out.println(Thread.currentThread().getName()+"  Finished calling");
    }
  }

  public static void main(String[] args) {
    WaitingThread w=new WaitingThread();
    w.setName("A");
    WaitingThread w1=new WaitingThread();
    w1.setName("b");
    w.start();
   w1.start();
  }
}
