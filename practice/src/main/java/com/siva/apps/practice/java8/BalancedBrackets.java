package com.siva.apps.practice.java8;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String testString1 = "{[()()]}";
        String testString2 = "{[()]";

        System.out.println("Is \"" + testString1 + "\" balanced? " + new BalancedBrackets().isBalanced(testString1));
        System.out.println("Is \"" + testString2 + "\" balanced? " + new BalancedBrackets().isBalanced(testString2));
    }

    public boolean isBalanced(String testString1) {

        Stack<Character> stack= new Stack<>();

        for(char c:testString1.toCharArray()){

            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            } else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            } else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }

        }
        return  stack.isEmpty();
    }

}
