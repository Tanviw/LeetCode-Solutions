public class Solution {
    public String decodeString(String s) {
        Stack<Integer>countStack=new Stack<>();
        Stack<StringBuilder>strStack=new Stack<>();
        StringBuilder cur=new StringBuilder();
        int k=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+c-'0';
            }else if(c=='['){
                countStack.push(k);
                k=0;
                strStack.push(cur);
                cur=new StringBuilder();
            }else if(c==']'){
                StringBuilder temp=new StringBuilder(cur);
                cur=strStack.pop();
                int repeatTimes=countStack.pop();
                for(int t=repeatTimes;t>0;t--){
                    cur.append(temp);
                }
            }else{
                cur.append(c);
            }
        }
        return cur.toString();
    }
}