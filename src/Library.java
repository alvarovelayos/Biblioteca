package src;

public class Library {

    private Integer isbn
    private String title;
    private String author;
    private String genre;
    private String publicationDate;

    public Integer getIsbn() {

        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getGenre() {

        return genre;
    }

    public void setGenre(String genre) {

        this.genre = genre;
    }

    public String getPublicationDate() {

        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {

        this.publicationDate = publicationDate;
    }
}