package com.bhasker.dgstack.collectionpro;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayTest {

    public static void main(String args[]){

        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: "+ Arrays.toString(array_nums));
        int ctr = 0;
        for(int i = 0; i <= array_nums.length-1; i++)
        {
            if(array_nums[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Number of even numbers : "+ctr);
        System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));

        longest_sequence(array_nums);

    }

    public static int longest_sequence(int[] nums) {
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums) h_set.add(i);

        int longest_sequence_len = 0;
        for (int i : nums) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;
    }


}
