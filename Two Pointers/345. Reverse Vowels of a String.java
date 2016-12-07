public class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        int start=0;
        int end=s.length()-1;
        char[]array=s.toCharArray();
        while(start<end){
            while(start<end&&vowels.indexOf(array[start])==-1){
                start++;
            }
            while(start<end&&vowels.indexOf(array[end])==-1){
                end--;
            }
            char temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return new String(array);
    }
}