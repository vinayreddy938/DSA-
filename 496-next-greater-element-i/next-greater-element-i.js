/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var nextGreaterElement = function(nums1, nums2) {
    const  map = new Map();
    const  stack = [];
      stack.push(nums2[nums2.length - 1]);
    map[nums2[nums2.length-1]] = -1;
    const ans = [];
    for(let i=nums2.length-2;i>=0;i--){
        if(stack[stack.length-1]>nums2[i]){
            map[nums2[i]] =stack[stack.length-1];
            stack.push(nums2[i]);
        }else{
            while(stack.length!=0){
                if(stack[stack.length-1]<nums2[i]){
                    stack.pop();
                    
                }else{
                    map[nums2[i]] = stack[stack.length-1];
                    break;
                }
            }
            if(stack.length==0){
                map[nums2[i]] = -1;
            }
            stack.push(nums2[i]);
        }
       
        
    }
    for(let i=0;i<nums1.length;i++){
        ans.push(map[nums1[i]]);
    }
    return ans;
};