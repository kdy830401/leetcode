class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null){
            return false;
        }
        
        if(s.length() != t.length()){
            return false;
        }
        
        if(s.equals(t)){
            return true;
        }
        
        char[] cs = new char[s.length()];
        char[] ct = new char[t.length()];
        
        boolean result = true;
        for(int i = 0; i < s.length(); i++){
            cs[i] = s.charAt(i);
            ct[i] = t.charAt(i);

            for(int j = 0; j < i; j++){
                if(cs[i] == cs[j] && ct[i] != ct[j]){
                    result = false;
                } else if(cs[i] != cs[j] && ct[i] == ct[j]){
                    result = false;
                }
            }
        }
        return result;
    }
}