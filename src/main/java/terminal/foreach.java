package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class foreach {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(22);
        integerList.add(30);
        integerList.add(42);
        integerList.add(50);

        Consumer consumer = x -> System.out.println(x);
        integerList.stream().forEach(consumer);
    }
}
