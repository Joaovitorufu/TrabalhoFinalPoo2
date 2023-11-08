public class GrandePorte extends Veiculo{

    private int qtdLugares;

    public GrandePorte(String cor, String modelo, String placa, Integer idVaga, PessoaTemplate proprietario, int qtdLugares) {
        super(cor, modelo, placa, idVaga, proprietario);
        this.qtdLugares = qtdLugares;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
