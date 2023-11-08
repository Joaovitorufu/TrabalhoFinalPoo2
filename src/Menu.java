import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {
    private Estacionamento estacionamento;
    Scanner scanner = new Scanner(System.in);

    public Menu(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public void menuInicial(){
        System.out.println("1-Ver vagas disponiveis\n2-Estacionar Carro\n3-Fechar Conta\n4-Mostrar veiculos estacionados");
        int x = scanner.nextInt();

        if(x==1){
            estacionamento.mostrarVagas();
            menuInicial();
        }
        if (x==2){
            PessoaTemplate proprietario = estacionamento.cadastrarPessoa();
            Veiculo veiculo = estacionamento.cadastrarVeiculo(proprietario);
            estacionamento.estacionarVeiculo(veiculo);
            LocalDateTime dataEHoraAtual = LocalDateTime.now();
            Comprovante c = new Comprovante(dataEHoraAtual,veiculo);
            estacionamento.adicionarComprovante(c);
            menuInicial();
        }
        if(x==3){
            System.out.println("Qual a placa do veiculo?");
            String placa = scanner.next();
            Comprovante comprovante = estacionamento.buscarComprovante(placa);
            estacionamento.removerComprovante(placa);
            Pagamento pagamento = new Pagamento(comprovante);

            System.out.println("Qual a forma de pagamento?\n1-Credito\n2-Debito\n3-Dinheiro\n4-pix\n");
            int y = scanner.nextInt();

            if (y==1){
                PagamentoStrategy credito = new PagamentoCartaoCredito();
                pagamento.realizaPagamento(credito);
            }
            if (y==2){
                PagamentoStrategy debito = new PagamentoCartaoDebito();
                pagamento.realizaPagamento(debito);
            }
            if (y==3){
                PagamentoStrategy dinheiro = new PagamentoDinheiro();
                pagamento.realizaPagamento(dinheiro);
            }
            if (y==4){
                PagamentoStrategy pix = new PagamentoPix();
                pagamento.realizaPagamento(pix);
            }
            menuInicial();
        }
        if(x==4){
            estacionamento.mostrarVeiculos();
            menuInicial();
        }




    }
}
