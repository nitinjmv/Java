package dev.jmv.dsa.easy;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

import java.util.Arrays;
import java.util.HashMap;

import static java.lang.System.*;
import static java.util.Arrays.stream;

public class TwoSum {
    public static void main(String[] args) {
        int []nums = {2, 7, 11, 15};
        int target = 17;

        //Arrays.stream(new TwoSum().twoSumNaive(nums, target)).forEach(o-> System.out.println(o));
        Arrays.stream(new TwoSum().twoSum(nums, target)).forEach(o-> System.out.println(o));
    }

    //O(n*2)
    public int[] twoSumNaive(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{0,0};
    }

    //O(n)
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.get(target - nums[i]) == null){
                hm.put(nums[i], i);
            }else{
                out.println(i);
                out.println(hm.get(nums[i]));
            }
        }
        return new int[]{0,0};
    }


}
