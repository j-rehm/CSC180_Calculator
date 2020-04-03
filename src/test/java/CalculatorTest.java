import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // arrange
        double expectedResult = 19;

        // act
        double actualResult = Calculator.Add(9, 10);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void subtract() {
        // arrange
        double expectedResult = 15;

        // act
        double actualResult = Calculator.Subtract(20, 5);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply() {
        // arrange
        double expectedResult = 18;

        // act
        double actualResult = Calculator.Multiply(6, 3);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide() {
        // arrange
        double expectedResult = 9;

        // act
        double actualResult = Calculator.Divide(27, 3);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}