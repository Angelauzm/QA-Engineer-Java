public class Lesson1 {
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign(){
        int a = -4;
        int b = 65;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value){
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }else{
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 54;
        int b = -12;
        if (a >= b){
            System.out.println("a >= b");
        } else{
            System.out.println("a < b");
        }
    }

    public static boolean checkSumInRange(int a, int b){
        int sum =  a + b;
        return sum > 10 && sum <= 20;
    }

    public static void printNumberSigh(int a){
        if (a >= 0){
            System.out.println("Число пложительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNumberIsNegative(int num){
        return num < 0;
    }

    public static void printString(String str, int num){
        for (int i = 0; i < num; i++){
            System.out.println(str);
        }
    }

    public static boolean checkIsLeapYear(int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0){
            return false;
        } else {
            return year % 4 ==0;
        }
    }

    public static void invertArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public static int[] createArray(){
        int[] array = new int[100];
        for(int i = 0; i < 100; i++) {
            array[i] = i+1;
        }
        return  array;
    }

    public static void lessThenSix(int[] array){
        for(int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] *= 2;
            }
        }
    }

    public static void diagonalMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
    }

    public static int[] newArray(int len, int initialValue){
        int[] array = new int[len];
        for(int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor(45);
        compareNumbers();
        System.out.println(checkSumInRange(5,6));
        printNumberSigh(-40);
        printNumberSigh(150);
        printNumberSigh(0);
        System.out.println(checkNumberIsNegative(57));
        System.out.println(checkNumberIsNegative(-132));
        printString("Check",5);
        System.out.println(checkIsLeapYear(2024));
        System.out.println(checkIsLeapYear(2023));

        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        invertArray(arr);
        System.out.println(java.util.Arrays.toString(arr));

        int[] createArr = createArray();
        System.out.println(java.util.Arrays.toString(createArr));

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        lessThenSix(arr2);
        System.out.println(java.util.Arrays.toString(arr2));

        int [][]matrix = new int[10][10];
        diagonalMatrix(matrix);
        for (int[] idx: matrix){
            System.out.println(java.util.Arrays.toString(idx));
        }

        int[] arr3 = newArray(4,7);
        System.out.println(java.util.Arrays.toString(arr3));
    }
}
