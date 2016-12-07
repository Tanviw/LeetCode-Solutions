public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int []len=new int[26];
        
        for(char i:magazine.toCharArray()){
            len[i-'a']++;
        }
        for(char j:ransomNote.toCharArray()){
               len[j-'a']--;
               if(len[j-'a']<0)return false;
        }
       return true;
    }
}