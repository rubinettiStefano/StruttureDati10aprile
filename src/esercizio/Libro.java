package esercizio;

import java.time.LocalDate;
import java.util.*;

public class Libro
{
    private String isbn,titolo,autore;
    private Set<String> generi = new HashSet<>();
    private LocalDate releaseDate;
    private double price;

    public Libro(){}

    public Libro(String isbn, String titolo, String autore, Set<String> generi, LocalDate releaseDate, double price) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
        this.generi = generi;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Set<String> getGeneri() {
        return generi;
    }

    public void setGeneri(Set<String> generi) {
        this.generi = generi;
    }

    public void addGenere(String genere) {
        this.generi.add(genere);
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = LocalDate.parse(releaseDate);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro libro)) return false;
        return Double.compare(price, libro.price) == 0 && Objects.equals(isbn, libro.isbn) && Objects.equals(titolo, libro.titolo) && Objects.equals(autore, libro.autore) && Objects.equals(generi, libro.generi) && Objects.equals(releaseDate, libro.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, titolo, autore, generi, releaseDate, price);
    }

    @Override
    public String toString() {
        return titolo;
    }
}
