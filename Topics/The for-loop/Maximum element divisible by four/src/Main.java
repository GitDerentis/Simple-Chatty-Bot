import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // put your code here
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int input;
        int maxNum = 0;

        final int magicNumber = 4;

        for (int i = 0; i < num; i++) {
            input = sc.nextInt();
            if (input % magicNumber == 0 && input > maxNum) {
                maxNum = input;
            }
        }
        System.out.println(maxNum);


    }
}