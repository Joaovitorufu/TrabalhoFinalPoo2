public class Motocicleta extends Veiculo {
    private int qtdCapacetes;

    public Motocicleta(String cor, String modelo, String placa, Integer idVaga, PessoaTemplate proprietario, int qtdCapacetes) {
        super(cor, modelo, placa, idVaga, proprietario);
        this.qtdCapacetes = qtdCapacetes;
    }

    public int getQtdCapacetes() {
        return qtdCapacetes;
    }

    public void setQtdCapacetes(int qtdCapacetes) {
        this.qtdCapacetes = qtdCapacetes;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
