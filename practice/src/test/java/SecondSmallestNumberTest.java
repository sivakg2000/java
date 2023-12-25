
import com.siva.apps.practice.java8.SecondSmallestNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;


public class SecondSmallestNumberTest {
    @Test
    public void find(){
            List<Integer> numbers = Arrays.asList(10, 5, 8, 2,3, 12, 7);
            int result=new SecondSmallestNumber().find(numbers);
            Assertions.assertEquals(3,result);
    }


    @Test
    public void findNegativeNumber(){
        List<Integer> numbers = Arrays.asList(10, 5, 8, -2,-3, 12, 7);
        int result=new SecondSmallestNumber().find(numbers);
        Assertions.assertEquals(-2,result);
    }


    @Test
    public void findNegativeNumberAndPossitive(){
        List<Integer> numbers = Arrays.asList(10, 5, 8, -2, 12, 7);
        int result=new SecondSmallestNumber().find(numbers);
        Assertions.assertEquals(5,result);
    }


    /*@Test
    public void findEmptyAndException(){
        List<Integer> numbers = Collections.emptyList();
        try {
            int result = new SecondSmallestNumber().find(numbers);
            fail("Should have thrown an exception");
        }catch (Exception ex){
            Assertions.assertEquals("java.lang.IllegalArgumentException: List is too short", ex,ex.getMessage());
        }
    }*/
}
