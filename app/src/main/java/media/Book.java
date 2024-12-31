package media;

public class Book extends Media{
    private long pages;

    public long getLength() {
        return pages;
    }

    public void setLength(long pages) {
        this.pages = pages;
    }
}
