class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int element1=0;
        int element2=0; 
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i] != element2){
                element1=nums[i];
                count1=1;
            }else if(count2==0 && nums[i] != element1){
                element2=nums[i];
                count2=1;
            }else if(element1==nums[i]){
                count1++;
            }else if(element2==nums[i]){
                count2++;
            }else {
                count1--;
                count2--;
            }
        }List<Integer> ans = new ArrayList<>();
           count1 = 0;
        count2 = 0;

        for(int num : nums) {
            if(num == element1)
                count1++;
            else if(num == element2)
                count2++;
        }

if(count1 > nums.length/3)
    ans.add(element1);

if(count2 > nums.length/3)
    ans.add(element2);

return ans;
        
    }
}