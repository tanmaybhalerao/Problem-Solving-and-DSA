public class $2TwoSum{
    public static void main(String[] args) {
        $2TwoSum test=new $2TwoSum();
        int [] num={1,2,3};
        int [] ouput=test.twoSum(num, 4);
        System.out.println("Final answer");
        printArray(ouput);
    }
    public int[] twoSum(int[] nums, int target) {
        int [] indices=new int[2];
        //If the size of the array is 2 then output is always [0,1]
        System.out.println("Indices inside function :");
        printArray(indices);
        if(nums.length==2){
            indices[0]=0;
            indices[1]=1;
            return indices;
        }
        System.out.println("Indices step2  inside function :");
        printArray(indices);
       
       for(int i=0;i<=nums.length-2;i++){
        for(int j=i+1;j<=nums.length-1;j++){
            if(target ==( nums[i]+nums[j]) ){
                indices[0]=i;
                indices[1]=j;
                return indices;   
            }
        }
       }
       System.out.println("Indices step3  inside function :");
        printArray(indices);
       return indices;
    }

    public static void printArray(int [] arr){
        for (int i: arr){
            System.out.println("indice : "+i);
        }
    }
}