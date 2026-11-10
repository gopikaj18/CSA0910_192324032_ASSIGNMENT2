import java.util.*;

public class Main {
    public static void main(String[] args) {

        int n = 10000;

        // Original: ArrayList

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(i);
        }

        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            a.add(0, i);
        }

        long end = System.nanoTime();

        System.out.println("ArrayList time: " + (end - start));

        // Redesigned: ArrayDeque

        ArrayDeque<Integer> d = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            d.addLast(i);
        }

        start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            d.addFirst(i);
        }

        end = System.nanoTime();

        System.out.println("ArrayDeque time: " + (end - start));
    }
}