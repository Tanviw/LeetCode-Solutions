public class Solution {
    public int[] countBits(int num) {
        int []array=new int[num+1];
        for(int i=1;i<=num;i++){
            array[i]=array[i>>1]+(i&1);
        }
        return array;
    }
}