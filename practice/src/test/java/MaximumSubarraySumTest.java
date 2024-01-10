import com.siva.apps.practice.java8.MaximumSubarraySum;
import com.siva.apps.practice.java8.MinMaxDouble;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarraySumTest {


    @Test
    public  void findMin(){
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int maxSum = new MaximumSubarraySum().maxSubArray(nums);
            System.out.println("Maximum subarray sum: " + maxSum);
            assertEquals(maxSum,6);

    }
}

