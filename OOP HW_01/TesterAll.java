import java.util.Scanner;

public class TesterAll {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numerator, denominator, numerator2, denominator2;

        numerator = kb.nextInt();
        denominator = kb.nextInt();
        Fraction fraction = new Fraction(numerator, denominator);
        
        // 1
        //fraction.print();

        // 2
        //fraction.makeNewFormat().print();


        //numerator2 = kb.nextInt();
        //denominator2 = kb.nextInt();
        //Fraction fraction2 = new Fraction(numerator2, denominator2);
        
        // 3
        //fraction.multiply(fraction2).makeNewFormat().print();

        // 4
        //fraction.divide(fraction2).makeNewFormat().print();
        
        // 5
        //fraction.add(fraction2).makeNewFormat().print();
        
        // 6
        //fraction.minus(fraction2).makeNewFormat().print();

        // 7
        //String operator;

        //int count = kb.nextInt();
        //Fraction fraction_add = new Fraction();

        //numerator = kb.nextInt();
        //denominator = kb.nextInt();
        //fraction_add = new Fraction(numerator, denominator);

        // if (count > 1) {
        //     for(int i = 0; i < count-1; i++){
        //         numerator2 = kb.nextInt();
        //         denominator2 = kb.nextInt();
        //         Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
        //         fraction_add = fraction_add2.add(fraction_add).makeNewFormat();
        //     }
        // }
        // fraction_add.makeNewFormat().print();
        
        // 8
        //Fraction fraction_add2;  

        // if (count > 1) {
        //     for(int i = 0; i < count-1; i++){

        //         operator = kb.next();

        //         numerator2 = kb.nextInt();
        //         denominator2 = kb.nextInt();

        //         if (operator.equalsIgnoreCase("add")) {
        //             Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
        //             fraction_add = fraction_add.add(fraction_add2).makeNewFormat();
        //         }
        //         if (operator.equalsIgnoreCase("minus")) {

        //             Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
        //             fraction_add = fraction_add.minus(fraction_add2).makeNewFormat();
        //         }
        //     }
        // }
        // fraction_add.print();

        // 9
        //Fraction fraction_add2;   

        // if (count > 1) {
        //     for(int i = 0; i < count-1; i++){

        //         operator = kb.next();

        //         numerator2 = kb.nextInt();
        //         denominator2 = kb.nextInt();

        //         if (operator.equalsIgnoreCase("add")) {
        //             Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
        //             fraction_add = fraction_add.add(fraction_add2).makeNewFormat();
        //         }
        //         if (operator.equalsIgnoreCase("minus")) {

        //             Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
        //             fraction_add = fraction_add.minus(fraction_add2).makeNewFormat();
        //         }
        //         if (operator.equalsIgnoreCase("mul")) {

        //             Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
        //             fraction_add = fraction_add.multiply(fraction_add2).makeNewFormat();
        //         }
        //         if (operator.equalsIgnoreCase("div")) {

        //             Fraction fraction_add2 = new Fraction(numerator2, denominator2);   
        //             fraction_add = fraction_add.divide(fraction_add2).makeNewFormat();
        //         }
        //     }
        // }
        // fraction_add.print();

        // 10
        // numerator2 = kb.nextInt();
        // denominator2 = kb.nextInt();
        // Fraction fraction2 = new Fraction(numerator2, denominator2);

        // fraction = fraction.makeNewFormat();
        // fraction2 = fraction2.makeNewFormat();

        // if(fraction.isEqual(fraction2)){
        //     System.out.println("true");
        // }else {
        //     System.out.println("false");
        // }
        
    }
}