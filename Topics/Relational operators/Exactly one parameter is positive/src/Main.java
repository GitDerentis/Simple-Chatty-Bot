import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean res = a > 0 && b <= 0 && c <= 0 
        || b > 0 && a <= 0 && c <= 0 
        || c > 0 && a <= 0 && b <= 0;

        System.out.println(res);

    }
}
