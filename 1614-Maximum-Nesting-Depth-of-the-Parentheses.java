class Solution {
    public int maxDepth(String s) {
        int mx=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                mx=Math.max(mx,count);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return mx;
    }
}