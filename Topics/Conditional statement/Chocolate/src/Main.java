import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((c % a == 0 || c % b == 0) && c < a*b){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}