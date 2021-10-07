import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // put your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        final int five = 5;
        final int four = 4;
        final int three = 3;

        for (int i = 1; i <= n; i++) {

            int out = sc.nextInt();

            if (out == five) {
                a++;
            } else if (out == four) {
                b++;
            } else if (out == three) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);

    }
}