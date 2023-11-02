class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == ' '){
                count = 0;
            }
            else{
                count += 1;
            }
        }
        return count;
    }
}