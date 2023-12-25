import com.siva.apps.practice.java8.IntMergeList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntMergeListTest {

    @Test
    public  void  merge1(){

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);

        List<Integer> rList = Arrays.asList(1,5, 2,6, 3,7, 4,8);

        List<Integer> mList=new IntMergeList().merge(list1,list2);

        assertEquals(rList,mList);


    }


    @Test
    public  void  merge2(){

        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);


        List<Integer> rList = Arrays.asList(10,1, 20,2, 30,3, 40,4, 50,5);

        List<Integer> mList=new IntMergeList().merge(list1,list2);

        assertEquals(rList,mList);


    }


    @Test
    public  void  merge3(){


        List<Integer> list1 = Arrays.asList(100, 200, 300);
        List<Integer> list2 = Arrays.asList(5, 10, 15, 20, 25);


        List<Integer> rList = Arrays.asList(100,5, 200,10, 300,15);

        List<Integer> mList=new IntMergeList().merge(list1,list2);

        assertEquals(rList,mList);


    }




}
