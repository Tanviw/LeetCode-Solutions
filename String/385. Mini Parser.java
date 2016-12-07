/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    int i = 1;
    int start = i;
    
    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') return new NestedInteger(Integer.valueOf(s));
        NestedInteger res = new NestedInteger();
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '[') {
                start = ++i;
                NestedInteger ni = deserialize(s);
                res.add(ni);
            }
            else if (c == ']' || c == ',') {
                String num = s.substring(start, i);
                if (!num.equals("")) {
                    int n = Integer.valueOf(num);
                    NestedInteger ni = new NestedInteger(n);
                    res.add(ni);
                }
                start = ++i;
                if (c == ']') break;
            } 
            else 
                i++;
        }
        return res;
    }
}