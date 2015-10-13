import java.util.*;

public class PerfectShuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (;;) {
            int num = in.nextInt();
            if (num == 0) {
                return;
            }
            ArrayList<String> input = new ArrayList<>(num);
            for (int i = 0; i < num; i++) {
                input.add(in.next());
            }

            for (int i = 0; i < num; i += 2) {
                System.out.println(input.get(i));
            }

            for (int i = 1; i < num; i += 2) {
                System.out.println(input.get(i));
            }
        }
    }
}
