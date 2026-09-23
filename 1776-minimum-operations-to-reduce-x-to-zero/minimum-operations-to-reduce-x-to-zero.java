// class Solution {



//ye code hi falltu ka hai 





//     public int minOperations(int[] nums, int x) {
//         int l = 0 ; 
//         int r = nums.length -1 ;
//         int a = x ;
//         int c = 0 ; 
//        while(a!=0 || l>=r) {
//             int k = Math.max(nums[l], nums[r]) ; 
//             a-=k ; 
//             c++;
//             if(nums[l]>nums[r])l++ ; 
//             else r-- ;
//         }
//             if(a==0)return c ; 
//             else return -1; 
//          }
// }


class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int target = totalSum - x;
        if (target < 0) return -1;
        if (target == 0) return nums.length;
        
        int n = nums.length;
        int maxLen = -1;
        int currentSum = 0;
        
        int l = 0;
        int c = 0; // represents window length
        
        for (int r = 0; r < n; r++) {
            currentSum += nums[r];
            
            while (currentSum > target && l <= r) {
                currentSum -= nums[l];
                l++;
            }
            
            if (currentSum == target) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }
        
        return maxLen == -1 ? -1 : n - maxLen;
    }
}