import com.siva.apps.practice.java8.CommonPrefix;

import java.util.Arrays;
import java.util.List;

public class DifferenceSquares {

    public static void  main(String[] args){

        List<Integer> nums = Arrays.asList(1, 2, 3);
        int result=new DifferenceSquares().find(nums);
        System.out.println(result);


    }

    public int find(List<Integer> list){
        int sumSq=list.stream().mapToInt(n->n*n).sum();
        int sum=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumSq+">>"+sum);
        int sqSum=sum*sum;
        return sumSq-sqSum;
    }
}
