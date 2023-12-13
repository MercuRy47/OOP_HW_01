import java.util.Scanner;

public class Tester1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numerator, denominator;

        numerator = kb.nextInt();
        denominator = kb.nextInt();
        Fraction fraction = new Fraction(numerator, denominator);
        
        // 1
        fraction.print();
 
    }
}