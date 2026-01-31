package basic;

class Main{
    public static void main(String[] args) {

        //shortをbyteにキャスト
        short valShort = 32767;
        byte valByte = (byte)valShort;
        System.out.println(valByte);
        // 範囲を超えたキャストなので、-1と変な数字になる

        //doubleをintにキャスト
        double valDouble = 123.456;
        int valInt = (int)valDouble;
        System.out.println(valInt);
        // 小数点以下がなくなる

        //いつ使うねん→小数点以下まで正確に計算したいとき
        int distance = 120; //m
        int time = 25; //sec

        float speed = distance / time;
        System.out.println("速度：" + speed + "m/秒");
        //正確には4.8m/秒のはずが、int扱いなので小数点以下をカットして4.0になる

        float speed2 = (float)distance / (float)time;
        System.out.println("速度：" + speed2 + "m/秒");
        //4.8m/秒にするため、それぞれfloat扱いにする

//===========================================================

        int price = 298; //yen
        double tax = 0.1; // tax

        int charge = (int)(price + (price * tax));
        System.out.println(charge + "円");
        // 298+29.8円になるが、intでキャスト

//===========================================================


    }
}