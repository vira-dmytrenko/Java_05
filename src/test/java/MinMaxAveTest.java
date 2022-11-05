import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class MinMaxAveTest {



    @Test
    public void testMinMaxAve_HappyPath(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {3, 7, 5};
        int[] actual = minMaxAve.minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6);

        assertEquals(actual, expected);
    }

    @Test
    public void testMinMaxAve_HappyPath_mixedValues(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {3, 8, 5};
        int[] actual = minMaxAve.minMaxAve(new int[]{1, 2, 6, 4, 8, 3, 7, 5}, 2, 6);

        assertEquals(actual, expected);
    }

    @Test
    public void testMinMaxAve_equal_indexes(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {5, 5, 5};
        int[] actual = minMaxAve.minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4, 4);

        assertEquals(actual, expected);
    }

    @Test
    public void testMinMaxAve_upendedIndexes(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {3, 8, 5};
        int[] actual = minMaxAve.minMaxAve(new int[]{1, 2, 6, 4, 8, 3, 7, 5}, 6, 2);

        assertEquals(actual, expected);
    }

    @Test
    public void testMinMaxAve_NegativeValueInArray(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {-7, 8, 0};
        int[] actual = minMaxAve.minMaxAve(new int[]{1,-2, 3, -4, -5, 6, -7, 8}, 1, 7);

        assertEquals(actual, expected);
    }

    @Test
    public void testMinMaxAveIndexIsClose(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {4, 5, 4};
        int[] actual = minMaxAve.minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3, 4);

        assertEquals(actual, expected);
    }

    //------------------ Negative tests--------------------

    // test if indexes out of bounds
    @Test
    public void testMinMaxAveFirsIndexOutOfBound(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {};
        int[] actual = minMaxAve.minMaxAve(new int[]{1,-2, 3, -4, -5, 6, -7, 8}, -3, 6);

        assertEquals(actual, expected);
    }

    @Test
    public void testMinMaxAveSecondIndexOutOfBound(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {};
        int[] actual = minMaxAve.minMaxAve(new int[]{1,-2, 3, -4, -5, 6, -7, 8}, 0, 10);

        assertEquals(actual, expected);
    }

    // Boundary Values
    @Test
    public void testFirstIndexOutOfBoundBoundaryValues(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {};
        int[] actual = minMaxAve.minMaxAve(new int[]{1,-2, 3, -4, -5, 6, -7, 8}, -1, 6);

        assertEquals(actual, expected);
    }

    // Boundary Values
    @Test
    public void testSecondIndexOutOfBoundBoundaryValues(){
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] expected = {};
        int[] actual = minMaxAve.minMaxAve(new int[]{1,-2, 3, -4, -5, 6, -7, 8}, 0, 8);

        assertEquals(actual, expected);
    }

    // test null or empty array

    @Test
    public void testNullOrEmptyArray() {
        MinMaxAve minMaxAve = new MinMaxAve();
        int[] nullArray = null;
        int[] emptyArray = new int[0];

        int[] expected = {};

        assertEquals(minMaxAve.minMaxAve(emptyArray, 0, 0), expected);
        assertEquals(minMaxAve.minMaxAve(nullArray, 0, 0), expected);
    }









}
