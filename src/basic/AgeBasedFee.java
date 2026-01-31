    package basic;

public class AgeBasedFee {
       public static void main(String[] args) {
        int age = 10;
        int price;

        price = switch(age){
            case 10 -> 1000; //複数行の場合、{}でかこむべし
            case 20 -> 2000;
            case 30,40 -> 3000;
            case 50 -> 4000;
            default -> 5000;
        };
        System.out.println(age + "代の料金は" + price + "円です");
}
}