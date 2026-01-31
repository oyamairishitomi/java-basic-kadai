package basic;
public class If {
        public static void main(String[] args) {
            int age = 17; //年齢

            if( age < 18 ){
                System.out.println("未成年です");
            }
            if( age >= 18 ){
                System.out.println("成人です");
            }

            //==========================

            if (age < 18){
                System.out.println("未成年です");
            } else {
                System.out.println("成人です");
            }
            //==========================

            System.out.println(1 != 2);
            System.out.println(1 == 2);

            //==========================

            boolean isAdult = false;

            if(!isAdult){
                System.out.println("成人です");
            } else {
                System.out.println("未成年です");
            }

            //============================

            float valFloat = 12.3F;
            double valDouble = 12.3;

            System.out.println(valFloat == valDouble);
            //わずかなごさがあるためfalse

            //============================
            float valFloat2 = 12.3f;
            double valDouble2 = 12.3;

            if (Math.abs(valFloat2 - valDouble2) <= 0.0001){
                System.out.println("２つの変数値は等しいです（誤差は許容範囲）");    
            } else {
                System.out.println("２つの変数値は等しくありません");
            }

            // ==============================

            int randNum = (int)(Math.random() * 10);
            //ランダムに生成、乱数を１０倍して小数部分を切り捨て
            //intの()必須：型キャスト構文。byte valByte = (byte)valShort;と一緒
            System.out.println(randNum);

            if ( randNum == 9){
                System.out.println("大当たりです");
            } else if( randNum == 8){
                System.out.println("当たりです");
            }
            else {
                System.out.println("はずれです");
            }

            // =========================
            int randNum2 = (int)(Math.random() * 5);
            System.out.println(randNum2);

            if( (1 < randNum) && (randNum < 3)){
                System.out.println("randNumは１より大きい、かつ３より小さい値です");
            } else{
                System.out.println("and条件が成り立ちません");
            }
            if((randNum == 1) || (randNum == 3)){
                System.out.println("randNumは１，または３です");
            } else {
                System.out.println("or条件が成り立ちません");
            }
        }
}
