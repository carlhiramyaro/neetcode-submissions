class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // init a hashmap
        // for each word sort it and check if the sorted word is in the hmap
        // if it is not add the sorted word as a key and append the original word to the list
        // return the hasmap's values in an List

        HashMap<String, List<String>> hMap = new HashMap<>();

        for (String word : strs) {
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String sortedWord = new String(wordChar);

            hMap.putIfAbsent(sortedWord,  new ArrayList<>());
            hMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(hMap.values());
    }
}
