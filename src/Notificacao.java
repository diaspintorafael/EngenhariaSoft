import java.time.LocalDate;

public class Notificacao {
    private Integer int_notificacao;
    private Envio envio;
    private LocalDate data;
    private String descricao;

    public Notificacao(Integer int_notificacao, Envio envio, LocalDate data, String descricao) {
        this.int_notificacao = int_notificacao;
        this.envio = envio;
        this.data = data;
        this.descricao = descricao;
    }

    public Integer getInt_notificacao() { return int_notificacao; }

    public void setInt_notificacao(Integer int_notificacao) { this.int_notificacao = int_notificacao; }

    public Envio getEnvio() { return envio; }

    public void setEnvio(Envio envio) { this.envio = envio; }

    public LocalDate getData() { return data; }

    public void setData(LocalDate data) { this.data = data; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }
}
