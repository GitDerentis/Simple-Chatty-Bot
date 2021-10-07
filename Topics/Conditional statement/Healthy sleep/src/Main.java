import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c < a) {
            System.out.println("Deficiency");
        } else if (a <= b && c > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}