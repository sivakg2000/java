import com.siva.apps.practice.java.BuySellStock;
import com.siva.apps.practice.java8.AvgLenString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuySellStockTest {
    @Test
    public void findProfit1(){
        int[] prices = {7,1,5,3,6,4};
        int expProf=5;
        int pro=new BuySellStock().maxProfit(prices);
        Assertions.assertEquals(expProf,pro);
    }


    @Test
    public void findProfit2(){
        int[] prices = {7,2,5,3,6,4};
        int expProf=4;
        int pro=new BuySellStock().maxProfit(prices);
        Assertions.assertEquals(expProf,pro);
    }


    @Test
    public void findProfitNeg(){
        int[] prices = {7,2,5,3,6,4};
        int expProf=3;
        int pro=new BuySellStock().maxProfit(prices);
        Assertions.assertNotEquals(expProf,pro);
    }


}
