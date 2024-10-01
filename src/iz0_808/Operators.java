package iz0_808;

import java.util.Scanner;

public class Operators {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input x value: ");
        int x = sc.nextInt();
        System.out.println("input y value: ");
        int y = sc.nextInt();
        logical(x, y);
        simpleMaths(x, y);
        System.out.println("Is X="+x+" a multiple of Y="+y+"? "+modulus(x, y));
        System.out.println("______________________________________");
        incrDecr();
    }

    public static void logical(int x, int y) {
        if(x > 0 && y > 0) {
            System.out.println("X and Y are positives");
        } else if (x < 0 && y < 0) {
            System.out.println("X and Y are negatives");
        } else if (x == 0 || y == 0) {
            System.out.println("X or Y is zero");
        } else if (x < 0 | y < 0) {
            System.out.println("X or Y is minor than zero");
        }
    }

    public static void simpleMaths(int x, int y) {
        System.out.println("The sum of "+x+" and "+y+" is "+ (x+y));
        System.out.println("The product of "+x+" and "+y+" is "+ (x*y));
        System.out.println("The difference of "+x+" and "+y+" is "+ (x-y));
        System.out.println("The quotient of "+x+" and "+y+" is "+ (double) (x/y));
    }

    public static boolean modulus(int x, int y) {
        return x % y == 0;
    }

    public static void incrDecr() {
        int x=0, w=0, y=0, z=0;
        x=4;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);
        w=20;
        x=10;
        y=-5;
        z=0;
        System.out.println( w == x && y != z );
        System.out.println( w == x || y != z );
        System.out.println( ! ( w == (x + z) ) );
    }
}
