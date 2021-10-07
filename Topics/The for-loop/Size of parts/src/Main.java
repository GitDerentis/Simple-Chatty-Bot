import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n;

        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < num; i++) {
            n = sc.nextInt();
            if (n == 0) {
                perfect++;
            } else if (n == 1) {
                larger++;
            } else {
                smaller++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);


    }
}