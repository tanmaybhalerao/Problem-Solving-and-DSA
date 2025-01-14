import java.util.ArrayList;

class $3LongestPrefix {
    public static void main(String ...  args){
        String [] strs={"flower","flight","flow"};
        System.out.println("Max Prefix is : "+longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String[] strs) {
        String [] temp=strs;
        //Code for Finding the smallest by size
        int smallestStringSize=temp[0].length();
        String smallestString="";
        String maxPreFix="";
        boolean flag=true;
        // int smallestStringIndex;
        
        for(int i =0;i<temp.length;i++){
            smallestStringSize=temp[i].length()<=smallestStringSize?temp[i].length():smallestStringSize;
            smallestString    =temp[i].length()<=smallestStringSize?temp[i]:smallestString;
        }
        System.out.println(smallestString+" :"+smallestStringSize);
        for(int i=0;i<smallestStringSize;i++){
            smallestString.charAt(i);
            for(int j=0;j<temp.length;j++){
                if(temp[j].charAt(i)!=(smallestString.charAt(i))){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            maxPreFix+=smallestString.charAt(i);
        }
        return maxPreFix;     
    }
}