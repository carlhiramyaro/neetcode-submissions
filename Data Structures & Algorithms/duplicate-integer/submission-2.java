class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Hashset chechk if the hashset has the number
        // return true
        // if not add to the hashset
        // after the loop is done return False
        HashSet<Integer> bucket = new HashSet<>();

        for (Integer num : nums) {
            if (bucket.contains(num)) {
                return true;

            } else {
                bucket.add(num);
            }
        }

        return false;
    }
}