class MonotonicStack:

    def nextGreaterElement(self):
        nums = [2, 1, 5, 3, 7, 6]
        result = [-1]*len(nums)

        stack = []
        for i in range(len(nums)):
            while stack and nums[stack[-1]] < nums[i]:
                index = stack.pop()
                result[index] = nums[i]
            stack.append(i)
            
        print(result)
    def  nextSmallerElement(self,nums):
        result = [-1]*len(nums)
        stack = []
        for i in range(len(nums)):
            while len(stack) > 0 and nums[stack[-1]] > nums[i]:
                index = stack.pop()
                result[index] = nums[i]
            stack.append(i)
        return result
obj = MonotonicStack()
obj.nextGreaterElement()
print(obj.nextSmallerElement([3,5,2,7,6]))