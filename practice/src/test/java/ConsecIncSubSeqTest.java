import com.siva.apps.practice.java8.ConsecIncSubSeq;
import com.siva.apps.practice.java8.SecondSmallestNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ConsecIncSubSeqTest {

    @Test
    public void find(){

        List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 10, 11,12);
        List<List<Integer>> result=new ConsecIncSubSeq().find(list1);
        List<Integer> expRes= Arrays.asList(1, 2, 3);
        Assertions.assertEquals(expRes,result.get(0));
    }
}
