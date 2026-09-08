class Solution {
    public int[] twoSum(int[] nums, int target) {

        // init hashmap
        // for each number we want to find the complement and check if the complement
        // is in the hashmap if it is return th index and the value of the complement in the
        // hasmap
        // if not, add the number and its index to the hashmap

        HashMap<Integer, Integer> hMap = new HashMap<>();

        for(int i = 0; i < nums.length; i ++ ){
            int comp = target - nums[i];

            if(hMap.containsKey(comp)){
                int res[] = { hMap.get(comp), i};
                return res;
            } else {
                hMap.put(nums[i], i);
            }
        }

        return null;
        
    }


}
