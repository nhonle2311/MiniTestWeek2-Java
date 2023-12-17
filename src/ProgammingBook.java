public class ProgammingBook extends Book{
    private String language;
    private String frameWork;

    public ProgammingBook() {

    }

    public ProgammingBook(int bookcode, String name, double price, String author, String language, String frameWork) {
        super(bookcode, name, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    @Override
    public String toString() {
        return "ProgammingBook:" + super.toString() + '\''+
                "language='" + language + '\'' +
                ", frameWork='" + frameWork + '\'' +
                '}' + "\n";
    }
}
