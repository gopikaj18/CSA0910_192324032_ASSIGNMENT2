public class Main {
    public static void main(String[] args) {

        long start, end;

        start = System.nanoTime();

        String s = "";
        for (int i = 0; i < 100; i++) {
            s = s + "Ticket" + i;
        }

        end = System.nanoTime();
        System.out.println("String: " + (end - start));

        start = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("Ticket").append(i);
        }

        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start));

        start = System.nanoTime();

        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sf.append("Ticket").append(i);
        }

        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start));
    }
}