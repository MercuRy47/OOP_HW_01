import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numerator, denominator;

        numerator = kb.nextInt();
        denominator = kb.nextInt();
        Fraction fraction = new Fraction(numerator, denominator);

        // 2
        fraction.makeNewFormat().print();
 
    }
}