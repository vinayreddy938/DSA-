class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hmap = new HashMap<>();
        String[] arr = s.split(" ");
        HashSet<String> hset = new HashSet<>();
        if(arr.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch1 = pattern.charAt(i);
            if(hmap.containsKey(ch1)){
                if(!hmap.get(ch1).equals(arr[i])){
                    return false;

                }
            }else {
                if(hset.contains(arr[i])){
                    return false;
                }
                hmap.put(ch1,arr[i]);
                hset.add(arr[i]);
            }

        }
        return true;
        
    }
}