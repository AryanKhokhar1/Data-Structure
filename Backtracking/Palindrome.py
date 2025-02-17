class Solution(object):
    def ispalindrome(self,st):
        return st == st[::-1]
    
    def partition(self, s):
        result = []
        part = []

        def dfs(i):
            if(i >= len(s)):
                result.append(part.copy())
                return
            
            for j in range(i,len(s)):
                if self.ispalindrome(s[i:j+1]):
                    part.append(s[i:j+1])

                    dfs(j+1)

                    part.pop()
        dfs(0)
        return result

obj = Solution()
print(obj.partition("aab"))