class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int n = s.length();
        int left=0;
        int maxlen=0;
        int maxfreq=0;
        for(int right=0;right<n;right++){
            int idx = s.charAt(right)-'A';
            freq[idx]++;
            maxfreq=Math.max(maxfreq,freq[idx]);
            while((right-left+1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}