//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson3;

public class Lesson3 {
    public Lesson3() {
    }

    public static void main(String[] args) {
        Changeplaces();
        array100();
        countWith2AllLess6();
        squareArray();
        twoArgumentMethod(3, 6);
    }

    private static void Changeplaces() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }

        System.out.println();
    }

    private static void array100() {
        int[] array = new int[100];

        for(int i = 0; i < 100; ++i) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static void countWith2AllLess6() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    private static void squareArray() {
        int[][] arr = new int[6][6];

        for(int i = 0; i < 6; ++i) {
            System.out.println();

            for(int j = 0; j < 6; ++j) {
                if (i == j) {
                    System.out.print("1 ");
                } else if (i + j == arr.length - 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
        }

    }

    private static int[] twoArgumentMethod(int len, int initialValue) {
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = initialValue;
        }

        return arr;
    }
}
