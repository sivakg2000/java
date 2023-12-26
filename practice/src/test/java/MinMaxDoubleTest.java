import com.siva.apps.practice.java8.MinMaxDouble;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxDoubleTest {

    @Test
    public  void findMin(){
        List<Double> doubles = Arrays.asList(10.5, 5.2, 8.7, 3.9, 12.1, 7.0);

        MinMaxDouble.MinMaxResult expResult=new MinMaxDouble.MinMaxResult(3.9,12.1);
        MinMaxDouble.MinMaxResult rVal=new MinMaxDouble().find(doubles);

        assertEquals(expResult.getMinVal(),rVal.getMinVal());

    }


    @Test
    public  void findMax(){
        List<Double> doubles = Arrays.asList(10.5, 5.2, 8.7, 3.9, 12.1, 7.0);

        MinMaxDouble.MinMaxResult expResult=new MinMaxDouble.MinMaxResult(3.9,12.1);
        MinMaxDouble.MinMaxResult rVal=new MinMaxDouble().find(doubles);

        assertEquals(expResult.getMaxVal(),rVal.getMaxVal());

    }



    @Test
    public  void findEmptyMin(){
        List<Double> doubles = Collections.emptyList();

        MinMaxDouble.MinMaxResult expResult=new MinMaxDouble.MinMaxResult(Double.NaN,Double.NaN);
        MinMaxDouble.MinMaxResult rVal=new MinMaxDouble().find(doubles);

        assertEquals(expResult.getMinVal(),rVal.getMinVal());

    }


    @Test
    public  void findEmptyMax(){
        List<Double> doubles = Collections.emptyList();

        MinMaxDouble.MinMaxResult expResult=new MinMaxDouble.MinMaxResult(Double.NaN,Double.NaN);
        MinMaxDouble.MinMaxResult rVal=new MinMaxDouble().find(doubles);

        assertEquals(expResult.getMaxVal(),rVal.getMaxVal());

    }



}
