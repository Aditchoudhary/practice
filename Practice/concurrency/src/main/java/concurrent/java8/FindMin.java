package concurrent.java8;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class FindMin {

  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<Integer>();
    integers.add(5);
    integers.add(2);
    integers.add(4);
    integers.add(7);

    Optional<Integer> min = integers.stream().min(Comparator.comparing(Integer::valueOf));
    Optional<Integer> max = integers.stream().max(Comparator.comparing(Integer::valueOf));

    System.out.println(min.isPresent() ? min.get() : null);
    System.out.println(max.isPresent() ? max.get() : null);

  }
}
