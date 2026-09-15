class Solution {

/*
encode:
initiate a res strimg
for each string in the list we want to get the length of the string and a symbol(#) indicating
the start of a new word.
we concaltenate the length of the word, the string and the word in the res string

decode:
2 pointer approach
initiate a res array and a pointer variable(i)
initiate another pointer j starts at i, j moves foward until it meets # meaning start of a word
now that i is on the number and j is at #, the substring of i and j would be the length
of the word.
update pointers to capture the word:
i becomes the start of the word (j + 1)
j becomes the end of the word(i + wordLength)
append the word(substring of i and j) to the res array
i becomes j(end of the word and next number)




*/
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        
        for(String word: strs){
            encodedString.append(word.length());
            encodedString.append("#");
            encodedString.append(word);
        };

        System.out.println(encodedString.toString());
        return encodedString.toString();

    }

    public List<String> decode(String str) {
        ArrayList<String> res = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j ++;
            }
            int wordLength = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + wordLength;
            res.add(str.substring(i,j));
            i = j;

        }

        // System.out.println(res.toString());
        return res;

    }
}
