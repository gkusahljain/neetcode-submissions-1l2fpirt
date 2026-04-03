class Solution {
    public int characterReplacement(String s, int k) {
        int r=0 , l=0;
        int maxl=0 , maxf=0;
        int [] hash= new int[26];

        while(r<s.length()){
            hash[s.charAt(r) - 'A']++;
            maxf=Math.max(maxf,hash[s.charAt(r) - 'A']);
        
        while((r-l+1)-maxf>k){
            hash[s.charAt(l) - 'A']--;
            l++;
        }
        maxl=Math.max(maxl,(r-l+1));
        r++;
        }
        return maxl;
    }
}
