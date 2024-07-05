import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


  //-------------------------------MY METHOD---------------------------------
  public int[] twoSum(int[] nums, int target) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result.add(i);
          result.add(j);

        }
      }
    }

    int[] arr = new int[2];
    for (int i = 0; i < result.size(); i++) {
      arr[i] = result.get(i);
    }
    return arr;
  }
}



//------------------------------OPTIMIZED METHOD----------------------------------

class Solution {
  public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> numMap = new HashMap<>();
      int n = nums.length;

      for (int i = 0; i < n; i++) {
          int complement = target - nums[i];
          if (numMap.containsKey(complement)) {
              return new int[]{numMap.get(complement), i};    // containsKey , get , put
          }
          numMap.put(nums[i], i);
      }

      return new int[]{}; // this way to return an array
  }
}