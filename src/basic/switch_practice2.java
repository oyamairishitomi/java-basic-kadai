package basic;

public class switch_practice2 {
       public static void main(String[] args) {

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