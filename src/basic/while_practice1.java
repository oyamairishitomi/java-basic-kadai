package basic;
public class while_practice1 {
        public static void main(String[] args) {
            int dice=1;//さいころの目
            int cnt=0;//繰り返し回数

            while( dice !=6 ){
                dice = (int)( Math.ceil( Math.random() * 6));
                    //Math.ceil() は小数点以下を切り上げるメソッド
                    
                    if(5 <= cnt){
                        System.out.println("５回に達したため強制終了");
                        break;
                    }
                    
                    System.out.println("さいころの目は" + dice);

                    // １回さいころを振ったので、繰り返し回数を１プラス
                    cnt++;
            }
    }
}