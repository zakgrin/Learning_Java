public enum Book {
    // Enum: 
    Java1("Java Programming 1", "2010"),
    java2("Advanced Java Programming", "2015"),
    Algo("Algorithms Book", "2008"),
    SQL("SQL and Databases", "2003");
    // Variables: 
    private final String title;
    private final String publishYear;
    // Constructor: 
    Book(String title, String publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }
    // Getters:
    public String getTitle() {
        return title;
    }
    public String getPublishYear() {
        return publishYear;
    }

}
