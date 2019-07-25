package main.java.concurrent.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentModification {

  public static void main(String[] args) {
    checkConCurrentModificationException();
  }

  private static void checkConcurrentHashMapFunctionality() {
    ConcurrentHashMap m = new ConcurrentHashMap();
    m.put(100, "Hello");
    m.put(101, "Geeks");
    m.put(102, "Geeks");

    // Here we cant add Hello because 101 key
    // is already present in ConcurrentHashMap object
    m.putIfAbsent(101, "Hello");

    // We can remove entry because 101 key
    // is associated with For value
    m.remove(101, "Geeks");

    // Now we can add Hello
    m.putIfAbsent(103, "Hello");

    // We cant replace Hello with For
    m.replace(101, "Hello", "For");
    System.out.println(m);
  }

  private static void checkConCurrentModificationException() {

    HashMap<Integer, Integer> hashMap = new HashMap<>();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    hashMap.put(3, 3);
    hashMap.put(4, 4);
    hashMap.put(5, 5);

    Iterator<Integer> itr = hashMap.keySet().iterator();
    while (itr.hasNext()) {
      Integer key = itr.next();
      if (key.equals(5)) {
        hashMap.put(6, 6);
      }
    }
    System.out.println(hashMap);

    List al = new ArrayList();
    al.add(10);
    al.add(20);
    al.add(30);

    Iterator<Integer> itr2 = al.iterator();

    Integer key = itr.next();
    while (itr2.hasNext()) {
      if (key.equals(30)) {
        al.add(40);
      }

    }
    System.out.println(al);
  }

  private static void checkNull(Object obj) {
    System.out.println("OBj");
    System.out.println(obj);
  }

  private static void checkNull(String s) {
    System.out.println("String");

  }

}
