class Solution:
    def isPalindrome(self, s: str) -> bool:
        """
        initiate a new string variable
        take the string we have clean it up and make it lower case and store in the new string variable
        initiate l and right pointers
        while l < r
        check if new strng varr at l == the one at r
        if they are increment l and decremet r
        if they are not return flase
        """
        clean_s = ""

        for c in s:
            if c.isalnum():
                clean_s += c
        clean_s = clean_s.lower()

        l, r = 0, len(clean_s) - 1

        while l < r:
            if clean_s[l] == clean_s[r]:
                l += 1
                r -= 1
            else:
                return False
        return True 
        

        