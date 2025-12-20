package SRP.apres;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Création du livre
        BookSRP book = new BookSRP(
                "Design Patterns",
                "Erich Gamma",
                "Les patrons de conception expliqués"
        );

        // 2️⃣ Affichage du livre
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);

        // 3️⃣ Sauvegarde du livre
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);
        saver.saveToFile(book, "design_patterns.txt");

        // 4️⃣ Logique métier (emprunt)
        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(book, "Alice");
        logic.autreService(book);
    }
}

