import com.siva.apps.practice.java8.SumSqureEvenNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumSqureEvenNumbersTest {
    @Test
    public  void  find1(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int expVal=220;
        int rVal=new SumSqureEvenNumbers().find(numbers);
        assertEquals(expVal,rVal);


    }


    @Test
    public  void  find2(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expVal=120;
        int rVal=new SumSqureEvenNumbers().find(numbers);
        assertEquals(expVal,rVal);


    }


    @Test
    public  void  find3(){
        List<Integer> numbers = Arrays.asList(1, 2, 5, 6, 7);
        int expVal=40;
        int rVal=new SumSqureEvenNumbers().find(numbers);
        assertEquals(expVal,rVal);


    }



    @Test
    public  void  findEmpty(){
        List<Integer> numbers = Collections.emptyList();
        int expVal=0;
        int rVal=new SumSqureEvenNumbers().find(numbers);
        assertEquals(expVal,rVal);


    }
}
