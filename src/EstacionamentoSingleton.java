public class EstacionamentoSingleton {
    private static Estacionamento estacionamento;

    public static Estacionamento getInstance(){
            if(estacionamento == null){
                estacionamento = new Estacionamento();
            }
            return estacionamento;
    }
}
