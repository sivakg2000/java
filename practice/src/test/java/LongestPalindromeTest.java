import com.siva.apps.practice.java8.Len5UpperCase;
import com.siva.apps.practice.java8.LongestPalindrome;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestPalindromeTest {

    @Test
    public void find1(){
        List<String> strings = Arrays.asList("madam", "racecar", "hello", "level", "noon", "world", "radar");
        String expResult="racecar";
        String res=new LongestPalindrome().find(strings);
        assertEquals(expResult,res);
    }


    @Test
    public void find2(){
        List<String> strings = Collections.singletonList("world");
        String expResult="";
        String res=new LongestPalindrome().find(strings);
        assertEquals(expResult,res);


    }

}
