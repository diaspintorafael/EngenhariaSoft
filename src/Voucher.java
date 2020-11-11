import java.util.Date;

public class Voucher {
    private int codigoVoucher;
    private String titulo;
    private double desconto;
    private Date validade;
    private Date data_registo;
    private String descricao;

    public Voucher(int codigoVoucher, String titulo, double desconto, Date validade, Date data_registo, String descricao) {
        this.codigoVoucher = codigoVoucher;
        this.titulo = titulo;
        this.desconto = desconto;
        this.validade = validade;
        this.data_registo = data_registo;
        this.descricao = descricao;
    }

    public int getCodigoVoucher() { return codigoVoucher; }

    public void setCodigoVoucher(int codigoVoucher) { this.codigoVoucher = codigoVoucher; }

    public String getTitulo() { return titulo;}

    public void setTitulo(String titulo) { this.titulo = titulo;}

    public double getDesconto() { return desconto; }

    public void setDesconto(double desconto) { this.desconto = desconto; }

    public Date getValidade() { return validade; }

    public void setValidade(Date validade) { this.validade = validade; }

    public Date getData_registo() { return data_registo; }

    public void setData_registo(Date data_registo) { this.data_registo = data_registo; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }
}
