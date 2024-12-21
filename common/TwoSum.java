/*
 * Problem Statement : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may
 * not use the same element twice. You can return the answer in any order.
 */

 // First approach :  to solve this Problem would be to put all the items in a map. Then get the subtract of target while iterating through array and searching for subtract to be present in Map. 

import java.util.HashMap;
import java.util.Map;

class twoSumfirst {
     public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
         for (int i = 0; i < nums.length; i++) {
             mp.put(nums[i], i);
         }
         for (int i = 0; i < nums.length; i++) {
             int valueToFind = target - nums[i];
             if (mp.containsKey(valueToFind) && (mp.get(valueToFind) != i)) {
                 return new int[] { i, mp.get(valueToFind) };
             }
         }
         return new int[] { -1, -1 };
     }
 }


 // Second Approach : More feasible approach will be to search for substraction during the addition of elements into the map. 

 class twoSumSecond {
     public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> mp = new HashMap<Integer,Integer>();
         for (int i = 0; i < nums.length; i++) {
             int valueToFind = target - nums[i];
             if (mp.containsKey(valueToFind)) {
                 return new int[] { mp.get(valueToFind), i };
             }
             mp.put(nums[i], i);
         }
         return new int[] { -1, -1 };
     }
 }