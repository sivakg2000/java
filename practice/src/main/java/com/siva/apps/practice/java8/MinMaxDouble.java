package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;

public class MinMaxDouble {
    public  static void main(String[] args){
        List<Double> doubles = Arrays.asList(10.5, 5.2, 8.7, 3.9, 12.1, 7.0);
        MinMaxResult rVal=new MinMaxDouble().find(doubles);
        System.out.println(rVal);

    }

    public MinMaxResult find(List<Double> list){

        return new MinMaxResult(list.stream().sorted().min(Double::compareTo).orElse(Double.NaN), list.stream().sorted().max(Double::compareTo).orElse(Double.NaN));

    }

    public static class MinMaxResult{
        Double minVal;
        Double maxVal;
        public MinMaxResult(Double minVal,Double maxVal){
            this.minVal=minVal;
            this.maxVal=maxVal;
        }

        public Double getMinVal() {
            return minVal;
        }

        public Double getMaxVal() {
            return maxVal;
        }

        @Override
        public String toString() {
            return "MinMaxResult{" +
                    "minVal=" + minVal +
                    ", maxVal=" + maxVal +
                    '}';
        }
    }
}
