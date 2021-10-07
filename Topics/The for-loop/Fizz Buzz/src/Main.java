import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        final int three = 3;
        final int five = 5;

        for (int i = a; i <= b; i++) {
            if (i % three == 0 && i % five == 0) {
                System.out.println("FizzBuzz");
            } else if (i % three == 0) {
                System.out.println("Fizz");
            } else if (i % five == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}