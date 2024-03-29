package model;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private final String title;
    private final String author;
    private final int edition;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.edition = 1;
    }

    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition >= 1 ? edition : 1;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    @Override
    public int compareTo(Book book) {
        var result = title.compareTo(book.title);
        if(result == 0){
            if (edition == book.edition){
                return 0;
            }else if (edition > book.edition){
                return 1;
            } else {
                return -1;
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return edition == book.edition && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, edition);
    }
}
