import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean res = a + b == 20 || a + c == 20 || b + c == 20;
        System.out.println(res);
    }
}
