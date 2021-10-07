//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String java = sc.next();
        String prog = sc.next();
        String lang = sc.next();

        System.out.println(lang + "\n" + prog + "\n" + java);
    }
}