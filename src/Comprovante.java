import java.time.LocalDateTime;

public class Comprovante {

    private LocalDateTime dataEHora;
    private Veiculo veiculo;


    public Comprovante(LocalDateTime dataEHora, Veiculo veiculo) {
        this.dataEHora = dataEHora;
        this.veiculo = veiculo;
    }

    public void imprimeComprovante(){
        System.out.println("COMPROVANTE:\nVeiculo:"+veiculo.getModelo()+" "+ veiculo.getCor()+"\nPlaca:"+veiculo.getPlaca()+"\nProprietario:"+veiculo.getProprietario()+"\nVaga:"+veiculo.getIdVaga());
    }

    public LocalDateTime getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(LocalDateTime dataEHora) {
        this.dataEHora = dataEHora;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}


