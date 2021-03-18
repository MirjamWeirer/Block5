package rekursion;

public class DigitSumRecursiveDemo {
    public static void main(String[] args) {
        //Ziffernsumme berchnen
        System.out.println("getDigitSum(5) = " + getDigitSum(5));
        System.out.println("getDigitSum(12345) = " + getDigitSum(12345));
        System.out.println("getDigitSumLimit(12345) = " + getDigitSumLimit(12345));
        System.out.println("power(2,3) = " + power(2,3));
        System.out.println("power(2,3) = " + power(3,3));
        System.out.println(multiplicate(5,4));
    }

    public static int getDigitSum(int number) {
        if (number < 10) {
            return number;
        }else{
            int lastNumber = number % 10;
            number = number / 10;
            return lastNumber + getDigitSum(number);
        }
    }
    
    public static int getDigitSumLimit(int number){
        if (number < 10)return  number;
        return number % 10 + getDigitSum(number /10);
    }

    public static int power(int a, int b){
        //calculate a exp b ( a hoch b) with recusion
        if (b < 2) return a;
        return a * power(a, b-1);

    }
    
    public static int multiplicate (int a, int b){
        //multipliacte a * b,  but just do it with + and recrusion
        if (b >=1 && a >=1){
            return a + multiplicate(a, b-1);
        }
        return 0;
    }
}
