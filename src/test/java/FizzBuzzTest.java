import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FizzBuzzTest {
    //1. Positive testing Happy path
    // 1. if (start <= end)
    // return array;
    @Test
    public void testStartLessThanEnd_HappyPath(){
        // arrange
        int start = 1;
        int end = 20;

        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        // act
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] actualResult = fizzBuzz.fizzBuzz(start, end);

        assertEquals(actualResult, expectedResult);
    }

    //1. Positive testing Happy path
    //2. if (start == end)
    @Test
    public void testStartEqualsEnd_HappyPath(){
        // arrange
        int start = 1;
        int end = 1;

        String[] expectedResult = {"1"};

        // act
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] actualResult = fizzBuzz.fizzBuzz(start, end);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStartLessThanEnd_StartEnrAreNegative_HappyPath(){
        // arrange
        int start = - 20;
        int end = -1;

        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13",
                "Fizz", "-11", "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};

        // act
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] actualResult = fizzBuzz.fizzBuzz(start, end);

        assertEquals(actualResult, expectedResult);
    }


    // 2. if (start > end)
    @Test
    public void testStartGraterThenEnd_NegativeTest(){
        // arrange
        int start = 20;
        int end = 1;

        String[] expectedResult = {};

        // act
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] actualResult = fizzBuzz.fizzBuzz(start, end);

        assertEquals(actualResult, expectedResult);
    }
}
