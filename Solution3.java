class Solution3 {
    public int romanToInt(String s) {
        s = s.replace("IV","c");
        s = s.replace("IX","h");
        s = s.replace("XL","e");
        s = s.replace("XC","n");
        s = s.replace("CD","q");
        s = s.replace("CM","i");
        int newSum = 0;
        char[] romen = {'I','V','X','L','C','D','M','c','h','e','n','q','i'};
        int[] value = {1,5,10,50,100,500,1000,4,9,40,90,400,900};
        char[] newArray = s.toCharArray();
        for(int i = 0;i < newArray.length;i ++){
            for(int j = 0;j < romen.length;j ++){
                if(newArray[i] == romen[j]){
                    newSum += value[j];
                    break;
                }
            }
        }
        return newSum;
    }
}