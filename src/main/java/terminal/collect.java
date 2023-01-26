package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class collect {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(22);
        integerList.add(30);
        integerList.add(42);
        integerList.add(50);

        List<Integer> responseList = (List<Integer>)integerList.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(responseList);
    }
}
