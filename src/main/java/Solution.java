import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int res = Integer.MAX_VALUE;
        int l = 0;
        int r = (int) 1e9 + 1;
        int mid;
        while (l <=r ) {
            mid= l + (r - l) / 2;
            if(check(position, m, mid)){
                res = mid;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return res;
    }
    boolean check(int[] pos, int m, int val) {
        int next = pos[0] + val;
        for(int i = 1; i < pos.length; i++) {
            if(pos[i] >= next){
                m--;
                if(m == 1) {
                    return true;
                }
                next = pos[i] + val;
            }
        }

        return false;
    }
}