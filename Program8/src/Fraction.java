import java.util.Scanner;
public class Fraction {
        private int numerator;
        private int denominator;
        // every fraction object must be passed a numerator and a denomator as intergers
        public Fraction(int n,int d)
        {
            numerator = n;
            denominator = d;
        }

        public Fraction(Fraction other)
        {
            numerator = other.numerator;
            denominator = other.denominator;
        }

        public Fraction subtract (Fraction other)
        {
            int denom = denominator * other.denominator;
            int numer1 = numerator * other.denominator;
            int numer2 = other.numerator * denominator;
            Fraction fak = new Fraction(numer1 - numer2, denom);
            fak.reduceFraction();
            return fak;
        }
        public  Fraction add (Fraction other)
        {
            int denom = denominator * other.denominator;
            int numer1 = numerator * other.denominator;
            int numer2 = other.numerator * denominator;

            Fraction fak = new Fraction(numer1 + numer2, denom);
            fak.reduceFraction();
            return fak;
        }
        public boolean equals(Fraction other)
        {
            Fraction frak1 = new Fraction(other);
            frak1.reduceFraction();
            // other option would be to call reduce function in the constructor
            Fraction frak2 = new Fraction(this);
            frak2.reduceFraction();

            return ((frak1.numerator == frak2.numerator) && (frak2.denominator == frak2.denominator) );
        }

        public Fraction multiply (Fraction other) {
            Fraction result = new Fraction(numerator * other.numerator,
                    denominator * other.denominator);
            result.reduceFraction();
            return result;
        }

        public Fraction divide(Fraction other) {
            Fraction result = new Fraction(numerator * other.denominator,
                    denominator * other.numerator);
            result.reduceFraction();
            return result;
        }
        private void reduceFraction()
        {
            Fraction result = new Fraction(numerator, denominator);
            int i = Math.min(Math.abs(result.numerator),
                    Math.abs(result.denominator));
            if (i == 0)  // might have to pass it other. numerator and denmanator
                return;
            while ((numerator % i != 0) || (denominator % i != 0 ))
                i --;
            numerator = numerator / i;
            denominator = denominator / i;
        }

        public String toString() {
            return "" + numerator + "/" + denominator;
        }
    }

