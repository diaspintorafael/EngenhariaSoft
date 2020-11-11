public class Cliente {

    private Integer id_cliente;
    private String nome;
    private String email;
    private String morada;
    protected String password;


    public Cliente(Integer id_cliente, String nome, String email, String morada, String password) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.email = email;
        this.morada = morada;
        this.password = password;
    }

    public String getNome() { return nome;}

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getMorada() { return morada; }

    public void setMorada(String morada) { this.morada = morada; }
}



