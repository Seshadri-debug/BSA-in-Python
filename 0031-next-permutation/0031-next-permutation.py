class Solution(object):
    def nextPermutation(self, nums):
        idx = -1
        n = len(nums)
        for i in range(n-2,-1,-1):
            if nums[i]<nums[i+1]:
                idx = i
                break
        if idx == -1:
            nums[:] =  nums[::-1]
            return
        for i in range(n-1,idx,-1):
            if nums[i]>nums[idx]:
                nums[i], nums[idx] = nums[idx], nums[i]
                break
        nums[idx+1:]=nums[idx+1:][::-1]