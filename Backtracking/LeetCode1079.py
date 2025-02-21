class Solution(object):
    def numTilePossibilities(self, tiles):
        result = []
        
        def backtrack(pstr, unpstr):
            if len(unpstr) == 0:
                return
            
            for i in range(len(pstr)+1):
                val = pstr[0:i]+unpstr[0]+pstr[i:]
                if(val not in result):
                    result.append(val)

                backtrack(val,unpstr[1:])

        backtrack("",tiles)
        print(result)
        return len(result)
obj = Solution()
print(obj.numTilePossibilities("AAB"))