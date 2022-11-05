import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OddEvenTest {
    @Test
    public void testOddEvenMinusValue() {
        // arrange
        int number = -345;
        String expected = "Odd";

        // act
        OddEven oddEven = new OddEven();
        String actual = oddEven.oddEven(number);

        assertEquals(actual, expected);
    }

    @Test
    public void testOddEvenZeroValue() {
        // arrange
        int number = 0;
        String expected = "Even";

        // act
        OddEven oddEven = new OddEven();
        String actual = oddEven.oddEven(number);

        assertEquals(actual, expected);
    }

    @Test
    public void testOddEvenPositiveValue() {
        // arrange
        int number = 222222;
        String expected = "Even";

        // act
        OddEven oddEven = new OddEven();
        String actual = oddEven.oddEven(number);

        assertEquals(actual, expected);
    }

    @Test
    public void testOddEvenMaxValue() {
        // arrange
        long number = Long.MAX_VALUE;
        String expected = "Odd";

        // act
        OddEven oddEven = new OddEven();
        String actual = oddEven.oddEven(number);

        assertEquals(actual, expected);
    }

    @Test
    public void testOddEvenMinValue() {
        // arrange
        long number = Long.MIN_VALUE;
        String expected = "Even";

        // act
        OddEven oddEven = new OddEven();
        String actual = oddEven.oddEven(number);

        assertEquals(actual, expected);
    }


}
