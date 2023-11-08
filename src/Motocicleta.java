public class Motocicleta extends Veiculo {

    public Motocicleta(String cor, String modelo, String placa, Integer idVaga, PessoaTemplate proprietario) {
        super(cor, modelo, placa, idVaga, proprietario);


    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
