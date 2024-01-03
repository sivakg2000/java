import com.siva.apps.practice.java8.AnagramCheck;
import com.siva.apps.practice.java8.AvgLenString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckTest {
    @Test
    public void check1(){
        String str1 = "listen";
        String str2 = "silent";
        assertTrue(new AnagramCheck().isAnagram1(str1,str2));

    }

    @Test
    public void check2(){
        String str1 = "listen";
        String str2 = "silent";
        assertTrue(new AnagramCheck().isAnagram2(str1,str2));

    }

    @Test
    public void check1False(){
        String str1 = "listened";
        String str2 = "silenter";
        assertFalse(new AnagramCheck().isAnagram1(str1,str2));

    }

    @Test
    public void check2False(){
        String str1 = "listener";
        String str2 = "silented";
        assertFalse(new AnagramCheck().isAnagram2(str1,str2));

    }
}


