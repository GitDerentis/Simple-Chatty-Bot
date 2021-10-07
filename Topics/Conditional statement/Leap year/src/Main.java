import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year >= 1900 && year <= 3000) {

            if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        } else {
            System.out.println("Regular");
        }
    }
}
