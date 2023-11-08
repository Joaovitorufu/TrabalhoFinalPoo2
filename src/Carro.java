public class Carro extends Veiculo {
    private int qtdDePortas;

    public Carro(String cor, String modelo, String placa, Integer idVaga, PessoaTemplate proprietario, int qtdDePortas) {

        super(cor, modelo, placa, idVaga, proprietario);
        this.qtdDePortas = qtdDePortas;
    }

    public int getQtdDePortas() {
        return qtdDePortas;
    }

    public void setQtdDePortas(int qtdDePortas) {
        this.qtdDePortas = qtdDePortas;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
