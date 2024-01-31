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

        Set<String> set = words.stream().filter(word->word.length()>5).collect(Collectors.toSet());

        System.out.println(set);

        Map<Integer, String> map = words1.stream().collect(Collectors.toMap(String::length, Function.identity()));

        System.out.println(map);


        String result =  words.stream().filter(word->word.length()>5).collect(Collectors.joining(", "));

        System.out.println(result);

        Map<Integer, List<String>> groupedByLength =  words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);


        Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitioned);



        long count = words.stream().filter(word -> word.length() > 5).collect(Collectors.counting());

        System.out.println(count);


        IntSummaryStatistics stats = words.stream().collect(Collectors.summarizingInt(String::length));

        System.out.println(stats);








    }
}
