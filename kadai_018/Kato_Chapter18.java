package kadai_018;

abstract public class Kato_Chapter18 {
    public String familyName = "加藤";
    public String givenName;
    public String address = "東京都杉並区";

    //名前を受け取って保持する（super用）
    public void setgivenName(String givenName){
        this.givenName = givenName;
    }

    public void commonIntroduce(){
        System.out.println("私の苗字は" + familyName + "です");
        System.out.println("私の住所は" + address + "です");
    }

    abstract public void eachIntroduce();

    public void execIntroduce(){
        commonIntroduce();
        eachIntroduce();
    }
}
