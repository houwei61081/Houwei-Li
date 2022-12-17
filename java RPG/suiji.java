import java.util.Arrays;
import java.util.List;

public class suiji {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");
        int index = (int) (Math.random()* list.size());
        System.out.println(list.get(index));
    }
}