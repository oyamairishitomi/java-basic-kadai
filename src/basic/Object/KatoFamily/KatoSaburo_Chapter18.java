package basic.Object.KatoFamily;

public class KatoSaburo_Chapter18 extends Kato_Chapter18 {
    
    KatoSaburo_Chapter18() {
        super("三郎", 16);
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("私は三男です");
    }
}
