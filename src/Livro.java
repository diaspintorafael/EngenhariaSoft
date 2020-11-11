import java.util.Date;

public class Livro {
    private Integer id_livro;
    private String titulo;
    private String autor;
    private Double valor;
    private String sintese;
    private int quantidade;
    private Date lancamento;


    public Livro(Integer id_livro, String titulo, String autor, Double valor, String sintese, int quantidade, Date lancamento) {
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.sintese = sintese;
        this.quantidade = quantidade;
        this.lancamento = lancamento;
    }

    public Integer getId_livro() {return id_livro;}

    public void setId_livro(Integer id_livro) {this.id_livro = id_livro;}

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}

    public void setAutor(String autor) {this.autor = autor;}

    public Double getValor() {return valor;}

    public void setValor(Double valor) { this.valor = valor;}

    public String getSintese() { return sintese;}

    public void setSintese(String sintese) { this.sintese = sintese;}

    public int getQuantidade() { return quantidade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public Date getLancamento() { return lancamento;}

    public void setLancamento(Date lancamento) { this.lancamento = lancamento;}
}


