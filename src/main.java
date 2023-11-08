public class main {
    public static void main(String args[]){

        Estacionamento estacionamento = EstacionamentoSingleton.getInstance();
        Menu menu = MenuSingleton.getInstance(estacionamento);
        menu.menuInicial();
    }
}
