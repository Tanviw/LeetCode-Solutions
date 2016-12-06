public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []indexs=new int[2];
        if(numbers==null||numbers.length<2)return indexs;
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int num=numbers[i]+numbers[j];
            if(num==target){
                indexs[0]=i+1;
                indexs[1]=j+1;
                break;
            }else if(num>target){
                j--;
            }else
            i++;
        }
        return indexs;
    }
}