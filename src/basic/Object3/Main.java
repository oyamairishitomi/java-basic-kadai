package basic.Object3;

public class Main {
    //親クラス
    static class Animal {
        String name;
        int age;

        Animal(String name, int age){
            this.name = name;
            this.age = age;
        }

        void introduce(){
            System.out.println("私は" + name + "です");
        }
    }


    static class Dog extends Animal {
        Dog(){
            super("ポチ", 3); // 必ず１行目。Dog独自の処理はこの下
        }
    }

    public static void main(String[] args){

        Dog d = new Dog();
        d.introduce();

    }
}