import com.siva.apps.practice.java8.MostFreqChar;
import com.siva.apps.practice.java8.NumCharMap;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostFreqCharTest {

    @Test
    public void find(){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "banana", "apple", "kiwi", "strawberry");
        Map.Entry<Character,Long> res=new MostFreqChar().find(words);
        assertEquals('a',res.getKey());
        assertEquals(10,res.getValue());
    }



    @Test
    public void find2(){
        List<String> words = Arrays.asList("apple", "orange", "kiwi", "banana", "apple", "kiwi", "strawberry");
        Map.Entry<Character,Long> res=new MostFreqChar().find(words);
        assertEquals('a',res.getKey());
        assertEquals(7,res.getValue());
    }

}
