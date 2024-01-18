import com.siva.apps.practice.java.BuySellStock;
import com.siva.apps.practice.java8.AvgLenString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuySellStockTest {
    @Test
    public void findAvgLen(){
        int[] prices = {7,1,5,3,6,4};
        int expProf=5;
        int pro=new BuySellStock().maxProfit(prices);
    }

}
