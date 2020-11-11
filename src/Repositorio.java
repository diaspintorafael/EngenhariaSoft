import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Encomenda> encomendas = new ArrayList<>();
        ArrayList<Envio> envios = new ArrayList<>();
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        ArrayList<Transportadora> transportadoras = new ArrayList<>();
        ArrayList<Voucher> vouchers = new ArrayList<>();
        ArrayList<Feedback> feedbacks = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();


        void adicionaCliente(Cliente cliente){ this.clientes.add(cliente);}
        void adicionaEncomenda(Encomenda encomenda){this.encomendas.add(encomenda);}
        void adicionaEnvio(Envio envio){this.envios.add(envio);}
        void adicionaFeedback(Feedback feedback){this.feedbacks.add(feedback);}
        void adicionaFuncionario(Funcionario funcionario){this.funcionarios.add(funcionario);}
        void adicionaLivro(Livro livro){this.livros.add(livro);}
        void adicionaNotificacao(Notificacao notificacao){this.notificacoes.add(notificacao);}
        void adicionaTransportadora(Transportadora transportadora){this.transportadoras.add(transportadora);}
        void adicionaVoucher(Voucher voucher){this.vouchers.add(voucher);}


// retorna encomenda com aquele id
    Encomenda EncontraEncomenda(Integer id_Encomenda){
        for (int i = 0; i<this.encomendas.size(); i++)
        {
            if (encomendas.get(i).getId_Encomenda() == id_Encomenda)
            {
                return encomendas.get(i);
            }
        }
        return null;
    }

    //lista de livros
    ArrayList<Livro> devolveLivrosdaEncomenda(int id_encomenda){

            Encomenda e = EncontraEncomenda(id_encomenda); // encontrar encomenda respectiva
        ArrayList<Livro> Livro_encomenda = new ArrayList<>();
        for (int i = 0 ; i<e.getLivro().size(); i++){

            Livro_encomenda.add(e.getLivro().get(i));
        }
        if (Livro_encomenda.isEmpty()){
            return null;
        }else{
            return Livro_encomenda;
        }



    }


    }


