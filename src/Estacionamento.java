import com.sun.jdi.event.ExceptionEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Estacionamento implements Sujeito{
    private List<Veiculo> veiculosEstacionados;
    private List<Integer> vagasDisponiveis;
    private List<Comprovante> comprovantes = new ArrayList<>();
    private List<Observer> observers;
    private PrintVIsitor printer;

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObserver() {

        for(Observer o : observers){
            o.update(vagasDisponiveis);
        }
    }

    public Estacionamento() {
        veiculosEstacionados = new ArrayList<>();
        vagasDisponiveis = new ArrayList<>();
        printer = new PrintVIsitor();
        for (int i = 1; i <= 12; i++) {
            vagasDisponiveis.add(i);
        }
        observers = new ArrayList<Observer>();
    }

    public void estacionarVeiculo(Veiculo v){
        boolean vagaDisponivelParaEstacionar = vagasDisponiveis.remove(v.getIdVaga());
        if (!vagaDisponivelParaEstacionar || v.getIdVaga() > 12 || v.getIdVaga() < 0){
            System.out.println("Vaga indisponível para estacionar\n");
            return;
        }
        veiculosEstacionados.add(v);
        notifyObserver();
    }

    public void removerVeiculo(Integer IdVaga){
        for(Veiculo v : veiculosEstacionados){
            if (v.getIdVaga()==IdVaga){
                veiculosEstacionados.remove(v);
            }
        }
        vagasDisponiveis.add(IdVaga);
    }

    public List<Integer> getVagasOcupadas() {
        return vagasDisponiveis;
    }

    public List<Veiculo> getVeiculosEstacionados() {
        return veiculosEstacionados;
    }

    public void mostrarVagas(){
        System.out.println(vagasDisponiveis);
    }

    public Veiculo cadastrarVeiculo( PessoaTemplate proprietario){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os dados do veiculo:\nQual o porte?:(p, m, g)\n");
        String porte = scanner.next();
        System.out.println("Cor:");
        String cor = scanner.next();
        System.out.println("Modelo:");
        String modelo = scanner.next();
        System.out.println("Placa:");
        String placa = scanner.next();
        System.out.println("Vaga onde foi estacionado:");
        int vaga = scanner.nextInt();

        if (porte.equals("p")){
            System.out.println("Quantidade de Capacetes:");
            int qtdCapacetes = scanner.nextInt();
            return new Motocicleta(cor,modelo,placa,vaga,proprietario,qtdCapacetes);
        }
        if (porte.equals("m")){
            System.out.println("Quantidade de Portas:");
            int qtdPortas = scanner.nextInt();
            return new Carro(cor,modelo,placa,vaga,proprietario,qtdPortas);
        }
        if (porte.equals("g")){
            System.out.println("Quantidade de Lugares:");
            int qtdLugares = scanner.nextInt();
            return new GrandePorte(cor,modelo,placa,vaga,proprietario,qtdLugares);
        }else {
            throw new IllegalArgumentException("Porte inválido. Escolha 'p', 'm' ou 'g'.");
        }
    }

    public PessoaTemplate cadastrarPessoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seus dados:\n1-Pessoa Fisica\n2-Pessoa Juridica");
        int x = scanner.nextInt();
        System.out.println("Nome:");
        String nome = scanner.next();

        if(x==1){
            System.out.println("Data de Nascimento:");
            String nasc = scanner.next();
            System.out.println("Sexo:(m, f)");
            String sexo = scanner.next();
            System.out.println("CPF:");
            String cpf = scanner.next();

            return new PessoaFisica(nome,nasc,sexo,cpf);
        }

        if(x==2){
            System.out.println("CNPJ:");
            String cnpj = scanner.next();
            return new PessoaJuridica(nome,cnpj);
        }else{
            throw new IllegalArgumentException("Erro!");
        }
    }

    public void adicionarComprovante(Comprovante comprovante){
        comprovantes.add(comprovante);
    }

    public void removerComprovante(String placa){
        for(Comprovante c : comprovantes){
            Veiculo v = c.getVeiculo();
            String p = v.getPlaca();

            if (p.equals(placa)){
                comprovantes.remove(placa);
            }
        }

    }

    public Comprovante buscarComprovante(String placa){
        for(Comprovante c : comprovantes){
            Veiculo v = c.getVeiculo();
            String p = v.getPlaca();

            if (p.equals(placa)){
                return c;
            }
        }
        throw new IllegalArgumentException("Veiculo nao encontrado!");
    }

    public void mostrarVeiculos(){
        for(Veiculo v : veiculosEstacionados){
            v.accept(printer);
        }
    }
}
