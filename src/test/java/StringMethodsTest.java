import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringMethodsTest {

    @Test
    public void testInsertQuotes() {
        String s1 = "Федор Достоевский писал";
        String s2 = "Надо любить жизнь больше, чем смысл жизни.";
        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";

        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.insertQuotes(s1, s2);

        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotes_doubleQuotes() {
        String s1 = "Наполеон Бонапарт писал";
        String s2 = "В моем словаре нет слова «невозможно».";
        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";

        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.insertQuotes(s1, s2);

        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityName_case1() {
        String cityNameBeforeCap = "ташкент";
        String expectedResult = "Ташкент";

        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.cityName(cityNameBeforeCap);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityName_case2() {
        String cityNameBeforeCap = "ЧикаГО";
        String expectedResult = "Чикаго";

        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.cityName(cityNameBeforeCap);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityName_twoWords() {
        String cityNameBeforeCap = "mexiCo ciTY";
        String expectedResult = "Mexico City";
        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.cityName(cityNameBeforeCap);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityName_twoWordsRus() {
        String cityNameBeforeCap = "кривой рог";
        String expectedResult = "Кривой Рог";
        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.cityName(cityNameBeforeCap);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityName_twoWordsWithDash() {
        String cityNameBeforeCap = "ивано-фРанковск";
        String expectedResult = "Ивано-Франковск";
        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.cityName(cityNameBeforeCap);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityName_multiWord() {
        String cityNameBeforeCap = "NeW YorK ciTy";
        String expectedResult = "New York City";
        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.cityName(cityNameBeforeCap);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBetweenParameters_case1() {
        String word = "Abracadabra";
        String param = "b";
        String expectedResult = "bracadab";

        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.betweenParameters(word, param);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBetweenParameters_case2() {
        String word = "Whippersnapper";
        String param = "p";
        String expectedResult = "ppersnapp";

        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.betweenParameters(word, param);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBetweenParameters_endBoundaryValidValues() {
        String word = "Whippersnapp";
        String param = "p";
        String expectedResult = "ppersnapp";

        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.betweenParameters(word, param);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBetweenParameters_startBoundaryValidValues() {
        String word = "ppersnapp";
        String param = "p";
        String expectedResult = "ppersnapp";

        StringMethods stringMethods = new StringMethods();
        String actualResult = stringMethods.betweenParameters(word, param);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFirstAndEndTheSame_true() {
        String word = "Abracadabra";
        StringMethods stringMethods = new StringMethods();

        assertTrue(stringMethods.firstAndEndTheSame(word));
    }

    @Test
    public void testFirstAndEndTheSame_false() {
        String word = "Whippersnapper";
        StringMethods stringMethods = new StringMethods();

        assertFalse(stringMethods.firstAndEndTheSame(word));
    }

    // Task 12
    @Test
    public void tetLastWord_case1() {
        String word = "Red Rover";
        String expected = "Rover";

        StringMethods stringMethods = new StringMethods();
        String actual = stringMethods.lastWord(word);

        assertEquals(actual, expected);
    }

    // Task 13
    @Test
    public void deleteBetweenTwoIndexes() {
        String word = "Red rover";
        String expected = "Rover";

        StringMethods stringMethods = new StringMethods();
        String actual = stringMethods.deleteBetweenTwoIndexes(word, 1, 4);

        assertEquals(actual, expected);
    }

    // Task 15
    @Test
    public void testFullName() {
        String data = "Александр Сергеевич Пушкин";
        String expected = "Имя: Александр\n"
                + "Отчество: Сергеевич\n"
                + "Фамилия: Пушкин";

        StringMethods stringMethods = new StringMethods();
        String actual = stringMethods.fullName(data);

        assertEquals(actual, expected);
    }

    @Test
    public void testFullName_InvalidFirstLetter() {
        String data = "aлександр Сергеевич Пушкин";
        String expected = "Invalid name";

        StringMethods stringMethods = new StringMethods();
        String actual = stringMethods.fullName(data);

        assertEquals(actual, expected);
    }

    // Task 16
    @Test
    public void testRepeat(){
        String data = "one";
        String expected = "oneoneoneoneone";

        StringMethods stringMethods = new StringMethods();
        String actual = stringMethods.repeat(data, 5);

        assertEquals(actual, expected);
    }

    //Task17
    @Test
    public void testFindNumber() {
        String data = "I love Java";
        int index = 8;  // a = 97
        int expected = 97;

        StringMethods stringMethods = new StringMethods();
        int actual = stringMethods.findNumber(data, index);

        assertEquals(actual, expected);
    }

    //Task 18
    @Test
    public void equalsIgnoreCase_true(){
        StringMethods stringMethods = new StringMethods();

        assertTrue(stringMethods.compareThreeWords("one", "One", "ONE"));
    }

    @Test
    public void equalsIgnoreCase_false(){
        StringMethods stringMethods = new StringMethods();

        assertFalse(stringMethods.compareThreeWords("one", "Один", "ONE"));
    }





}
