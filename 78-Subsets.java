class Solution {
   public  List<List<Integer>> recu(List<List<Integer>> all, ArrayList<Integer> arr1,int[] nums,int n,int index){
        if(index==n){
            all.add(new ArrayList<Integer>(arr1));
            return all;
        }

        arr1.add(nums[index]);
        recu(all,arr1,nums,n,index+1);
        arr1.removeLast();
        recu(all,arr1,nums,n,index+1);
        return all;
    }


    public  List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> all= new ArrayList<>();
        int n= nums.length;
        int index=0;
        ArrayList<Integer> arr1=new ArrayList<>();

        return recu(all,arr1,nums,n,index);
    }
}