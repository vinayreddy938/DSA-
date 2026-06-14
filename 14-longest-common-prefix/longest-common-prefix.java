class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int x=0;
        while(x<strs[0].length()){
            char ch1=strs[0].charAt(x);
            for(int i=1;i<strs.length;i++){
                if(strs[i].length()==x){
                     return sb.toString();

                }
              
              char ch2 = strs[i].charAt(x);
                if(ch1!=ch2){
                    return sb.toString();
                }
            }
            sb.append(ch1);
            x++;
        }
        return sb.toString();
        
    }
}