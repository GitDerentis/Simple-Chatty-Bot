import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here

        int cups = sc.nextInt();
        boolean weekend = sc.nextBoolean();

        if (cups >= 10 && cups <= 20 && !weekend) {
            System.out.println(true);
        } else {
            System.out.println(cups >= 15 && cups <= 25 && weekend);
        }
    }
}
