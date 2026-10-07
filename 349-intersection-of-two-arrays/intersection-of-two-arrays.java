class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           /* HashMap<Integer , Integer > ptanhi = new HashMap<>() ; 
            HashMap<Integer , Integer > ptan = new HashMap<>() ; 
            for(int i = 0 ; i < nums1.length ; i++) { 
                    ptanhi.put(arr[i] , arr[i])  ; 
            }
            for(int i = 0 ;  i < nums2.length ; i++) { 

            }    */



        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0;
        List<Integer> r = new ArrayList<>();
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
             
                if (r.isEmpty() || r.get(r.size() - 1) != nums1[i]) {
                    r.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        
        int[] arr = new int[r.size()];
        for (int k = 0; k < r.size(); k++) {
            arr[k] = r.get(k);
        }
        
        return arr;


       
        // HashMap<Integer, Integer> ptanhi = new HashMap<>();
        
        // for (int num : nums1) {
        //     ptanhi.put(num, 1); 
        // }
        
        // List<Integer> rl = new ArrayList<>();
        
        // for (int num : nums2) {
           
        //     if (ptanhi.containsKey(num) && ptanhi.get(num) == 1) {
        //         rl.add(num);
        //         ptanhi.put(num, 0); 
        //     }
        // }
        
      
        // int[] result = new int[rl.size()];
        // for (int i = 0; i < rl.size(); i++) {
        //     result[i] = rl.get(i);
       // }
        
       // return result;
    }
}



 