import java.util.Scanner;

public class Tester9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numerator, denominator, numerator2, denominator2;

        String operator;

        int count = kb.nextInt();
        Fraction fraction_add = new Fraction();

        numerator = kb.nextInt();
        denominator = kb.nextInt();
        fraction_add = new Fraction(numerator, denominator);

        // 9
        if (count > 1) {
            for(int i = 0; i < count-1; i++){

                operator = kb.next();

                numerator2 = kb.nextInt();
                denominator2 = kb.nextInt();

                if (operator.equalsIgnoreCase("add")) {
                    Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
                    fraction_add = fraction_add.add(fraction_add2).makeNewFormat();
                }
                if (operator.equalsIgnoreCase("minus")) {

                    Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
                    fraction_add = fraction_add.minus(fraction_add2).makeNewFormat();
                }
                if (operator.equalsIgnoreCase("mul")) {

                    Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
                    fraction_add = fraction_add.multiply(fraction_add2).makeNewFormat();
                }
                if (operator.equalsIgnoreCase("div")) {

                    Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
                    fraction_add = fraction_add.divide(fraction_add2).makeNewFormat();
                }
            }
        }
        fraction_add.print();

    }
}