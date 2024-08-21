package FactorialTest;

public class Factorial {
    public long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал не определен, число отрицательное.");
        }
        if (number == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
