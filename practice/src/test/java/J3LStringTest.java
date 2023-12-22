import com.siva.apps.practice.java8.J3LString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J3LStringTest {
    @Test
    public void findJ3L(){
        List<String> words = Arrays.asList("Java", "C", "Python", "Javascript", "Ruby","Jub", "Julia");
        List<String> testResult = Collections.singletonList("Jub");
        List<String> result=new J3LString().find(words);
        assertEquals(result,testResult);

    }


    @Test
    public void findJ3LEmpty(){
        List<String> words = Arrays.asList("Java", "C", "Python", "Javascript", "Ruby", "Julia");
        List<String> testResult = Collections.emptyList();
        List<String> result=new J3LString().find(words);
        assertEquals(result,testResult);

    }


    @Test
    public void findJ3LMultiple(){
        List<String> words = Arrays.asList("Java", "C", "Python", "Javascript", "Ruby", "Jub","Jka","Julia");
        List<String> testResult =Arrays.asList("Jub","Jka");
        List<String> result=new J3LString().find(words);
        assertEquals(result,testResult);

    }

}
