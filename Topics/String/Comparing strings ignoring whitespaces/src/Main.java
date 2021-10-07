import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();

        str = str.replaceAll(" ", "");

        str2 = str2.replace(" ", "");

        System.out.println(str.equals(str2));

    }
}