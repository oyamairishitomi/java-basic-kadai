package basic.Object;

class Human{
    String name;
    private double weight;

    //コンストラクタ
    Human(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    void show(){
        System.out.println("名前: "+ name +", 体重: " + getWeight() + "kg");
    }

}