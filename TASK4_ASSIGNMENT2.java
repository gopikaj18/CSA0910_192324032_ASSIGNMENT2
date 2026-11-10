import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> h = new HashMap<>();
        TreeMap<String, Integer> t = new TreeMap<>();
        LinkedHashMap<String, Integer> l = new LinkedHashMap<>();

        h.put("MED103", 50);
        h.put("MED101", 20);
        h.put("MED102", 30);

        t.putAll(h);

        l.put("MED103", 50);
        l.put("MED101", 20);
        l.put("MED102", 30);

        System.out.println("HashMap: " + h);
        System.out.println("TreeMap: " + t);
        System.out.println("LinkedHashMap: " + l);

        System.out.println("Medicine stock: " + h.get("MED101"));
    }
}