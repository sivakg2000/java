import com.siva.apps.practice.java8.MaximumSubarraySum;
import com.siva.apps.practice.java8.MinMaxDouble;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarraySumTest {


    @Test
    public  void find1(){
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int maxSum = new MaximumSubarraySum().maxSubArray(nums);
            System.out.println("Maximum subarray sum: " + maxSum);
            assertEquals(maxSum,6);

    }


    @Test
    public  void find2(){
        int[] nums =  {-2, -5, 6, -2, -3, 1, 5, -6};
        int maxSum = new MaximumSubarraySum().maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
        assertEquals(maxSum,7);

    }


}

