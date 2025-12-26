package ict301.solid.srp;

public class BookPrinter {
    public void printToScreen(BookSRP book) {
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }
}
