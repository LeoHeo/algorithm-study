// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        if (K < 0 || K > 100) {
          throw new IllegalArgumentException("invalid K");
        }
    
        int[] result = new int[A.length];
        final int length = A.length - 1;
    
        for(int i=0; i<=length; i++) {
          final int newIndex = i + K < length ? i + K : (i + K) % (length + 1);
          result[newIndex] = A[i];
        }
    
        return result;
    }
}