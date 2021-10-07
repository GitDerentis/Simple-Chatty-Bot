import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int n = sc.nextInt();



        int sumT = n / 100 + (n / 10) % 10 + n % 10;


        System.out.println(sumT);
    }
}
