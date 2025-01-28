class Permutation:

    def permutation(self,pstr,unstr):
        if(len(unstr) == 0):
            print(pstr)
            return
        for i in range(len(pstr)+1):
            self.permutation(pstr[0:i]+unstr[0]+pstr[i:],unstr[1:])

obj = Permutation()
obj.permutation("","abc")