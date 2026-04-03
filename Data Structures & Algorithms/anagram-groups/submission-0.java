class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupAnagrams =new HashMap<>();
        for(String s : strs){
            int [] count=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            String key=Arrays.toString(count);
            groupAnagrams.putIfAbsent(key,new ArrayList<>());
            groupAnagrams.get(key).add(s);
        }
        return new ArrayList<>(groupAnagrams.values());
    }
}
