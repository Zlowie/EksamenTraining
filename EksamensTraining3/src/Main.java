public class Main {
    public static void main(String[] args) {
        Bog bog = new Bog("Hvorfor", " er det her ", "nødvendigt??");
        bog.makeBog("Harry Potter", "J.K. Rowling", "1997", 0);
        bog.makeBog("Lord of the Rings", "J.R.R. Tolkien", "1954", 1);
        bog.makeBog("The Hobbit", "J.R.R. Tolkien", "1937", 2);
        bog.removeBog(1);
        bog.printBogListe();

    }
}