import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        Random r = new Random();

        int n = r.nextInt(100);

        if (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2)){
            System.out.println("1");
        } else {
            System.out.println(n);
        }
    }
}