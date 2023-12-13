import java.util.Scanner;

public class Tester10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numerator, denominator, numerator2, denominator2;

        numerator = kb.nextInt();
        denominator = kb.nextInt();
        Fraction fraction = new Fraction(numerator, denominator);

        // 10
        numerator2 = kb.nextInt();
        denominator2 = kb.nextInt();
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        fraction = fraction.makeNewFormat();
        fraction2 = fraction2.makeNewFormat();

        if(fraction.isEqual(fraction2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        
    }
}