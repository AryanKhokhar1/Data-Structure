class Solution:
    def subsets(self, nums):
        Ans = []
        n = len(nums)

        # Helper function
        def Helper(op, start_index):
            # base case
            if start_index == len(nums):
                return
            
            Ans.append(op)

            Helper(op,start_index+1)
            op.append(nums[start_index])
            Helper(op,start_index+1)

            print(op)
        
        Helper([], 0)
        return Ans
obj = Solution()
print(obj.subsets([1,2,3]))