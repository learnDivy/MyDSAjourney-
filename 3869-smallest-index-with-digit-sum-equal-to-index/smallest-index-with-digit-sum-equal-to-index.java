class Solution {
    public int smallestIndex(int[] nums) {
          
        for(int i = 0 ; i < nums.length ; i++) { 
         
            if(check(nums[i] , i))return i ; 
            
        }
          
         return -1 ;
    }
    public boolean check(int n , int i ) { 
        
        int a = 0 ;
        while(n>0){
           a = n%10 + a ; 
           n = n/10 ; 
            ;
        }
        if(i==a)return true ; 
        else return false ; 
    }
}