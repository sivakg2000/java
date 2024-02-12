import com.siva.apps.practice.java8.Len5UpperCase;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Len5UpperCaseTest {

    @Test
    public void find1(){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry", "grapes");
        String expResult="BANANA";
        List<String> fList=new Len5UpperCase().find(words);
        assertTrue(fList.contains(expResult));


    }



    @Test
    public void find2(){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry", "grapes");
        String expResult="STRAWBERRY";
        List<String> fList=new Len5UpperCase().find(words);
        assertTrue(fList.contains(expResult));


    }


    @Test
    public void find3(){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "grapes","preposition");
        String expResult="preposition";
        List<String> fList=new Len5UpperCase().find(words);
        assertTrue(fList.contains(expResult));


    }


    @Test
    public void findEmpty(){
        List<String> words = Collections.emptyList();
        List<String> fList=new Len5UpperCase().find(words);
        assertTrue(fList.isEmpty());


    }




}
