import com.siva.apps.practice.java8.BalancedBrackets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBracketsTest {

    @Test
    public  void test1() {
        String testString1 = "{[()()]}";
        assertTrue(new BalancedBrackets().isBalanced(testString1));

    }


    @Test
    public  void test2() {
        String testString1 = "({[()]})";
        assertTrue(new BalancedBrackets().isBalanced(testString1));

    }


    @Test
    public  void test3() {
        String testString1 = "({[()]}";
        assertFalse(new BalancedBrackets().isBalanced(testString1));

    }

    @Test
    public  void test4() {
        String testString1 = "{[(])}";
        assertFalse(new BalancedBrackets().isBalanced(testString1));

    }
}
