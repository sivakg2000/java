import com.siva.apps.practice.java8.AvgLenString;
import com.siva.apps.practice.java8.CommonPrefix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CommonPrefixTest {

    @Test
    public void findA(){



        List<String> words = Arrays.asList("pref", "prefix", "preposition", "prediction");
        String result=new CommonPrefix().find(words);
        assertEquals("pre",result);


    }


    @Test
    public void find1(){



        List<String> words = Arrays.asList("prf", "prefix", "preposition", "prediction");
        String result=new CommonPrefix().find(words);
        assertEquals("pr",result);


    }


    @Test
    public void findN(){



        List<String> words = Arrays.asList("prf", "prefix", "preposition", "prediction");
        String result=new CommonPrefix().find(words);
        assertNotEquals("pre",result);


    }


    @Test
    public void findP(){



        List<String> words = Arrays.asList("p", "prefix", "preposition", "prediction");
        String result=new CommonPrefix().find(words);
        assertEquals("p",result);


    }


}
