package task_2;

import java.util.Scanner;

public class Bistro {
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bistro bistro = new Bistro();
        bistro.menu();


    }

    private void menu() {
        System.out.println("Welcome to Large's pompous bistro! Could we take your order please");
        System.out.println("1 - Caviar");
        System.out.println("2 - Vegan Burger");
        System.out.println("3 - Mac n Cheeze");
        System.out.println("4 - Exit");
        int input = Integer.parseInt(myScanner.nextLine());

        switch (input) {
            case 1:
                makeCaviar();
                break;
            case 2:
                makeVeganBurger();
                break;
            case 3:
                makeMacNCheeze();
                break;
            case 4:
                exitBistro();
                break;
        }
    }

    private void makeCaviar() {
        System.out.println("Good choice! Only the best for you");
        menu();
    }
    private void makeVeganBurger(){
        System.out.println("The best burger in the land coming right up");
        menu();
    }
    private void makeMacNCheeze() {
        System.out.println("Mac n Cheeze, of course!");
        menu();
    }
    private void exitBistro(){
        System.out.println("Thanks for visiting the world famous Large Bistro, Hope you had a jolly time!");
    }

}
