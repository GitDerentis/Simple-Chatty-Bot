import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();

        System.out.println(word.substring(sub1, sub2 + 1));
    }
}