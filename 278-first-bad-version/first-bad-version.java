/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    //     int  s =  0 ; 
    //     int  l = n ; 
    //     while(l>=s) { 
    //         int m = (s+l)/2 ; 
    //         if(isBadVersion(m)==false && isBadVersion(m+1)==true) {
    //             return m+1 ;
    //         }
    //         else if(isBadVersion(m)==true && isBadVersion(m-1)==false){
    //             return m ; 
    //         }
    //         else if(isBadVersion(m)==false &&  isBadVersion(m+1)==false){
    //             s = m ; 
    //         }
    //         else l = m ; 
    //     }
    //     return 0 ; 
    // }

    int l = 1;
        int r = n;
        
        while (l < r) {
            int m= l+ (r - l) / 2;
            
            if (isBadVersion(m)) {
            r = m;
            } else {
                l = m+ 1;
            }
        }
        
        return l;
    }
}