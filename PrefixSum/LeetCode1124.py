class Solution:
    def longestWPI(self, hours):
        transformed = [1 if h > 8 else -1 for h in hours]
        
        prefix_sum = 0
        longest_interval = 0
        prefix_sum_map = {}

        for i in range(len(transformed)):
            prefix_sum += transformed[i]
            
            if prefix_sum > 0:
                longest_interval = i + 1
            else:
                if prefix_sum - 1 in prefix_sum_map:
                    longest_interval = max(longest_interval, i - prefix_sum_map[prefix_sum - 1])
            
            if prefix_sum not in prefix_sum_map:
                prefix_sum_map[prefix_sum] = i

        return longest_interval
obj = Solution()
obj.longestWPI([9,9,6,0,6,6,9])