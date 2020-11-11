import java.util.Date;
import java.util.List;

public  class Encomenda {

    private int id_Encomenda;
    private Date data_registo;
    private String estado_encomenda;
    private Cliente cliente;
    private Voucher voucher;
    private double valor;
    private List<Livro> Livro;

    public Encomenda(int id_Encomenda, Date data_registo, String estado_encomenda, Cliente cliente, Voucher voucher, double valor, Livro livro) {
        this.id_Encomenda = id_Encomenda;
        this.data_registo = data_registo;
        this.estado_encomenda = estado_encomenda;
        this.cliente = cliente;
        this.voucher = voucher;
        this.valor = valor;
        Livro = (List<Livro>) livro;
    }

    public int getId_Encomenda() { return id_Encomenda; }

    public void setId_Encomenda(int id_Encomenda) { this.id_Encomenda = id_Encomenda; }

    public Date getData_registo() { return data_registo; }

    public void setData_registo(Date data_registo) { this.data_registo = data_registo; }

    public String getEstado_encomenda() { return estado_encomenda; }

    public void setEstado_encomenda(String estado_encomenda) { this.estado_encomenda = estado_encomenda; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Voucher getVoucher() { return voucher; }

    public void setVoucher(Voucher voucher) { this.voucher = voucher; }

    public double getValor() { return valor; }

    public void setValor(double valor) { this.valor = valor; }

    public List<Livro> getLivro() { return Livro; }

    public void setLivro(List<Livro> livro) { Livro = livro;}

    public void getData() {
    }
}
