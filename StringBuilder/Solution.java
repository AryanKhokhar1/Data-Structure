class Solution {
    public String minWindow(String s, String t) {
        String str = "";
        StringBuilder target = new StringBuilder(t);
        int start = 0;
        int time = 0;
        int nexti;
        for(int i = 0; i<s.length(); i++){
            System.out.println(i+":"+s.charAt(i));
            int index = target.indexOf(String.valueOf(s.charAt(i)));
            if(index != -1){
                target.deleteCharAt(index);
                time++;
            }
            if(index != -1 && time == 1){
                nexti = i;
            }
            if(target.length() == 0){
                String word = s.substring(start,i+1);
                if(str == ""){
                    str = word;
                }else if(word.length()< str.length()) {
                    str = word;
                }
                start = i;
                i = nexti -1;
                target = new StringBuilder(t);
                System.out.println(str);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minWindow("ADOBECODEBANC","ABC"));
    }
}