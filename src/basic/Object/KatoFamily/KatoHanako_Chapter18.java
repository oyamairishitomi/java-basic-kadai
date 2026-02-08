package basic.Object.KatoFamily;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
    KatoHanako_Chapter18(){
        super("花子", 14);
    }
    
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("私は長女です");
    }
}
