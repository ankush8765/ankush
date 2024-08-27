class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String s=strs[0];
        int a=s.length();
        int l=Integer.MAX_VALUE;
        for(int i=1;i<strs.length;i++){
            int b=strs[i].length();
            int c=Math.min(a,b);
            int k=0;
            for(int j=0;j<c;j++){
             if(s.charAt(j)==strs[i].charAt(j)){
                k++;
            }
            else{
                break;
            }
            }
            
            l=Math.min(l,k);
        }
        return s.substring(0,l);
    }
}