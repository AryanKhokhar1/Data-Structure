class Solution(object):
    def nextPermutation(self, nums):
        p = []
        def permutation(pstr, unstr):

            if len(unstr) == 0:
                p.append(pstr)
                return

            for i in range(len(pstr)+1):
                permutation(pstr[0:i]+unstr[0]+pstr[i:],unstr[1:])
        unstr = "".join(str(ele) for ele in nums)
        permutation("",unstr)
        p = set(p)
        p = list(p)
        p.sort()
        print(p)
        index = p.index(unstr) + 1
        print(index)
        nextPerm = []
        if(index == len(p)):
            for i in range(len(p[0])):
                print(int(p[0][i]))
                nextPerm.append(int(p[0][i]))
        else:
            for i in range(len(p[index])):
                print(int(p[index][i]))
                nextPerm.append(int(p[index][i]))
        return nextPerm
        
obj = Solution()
print(obj.nextPermutation([1,2,3]))