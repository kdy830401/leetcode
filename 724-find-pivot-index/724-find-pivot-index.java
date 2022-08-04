class Solution {
    public int pivotIndex(int[] nums) {
   
        
        for(int i = 0; i < nums.length; i++){
            int rightSum = 0;
            int leftSum = 0;
            
            for(int j = 0 ; j < i; j++){
                leftSum += nums[j];
            }
            
            for(int k = i + 1; k < nums.length; k++){
                rightSum += nums[k];
            }
            
            if(i == 0 && rightSum == 0){
                return 0;
            } else if(rightSum == leftSum){
              return i;
            }
        }
        return -1;
         
    }
}