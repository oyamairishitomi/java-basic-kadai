package basic;

public class for_practice1 {
           public static void main(String[] args) {

            for( int i =1; i < 11; i++){ //初期化式、条件式、変化式 i++で１プラスするインクリメント。--で1減らす。
                
                if(i == 3){
                    System.out.println("次の繰り返し処理に進む");
                    continue;
                }

                if(i == 5 ) {
                    System.out.println("繰り返し処理を強制終了");
                    break;
                }
                
                System.out.println(i); //反復処理

            }//変数iはこのスコープ内でのみ用いる

           }
}
