class Solution {
    public String reverseWords(String s) {
        int n=0;
        s=s.trim();
        String[] arr=s.split(" +");

        String st="";
        for(int i=arr.length-1;i>=0;i--){
            st+=arr[i];
            if(i!=0){
                st+=" ";
            }

        }
        return st;
    }
}