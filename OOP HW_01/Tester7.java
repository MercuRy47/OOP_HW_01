import java.util.Scanner;

public class Tester7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numerator, denominator, numerator2, denominator2;

        // 7
        int count = kb.nextInt();
        Fraction fraction_add = new Fraction();

        numerator = kb.nextInt();
        denominator = kb.nextInt();
        fraction_add = new Fraction(numerator, denominator);

        if (count > 1) {
            for(int i = 0; i < count-1; i++){
                numerator2 = kb.nextInt();
                denominator2 = kb.nextInt();
                Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
                fraction_add = fraction_add2.add(fraction_add).makeNewFormat();
            }
        }
        fraction_add.makeNewFormat().print();
        
    }
}