class Solution(object):
    def uniquePaths(self, m, n):
        N=m+n-2
        r=m-1
        res = 1
        for i in range(1,r+1):
            res=res * (N+i-r) / i
        return int(res)