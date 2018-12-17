import java.util.Locale;
import java.util.Scanner;
class Fraction {
    int numerator; // Числитель
    int denominator; // Знаменатель


    public Fraction(int num,int denom) {
        if (denom==0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }

        numerator=num;
        denominator=denom;
    }
    public  String minus(Fraction b){
        if (b.denominator==0||this.denominator==0) {

            return"Denominator can't be zero. Choose another one.";
        }
        else if (this.denominator==b.denominator){

                return Math.abs(this.numerator-b.numerator)+"/"+Math.abs(this.denominator);



        }
        else if (this.numerator - b.denominator<0 && this.denominator*b.numerator>0 || this.numerator - b.denominator>0 && this.denominator*b.numerator<0){
            return "-" +Math.abs(this.numerator-b.denominator)+"/"+Math.abs(this.denominator*b.numerator);
        }
        else {
            return Math.abs(this.numerator-b.denominator)+"/"+Math.abs(this.denominator*b.numerator);
        }



    }

    public String umno(Fraction b){
        if (b.denominator==0||this.denominator==0) {

            return"Denominator can't be zero. Choose another one.";
        }
        else if (this.numerator>0 && b.denominator<0 || this.numerator<0 && b.denominator>0){
            return "-" +Math.abs(this.numerator*b.denominator)+"/"+Math.abs(this.denominator*b.numerator);
        }
        else {
            return Math.abs(this.numerator*b.denominator)+"/"+Math.abs(this.denominator*b.numerator);
        }
    }
    public String divi(Fraction b){
        if (b.denominator==0||this.denominator==0) {

            return"Denominator can't be zero. Choose another one.";
        }
        else if (this.numerator>0 && b.denominator<0 || this.numerator<0 && b.denominator>0){
            return "-" +Math.abs(this.numerator*b.denominator)+"/"+Math.abs(this.denominator*b.numerator);
        }
        else {
            return Math.abs(this.numerator*b.denominator)+"/"+Math.abs(this.denominator*b.numerator);
        }
    }
}
public class Main {
    public static void main(String[] arqs){
        Fraction a=new Fraction(5,8);
        Fraction b=new Fraction(1,-6);
        System.out.println(a.minus(b));
        System.out.println(a.umno(b));
        System.out.println(a.divi(b));






    }
}















