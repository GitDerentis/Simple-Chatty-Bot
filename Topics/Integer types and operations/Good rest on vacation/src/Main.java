import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int days = sc.nextInt();
        int foodCost = sc.nextInt();
        int oneFlightCost = sc.nextInt();
        int oneNightCost = sc.nextInt();

        foodCost = foodCost * days;
        oneFlightCost = oneFlightCost * 2;
        oneNightCost = oneNightCost * (days - 1);

        int sum = foodCost + oneFlightCost + oneNightCost;

        System.out.println(sum);

    }
}