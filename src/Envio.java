import java.util.Date;

public class Envio {

    private int id_envio;
    private Encomenda encomenda;
    private Transportadora transportadora;
    private Funcionario funcionario;
    private Date data;
    private Feedback feedback;


    public Envio(int id_envio, Encomenda encomenda, Transportadora transportadora, Funcionario funcionario, Date data, Feedback feedback) {
        this.id_envio = id_envio;
        this.encomenda = encomenda;
        this.transportadora = transportadora;
        this.funcionario = funcionario;
        this.data = data;
        this.feedback = feedback;
    }

    public int getId_envio() { return id_envio; }

    public void setId_envio(int id_envio) { this.id_envio = id_envio; }

    public Encomenda getEncomenda() { return encomenda; }

    public void setEncomenda(Encomenda encomenda) { this.encomenda = encomenda; }

    public Transportadora getTransportadora() { return transportadora; }

    public void setTransportadora(Transportadora transportadora) { this.transportadora = transportadora; }

    public Funcionario getFuncionario() { return funcionario; }

    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

    public Date getData() { return data; }

    public void setData(Date data) { this.data = data; }

    public Feedback getFeedback() { return feedback; }

    public void setFeedback(Feedback feedback) { this.feedback = feedback; }
}
