
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        // check if it starts with J toUpperCase
        System.out.println(word.substring(0, 1).toUpperCase().startsWith("J"));


    }
}