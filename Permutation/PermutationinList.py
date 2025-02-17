class Permutation:
    def permutation(self,pstr, unstr):
        if(len(unstr)== 0):
            return [pstr]
        ans = list()
        for i in range(len(pstr)+1):
            ans.append(self.permutation(pstr[0:i]+unstr[0]+pstr[i:],unstr[1:]))
        return ans
obj = Permutation()
lis = obj.permutation("","abc")
lis.sort()
print(lis)