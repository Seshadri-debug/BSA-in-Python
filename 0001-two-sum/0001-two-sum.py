class Solution(object):
    def twoSum(self, nums, target):
        targetlist = []

        for index, num in enumerate(nums):
            for count in range(index + 1, len(nums)):
                if (num + nums[count]) == target:
                    targetlist.append(index)
                    targetlist.append(count)
                    return targetlist