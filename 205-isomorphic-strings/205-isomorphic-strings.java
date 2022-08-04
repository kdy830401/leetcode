class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null){
            return false;
        }
        
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character, Character> map = new HashMap<>();
        Set<Character> tSet = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
           
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if(!map.containsKey(s.charAt(i)) && tSet.contains(t.charAt(i))){
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
            tSet.add(t.charAt(i));
            
            
        }
        return true;
    }
}