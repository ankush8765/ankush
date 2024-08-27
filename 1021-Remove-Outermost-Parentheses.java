class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String str="";
        for(int i=0;i<s.length()-1;i++){

            if(s.charAt(i)=='(' && count>0){
                count++;
                str+=s.charAt(i);
            }
            else if(s.charAt(i)=='(' && count==0){
                count++;
            }
            else if(s.charAt(i)==')' && count>0){
                count--;
                str+=s.charAt(i);
            }
            if(count==1 && s.charAt(i+1)==')'){
                i++;
                count--;
            }
        }
        return str;
    }
}