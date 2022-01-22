package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    void testadd() {
        //given
        int firstNumber = 12;
        int secondNumber = 3;
        //when
        int actualAddResult = calculator.add(firstNumber, secondNumber);
        //then
        assertEquals(15, actualAddResult); //JUNIT assertEqual
        assertThat(actualAddResult).isEqualTo(15); //Tas pats su ASSERTJ biblioteka

    }

    @Test
    void testaddMultipleNumbers() {
        int[] numbersToTest = {5, 2, 6, 8, 1};
        int actualAddMultipleNumbersResult = calculator.addMultipleNumbers(numbersToTest);
        assertThat(actualAddMultipleNumbersResult).isEqualTo(22);
    }

    @Test
    void testsubtract() {
        int firstNumber = 10;
        int secondNumber = 5;
        int actualSubtractResult = calculator.subtract(firstNumber, secondNumber);
        assertThat(actualSubtractResult).isEqualTo(5);

    }

    @Test
    void testsubtractMultipleNumber() {
        int[] numbersToTest = {5, 2, 6, 8, 1};
        int actualSubtractionResult = calculator.subtractMultipleNumber(numbersToTest);
        assertThat(actualSubtractionResult).isEqualTo(-22);
    }

    @Test
    void testmultiply() {
        int firstNumber = 10;
        int secondNumber = 5;
        int actualMultiplyResult = calculator.multiply(firstNumber, secondNumber);
        assertThat(actualMultiplyResult).isEqualTo(50);
    }

    @Test
    void testDivideTwoNumbers() {
        int firstNumber = 4;
        int secondNumber = 2;

        double actualResult = calculator.divideTwoNumber(firstNumber, secondNumber);

        assertThat(actualResult).isEqualTo(2);
    }

    @Test
    void testDivideTwoNumbersWhereResultIsNotAnInteger() {
        int firstNumber = 9;
        int secondNumber = 2;
        double actualResult = calculator.divideTwoNumber(firstNumber, secondNumber);
        assertThat(actualResult).isEqualTo(4.5);
    }
    @Test
    void testDivideByZero(){
        int firstNumber = 10;
        int secondNumber = 0;
        int actualResult = calculator.divideByZero(firstNumber, secondNumber);


    }
}