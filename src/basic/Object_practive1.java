package basic;

class Student{
    String name;

    Student(String name){
        this.name = name;
    }

    double calculateAvg(int[] scores){
        int sum = 0;
        for (int s : scores){
            sum += s;
        }
        return(double) sum / scores.length;
    }
        
}

public class Object_practive1 {
    public static void main(String[] args) {
        
    Student sato = new Student("佐藤");
    int[] scores = {70, 65, 80, 60, 75};

    double avg = sato.calculateAvg(scores);
    System.out.println(avg);
    }

}