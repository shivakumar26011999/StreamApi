package terminal;

import java.util.ArrayList;
import java.util.List;

public class reduce {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(22);
        integerList.add(30);
        integerList.add(42);
        integerList.add(50);

        int response = integerList.stream().map(x -> x).reduce(0, (ans,i) -> ans+i);
        System.out.println(response);
    }
}
