package basic.kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
    KatoIchiro_Chapter18(){
        setgivenName("一郎");
    }

    @Override
    public void eachIntroduce(){
        System.out.println("私は" + givenName + "です");
        System.out.println("好きな食べ物はリンゴです");

    }
}
