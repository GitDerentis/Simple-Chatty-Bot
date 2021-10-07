import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here

        int height = sc.nextInt();
        int feetPerDay = sc.nextInt();
        int feetDownPerNight = sc.nextInt();

        System.out.println((height - feetDownPerNight - 1) / (feetPerDay - feetDownPerNight) + 1);

    }
}