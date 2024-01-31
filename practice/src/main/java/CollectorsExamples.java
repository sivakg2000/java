import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExamples {

    public static void  main(String[] args){

        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry", "grapes");

        List<String> words1 = Arrays.asList("apple", "banana", "orange1", "kiwi", "strawberry", "grapes23");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<String> list = words.stream().filter(word->word.length()>5).collect(Collectors.toList());

        System.out.println(list);







    }
}
