public class DocumentFactory {
    public static Document createDocument(String type, String author, String title, String extension){
        if(type.trim().equalsIgnoreCase("Word")){
            return new WordDocument(author, title, extension);
        } else if(type.trim().equalsIgnoreCase("PDF")){
            return new PdfDocument(author, title, extension);
        } else if(type.trim().equalsIgnoreCase("Excel")){
            return new ExcelDocument(author, title, extension);
        } else { 
            return null;
        }
    }
}
