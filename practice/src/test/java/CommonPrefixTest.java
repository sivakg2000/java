import com.siva.apps.practice.java8.AvgLenString;
import com.siva.apps.practice.java8.CommonPrefix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonPrefixTest {

    @Test
    public void findA(){



        List<String> words = Arrays.asList("pref", "prefix", "preposition", "prediction");
        String result=new CommonPrefix().find(words);
        assertEquals("pre",result);


    }


}
