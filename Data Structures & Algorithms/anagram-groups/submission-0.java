class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // initiate a hmap
        // two methods come to mind sorting and grouping or bit map method
        // for the bit map method:
        // iterate through each word and use the characters to form a bit reprsentation of the word
        // do this by getting an array of 26 0's represnting the alphabet then using ascii values
        // increment the appearnce of each letter.
        // now if the bit pattern does not exist in a hmap we can add it as a key with the word as a
        // value if it exists we can append the word to the value which will be an arraylist object
        // return the values of the hmap in a list

        // sorting
        // init hmap
        // for each word sort them
        // if the sorted word is not in the hmap
        // add it as a key and keep the actual word as a value
        // if it is in the get the value which is an array and append the actual word to it
        // return the values in an array list

        HashMap<String, ArrayList<String>> hmap = new HashMap<>();
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            hmap.putIfAbsent(sortedWord, new ArrayList<>());
            hmap.get(sortedWord).add(word);
        }

        return new ArrayList<>(hmap.values());
    }
}
