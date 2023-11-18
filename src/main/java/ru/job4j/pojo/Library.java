package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 650);
        Book book2 = new Book("Molodoya gvardiya", 669);
        Book book3 = new Book("Oliver Tvist", 364);
        Book book4 = new Book("Fill Nite", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (Book bk : books) {
            System.out.println("название книги : " + bk.getName() + " количество старниц = " + bk.getNumPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book bk : books) {
            System.out.println("название книги : " + bk.getName() + " количество старниц = " + bk.getNumPages());
        }

        for (Book book : books) {
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName());
            }
        }
    }
}
