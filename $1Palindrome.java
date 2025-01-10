class Solution {
    
    public static void main(String[] args) {
        Solution solution=new Solution();
       System.out.println( solution.isPalindrome2(-121));
    }


    /*
     * 1. Approcah by Math Operations
    */
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(temp>0){
            int digit=x%10;
            rev=(rev*10)+digit;
            temp=temp/10;
        }
        if(rev==x)
        return true;

        return false;
    }

    /**
     * 2.Approch by String builder and string manupulation
     * 
     */

     public boolean isPalindrome2(int x){
        //If the number is negative then output become always negative.
        if(x<0){
            return false;
        }
        
        StringBuilder sb=new StringBuilder();
        sb.append(x);
        String reverseString =(sb.reverse()).toString();
        if(reverseString.equals(x+"")){
            return true;
        }
        return false;
     }
}