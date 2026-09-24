class Solution {
    public int firstMissingPositive(int[] digits) {
        HashMap < Integer  , Integer > ptanhi = new HashMap<>() ; 
        for(int i =  0 ; i < digits.length ; i++){
            ptanhi.put(digits[i] , digits[i]) ; 
        }
        for(int i = 1 ;  ; i++) { 
            if( ptanhi.containsKey (i))continue ;
            else return i ;  
        }
    }
}