package basic.Quiz;
public class java_training3 {
    public static void main(String[] args) {

        //問１
        for(int i=1; i<6; i++){
            System.out.println(i);
                }

        //問２
        int sum = 0;
        for(int ii=1; ii<5; ii++){
            sum += ii;
        }
        System.out.println(sum);

        //問４
        int sumsum = 0;
        for(int iii=1; iii<=10; iii++){
            if(iii%2 != 0){
                continue;
            }else{
                sumsum += iii;
            }
        }
        System.out.println(sumsum);

        //問３
        int sumsumsum = 0;
        for(int i4=0; i4<10; i4++){
            if(i4 % 2 == 0){
                System.out.println(i4);
            }
        }
    }
}