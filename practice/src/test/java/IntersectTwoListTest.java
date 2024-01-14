import com.siva.apps.practice.java8.IntersectTwoList;
import com.siva.apps.practice.java8.J3LString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IntersectTwoListTest {

    @Test
    public void find(){

        List<Integer> list1= Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2= Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> expAnwserList=Arrays.asList(3, 4, 5);
        List<Integer> anwserList=new IntersectTwoList().find(list1,list2);
        assertEquals(expAnwserList,anwserList);
    }


    @Test
    public void find2(){

        List<Integer> list1= Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2= Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> expAnwserList=Arrays.asList(1, 4, 5);
        List<Integer> anwserList=new IntersectTwoList().find(list1,list2);
        assertNotEquals(expAnwserList,anwserList);



    }
}
