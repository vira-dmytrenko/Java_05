import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreateArrayTest {
    @Test
    public void testCreateArrayTest_HappyPath() {
        // arrange
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int[] expected = {1, 2, 3, 4, 5};

        // act
        CreateArray createArray = new CreateArray();
        int[] actual = createArray.createIntArray(num1, num2, num3, num4, num5);

    }

    @Test
    public void testCreateArrayTest_HappyPathMixedValues() {
        // arrange
        int num1 = 8;
        int num2 = 9;
        int num3 = 3;
        int num4 = 10;
        int num5 = 111;
        int[] expected = {8, 9, 3, 10, 111};

        // act
        CreateArray createArray = new CreateArray();
        int[] actual = createArray.createIntArray(num1, num2, num3, num4, num5);

        assertEquals(actual, expected);
    }

    @Test
    public void testCreateArrayTest_HappyPathNegativeValues() {
        // arrange
        int num1 = -9;
        int num2 = 9;
        int num3 = 0;
        int num4 = 10;
        int num5 = -1000;
        int[] expected = {-9, 9, 0, 10, -1000};

        // act
        CreateArray createArray = new CreateArray();
        int[] actual = createArray.createIntArray(num1, num2, num3, num4, num5);

        assertEquals(actual, expected);
    }

    @Test
    public void testCreateIntArrayFromText_HappyPath() {
        String str = "3 4 1 8 10 12.3";
        int[] expected = {3, 4, 1, 8, 10, 12};

        CreateArray createArray = new CreateArray();
        int[] actual = createArray.createIntArrayFromText(str);

        assertEquals(actual, expected);
    }

    @Test
    public void testCreateIntArrayFromText_containsNegativeNumbers() {
        String str = "-103 4.45 1 8 0 12.3 10 3 8";
        int[] expected = {-103, 4, 1, 8, 0, 12, 10, 3, 8};

        CreateArray createArray = new CreateArray();
        int[] actual = createArray.createIntArrayFromText(str);

        assertEquals(actual, expected);
    }

    @Test
    public void testCreateIntArrayFromText_lengthEqualsOne() {
        String str = "100";
        int[] expected = {100};

        CreateArray createArray = new CreateArray();
        int[] actual = createArray.createIntArrayFromText(str);

        assertEquals(actual, expected);
    }

    @Test
    public void testCreateIntArrayFromText_nullOrEmptyString() {
        String strNull = null;
        String strEmpty = "";
        int[] expected = {};

        CreateArray createArray = new CreateArray();
        int[] actual1 = createArray.createIntArrayFromText(strNull);
        int[] actual2 = createArray.createIntArrayFromText(strEmpty);

        assertEquals(actual1, expected);
        assertEquals(actual2, expected);
    }

    @Test
    public void testGetPhoneNumberAndCountry_HappyPath () {
        int[] dataArray = {1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
        String[] expected = {"1(800)123-45-67", "USA"};

        CreateArray createArray = new CreateArray();
        String[] actual = createArray.getPhoneNumberAndCountry(dataArray);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetPhoneNumberAndCountry_HappyPath_countryCode () {
        int[] dataArray = {7, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
        String[] expected = {"7(800)123-45-67", "RUS"};

        CreateArray createArray = new CreateArray();
        String[] actual = createArray.getPhoneNumberAndCountry(dataArray);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetPhoneNumberAndCountry_invalidNumbers () {
        int[] dataArray = {1, 8, 10, 0, 1, 2, 3, 4, 5, 6, 7};
        String[] expected = {};

        CreateArray createArray = new CreateArray();
        String[] actual = createArray.getPhoneNumberAndCountry(dataArray);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetPhoneNumberAndCountry_invalidNumbersContainsNegative () {
        int[] dataArray = {1, 8, 10, 0, 1, 2, -3, 4, 5, 6, 7};
        String[] expected = {};

        CreateArray createArray = new CreateArray();
        String[] actual = createArray.getPhoneNumberAndCountry(dataArray);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetPhoneNumberAndCountry_invalidArrayLength () {
        int[] dataArray = {1, 8, 0, 0, 1, 2, 3, 4, 5, 6};
        String[] expected = {};

        CreateArray createArray = new CreateArray();
        String[] actual = createArray.getPhoneNumberAndCountry(dataArray);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetPhoneNumberAndCountry_NullOrEmptyArray () {
        int[] dataArray1 = {};
        int[] dataArray2 = null;

        String[] expected = {};

        CreateArray createArray = new CreateArray();
        String[] actual1 = createArray.getPhoneNumberAndCountry(dataArray1);
        String[] actual2 = createArray.getPhoneNumberAndCountry(dataArray2);

        assertEquals(actual1, expected);
        assertEquals(actual2, expected);
    }



}
