package basic.Quiz;
public class java_training6 {
    public static void main(String[] args) {

        //問１
        int[] nums = {3, 10, 7, 15,20};
        int sum = 0;
        for (int n: nums){
            if(n>=10){
                sum += n;
            }
        }
        System.out.println(sum);
    }
}