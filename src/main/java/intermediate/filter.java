package intermediate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(22);
        integerList.add(30);
        integerList.add(42);
        integerList.add(50);

        Predicate predicate = x -> (int)x%10 != 0;
        List<Integer> tenfactors = (List<Integer>)integerList.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(tenfactors);
    }
}
