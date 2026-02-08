package basic;
public class Method_2 {
    public static void main(String[] args){
    final int postage1 = 500; //送料１
    final int postage2 = 800; //送料２

    addPostage(1000, postage1 );
    addPostage(1000, postage2 );
}
public static void addPostage( final int price, final int postage ){
    int total= price + postage; //価格に送料を加算
    System.out.println("送料込みの価格は"+total+"円です");
    }
}
//戻り値をvoidではなく、charにしている。最終的に成績を返す
    public static char getGrade (final int score){
        char grade = 'C';

        if( 90 <= score ){
            grade = 'A';
        } else if(80 <= score){
            grade = 'B';
        }

        return grade;
    }