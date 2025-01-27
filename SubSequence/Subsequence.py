class SubSequence:
    def printsubsequence(self,pstr,unstr):
        if(len(unstr) == 0):
            print(pstr)
            return

        self.printsubsequence(pstr+unstr[0], unstr[1:])
        self.printsubsequence(pstr, unstr[1:])
        return

    
obj = SubSequence()
obj.printsubsequence("","abc")