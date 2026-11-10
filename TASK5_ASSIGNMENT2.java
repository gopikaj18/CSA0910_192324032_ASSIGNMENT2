import java.util.*;

class Team {

    String name;
    int points;
    int goalDiff;

    Team(String n, int p, int g) {
        name = n;
        points = p;
        goalDiff = g;
    }

    public String toString() {
        return name + "(" + points + "," + goalDiff + ")";
    }
}

class Leaderboard<T> {

    ArrayList<T> list = new ArrayList<>();
    Comparator<T> c;

    Leaderboard(Comparator<T> c) {
        this.c = c;
    }

    void add(T x) {
        list.add(x);
    }

    ArrayList<T> ranking() {
        ArrayList<T> copy = new ArrayList<>(list);
        copy.sort(c);
        return copy;
    }
}

public class Main {
    public static void main(String[] args) {

        Comparator<Team> c =
            Comparator.comparingInt((Team t) -> t.points)
            .reversed()
            .thenComparing(
                Comparator.comparingInt((Team t) -> t.goalDiff).reversed()
            )
            .thenComparing(t -> t.name);

        Leaderboard<Team> b = new Leaderboard<>(c);

        b.add(new Team("Panthers", 9, 4));
        b.add(new Team("Eagles", 9, 6));
        b.add(new Team("Cobras", 6, 1));
        b.add(new Team("Bisons", 9, 4));

        System.out.println(b.ranking());
    }
}