import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Part1Tests {

    @Test
    public void testTask9(){
        Task9 task9 = new Task9();

        int[] expected = {2, 4};
        assertEquals(task9.intersection(new int[]{1, 2, 4, 5, 89}, new int[]{8, 9, 4, 2}), expected);

    }
}
