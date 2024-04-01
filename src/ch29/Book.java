package ch29;

public class Book {

    private String title;
    private Author author;

    public void something(){

    }

    // static이 붙어서 다른데에서 부를려면 new 써야됨.
    public static class Author{
        private String name;
        private String addr;
        public void something(){

        }

    }
}

class Main{
    public static void main(String[] args) {

        Book.Author author = new Book.Author();
        author.something();

    }
}
