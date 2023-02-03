public class ArraysIn {
    private int[] nums;

    public ArraysIn(int[] nums){
        this.nums = nums;
    }

    public int[] getNums(){
        return nums;
    }
    public String toString(){
        String sub = "{";
        for (int i = 0; i <= nums.length - 1; i ++){
            if (i < nums.length - 1) {
                sub += nums[i] + ", ";
            } else if (i == nums.length - 1) {
                sub += nums[i] + "]";
            }
        }
        return sub;
    }
}
