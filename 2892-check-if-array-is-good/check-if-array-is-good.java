// import java.util.Arrays;

// class Solution {
//     public boolean isGood(int[] nums) {
//         int n = nums.length; 
        
//         int actualSum = Arrays.stream(nums).sum(); 
      
//         return (((n * (n - 1) / 2) + (n - 1)) == actualSum) ? true : false; 
//     }
// }

import java.util.Arrays;

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int base = n - 1; 
        int[] counts = new int[n];
        
        for (int num : nums) {
          
            if (num < 1 || num > base) {
                return false;
            }
            counts[num]++;
        }
        
        for (int i = 1; i < base; i++) {
            if (counts[i] != 1) {
                return false;
            }
        }
        
        return counts[base] == 2;
    }
}
