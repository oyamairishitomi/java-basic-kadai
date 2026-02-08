package basic.Object.KatoFamily;

public class Main {
    public static void main(String[] args) {
        Kato_Chapter18[] family = {
            new KatoTaro_Chapter18(),
            new KatoJiro_Chapter18(),
            new KatoSaburo_Chapter18(),
            new KatoHanako_Chapter18()
        };

        for (Kato_Chapter18 p : family){
            p.execIntroduce();
            System.out.println("------");
        }
    }
}
