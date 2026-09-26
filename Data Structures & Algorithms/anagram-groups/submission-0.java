class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            char[]chararr=s.toCharArray();
            Arrays.sort(chararr);
            String Ssorted=new String(chararr);
            res.putIfAbsent(Ssorted,new ArrayList<>());
            res.get(Ssorted).add(s);

        }
        return new ArrayList<>(res.values());
    }
}
