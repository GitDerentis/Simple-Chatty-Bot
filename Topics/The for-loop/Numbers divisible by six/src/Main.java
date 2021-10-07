import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            int a = sc.nextInt();

            final int six = 6;
            if (a % six == 0) {
                sum += a;
            }
        }

        System.out.println(sum);


    }
}