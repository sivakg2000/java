import com.siva.apps.practice.java8.AvgLenString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvgLenTest {
    @Test
    public void findAvgLen(){
        List<String> words = Arrays.asList("Java", "C", "Python", "Javascript", "Ruby", "Julia");
        double result=new AvgLenString().find(words);
        assertEquals(result,5.0);
    }


    @Test
    public void findAvgLen2() {
        List<String> words1 = Arrays.asList("Hello", "World", "Java", "Stream", "Example");
        double result=new AvgLenString().find(words1);
        assertEquals(result,5.4);
    }



    @Test
    public void findAvgLen3() {
        List<String> words2 = Arrays.asList("OpenAI", "GPT", "Machine", "Learning", "NLP", "Artificial", "Intelligence");

        double result=new AvgLenString().find(words2);
        assertEquals(result,7.0);
    }

    @Test
    public void findAvgLenEmpty(){
        List<String> words = Collections.emptyList();
        double result=new AvgLenString().find(words);
        assertEquals(result,0.0);
    }
}
