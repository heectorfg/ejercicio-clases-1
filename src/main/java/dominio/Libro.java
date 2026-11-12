package dominio;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private int paginas;

    public Libro() {
        this.titulo = " ";
        this.autor = " ";
        this.isbn = " ";
        this.paginas = 0;
    }

    public Libro(String titulo, String isbn, String autor, int paginas) {
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getIsbn() { return isbn; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }

    public void setAutor(String autor) { this.autor = autor; }
    public String getAutor() { return autor; }

    public void setPaginas(int paginas) { this.paginas = paginas; }
    public int getPaginas() {return paginas; }

    public boolean libroLargo() {
        return paginas > 300;
    }

    public String mostrarInformacion() {
        System.out.println("El titulo es: " + titulo + "\nEl autor es: " + autor + "\nEl isbn es: " + isbn + "\nTiene " + paginas + " paginas.");
        return "";
    }

    public boolean consultarTitulo(String titulo) {
        return this.titulo.equalsIgnoreCase(titulo);
    }
}

