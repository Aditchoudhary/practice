package main.java.concurrent.HashMap;

import java.util.HashMap;

public class DuplicateEntry {

  @Override
  public boolean equals(Object obj) {
    return false;
  }

  @Override
  public int hashCode() {
    return 9;
  }

  public static void main(String[] args) {
    DuplicateEntry duplicateEntry = new DuplicateEntry();
    HashMap<DuplicateEntry,String> duplicateEntryStringHashMap = new HashMap<>();
    duplicateEntryStringHashMap.put(duplicateEntry,"First");
    duplicateEntryStringHashMap.put(duplicateEntry,"Second");

    System.out.println(duplicateEntryStringHashMap.size());

  }
}
