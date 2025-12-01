import java.util.Scanner;

public class ConditionalStatements  {
    public static void main(String[] args) {
//If statement (Program to check if a number is greater than 15)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        if (number >15) {
            System.out.println("Number is greater than 15");
        }

//Nested if statement(Program to check if a number lies between 20 and 30)
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number2 = input2.nextInt();

        if (number2 >= 20) {
            if (number2 <= 30) {
                System.out.println("Number lies between 20 and 30: " + number2);
            } else {
                System.out.println("Number is greater than 30: " + number2);
            }
        } else {
            System.out.println("Number is less than 20: " + number2);
        }

//Switch Statements( Program that prints the day according to the integer entered)
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter any number between 1 and 6 for the day to be printed: ");
        int day = input3.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("It is a Weekend");
                break;
        }

//While loop(Prints numbers 1 to 5)
        int count = 1;
        System.out.println("While loop output:");
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

//Do While loop
        int doCount = 1;
        System.out.println("Do-while loop output:");
        do {
            System.out.println("doCount is: " + doCount);
            doCount++;
        } while (doCount <= 5);

//For Loop(Prints numbers 1 to 5)
        System.out.println("For loop output:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i is: " + i);
        }




        }
}