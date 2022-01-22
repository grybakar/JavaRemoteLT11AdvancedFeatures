package testingRecap;

import java.util.logging.Logger;

public class Calculator {

//private static final Logger LOGGER = Logger.getLogger(Calculator.class);


    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int subtractMultipleNumber(int[] numbers) {
        int subtractionResult = 0;
        for (int number : numbers) {
            subtractionResult -= number;
        }
        return subtractionResult;
    }

    public int addMultipleNumbers(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divideTwoNumber(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }

    public int divideByZero(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}

