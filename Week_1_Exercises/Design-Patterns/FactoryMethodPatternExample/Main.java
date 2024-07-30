public class Main {
    public static void main(String[] args) {
        Document document = DocumentFactory.createDocument("Excel", "Sahil", "Hello World in Python", "xlsx");
        Document document1=DocumentFactory.createDocument("PDF", "Khushi", "Hello in Java", "pdf");
        Document document2=DocumentFactory.createDocument("Word","Cognizant","Welcome to deep skilling","docx");
        String message = document.toString();
        System.out.println(message);
        System.out.println(document1.toString());
        System.out.println(document2.toString());
    }
}
