import com.siva.apps.practice.java.TWOSum;
import com.siva.apps.practice.java8.PrimeNumber;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TWOSumTest {
    @Test
    public  void  find(){

        int[] nums = {2,7,11,15};
        int[] resInd=new TWOSum().twoSum(nums,9);
        int[] expInd={0,1};
        assertEquals(expInd[0],resInd[0]);
        assertEquals(expInd[1],resInd[1]);


    }



    @Test
    public  void  find1(){

        int[] nums = {2,7,11,15};
        int[] resInd=new TWOSum().twoSum(nums,26);
        int[] expInd={2,3};
        assertEquals(expInd[0],resInd[0]);
        assertEquals(expInd[1],resInd[1]);


    }
}
