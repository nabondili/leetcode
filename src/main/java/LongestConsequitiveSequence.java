import java.util.*;

public class LongestConsequitiveSequence {
    public static void main(String args[]){
        int[] nums={1,2,0,1};
        if(nums.length<1) {
//            return 0;
        }
        if(nums.length<2) {
//            return 1;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        Set<Integer> set=new HashSet<>();
        for(var i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                pq.add(nums[i]);
                set.add(nums[i]);
            }
        }
        List<Integer> list= new ArrayList<>();
        list.add(pq.poll());
        int i=0;
        int max=Integer.MIN_VALUE;
//        pq.
        while(!pq.isEmpty()){
            int temp=pq.poll();
            if((temp)==list.get(i)+1){
                list.add(temp);
                i=i+1;
            }else{
                max=list.size()>max?list.size():max;
                list=new ArrayList<>();
                list.add(temp);
                i=0;
            }
        }
        max=list.size()>max?list.size():max;
        System.out.println(max);
    }
}
