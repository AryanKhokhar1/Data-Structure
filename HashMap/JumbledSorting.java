import java.util.HashMap;

public class JumbledSorting {


    public void sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[nums.length];
        int letter;
        int p = 0;
        for(int n = 0; n<nums.length; n++){
            int val = 0;
            int i = 0;
            while(nums[n] != 0){
                letter = nums[n]%10;
                val = mapping[letter]*((int) Math.pow(10,i++)) + val;
                nums[n] = nums[n]/10;
            }
            map.put(val,nums[n]);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        JumbledSorting obj = new JumbledSorting();
        obj.sortJumbled(new int[]{8,9,4,0,2,1,3,5,7,6}, new int[]{991, 338, 38});
    }
}
