public class main {
    public static void main(String args[]){

        Estacionamento estacionamento = EstacionamentoSingleton.getInstance();
        Observer empresaCaminhao = new EmpresaCaminhao();
        Observer gerente = new Gerente();
        estacionamento.addObserver(empresaCaminhao);
        estacionamento.addObserver(gerente);
        Menu menu = MenuSingleton.getInstance(estacionamento);
        menu.menuInicial();
    }
}
