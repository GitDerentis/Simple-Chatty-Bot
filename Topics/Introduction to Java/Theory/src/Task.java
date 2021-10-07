//In a computer game, each gamer has an army of units.
//
//Write a program that will classify the army of your enemies corresponding to the following rules:

//Units: Category
//less than 1: no army
//from 1 to 19: pack
//from 20 to 249: throng
//from 250 to 999: zounds
//1000 and more: legion
//The program should read the number of units and output the corresponding category.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Select your army:");
    System.out.println("less than 1: no army");
    System.out.println("from 1 to 19: pack");
    System.out.println("from 20 to 249: throng");
    System.out.println("from 250 to 999: zounds");
    System.out.println("1000 and more: legion");

    int n = sc.nextInt();

    if (n < 1){
      System.out.println("no army");
    } else if (n <= 19){
      System.out.println("pack");
    } else if (n <= 249){
      System.out.println("throng");
    } else if (n <= 999){
      System.out.println("zounds");
    } else {
      System.out.println("legion");
    }
  }
}