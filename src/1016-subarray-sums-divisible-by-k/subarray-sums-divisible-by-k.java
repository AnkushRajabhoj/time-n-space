class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0; // Approach 1
        int count2 = 0; // Approach 2
        // Reminder -> count
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,1);
        for (int end = 0;end < nums.length; end++) {
            sum += nums[end];
            int mod = (sum % k+k) % k;

            // Approach 1
            count += map.getOrDefault(mod, 0); 

            map.put(mod, map.getOrDefault(mod, 0) + 1);      
        }
        
        // Approach 2
        for (int  i = 0 ; i< k ;i ++) {
            if (map.containsKey(i)) {
                int c = map.get(i)-1;
                count2 += (c *(c+1))/2;
                System.out.println(i + " " + map.get(i));
            }
        }
        if (count != count2) throw new RuntimeException("");
        return count;
        
        
    }
}