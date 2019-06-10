import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileTest {
    public static void main(String[] args) {
        List<String> veggies = new ArrayList<>();
        veggies.add("Bean");
        veggies.add("Leek");
        veggies.add("onion");

        Iterator<String> it = veggies.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
