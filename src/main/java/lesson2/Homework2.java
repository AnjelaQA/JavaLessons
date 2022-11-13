package lesson2;

import java.lang.reflect.Parameter;

public class Homework2 {
    public static void main(String[] args) {
        from10To20(1,19);
        PositiveOrNegative(0);
        ReturnTrueOrFalse(0);
        ParameterXCount("Anjela", 5);

    }

    private static void from10To20(int first, int second) {
        if (first + second >=10 && first + second <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void PositiveOrNegative(int number) {
        if (number < 0){
            System.out.println("отрицательное число");
        } else {
            System.out.println("положительное число");
        }
    }

    private static boolean ReturnTrueOrFalse(int a) {
        if (a < 0){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    private static void ParameterXCount(String hello, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(hello);
        }
    }
}
