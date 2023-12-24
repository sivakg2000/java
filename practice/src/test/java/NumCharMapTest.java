import com.siva.apps.practice.java8.NumCharMap;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumCharMapTest {

    @Test
    public void find(){
        String text = "hellojava";
        Map map=new NumCharMap().find(text);
        assertEquals(map.get('a'),2);
    }


    @Test
    public void find2(){
        String text = "hellojava";
        Map map=new NumCharMap().find(text);
        assertEquals(map.get('l'),2);
    }

    @Test
    public void find3(){
        String text = "hellojava";
        Map map=new NumCharMap().find(text);
        assertEquals(map.get('v'),1);
    }


    @Test
    public void find4(){
        String text = "hellojava";
        Map map=new NumCharMap().find(text);
        assertEquals(map.get('m'),null);
    }
}
