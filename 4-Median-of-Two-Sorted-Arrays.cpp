class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<double>vec;
        for(int i=0;i<nums1.size();i++){
            vec.push_back(nums1[i]);
        }
        double median;
        for(int i=0;i<nums2.size();i++){
            vec.push_back(nums2[i]);
        }
        sort(vec.begin(),vec.end());
        int k=vec.size();
        if(k%2!=0){
            median=vec[(k/2)];
            return median;
        }
        else{
            median=(vec[k/2]+vec[(k/2)-1])/2;
            return median;
        }
        
    }
};