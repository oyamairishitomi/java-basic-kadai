package basic.Quiz;
public class java_training8 {
    public static void main(String[] args) {

        //問１
        int[] nums = {3, 10, 7, 15,20};
        int max = nums[0];
        int min = nums[0];
        for (int n: nums){
            if(n>max){
                max = n;
            }
            else if(n<min){
                min = n;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}