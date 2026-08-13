class Solution {
    public int[] twoSum(int[] nums, int target) {
        // initiate a hashmap
        // for each number we want to find the complement
        // check if the complement exist in our hash map
        // if not put the number in the hash map with its index being the value
        // if it is return the complments value(its index)
        // and the index we are currently at(the other number)

        HashMap<Integer, Integer> complementCheck = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i ++){
            Integer complement = target - nums[i];
            if (complementCheck.containsKey(complement)){
                int[] res = {complementCheck.get(complement), i};
                return res;
            } else{
                complementCheck.put(nums[i], i);
            }
        }

        return new int[] {};




        
    }
}
