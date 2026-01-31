package basic;

public class list_practice {
           public static void main(String[] args) {

            String[] nameArray = new String[5];
            int[] scoreArray = {70,85,80,95,90};

            //氏名を代入
            nameArray[0] = "侍太郎";
            nameArray[1] = "侍一郎";
            nameArray[2] = "侍二郎";
            nameArray[3] = "侍三郎";
            nameArray[4] = "侍四郎";

            //氏名を出力
            System.out.println(nameArray[0]);
            System.out.println(nameArray[1]);
            System.out.println(nameArray[2]);
            System.out.println(nameArray[3]);
            System.out.println(nameArray[4]);

            //点数を出力
            System.out.println(scoreArray[0]);
            System.out.println(scoreArray[1]);
            System.out.println(scoreArray[2]);
            System.out.println(scoreArray[3]);
            System.out.println(scoreArray[4]);

            //=================================
                                //配列の要素数を意味する
            for( int i = 0; i < scoreArray.length; i++){
                System.out.println((i + 1)+"番目は"+ scoreArray[i]);
            }
        //要素数を示す
        System.out.println("要素数は" + scoreArray.length);
            //=====拡張for文============================
            //=====配列などの各要素を順番に参照するため、さらに単純化した
            //　データ型 ループ用変数名　: 配列名){反復処理}
            for(int score: scoreArray){
                System.out.println(score+"拡張for文");


           }
        }
    }
