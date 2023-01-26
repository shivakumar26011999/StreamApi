package intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sorted {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(22);
        integerList.add(30);
        integerList.add(42);
        integerList.add(5);

        List<Integer> sortedList = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
