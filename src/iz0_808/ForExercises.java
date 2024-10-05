package iz0_808;

import java.util.Scanner;

public class ForExercises {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        forLargestSmallest();
//        forHistogram();
//        forAverage();
        twelveDaysOfChristmas();
    }

    public static void forLargestSmallest() {
        System.out.println("How much numbers do you want in this sequence? ");
        int n = sc.nextInt();
        int smallest = Integer.MIN_VALUE, largest = Integer.MAX_VALUE;
        if (n <= 0) {
            throw new IllegalArgumentException("Less than or equals 0.");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            int currentNumber = sc.nextInt();
            if (i == 0) {
                smallest = currentNumber;
                largest = currentNumber;
            } else {
                if (currentNumber < smallest) {
                    smallest = currentNumber;
                }
                if (currentNumber > largest) {
                    largest = currentNumber;
                }
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

    }

    public static void forHistogram() {
        System.out.println("Number of rows:");
        int rows = sc.nextInt();
        System.out.println("Number of columns:");
        int col = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            String line = "";
            for (int k = 1; k <= col; k++) {
                line = line.concat("*");
            }
            System.out.println(line);
        }
    }

    public static void forAverage() {
        System.out.println("Number of numbers in the sequence:");
        int n = sc.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("Less than or equals 0.");
        }
        double total = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.println("Input a number:");
            total += sc.nextDouble();

        }

        System.out.println("Average is: " + (total / n));
    }

    public static void twelveDaysOfChristmas() {
        for (int day = 1; day <= 12; day++) {
            String message = "On the ";
            switch (day) {
                case 1:
                    message = message.concat("first");
                    break;
                case 2:
                    message = message.concat("second");
                    break;
                case 3:
                    message = message.concat("third");
                    break;
                case 4:
                    message = message.concat("fourth");
                    break;
                case 5:
                    message = message.concat("fifth");
                    break;
                case 6:
                    message = message.concat("sixth");
                    break;
                case 7:
                    message = message.concat("seventh");
                    break;
                case 8:
                    message = message.concat("eight");
                    break;
                case 9:
                    message = message.concat("ninth");
                    break;
                case 10:
                    message = message.concat("tenth");
                    break;
                case 11:
                    message = message.concat("eleventh");
                    break;
                case 12:
                    message = message.concat("twelfth");
                    break;
            }
            message = message.concat(" day of Christmas\nMy true love sent to me: ");

            switch (day) {
                case 12:
                    message = message.concat("\n Twelve drummers drumming,");
                case 11:
                    message = message.concat("\n Eleven pipers piping,");
                case 10:
                    message = message.concat("\n Ten lords a-leaping,");
                case 9:
                    message = message.concat("\n Nine ladies dancing,");
                case 8:
                    message = message.concat("\n Eight maids a-milking,");
                case 7:
                    message = message.concat("\n Seven swans a-swimming,");
                case 6:
                    message = message.concat("\n Six geese a-laying,");
                case 5:
                    message = message.concat("\n Five golden rings,");
                case 4:
                    message = message.concat("\n Four calling birds,");
                case 3:
                    message = message.concat("\n Three French hens,");
                case 2:
                    message = message.concat("\n Two turtle doves, and");
                case 1:
                    message = message.concat("\n A partridge in a pear tree.");
            }
            System.out.println(message + "\n\n");
        }
    }
}
