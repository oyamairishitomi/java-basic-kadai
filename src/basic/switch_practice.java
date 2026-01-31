package basic;

public class switch_practice {
       public static void main(String[] args) {
        int ranking = 1; //順位

        switch(ranking){
            case 1 -> System.out.println("金メダル");
            case 2 -> System.out.println("銀メダル");
            case 3 -> System.out.println("銅メダル");
            default -> System.out.println("参加賞");
        }

        //================================

        int randNum = (int)(Math.random()*10);
        System.out.println(randNum);

        switch(randNum){
            case 0,9 -> {System.out.println("大当たりです");System.out.println("やったー");}
            case 1,8 -> System.out.println("当たりです");
            default -> System.out.println("はずれです");
        }

        //=======================

        int ranking = 1;
        String award= "";

        //順位に応じた商品名
        award = switch(ranking){
            case 1 -> "金メダル";
            case 2 -> "銀メダル";
            case 3 -> "銅メダル";
            default -> "参加賞";
        };

        //商品名を表示
        System.out.println(award);

    }
}