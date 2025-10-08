class Solution {
    private void merge(int[] arr, int[] a, int[] b) {
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) arr[k++] = a[i++]; // here (=) has its importance if we don't put = then sort will not be stable..
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++];       
        while(j<b.length) arr[k++] = b[j++];       
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if(n==1) return nums;
        int a[] = new int[n/2];
        int b[] = new int[n-n/2];

        for(int i=0; i<n/2; i++) {
            a[i] = nums[i];
        }
        for(int i=0; i<n-n/2; i++) {
            b[i] = nums[i+n/2];
        }
        sortArray(a);
        sortArray(b);
        merge(nums, a, b);
        return nums;
    }
}