import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class OddEvenElementsInArrayTest {

    @Test
    public void testCountOddEvenValuesInArray_HappyPath() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {4, 4};

        OddEvenElementsInArray obj = new OddEvenElementsInArray();
        int[] actual = obj.countOddEvenValuesInArray(data);

        assertEquals(actual, expected);
    }

    @Test
    public void testCountOddEvenValuesInArray_oneValueInArray() {
        int[] data = {1};
        int[] expected = {0, 1};

        OddEvenElementsInArray obj = new OddEvenElementsInArray();
        int[] actual = obj.countOddEvenValuesInArray(data);

        assertEquals(actual, expected);
    }

    @Test
    public void testCountOddEvenValuesInArray_emptyArray() {
        int[] data = {};
        int[] expected = {};

        OddEvenElementsInArray obj = new OddEvenElementsInArray();
        int[] actual = obj.countOddEvenValuesInArray(data);

        assertEquals(actual, expected);
    }

}
