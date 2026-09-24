class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        



        to do this we need two helper arrays prefix and postfix
        compute prefix product for every single position in the input array and put it in a the prefix array
        compute the postfix product for every single position in the input array and put it in a the prefix array

        prefix is the product of all numbers before the number we are at.
        postfix is the product of all numbers after the number we are at.

        at position n we want the prefix of every value before it (this is at position(in prefix arr) - 1) else 1
        at position n we want the postfix of every value after it (this is at position(in postfix arr) + 1) else 1

        We want to get the product of every value before the number - prefix
        and get the prdocut of every value after the number - postfix
        and multiply those values together to give us the product of array except self

        now optimizing solving without the need for the postfix and prefix arrays
        we will do two passes on input array 
        first pass -> comptute every prefix and store it at position n where position n is the number whos product except self we are trying to solve for.
        remember for the first position there is no prefix so use 1
        second pass -> from end to beginning computing every postfix. we already have the post fix stored at position n so we multiply be postfix by what is in position n

        when coding
        init res array
         you can init prefix at 1 put it at position n(prefix needed to calculate position except self).
        now at the next position you compute prefix by multiplying current prefix by next value in the array put it at position n.
        continue until res array is full
        init postfix at 1 mutliply it by prefix at position n(post fix needed)
        now at the next position you compute postfix by multiplying current postfix by the next value in the array, continue to multiply by whatever is in position n 

        */

        int[] resArray = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < resArray.length; i ++){
            resArray[i] = prefix;
            prefix *= nums[i];
        }

        // System.out.println(resArray.toString());

        int postfix = 1;
        for(int i = resArray.length - 1; i >= 0; i --){
            resArray[i] = resArray[i] * postfix;
            postfix *= nums[i];
        }

        // System.out.println(resArray.toString());

        return resArray;

        
    }
}  
