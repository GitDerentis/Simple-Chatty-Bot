//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        String sec = sc.next();
        int num = sc.nextInt();
        String cuisinePreference = sc.next();

        System.out.println("The form for " + name + "" +
                " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}
