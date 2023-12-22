import com.siva.apps.practice.java8.LongestWord;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestWordTest {
    @Test
    public void testLongestWord_SingleLongestWord(){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");
        String rVal=new LongestWord().findLongestWord(words);
        assertEquals("strawberry",rVal);

    }


    @Test
    public void testLongestWord_MultipleLongestWord(){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "peach", "grapefruit");
        String rVal=new LongestWord().findLongestWord(words);
        assertEquals("grapefruit",rVal);

    }


    @Test
    public void testLongestWord_EmptyList() {
        List<String> words = Collections.emptyList();

        String longestWord =new LongestWord().findLongestWord(words);

        assertEquals("", longestWord);
    }
}
