class Solution {
    public boolean isAnagram(String s, String t) {
        // two ways to solve this come in mind.
        // either you sort both and compare them or 
        // you count each letter and compare the counts

        // HashMap<String, Integer> sMap = new HashMap<String, Integer>();
        // HashMap<String, Integer> tMap = new HashMap<String, Integer>();

        // for (int i = 0, i < s.lenght(), i ++){
        //     if(sMap.contains(s[i]) == false){
        //         sMap.put(s[i], 1)
        //     }
        //     else{
        //         sMap.
        //     }
        // }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return Arrays.equals(sSort, tSort);


    }


}
