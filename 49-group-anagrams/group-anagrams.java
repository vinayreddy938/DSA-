class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            hmap.put(s,new ArrayList<>());
        }
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
             String s = String.valueOf(chars); 
             if(hmap.containsKey(s)){
               List<String> s2 =  hmap.get(s);
                 s2.add(strs[i]);
             }  
            
        }
       for(String key:hmap.keySet()){
        ans.add(hmap.get(key));
       }
        return ans;
    }
}
