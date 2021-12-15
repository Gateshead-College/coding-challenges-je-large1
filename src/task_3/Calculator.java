package task_3;

import java.util.Scanner;

public class Calculator {


        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";


        Scanner scn = new Scanner(System.in);

        double firstNumber;
        double secondNumber;


        String operand;


        double result;


        double memory;


        public static void main(String[] args) {
            Calculator c = new Calculator();
            c.getFirstNumber();
        }

        private void getFirstNumber(){
            System.out.println(ANSI_GREEN + "--------------------------" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Memory: " + memory + ANSI_RESET);
            System.out.println(ANSI_GREEN + "--------------------------" + ANSI_RESET);
            System.out.println();
            System.out.println("Enter first number:");

            String input = scn.nextLine();
            if(input.equalsIgnoreCase("mr")) {
                firstNumber = memory;
            }

            else if(input.equalsIgnoreCase("mc")){
                memory = 0;
                getFirstNumber();
            }
            else {

                firstNumber = Double.parseDouble(input);
            }
            getOperand();
        }

        private void getOperand(){
            System.out.println(ANSI_GREEN + "--------------------------" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Memory: " + memory + ANSI_RESET);
            System.out.println(ANSI_GREEN + "--------------------------" + ANSI_RESET);
            System.out.println();
            System.out.println("Please enter the operand you wish to use:");
            operand = scn.nextLine();

            if(!requiresSecond()){

                performCalculation();
            }

            else {
                getSecondNumber();
            }
        }

        private void getSecondNumber(){
            System.out.println(ANSI_GREEN + "--------------------------" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Memory: " + memory + ANSI_RESET);
            System.out.println(ANSI_GREEN + "--------------------------" + ANSI_RESET);
            System.out.println();

            System.out.println(firstNumber + " " + operand);

            System.out.println("Enter second number:");
            String input = scn.nextLine();

            if(input.equalsIgnoreCase("mr")){

                secondNumber = memory;
            }
            else {

                secondNumber = Double.parseDouble(input);
            }

            performCalculation();
        }

        private void performCalculation(){

            if(requiresSecond()){
                System.out.println(firstNumber + " " + operand + " " + secondNumber);
            }
            else {

                System.out.println(operand + " of " + firstNumber);
            }

            switch(operand){

                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                    break;

                case "-":

                    result = firstNumber - secondNumber;
                    System.out.println(result);
                    break;

                case "/":

                    result = firstNumber / secondNumber;
                    System.out.println(result);
                    break;

                case "*":

                    result = firstNumber * secondNumber;
                    System.out.println(result);
                    break;

                case "pow":

                    result = Math.pow(firstNumber, secondNumber);
                    System.out.println(result);
                    break;

                case "sqrt":
                    result = Math.sqrt(firstNumber);
                    System.out.println(result);
                    break;

                case "sq":

                    result = firstNumber * firstNumber;
                    System.out.println(result);
                    break;

                case "rec":

                    result = 1 / firstNumber;
                    System.out.println(result);
                    break;

                case "m+":
                    memory += firstNumber;
                    getOperand();
                    break;

                case "m-":
                    //Take whatever is currently in memory and subtract the value of first number to it.
                    memory -= firstNumber;
                    getOperand();
                    break;

                case "mc":
                    //set the value of memory to 0.
                    memory = 0.0;
                    System.out.println(result);
                    break;


            }

            System.out.println("Do you want to perform another calculation on this result?");

            if(scn.nextLine().equalsIgnoreCase("y")){
                firstNumber = result;
                getOperand();
            }
            else {
                getFirstNumber();
            }
        }


        private boolean requiresSecond(){

            switch(operand){
                case "sqrt":
                case "sq":
                case "rec":
                case "m+":
                case "m-":
                    return false;
            }

            return true;
        }
    }

