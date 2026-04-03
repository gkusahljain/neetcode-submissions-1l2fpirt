class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest=0;
   // initaializing the starting point  if number -1 is not in set thn it  is the staring point
        for( int num : set){
            if(!set.contains(num-1)){
                int curnum=num;
                int count =1;

                //count the concecutive no
                while(set.contains(curnum+1)){
                    curnum++;
                    count++;
                }
                longest =Math.max(longest,count) ;
            }
        }
        return longest;
    }
}
