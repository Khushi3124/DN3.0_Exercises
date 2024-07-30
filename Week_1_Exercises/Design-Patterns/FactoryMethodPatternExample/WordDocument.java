public class WordDocument implements Document {
    private String authorName;
    private String title;
    private String extension;

    public WordDocument(String authorName, String title, String extension){
        this.authorName = authorName;
        this.title = title;
        this.extension = extension;
    }


    public String getAuthorName() {
        return this.authorName;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDocumentExtension() {
        return this.extension;
    }
    
    @Override
    public String toString() {
        return "Author Name: "+this.getAuthorName()+", Filename: "+this.getTitle()+"."+this.getDocumentExtension();
    }    
}
