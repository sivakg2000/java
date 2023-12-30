import com.siva.apps.practice.java8.GreaterAvgNumbers;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreaterAvgNumbersTest {
    @Test
    public void find(){
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<Integer> resList=new GreaterAvgNumbers().findList(numbers);
        List<Integer> expRes=Arrays.asList(30, 35, 40);
        assertEquals(expRes,resList);
    }
}
