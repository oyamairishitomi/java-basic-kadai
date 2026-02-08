package basic;

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void print(){
        System.out.println(title + '/' + author);
    }

    void describe(){
        System.out.println("「" + title + "」は" + author + "の作品です");
    }
}

public class Object_practive2 {
    public static void main(String[] args) {
        Book kokoro = new Book("こころ", "夏目漱石");

        kokoro.print();
        kokoro.describe();
    }
}
