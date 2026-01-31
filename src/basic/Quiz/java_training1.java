package basic.Quiz;
public class java_training1 {
    public static void main(String[] args) {

        //第１
        //printlnは改行します
        System.out.println("こんにちは");

        //第２
         /* lnなしは改行しない
         うまくつかいわけます。*/
        System.out.print("おはようございます");

        //第３　上述

        //問４
        int a; //これだけでいい
        a = 5;

        System.out.println("aは"+ a + "です");

        //問５
        int aa =5;
        int bb =8;
        System.out.println("変数aaの値は" + aa +"です");
        System.out.println("変数bbの値は" + bb +"です");

        //問６
        int aaa = 10;
        int bbb;
        System.out.println(aaa);
        bbb = aaa;
        System.out.println(bbb);

        //====================================

        //問１
        //実行結果のとおりになるように、４つの変数の右辺を入れてください。
        int i = 5;
        double d = 3.14;
        char c = 'A';
        String s = "Hello";
        //変数の内容を表示
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);

        //問２
        System.out.println("私は" + 20 + "歳です。");
        int year = 2020;
        System.out.println("今年は" + year + "年です。");
        String box = "円周率は" + 3.14;
        System.out.println(box);

        //問３
        long aaaa = 123456789012L;
        double b = 3.141592653589;
        String cccc = "Good " + "Morning";
        System.out.println(aaaa);
        System.out.println(b);
        System.out.println(cccc);

        //問４略
        //問５
        char value1 = 'B';
        double value2 = 3.14;
        System.out.println(value1);
        System.out.println(value2);
        
        //====================================

        //問１
        int l3a = 5;
        System.out.println(4*3);
        System.out.println(15%4);
        System.out.println(l3a+7);
        System.out.println(l3a+4);

        //====================================
        //問１
        int l4a = 12;
        if (l4a > 7) {
        System.out.println("aは7より大きいです。");
        }

        //問２
        int l4b = 7;
        if (l4b>=8){
            System.out.println("bは8以上です。");
        }
        else {
            System.out.println("bは8より小さいです");
        }
    
        //問３
        int l4c = 7;
        if (l4c < 7) {
            System.out.println("7より小さいです");
        }
        else if (l4c == 7){
            System.out.println("true");
        }
        else{
            System.out.println("7より大きいです");
        }

        //問４
        int l4d = 5;
        switch (l4d) {
            case 1,2 -> System.out.println("小");
            case 3,4 -> System.out.println("中");
            case 5,6 -> System.out.println("大");
        }

        //問５
        //0～9までのランダムな値をaに代入してくれる命令です。
        int l4e = new java.util.Random().nextInt(10);
        System.out.println("l4e = " + l4e);
        //ここからプログラムを書いていきます
        if (l4e%2 == 2){
            System.out.println(l4e + "は偶数です");
        } else {
            System.out.println(l4e + "は奇数です");
        }

        //問６
        int l4f = -5;
        //ここからプログラムを書きます。
        l4f = l4f * -1;
        System.out.println(l4f);
}
}