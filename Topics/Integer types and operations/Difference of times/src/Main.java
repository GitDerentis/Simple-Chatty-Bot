import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        h1 = (h1 * 60) * 60;
        m1 = m1 * 60;

        h2 = (h2 * 60) * 60;
        m2 = m2 * 60;

        System.out.println((h2 + m2 + s2) - (h1 + m1 + s1));

    }
}