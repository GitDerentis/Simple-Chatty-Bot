//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String jane = sc.next();
        String kate = sc.next();
        String john = sc.next();
        String mary = sc.next();
        String susan = sc.next();
        String paul = sc.next();
        String boris = sc.next();
        String ann = sc.next();

        System.out.println(ann + "\n" + boris + "\n" + paul + "\n" + susan + "\n" + mary + "\n" + john);
        System.out.println(kate + "\n" + jane);
    }
}