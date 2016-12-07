public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int []>(){
            public int compare(int []o1,int []o2){
                return o1[0]!=o2[0]?o2[0]-o1[0]:o1[1]-o2[1];
            }
        });
        List<int[]> list=new LinkedList<>();
        for(int []i:people){
            list.add(i[1],i);
        }
        return list.toArray(new int [people.length][]);
    }
}