public class Quicksort {

    public void sort(int[] nums){
        qs(nums,0,nums.length-1);

    }

    private void qs (int[] nums, int l, int r){

        if(l>=r){
            return;
        }
        int p = partition(nums,l,r);

        qs(nums,l,p-1);
        qs(nums,p+1,r);
    }

    private int partition (int[] nums, int l, int r){

        int p = nums[r];
        int i = l -1 ;

        for( int j = l; j< r; j++ ){
            if (nums[j]<p){
                i++;
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j] = temp;

            }


        }
        int temp = nums[i+1];
        nums[i+1]= nums[r];
        nums[r] = temp;
        return i+1;
    }
}
