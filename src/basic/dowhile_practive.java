package basic;
public class dowhile_practive {
        public static void main(String[] args) {

        int dice = 1;

            do{
                dice = (int)( Math.ceil(Math.random()*6));
                System.out.println("[do-while]さいころの目は" + dice);
            } while( dice != 1);

        }
    }