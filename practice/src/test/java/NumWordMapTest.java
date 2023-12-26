import com.siva.apps.practice.java8.NumWordMap;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals; 

public class NumWordMapTest {
    @Test
    public void find(){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Long> expRes=new HashMap<>();
        expRes.put("apple",3L);
        Map<String,Long> res=new NumWordMap().find(words);
        assertEquals(expRes.get("apple"),res.get("apple"));


    }

    @Test
    public void find1(){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Long> expRes=new HashMap<>();
        expRes.put("banana",2L);
        Map<String,Long> res=new NumWordMap().find(words);
        assertEquals(expRes.get("banana"),res.get("banana"));
    }


    @Test
    public void findEmpty(){
        List<String> words = Collections.emptyList();
        Map<String,Long> expRes=new HashMap<>();
        Map<String,Long> res=new NumWordMap().find(words);

        assertEquals(expRes.get("banana"),res.get("banana"));
    }
}
