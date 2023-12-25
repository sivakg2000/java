import com.siva.apps.practice.java8.NumCharMap;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NumCharMapTest {

    @Test
    public void find(){
        String text = "hellojava";
        Map<Character,Integer> map=new NumCharMap().find(text);
        assertEquals(2,map.get('a'));
    }


    @Test
    public void find2(){
        String text = "hellojava";
        Map<Character,Integer> map=new NumCharMap().find(text);
        assertEquals(2,map.get('l'));
    }

    @Test
    public void find3(){
        String text = "hellojava";
        Map<Character,Integer> map=new NumCharMap().find(text);
        assertEquals(1,map.get('v'));
    }


    @Test
    public void find4(){
        String text = "hellojava";
        Map<Character,Integer> map=new NumCharMap().find(text);
        assertNull(map.get('m'));
    }
}
