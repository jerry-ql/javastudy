class Solution2 {
    public boolean isPalindrome(int x) {
        if(x < 0|| (x % 10 ==  0) && (x != 0)){
            return false;
        }
   int A = 0;
        while(x > A){
            A = A*10 + x%10;
            x/=10;
           }
        return x == A || x == A/10;     
      }
}