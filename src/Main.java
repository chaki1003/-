import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("加藤");
        names.add("中橋");
        names.add("岡本");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

    }
}
