package typeCasting;
public class Test3 {
    public static void main(String[] args) {
        short a = 10 ; 
        short b = 20 ; 
        short c = (short) (a+b); // the mistake here is int cn=ant be ocnverted to short while add 
        System.out.println(c);
    }
}
