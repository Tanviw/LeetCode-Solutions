public class Solution {
    public String frequencySort(String s) {
        int []map=new int[256];
        int max=0;
        for(Character i:s.toCharArray()){
            map[i]++;
            max=Math.max(max,map[i]);
        }
        String[]strArray=new String[max+1];
        for(int j=0;j<256;j++){
            String st=strArray[map[j]];
            if(map[j]>0){
                strArray[map[j]]=(st==null)?(""+(char)j):(st+(char)j);
            }
        }
        StringBuffer sbf=new StringBuffer();
        for(int k=max;k>=0;k--){
            if(strArray[k]!=null){
                for(Character c:strArray[k].toCharArray()){
                    for(int l=0;l<k;l++){
                        sbf.append(c);
                    }
                }
            }
        }
        return sbf.toString();
    }
}