package basic;
public class while_practice3 {
        public static void main(String[] args) {
        
        // 問１=====

        int count = 0;
        while(count < 5){
            System.out.println(count);
            count++;
        }

        // 問２=====
        
        int count2 = 5;
        while(count2 >= 1){
            System.out.println(count2);
            count2--;
        }

        // 問３=====
        int counter=0;
        int i = 1;
       // while(int i=0; i <= 10; i++){ for文のやり方やろうとしている
        while(i <= 10){
            counter+=i;
            i++;
        }
        System.out.println(counter);
        
}
}