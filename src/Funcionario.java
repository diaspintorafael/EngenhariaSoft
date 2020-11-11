public class Funcionario {

    private Integer id_funcionario;
    private String nome;
    private String email;
    protected String password;

    public Funcionario(Integer id_funcionario, String nome, String email, String password) {
        this.id_funcionario = id_funcionario;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
