import java.util.*;

class Patient {

    String name;
    int severity;
    int arrival;

    Patient(String n, int s, int a) {
        name = n;
        severity = s;
        arrival = a;
    }

    public String toString() {
        return name + "(S" + severity + ")";
    }
}

public class Main {

    static int count = 0;

    public static void main(String[] args) {

        PriorityQueue<Patient> q = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.severity)
            .thenComparingInt(p -> p.arrival)
        );

        q.add(new Patient("Ravi", 3, count++));
        q.add(new Patient("Meena", 1, count++));
        q.add(new Patient("John", 3, count++));
        q.add(new Patient("Asha", 5, count++));
        q.add(new Patient("Kumar", 1, count++));
        q.add(new Patient("Lata", 2, count++));

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}