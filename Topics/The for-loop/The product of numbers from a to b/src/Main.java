import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        long mult = 1;

        for (long i = a; i < b; i++) {
            mult *= i;
        }
        System.out.println(mult);

    }
}