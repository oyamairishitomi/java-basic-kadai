package basic.Quiz;
public class java_training4 {
    public static void main(String[] args) {

        //問１
        int[] nums = {3,10,7,15,20};
        for (int n:nums){
            if (n<10)
                continue;
            else {
                System.out.println(n);
            }
        }


    }
}