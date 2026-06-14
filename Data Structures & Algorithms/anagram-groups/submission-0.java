class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>m=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            m.putIfAbsent(st,new ArrayList<>());
            m.get(st).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
