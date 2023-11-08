public class GrandePorte extends Veiculo{

    public GrandePorte(String cor, String modelo, String placa, Integer idVaga, PessoaTemplate proprietario) {
        super(cor, modelo, placa, idVaga, proprietario);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
