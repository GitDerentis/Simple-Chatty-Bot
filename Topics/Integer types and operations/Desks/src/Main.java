import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here

        int numOfS1 = sc.nextInt();
        int numOfS2 = sc.nextInt();
        int numOfS3 = sc.nextInt();

        numOfS1 = numOfS1 % 2 + numOfS1 / 2;
        numOfS2 = numOfS2 % 2 + numOfS2 / 2;
        numOfS3 = numOfS3 % 2 + numOfS3 / 2;

        int sum = numOfS1 + numOfS2 + numOfS3;
        System.out.println(sum);
    }
}
