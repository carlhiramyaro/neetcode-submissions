class Solution {
    public boolean isAnagram(String s, String t) {
        // two ways to solve this come in mind.
        // either you sort both and compare them or 
        // you count each letter and compare the counts

        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i ++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        System.out.println(sMap.toString());
        System.out.println(tMap.toString());


        return sMap.equals(tMap);


        


    }


}
