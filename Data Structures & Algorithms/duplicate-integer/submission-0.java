class Solution {
    public boolean hasDuplicate(int[] nums) {

        // init a hashset
        // for each number check if it is in the hasset
        // add if it is not returrn true if it is
        // break and return false if you have gone through all values.

        HashSet<Integer> checker = new HashSet<Integer>();

        for (Integer num: nums){
            if (checker.contains(num) == false){
                checker.add(num);
            } else {
                return true;
            }
        }

        return false;
        
    }
}