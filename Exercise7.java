package Chapter11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercise7
{
    /*
        Write a method countCommon that accepts two lists of integers as parameters
        and returns the number of unique integers that occur in both lists. Use one
        or more sets as storage to help you solve this problem. For example, if one
        list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list
        contains the values [–5, 15, 2, –1, 7, 15, 36], your method should return 4
        because the elements –1, 2, 7, and 15 occur in both lists.
     */

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(3);
        list1.add(7);
        list1.add(3);
        list1.add(-1);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(2);
        list1.add(15);
        list1.add(15);

        list2.add(-5);
        list2.add(15);
        list2.add(2);
        list2.add(-1);
        list2.add(7);
        list2.add(15);
        list2.add(36);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        System.out.println("Number of unique integers in common: ");
        countCommon(list1, list2);
    }

    public static void countCommon(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        list1.retainAll(list2); //  Intersect the two lists, finding the integers in common

        Set<Integer> set = new HashSet<Integer>(list1); //  Make a hash set, eliminating duplicates

        System.out.println(set.size()); //  Print the number of elements in set

    }
}
