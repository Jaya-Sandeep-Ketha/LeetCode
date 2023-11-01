class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int i = 0;
        char[] arr = s.toCharArray();
        while(i < arr.length){
            if(i+1 < arr.length && romanvalue(arr[i])<romanvalue(arr[i+1])){
                num += romanvalue(arr[i+1]) - romanvalue(arr[i]);
                i += 2;
            }
            else{
                num += romanvalue(arr[i]);
                i++;
            }
        }
        return num;
    }
    private int romanvalue(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}