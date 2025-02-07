// package Intro.Intro-05. Intro-05-Java-Math-Operators;

/**

* The HelloWorld program implements an application that

* simply displays "Hello World!" to the standard output.

*Add
Subtract
Multiply
Divide numbers that give non-decimal and infinite decimal output with both float and double
For example: 4 / 2 = 2 and 2 / 3 = 0.66666666666
Exponents to the power of 2 and 3
Square root
Do not round.


* @author  Tony Tran

* @version 1.0

* @since   2025-02-05

*/

public class MathOperators {
    public static void main(String[] args) {
        System.out.println("5 + 5 = " + (5 + 5));
        System.out.println("4 + 5 = " + (4 * 5));
        System.out.println("4 / 2 = " + (4f / 2));
        System.out.println("2 / 3 = " + (2f / 3f));
        System.out.println("6^3 = " + (Math.pow(6, 3)));
        System.out.println("√5 = " + (Math.sqrt(5)));
    }
}
