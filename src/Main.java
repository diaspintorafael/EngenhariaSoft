import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String args[]) {

        Repositorio repositorio = new Repositorio();

        String nome="", morada ="", email="", titulo="", autor="", descricao="",avaliacao="", link="",password="",sintese="",estado="";
        int id=0, quantidade=0, contacto=0, desc=0, quant=0, disp=0,codigo=0;

        double valor=0.0, desconto =0.0;
        LocalDate data=null;
        Date lancamento=null,validade=null,data_registo=null;

        Cliente cliente = new Cliente(id,nome, morada, email,password);
        Funcionario funcionario = new Funcionario(id,nome, email,password);
        Livro livro = new Livro(id,titulo, autor, valor, sintese, quantidade, lancamento);
        Transportadora transportadora = new Transportadora(id,nome, email, contacto);
        Voucher voucher = new Voucher(codigo,titulo,desconto,validade,data_registo,descricao);
        Encomenda encomenda = new Encomenda(id, data_registo, estado, cliente, voucher, valor, livro);
        Feedback feedback = new Feedback(id, link, avaliacao);
        Envio envio = new Envio(id, encomenda, transportadora, funcionario, data_registo,feedback);

        Notificacao no = new Notificacao(id,envio, data,descricao);

        repositorio.adicionaCliente(cliente);
        repositorio.adicionaFuncionario(funcionario);
        repositorio.adicionaLivro(livro);
        repositorio.adicionaTransportadora(transportadora);
        repositorio.adicionaVoucher(voucher);
        repositorio.adicionaEncomenda(encomenda);
        repositorio.adicionaEnvio(envio);
        repositorio.adicionaFeedback(feedback);
        repositorio.adicionaNotificacao(no);
        repositorio.EncontraEncomenda(id);
        repositorio.devolveLivrosdaEncomenda(id);

        System.out.println("Data: " + envio.getData());
        System.out.println("Encomenda: " + envio.getEncomenda().getId_Encomenda());
        System.out.println("Cliente: " + envio.getEncomenda().getCliente());
        System.out.println("Transportadora: " + envio.getTransportadora().getNome());
    }

}
