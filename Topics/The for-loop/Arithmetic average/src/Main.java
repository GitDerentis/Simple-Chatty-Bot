import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = 0;
        int avg = 0;

        final int magicNumber = 3;

        for (int i = num1; i <= num2; i++) {
            if (i % magicNumber == 0) {
                sum = sum + i;
                avg++;
            }
        }

        System.out.println((double) sum / avg);


    }
}
