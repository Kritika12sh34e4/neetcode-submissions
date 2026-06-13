class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer>m=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(m.containsKey(ch))m.put(ch,m.get(ch)+1);
            else m.put(ch,1);
        }
        for(char ch1:t.toCharArray()){
            if(!m.containsKey(ch1) || m.get(ch1)==0)return false;
            m.put(ch1,m.get(ch1)-1);
        }
        return true;
    }
}
