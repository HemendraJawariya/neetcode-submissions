class Solution {
    public boolean isArmstrong(int x) {
        int original=x;
        int n=String.valueOf(x).length();
        int sum=0;
        while(x>0){
            int digit=x%10;
            sum+=Math.pow(digit,n);
            x/=10;

        }
        return sum==original;
    }
}
