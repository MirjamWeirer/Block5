package rekursion;

public class HerunterzählenDemo {
    public static void main(String[] args) {

        reduce(99,-5);


    }
    public static void reduce (int value, int stopValue){
        System.out.println(value);

        if (value == stopValue || value == 0){
            return;
        }
        reduce(value -1,stopValue);
    }
}
