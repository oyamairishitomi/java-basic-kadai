package basic;
public class Method_3 {
    public static void main(String[] args){
        int[] scoreArray = {70,85,80,95,90,120};

        //点数ごとに成績をつける
        for( int score : scoreArray){
            System.out.println( score + "点だと成績は" + getGrade(score));
            }
        }

    //戻り値をvoidではなく、charにしている。最終的に成績を返す
    public static char getGrade (final int score){
        char grade = 'C';
        //点数が不正な場合は成績を-としてメソッドを終了
        if ( (score < 0) | (100<score)){
            return '－';
        }

        //点数によって成績を決める
        if( 90 <= score ){
            grade = 'A';
        } else if(80 <= score){
            grade = 'B';
        }

        return grade;
    }

}