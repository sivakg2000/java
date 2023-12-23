import com.siva.apps.practice.java8.PrimeNumber;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTest {
    @Test
    public  void  findPrime(){

        List<Integer> numbers = Arrays.asList(2, 7, 15, 23, 12, 31, 8, 17);
        List<Integer> expRes = Arrays.asList(2, 7, 23,31,17);

        List<Integer> result=new PrimeNumber().find(numbers);
        assertEquals(result,expRes);


    }



    @Test
    public  void  findPrime1(){

        List<Integer> numbers = Arrays.asList(2, 7, 15, 12, 31, 8);
        List<Integer> expRes = Arrays.asList(2, 7,31);

        List<Integer> result=new PrimeNumber().find(numbers);
        assertEquals(result,expRes);


    }




    @Test
    public  void  findPrime3(){

        List<Integer> numbers = Collections.singletonList(15);
        List<Integer> expRes = Collections.emptyList();

        List<Integer> result=new PrimeNumber().find(numbers);
        assertEquals(result,expRes);


    }

}
