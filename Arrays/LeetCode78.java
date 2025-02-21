import java.util.ArrayList;
import java.util.List;

class LeetCode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int ele: nums){
            int len = ans.size();
            for(int i = 0; i<len; i++){
                ArrayList<Integer> temp = new ArrayList<>(ans.get(i));
                temp.add(ele);
                ans.add(temp);
                
            }
            for(List<Integer> a : ans){
                System.out.println(a);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LeetCode78 obj = new LeetCode78();
        int[] num = {1,2,3};
        obj.subsets(num);
    }
}


