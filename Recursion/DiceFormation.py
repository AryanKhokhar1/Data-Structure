class DiceProblem:
    def dice(self,f,s):
        if(s == 4):
            print(f)
            s = 0
            return
        for i in range(1,5):
            if(s+i <= 4):
                self.dice(f+f"{i}",s+i)
        return
obj = DiceProblem()
obj.dice("",0)