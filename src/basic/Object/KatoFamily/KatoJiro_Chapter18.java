package basic.Object.KatoFamily;

public class KatoJiro_Chapter18 extends Kato_Chapter18 {
    KatoJiro_Chapter18(){
        super("二郎", 18);
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("私は次男です");
    }
}
