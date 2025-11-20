import java.util.Scanner;

public class eolymp_4817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int perimeter = 2 * (n + m);
            int area = n * m;

            System.out.println(perimeter + " " + area);
        }

        sc.close();
    }
}
