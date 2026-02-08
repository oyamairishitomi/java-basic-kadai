package basic.Quiz;
public class java_training9 {
    public static void main(String[] args) {

        //問２
        int[] nums = {3, 10, 7, 15,20};
        int max = nums[0];
        int second = nums[0];
        int min = nums[0];
        for (int n: nums){
            if(n>max){
                second = max;
                max = n;
            }
            else if(n<max && n>second){
                second = n;
            }
        }
        System.out.println(max);
        System.out.println(second);

    }
}