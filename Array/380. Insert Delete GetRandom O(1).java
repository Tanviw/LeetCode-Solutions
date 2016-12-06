public class RandomizedSet {

    Random rand=new Random();
    ArrayList<Integer> array;
    HashMap<Integer,Integer>map;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        array=new ArrayList<Integer>();
        map=new HashMap<Integer,Integer>();
    
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val))
        return false;
        map.put(val,array.size());
        array.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val))
        return false;
        int posi=map.get(val);
        if(posi<array.size()-1){
            int num=array.get(array.size()-1);
            array.set(posi,num);
            map.put(num,posi);
            
        }
        map.remove(val);
        array.remove(array.size()-1);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return array.get(rand.nextInt(array.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */