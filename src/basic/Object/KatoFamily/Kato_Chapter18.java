package basic.Object.KatoFamily;

class Kato_Chapter18 {
    public String familyName = "加藤";
    public String givenName = "";
    public int age = 0;

    Kato_Chapter18(String givenName, int age){
        this.givenName = givenName;
        this.age = age;
    }

    public void commonIntroduce(){
        System.out.println("苗字は" + familyName + "です");
        System.out.println("年齢は" + age + "です");
    }

    public void introduce(){
        System.out.println("名前は" + givenName + "です");
    }

    public void execIntroduce(){
        commonIntroduce();
        introduce();
    }


}
