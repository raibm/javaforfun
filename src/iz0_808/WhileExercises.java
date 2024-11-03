package iz0_808;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WhileExercises {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        thirdOrderPolynomial();
//        whileAverage();
//        whileGrades();
        whileHistogram();
    }

    public static void thirdOrderPolynomial() {
        String applyAgain;
        double x, a, b, c, d, result;
        do {
            System.out.println("Insert the value of A:");
            a = sc.nextDouble();
            System.out.println("Insert the value of B:");
            b = sc.nextDouble();
            System.out.println("Insert the value of C:");
            c = sc.nextDouble();
            System.out.println("Insert the value of D:");
            d = sc.nextDouble();
            System.out.println("Insert the value of X:");
            x = sc.nextDouble();
            result = a * (Math.pow(x, 3)) + b * (Math.pow(x, 2)) + c * x + d;
            System.out.println("The result is:" + result);
            System.out.println("Do you want to try again? [y][n]");
            applyAgain = sc.next();
        } while (applyAgain.equals("y"));
    }

    public static void whileAverage() {
        System.out.println("Insert the number of numbers:");
        int n = sc.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        double total = 0;
        int loops = 1;
        while (loops <= n) {
            System.out.println("Input a value:");
            total += sc.nextInt();
            loops++;
        }

        System.out.println("Average is: " + total / n);

    }

    public static void whileGrades() {
        String grade;
        Map<String, Integer> grades = new HashMap<>();
        grades.put("a", 0);
        grades.put("b", 0);
        grades.put("c", 0);
        grades.put("d", 0);
        grades.put("e", 0);
        do {
            System.out.println("Input one of [a/A][b/B][c/C][d/D][e/E] to count a grade, or press [x/X] to exit.");
            grade = sc.next().toLowerCase();
            switch (grade) {
                case "a":
                case "b":
                case "c":
                case "d":
                case "e":
                    grades.put(grade, Integer.sum(grades.get(grade), 1));
            }
        } while (!grade.equals("x"));
        System.out.println(grades);
    }

    public static void whileHistogram() {

    }

    public static void whileLargest() {

    }
}
