package concurrent.blockingQueue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {


  public static void main(String[] args) {
    Integer poison = -1;
    BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
    new Thread(new Producer(blockingQueue, poison)).start();
    new Thread(new Consumer(blockingQueue, poison)).start();

  }

}

class Producer implements Runnable {

  private final BlockingQueue<Integer> blockingQueue;
  private final Integer POISON;

  Producer(BlockingQueue<Integer> integers, Integer poison) {
    blockingQueue = integers;
    POISON = poison;
  }

  @Override
  public void run() {

    try {
      process();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      try {
        blockingQueue.put(POISON);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }

  private void process() throws InterruptedException {
    // Put 20 ints into Queue
    for (int i = 0; i < 20; i++) {
      System.out.println("[Producer] Put : " + i);
      blockingQueue.put(i);
      System.out.println("[Producer] Queue remainingCapacity : " + blockingQueue.remainingCapacity());
      Thread.sleep(100);
    }

  }

}

class Consumer implements Runnable {
  private final BlockingQueue<Integer> blockingQueue;
  private final Integer POISON;

  Consumer(BlockingQueue<Integer> integers, Integer poison) {
    blockingQueue = integers;
    POISON = poison;
  }

  @Override
  public void run() {

    try {
      while (true) {
        Integer take = blockingQueue.take();
        process(take);
        if (take == POISON)
          break;
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

  }

  private void process(Integer take) throws InterruptedException {
    System.out.println("[Consumer] Take : " + take);
    Thread.sleep(500);
  }

}
