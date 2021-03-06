import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Paopao on 08/11/17.
 */
public class Generics {

    public static void main(String[] args) {
        betterForCasting();

    }

    public static void betterForCasting() {
        List<String> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        list.add("A String");
        list.add(" Another string");

        String s = list.get(0);
        String s2 = list.get(1);

        System.out.println(s + s2);
    }

    @Test
    public void BoxesTest(){
        List<Box<String>> boxes = new ArrayList<>();

        Box<String> box = new Box<>();
        box.setObj("A String");

        Box box2 = new Box();
        box2.setObj("Another String");

        System.out.println(box.getObj());
        System.out.println(box2.getObj());
    }


    @Test
    public void usingPairs() {
        List list = new ArrayList();
        Pair<String, String> p1 = new OrderedPair<>("aKey", "aValue");

    }



}
