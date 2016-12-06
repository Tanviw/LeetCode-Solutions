public class RandomizedCollection {

	Random rand=new Random();
    ArrayList<Integer> numsArray;
    HashMap<Integer,LinkedHashSet<Integer>> map;
    
    public RandomizedCollection() {
        numsArray=new ArrayList<Integer>();
        map=new  HashMap<Integer,LinkedHashSet<Integer>>();
    }
    
    public boolean insert(int val) {
        boolean alreadyExists=map.containsKey(val);
        if(!alreadyExists){
        	map.put(val,new LinkedHashSet<Integer>());
        }
        map.get(val).add(numsArray.size());
        numsArray.add(val);
        return !alreadyExists;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
        	return false;
        }
        LinkedHashSet<Integer> v=map.get(val);
        int removeFlag=v.iterator().next();
       
        int lastNum=numsArray.get(numsArray.size()-1);
        LinkedHashSet<Integer>replaceWith=map.get(lastNum);
        
        numsArray.set(removeFlag,lastNum);
        
        v.remove(removeFlag);
        
        if(removeFlag!=numsArray.size()-1){
        	replaceWith.remove(numsArray.size()-1);
        	replaceWith.add(removeFlag);
        }
        numsArray.remove(numsArray.size()-1);
        if(v.isEmpty()){
        	map.remove(val);
        }
        return true;
    }
    
    public int getRandom() {
        return numsArray.get((int)(Math.random()*numsArray.size()));
    }
}
