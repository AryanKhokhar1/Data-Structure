import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer,String> person = new HashMap<>();
        for(int i = 0; i<names.length; i++){
            person.put(heights[i],names[i]);
        }
        Arrays.sort(heights);

        for (Map.Entry<Integer, String> set :
                person.entrySet()) {

            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }

        String[] ans = new String[names.length];
        for(int i = 0; i<names.length; i++){
            ans[i] = person.get(heights[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String[] names = {"Aryan", "Sohan", "Rahul", "Atharv"};
        int[] heights = {124,150,280,123};
        String[] ans = new String[4];
        ans = obj.sortPeople(names, heights);

        for(String name: ans){
            System.out.println(name);
        }
    }
}