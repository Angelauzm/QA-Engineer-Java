public class Array {

    public static void main(String[] args) {

        //корректный массив
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArrayElements(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
        //массив с неверным символом
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "i", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArrayElements(array2);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        //массив с неверным размером
        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "i", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            int sum = sumArrayElements(array3);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}
