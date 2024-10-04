package iz0_808;

import java.util.Scanner;

public class ConditionalLogic {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        preAndPostDifference();
//        booleanLogicShortCircuitOps();
//        booleanBitwiseOps();
//        compareStrings();
//        int certification = sc.nextInt(), ageOfAdmittance = sc.nextInt();
//        System.out.println(admitToFilm(certification, ageOfAdmittance));
//        switchVowelOrConsonant();
//        ifMonth();
//        ifGrade();
//        switchMathOperation();
//        ifTemperature();
        switchDaysInMonth();
    }

    public static void preAndPostDifference() {
        int x = 5, y = 10;
        System.out.println("The value of x is " + x);
        System.out.println("The value of x is " + (++x));
        System.out.println("The value of x is " + (x++));
        System.out.println("The value of x is " + x);
        System.out.println("________________________");
        System.out.println("The value of y is " + y);
        System.out.println("The value of y is " + (--y));
        System.out.println("The value of y is " + (y--));
        System.out.println("The value of y is " + y);

    }

    public static void booleanLogicShortCircuitOps() {
        boolean b = false;
        int x = 3;
        if (x < 0 && (b = true)) {
        }
        System.out.println(b);
        if (x > 0 || (b = true)) {
        }
        System.out.println(b);
    }

    public static void booleanBitwiseOps() {
        boolean b = false;
        int x = 3;
        /*
         * NOT OPERATION
         */

        if (x < 0 & (b = true)) {
        }
        System.out.println(b);
        if (x > 0 | (b = true)) {
        }
        System.out.println(b);
    }

    public static void compareStrings() {
        String s1 = sc.next(), s2 = sc.next();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public static boolean admitToFilm(int certification, int ageOfAdmittance) {
        return ageOfAdmittance >= certification;
    }

    public static void switchVowelOrConsonant() {
        char letter = sc.next().charAt(0);
        if (Character.isLetter(letter)) {
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 65:
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
            }
        }
    }

    public static void ifMonth() {
        final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6, JUL = 7, AUG = 8, OCT = 9, SEP = 10, NOV = 11, DEZ = 12;
        System.out.println("Insert a number month reference between 1-12: ");
        int month = sc.nextInt();
        if (month > DEZ || month < JAN) {
            System.out.println(month + " is out of range");
        } else if (month == JAN) {
            System.out.println("January");
        } else if (month == FEB) {
            System.out.println("February");
        } else if (month == MAR) {
            System.out.println("March");
        } else if (month == APR) {
            System.out.println("April");
        } else if (month == MAY) {
            System.out.println("May");
        } else if (month == JUN) {
            System.out.println("June");
        } else if (month == JUL) {
            System.out.println("July");
        } else if (month == AUG) {
            System.out.println("August");
        } else if (month == OCT) {
            System.out.println("October");
        } else if (month == SEP) {
            System.out.println("September");
        } else if (month == NOV) {
            System.out.println("November");
        } else {
            System.out.println("December");
        }
    }

    public static void ifGrade() {
        System.out.println("Insert a number between 0-100: ");
        int mark = sc.nextInt();
        if (mark >= 70 && mark <= 100) {
            System.out.println("A");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("B");
        } else if (mark >= 50 && mark <= 59) {
            System.out.println("C");
        } else if (mark >= 40 && mark <= 49) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void switchMathOperation() {
        double answer = 0.0;
        boolean operationOK = true;
        double n1 = sc.nextDouble(), n2 = sc.nextDouble();
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                answer = n1 + n2;
                break;
            case '-':
                answer = n1 - n2;
                break;
            case '*':
                answer = n1 * n2;
                break;
            case '/':
                answer = n1 / n2;
                break;
            default:
                System.out.println("Unknown mathematical operator");
                operationOK = false;
        }

        if (operationOK) {
            System.out.println(answer);
        }
    }

    public static void ifTemperature() {
        int temperature = 0;
        final int COLD = 0, MILD = 15, WARM = 20, VERY_WARM = 25, HOT = 30;
        temperature = sc.nextInt();

        if (temperature <= COLD) {
            System.out.println("cold");
        } else if (temperature > COLD && temperature < MILD) {
            System.out.println("a little cold, but ok");
        } else if (temperature >= MILD && temperature < WARM) {
            System.out.println("mild");
        } else if (temperature >= WARM && temperature < VERY_WARM) {
            System.out.println("warm");
        } else if (temperature >= VERY_WARM && temperature < HOT) {
            System.out.println("very warm");
        } else {
            System.out.println("hot");
        }
    }

    public static void switchDaysInMonth() {
        int numDays = 0;
        final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6, JUL = 7, AUG = 8, OCT = 9, SEP = 10, NOV = 11, DEZ = 12;
        System.out.println("Insert a number month reference between 1-12: ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 10:
            case 11:
                numDays = 30;
                break;
            case 2:
                System.out.println("Insert the year: ");
                int year = sc.nextInt();
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
        }

        System.out.println(numDays);
    }


}
