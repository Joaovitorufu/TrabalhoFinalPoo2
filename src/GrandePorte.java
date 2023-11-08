public class GrandePorte extends Veiculo{

    private int qtdLugares = 45;

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public GrandePorte(String cor, String modelo, String placa, Integer idVaga, PessoaTemplate proprietario) {
        super(cor, modelo, placa, idVaga, proprietario);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
