/**
 *
 * @author aluno
 */
public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int numPags;
    private int pagAtual = 0;
    
    public Livro(String titulo, String autor, String editora, int numPags) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numPags = numPags;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
     public void virarPagina() {
        if (pagAtual < numPags) {
            pagAtual++;
        } else {
            System.out.println("Você já está na última página!");
        }
    }
    public String exibirDetalhas() {
        return "Título: " + titulo +
            "\nAutor: " + autor +
            "\nEditora: " + editora +
            "\nNúmero de Páginas: " + numPags +
            "\nPágina Atual: " + pagAtual;
    }
}
