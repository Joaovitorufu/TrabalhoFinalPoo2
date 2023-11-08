public class PessoaFisica extends PessoaTemplate{
    private String dataNasc;
    private String sexo;
    private String cpf;

    public PessoaFisica(String nome, String dataNasc, String sexo, String cpf) {
        super(nome);
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.cpf = cpf;
    }
}
