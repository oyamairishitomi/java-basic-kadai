package basic.Object.KatoFamily;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
    KatoTaro_Chapter18(){
        // ここにsuper
        super("太郎",20);
    }

    @Override
    public void introduce(){
        super.introduce();
        //ここにオーバーライド。自己紹介を変えている
        System.out.println("私は長男です");
    }
}
