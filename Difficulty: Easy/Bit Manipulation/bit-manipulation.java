// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        System.out.print((num&(1<<i-1)) == 0? 0:1); 
        System.out.print(" "+(num|(1<<i-1))+" ");
        System.out.print((num&(~(1<<i-1)))+" ");
        
        
    }
}
