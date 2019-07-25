package dataStructure.queue.array;

public class Main {

  public static void main(String[] args) throws Exception{
    ArrayQueue arrayQueue = new ArrayQueue();
    arrayQueue.enqueue(1);
    arrayQueue.enqueue(2);
    arrayQueue.enqueue(3);
    arrayQueue.enqueue(4);
    arrayQueue.enqueue(5);

    System.out.println("Size : "+ arrayQueue.size);

    arrayQueue.enqueue(1);

    System.out.println("Size : "+ arrayQueue.size);

//    System.out.println("Tail :"+ arrayQueue.tail);
//    System.out.println("Head :"+ arrayQueue.head);
//    arrayQueue.enqueue(2);
//    arrayQueue.enqueue(3);
//    arrayQueue.enqueue(4);
//    arrayQueue.enqueue(5);

    System.out.println("Tail :" + arrayQueue.tail);
    System.out.println("Head :" + arrayQueue.head);

    arrayQueue.dequeue();
    arrayQueue.dequeue();
    arrayQueue.dequeue();
    arrayQueue.dequeue();
    arrayQueue.dequeue();

    System.out.println("Tail :" + arrayQueue.tail);
    System.out.println("Head :" + arrayQueue.head);

    System.out.println("After Dequeue, before queue ");

    arrayQueue.enqueue(20);
    arrayQueue.enqueue(30);
    arrayQueue.enqueue(40);
    arrayQueue.enqueue(50);

    System.out.println("Tail :" + arrayQueue.tail);
    System.out.println("Head :" + arrayQueue.head);

    arrayQueue.printQueue();

    System.out.println("Size : "+ arrayQueue.size);

    arrayQueue.dequeue();
    arrayQueue.dequeue();
    arrayQueue.dequeue();
    arrayQueue.dequeue();
    arrayQueue.dequeue();


    System.out.println("Size : "+ arrayQueue.size);
    System.out.println("Tail :" + arrayQueue.tail);
    System.out.println("Head :" + arrayQueue.head);

    arrayQueue.enqueue(1);
    arrayQueue.enqueue(2);
    arrayQueue.enqueue(3);
    arrayQueue.enqueue(4);
    arrayQueue.enqueue(5);

    System.out.println("Size : "+ arrayQueue.size);
    System.out.println("Tail :" + arrayQueue.tail);
    System.out.println("Head :" + arrayQueue.head);
    arrayQueue.enqueue(500);
    arrayQueue.enqueue(600);
    arrayQueue.enqueue(700);

    arrayQueue.printQueue();

    System.out.println(arrayQueue.dequeue());
  }
}
