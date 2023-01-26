package intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);

        Function<Integer, Integer> func = x -> x * x;
        List<Integer> squareList = integerList.stream().map(func).collect(Collectors.toList());
        System.out.println(squareList);
    }
}
