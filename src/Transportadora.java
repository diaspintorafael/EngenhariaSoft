public class Transportadora {

    private Integer id_transportadora;
    private String nome;
    private String email;
    private int contacto;


    public Transportadora(Integer id_funcionario, String nome, String email, int contacto) {
        this.id_transportadora = id_transportadora;
        this.nome = nome;
        this.email = email;
        this.contacto = contacto;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getContacto() { return contacto; }

    public void setContacto(int contacto) { this.contacto = contacto; }
}
