import com.siva.apps.practice.java8.UniqueCharList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueCharListTest {
    @Test
    public  void find(){
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "example", "unique", "characters");
        List<String> expRes = Arrays.asList("world", "stream");
        List<String> fList=new UniqueCharList().find(words);
        assertEquals(expRes,fList);

    }


    @Test
    public  void findNoMatch() {
        List<String> words = Arrays.asList("hello",  "java", "example", "unique", "characters");
        List<String> expRes = Collections.emptyList();
        List<String> fList=new UniqueCharList().find(words);
        assertEquals(expRes,fList);

    }
}
