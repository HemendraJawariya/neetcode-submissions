class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char temp;
       int i=0,j=n-1;
       while(i<j){
        temp=s[j];
        s[j]=s[i];
        s[i]=temp;
        j--;
        i++;
       }

    }
}