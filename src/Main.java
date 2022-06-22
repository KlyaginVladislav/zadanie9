public class Main {
    public static void main(String[] args) {
        Author authorZ = new Author("Владислав ", "Клягин");
        System.out.println(authorZ);
        System.out.println(authorZ.hashCode());

        Book book1 = new Book("Книга о Войне", authorZ,"2022");

        System.out.println( book1);
        System.out.println(book1.hashCode());

        System.out.println(" Название книги" + book1.getBookName() + " Имя автора" + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + " Год публикции" + book1.getPublishingYear());

        book1.setPublishingYear(2021);

        System.out.println(" Название книги" + book1.getBookName() + " Имя автора" + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + " Год публикции" + book1.getPublishingYear());
    }
}