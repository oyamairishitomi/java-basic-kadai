package basic.kadai_015_practice;

public class Washer_Chapter16 {
    int course = 1;
    int time = 20;

    public void changeCourse(int afterCourse){
            switch(course){
                case 1: time = 20; break;
                case 2: time = 30; break;
                case 3: time = 40; break;
                default: time = 20;break;
            }
        System.out.println("コース" + course + "から" + afterCourse + "に変更しました");
        }

        public void run(){
            System.out.println("洗濯時間は"+ time + "分です");
        }
    }
