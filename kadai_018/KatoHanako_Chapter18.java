package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
    KatoHanako_Chapter18(){
        setgivenName("花子");
    }

    @Override
    public void eachIntroduce(){
        System.out.println("私は" + givenName + "です");
        System.out.println("趣味は読書です");

    }
}
