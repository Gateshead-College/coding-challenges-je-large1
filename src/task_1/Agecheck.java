package task_1;

import java.io.InputStream;
import java.util.Scanner;

public class Agecheck {
    Scanner myScanner = new Scanner(System.in);


    public static void main(String[] args) {
        Agecheck ageCheck = new Agecheck();
        ageCheck.getAge();
    }

    private void getAge() {
        System.out.println("Hello, How old are you?");
        int userAge = Integer.parseInt(myScanner.nextLine());
        System.out.println("your age is" + " " + userAge);

        if (userAge < 16) {
            System.out.println("OMG YOU ARE SO YOUNG!!!!!");
            getAge();
        }
        if (userAge >= 16 && userAge <= 19) {
            System.out.println("Good luck, you are getting closer to having responsibilities");
            getAge();
        }
        if (userAge >= 20 && userAge <= 24) {
            System.out.println("You need to start acting like an adult");
            getAge();
        }
        if (userAge >= 25 && userAge <= 29) {
            System.out.println("Good luck, you are getting closer to having responsibilities");
            getAge();
        }
        if (userAge >= 30 && userAge <= 39) {
            System.out.println("My wife wants to start trying for kids! HELP!");
            getAge();
        }
        if (userAge >= 40 && userAge <= 49) {
            System.out.println("Can retirement come soon please!!!");
            getAge();
        }
        if (userAge >= 50) {
            System.out.println("You're on your last legs now");
            getAge();
        }
    }
}