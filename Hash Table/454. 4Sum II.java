public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int i=0;
        int j=0;
        int sum=0;
        for(i=0;i<A.length;i++){
            for(j=0;j<B.length;j++){
                sum=A[i]+B[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int count=0;
        for(i=0;i<C.length;i++){
            for(j=0;j<D.length;j++){
                count+=map.getOrDefault(-1*(C[i]+D[j]),0);
            }
        }
        return count;
    }
}