import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int n = sc.nextInt();

        int last = n % 10;
        int tens = (n / 10) % 10;
        int hundr = (n / 100) % 10;
        if (last == 0) {
            System.out.println(tens + "" + hundr);
        } else {
            System.out.println(last + "" + tens + "" + hundr);
        }
    }
}