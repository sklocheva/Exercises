package main.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Sophia Klocheva
 * on 16/11/2020
 */
public class BracesClass
{
    public static void main(String[] args)
    {
        String s = "[{}]";

        String[] ar = new String[]{"{}", "[[]}"};
        String[] braces = braces(ar);
        System.out.println(braces[0] + " " + braces[1]);
    }

    static String[] braces(String[] values)
    {
        String[] answers = new String[values.length];
        for (int i = 0; i < values.length; i++)
        {
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;
            for (int j = 0; j < values[i].length(); j++)
            {
                char currBrace = values[i].charAt(j);
                System.out.println(currBrace);
                if (currBrace == '(' || currBrace == '[' || currBrace == '{')
                {
                    stack.push(currBrace);
                    System.out.println("push");
                    continue;
                }
                else if (currBrace == '}')
                {
                    System.out.println("brace" + " = " + currBrace);
                    if (stack.isEmpty() || stack.pop() != '{')
                    {
                        System.out.println("false");
                        balanced = false;
                        break;
                    }
                }
                else if (currBrace == ']')
                {

                    System.out.println("brace" + " = " + currBrace);
                    if (stack.isEmpty() || stack.pop() != '[')
                    {

                        System.out.println("false");
                        balanced = false;
                        break;
                    }
                }
                else if (currBrace == ')')
                {

                    System.out.println("brace" + " = " + currBrace);
                    if (stack.isEmpty() || stack.pop() != '(')
                    {

                        System.out.println("false");
                        balanced = false;
                        break;
                    }
                }
                else
                {
                    balanced = false;
                    break;
                }
            }
            if (balanced == true)
            {
                answers[i] = "YES";
            }
            else
            {
                answers[i] = "NO";
            }
        }

        return answers;
    }

    public static List<Integer> oddNumbers(int l, int r)
    {
        // Write your code here
        if (l < r)
        {
            List<Integer> numbers = new LinkedList<Integer>();
            if (l % 2 == 0)
            {
                l = l + 1;
            }
            for (int i = l; i <= r; i = i + 2)
            {
                numbers.add(i);
            }
            return numbers;
        }
        return new LinkedList<Integer>();
    }
}
