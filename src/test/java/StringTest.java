import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringTest {

    @Test
    void test(){
        Strings s = new Strings();
        String expected = "\"Abracadabra\"";
        String actual = s.insertQuotes("Abracadabra");
        System.out.println(actual);
        assertEquals(actual, expected);
    }
}
