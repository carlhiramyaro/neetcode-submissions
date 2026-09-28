class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        prefix is product of elemnts before self
        postfix is product of elements after self

        init res array
        prefix starts at 1
        iterate through array an insert prefix at position we are calculating(self)
        update prefix = prefix * next num
        
        iterate through res array in reverse inserting prefix * post fix at position(self)
        update postfix = post fix * next num
        */

        int[] res = new int[nums.length];

        int prefix = 1;

        for(int i = 0; i < nums.length; i ++){
            res[i] = prefix;
            prefix = prefix * nums[i];
        }

        

        int postfix = 1;

        for(int i = nums.length - 1; i >= 0; i--){
            res[i] = res[i] * postfix;
            postfix = postfix * nums[i];
        }
       

        return res;
        
    }
}  
