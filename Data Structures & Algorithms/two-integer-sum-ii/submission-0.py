class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        """
        init l,r  = 0, len(arr) - 1
        if sum of num at l and num at r > target we need a smaller number so r-=1
        else we need a bigger number so l += 1
        else return l + 1, r + 1
        """

        l, r = 0, len(numbers) - 1
        while l < r:
            if numbers[l] + numbers[r] > target:
                r -= 1
            elif numbers[l] + numbers[r] < target:
                l += 1
            else:
                return [l + 1, r + 1]
        