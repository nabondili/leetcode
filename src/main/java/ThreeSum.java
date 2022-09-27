import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String args[]){
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i+2!=nums.length){
                int sum=nums[i]+nums[i+1]+nums[i+2];
                if(sum==0){
                    List<Integer> list= new ArrayList<>();
                    list.add(nums[i]);list.add(nums[i+1]);list.add(nums[i+2]);
                    result.add(list);
                }
            }
            System.out.println(result);
        }
    }
}

/*
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
                if(i+2!=nums.length){
                    int sum=nums[i]+nums[i+1]+nums[i+2];
                    if(sum==0){
                        List<Integer> list= new ArrayList<>();
                        list.add(nums[i]);list.add(nums[i+1]);list.add(nums[i+2]);
                        result.add(list);
                    }
                }

        }
        return result;
    }
}
* */
