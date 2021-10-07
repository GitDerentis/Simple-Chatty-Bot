import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        String burg = sc.nextLine();

        //
        if (burg.length() >= 4){
            burg = burg.substring(burg.length() - 4);
            System.out.println(burg.equalsIgnoreCase("burg"));
        } else {
            System.out.println(false);
        }

    }
}