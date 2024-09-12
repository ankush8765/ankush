class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashSet<Integer> hsh=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hsh.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(hsh.contains(nums2[i])){
                arr.add(nums2[i]);
                hsh.remove(nums2[i]);
            }
        }
        
        int [] num11= arr.stream().mapToInt(Integer::intValue).toArray();
        return num11;
        
    }
}