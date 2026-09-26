//leetcode 9
class Solution {
    public boolean isPalindrome(int x) {
        int b=0,c=0;
        int temp=x;
        while(x>0){
            b=x%10;
            c = (c*10)+b;
            x=x/10;

        }
        if(temp==c){
            return true;                 
        }else{
            return false;
        }
    }
}