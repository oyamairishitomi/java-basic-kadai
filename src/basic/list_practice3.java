package basic;

public class list_practice3 {
           public static void main(String[] args){

            //=====問１=====
            int[] nums = {10,20,30,40,50};

            for(int i = 0; i<nums.length;i++){
                System.out.println(nums[i]);
            }
            //=====類題１=====
            int[] nums2 = {3,6,9};
            for(int i = 0; i<nums2.length; i++){
                System.out.println(nums2[i]);
            }
            //=====類題２=====
            int[] num3 = {5,10,15};
            for(int i =0; i<num3.length; i++){
                System.out.println(i+"番目："+num3[i]);
            }
            //=====類題３=====
            for(int i = 0; i<5; i++){
                System.out.println("Java");
            }
            //=====類題４　#わからん=====
            int sum = 0;
            int number = 0;

            int[] scores = {10,20,30};
            for(int i = 0; i<scores.length; i++){
                sum += scores[i];
            }
            System.out.println(sum);
            //=====類題５ #わからん=====
            int cnt=0;
            int[] nums5 = {3,10,7,15,20};
                for(int i=0; i < nums5.length;i++){
                    if(nums5[i]>=10){
                    cnt++;
                    }
                }
            
            System.out.println("10個以上は"+ cnt + "個");

    }
}
