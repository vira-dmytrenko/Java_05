import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeleteNumberTest {

    @Test
    public void testDeleteNumber_HappyPath() {
        int[] data = {0, 1, 2, 2, 3, 0, 4, 2};
        int removedNumber = 2;
        int[] expected = {0, 1, 3, 0, 4};

        DeleteNumber deleteNumber = new DeleteNumber();
        int[] actual = deleteNumber.deleteNumber(data, removedNumber);

        assertEquals(actual, expected);
    }

    @Test
    public void testDeleteNumber_NoRemovedNumbers() {
        int[] data = {0, 1, 2, 2, 3, 0, 4, 2};
        int removedNumber = 5;
        int[] expected = {0, 1, 2, 2, 3, 0, 4, 2};

        DeleteNumber deleteNumber = new DeleteNumber();
        int[] actual = deleteNumber.deleteNumber(data, removedNumber);

        assertEquals(actual, expected);
    }

    @Test
    public void testDeleteNumber_NegativeNumbers() {
        int[] data = {0, -1001, 2, 2, 3, 0, 4, 2};
        int removedNumber = 2;
        int[] expected = {0, -1001, 3, 0, 4};

        DeleteNumber deleteNumber = new DeleteNumber();
        int[] actual = deleteNumber.deleteNumber(data, removedNumber);

        assertEquals(actual, expected);
    }

    @Test
    public void testDeleteNumber_RemoveNegativeNumbers() {
        int[] data = {0, -2, 2, 2, 3, 0, 4, 2, 3, 10};
        int removedNumber = -2;
        int[] expected = {0, 2, 2, 3, 0, 4, 2, 3, 10};

        DeleteNumber deleteNumber = new DeleteNumber();
        int[] actual = deleteNumber.deleteNumber(data, removedNumber);

        assertEquals(actual, expected);
    }

    @Test
    public void testDeleteNumber_NullOrEmptyArray() {
        int[] data1 = {};
        int[] data2 = null;
        int removedNumber = 0;
        int[] expected = {};

        DeleteNumber deleteNumber = new DeleteNumber();
        int[] actual1 = deleteNumber.deleteNumber(data1, removedNumber);
        int[] actual2 = deleteNumber.deleteNumber(data2, removedNumber);

        assertEquals(actual1, expected);
        assertEquals(actual2, expected);
    }


}
