public class CheckAdjacent {

    public static boolean isArraySpecial(int[] nums) {
        for(int i = 1; i < nums.length; ++i) {
            if(nums[i - 1] % 2 == nums[i] % 2) {
                return false;
            }
        }

        return true;
    }

}
  
class Solution {
  public boolean isArraySpecial(int[] nums) {

      if(nums.length==1) return true;
      if(nums.length==2){
          if((nums[0]+nums[1])%2==0) return false;
           return true;
      }
      // 2 6 1
      for(int i=nums.length-1;i>0;i--){
          if((nums[i]+nums[i-1])%2==0) return false;

      }
      return true;
  }
}

