import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(hm.containsKey(comp)){
                return new int[]{i,hm.get(comp)};
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return null;
        
    }
}