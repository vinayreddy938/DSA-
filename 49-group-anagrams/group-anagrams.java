class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String key = new String(charArray);

            if (hmap.containsKey(key)) {
                hmap.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                hmap.put(key, list);
            }
        }

        return new ArrayList<>(hmap.values());
    }
}