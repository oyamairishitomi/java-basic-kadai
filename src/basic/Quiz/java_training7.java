package basic.Quiz;
public class java_training7 {
    public static void main(String[] args) {

        //問１
        int[] nums = {3, 10, 7, 15,20};
        int max = nums[0];
        for (int n: nums){
            if(n>max){
                max = n;
            }
        }
        System.out.println(max);

        int min = nums[0];
        for (int n: nums){
            if(n<min){
                min = n;
            }
        }
        System.out.println(min);

    }
}