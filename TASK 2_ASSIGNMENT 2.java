import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            a.add(i);
            l.add(i);
        }

        System.out.println("ArrayList: " + a);
        System.out.println("LinkedList: " + l);

        a.add(0, 10);
        l.add(0, 10);

        System.out.println("After front insertion:");
        System.out.println(a);
        System.out.println(l);

        System.out.println("ArrayList middle: " + a.get(2));
        System.out.println("LinkedList middle: " + l.get(2));

        Deque<Integer> d = new ArrayDeque<>();

        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);

        System.out.println("ArrayDeque: " + d);

        d.removeFirst();

        System.out.println("After removal: " + d);
    }
}