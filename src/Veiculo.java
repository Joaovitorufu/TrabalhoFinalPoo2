public abstract class Veiculo {

    private String cor;
    private String modelo;
    private String placa;
    private PessoaTemplate proprietario;

    private Integer idVaga;

    public Veiculo(String cor, String modelo, String placa,Integer idVaga, PessoaTemplate proprietario) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.proprietario = proprietario;
        this.idVaga = idVaga;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public PessoaTemplate getProprietario() {
        return proprietario;
    }

    public void setProprietario(PessoaTemplate proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Integer idVaga) {
        this.idVaga = idVaga;
    }

    //visitor
    public abstract void accept (Visitor v);
}
